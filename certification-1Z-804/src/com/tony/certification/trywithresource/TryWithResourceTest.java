package com.tony.certification.trywithresource;

import java.io.IOException;

public class TryWithResourceTest {

	public static void main(String[] args) throws IOException {
		tryWithResource_Close_Catch_Finally();
		tryWithResource_CloseWithException_Finally();
		tryWithResource_CloseWithException_CatchWithSuppressed_Finally();
		tryWithResource_DoubleCloseWithException_Catch_Finally();
	}
	
	public static void tryWithResource_Close_Catch_Finally() {
		System.out.println("=======================");
		try (final AutoCloseableResource autoCloseableResource = new AutoCloseableResource()){
			throw new IllegalStateException();
		} catch(Exception e) {
			System.out.println("catch regular exception : " + e.getClass().getSimpleName() + ", nbre of suppressed exception(s) = " + e.getSuppressed().length);
		} finally {
			System.out.println("finally");
		}
		System.out.println("=======================");
	}
	
	public static void tryWithResource_CloseWithException_Finally() throws IOException {
		System.out.println("=======================");
		try (final AutoCloseableResourceWithException autoCloseableResourceWithException = new AutoCloseableResourceWithException()){
			// Nothing
		} catch(Exception e) {
			System.out.println("catch resource close exception : " + e.getClass().getSimpleName() + ", nbre of suppressed exception(s) = " + e.getSuppressed().length);
		} finally {
			System.out.println("finally");
		}
		System.out.println("=======================");
	}
	
	public static void tryWithResource_CloseWithException_CatchWithSuppressed_Finally() throws IOException {
		System.out.println("=======================");
		try (final AutoCloseableResourceWithException autoCloseableResourceWithException = new AutoCloseableResourceWithException()){
			throw new IllegalStateException();
		} catch(Exception e) {
			System.out.println("catch resource close exception : " + e.getClass().getSimpleName() + ", nbre of suppressed exception(s) = " + e.getSuppressed().length);
		} finally {
			System.out.println("finally");
		}
		System.out.println("=======================");
	}
	
	public static void tryWithResource_DoubleCloseWithException_Catch_Finally() throws IOException {
		System.out.println("=======================");
		try (final AutoCloseableResourceWithException autoCloseableResourceWithException1 = new AutoCloseableResourceWithException();
				final AutoCloseableResourceWithException autoCloseableResourceWithException2 = new AutoCloseableResourceWithException()){
			//  Nothing
		} catch(Exception e) {
			System.out.println("catch resource close exception : " + e.getClass().getSimpleName() + ", nbre of suppressed exception(s) = " + e.getSuppressed().length);
		} finally {
			System.out.println("finally");
		}
		System.out.println("=======================");
	}
	
	/**
	 * Simple {@link AutoCloseable} resource
	 * @author Tony
	 *
	 */
	public static class AutoCloseableResource implements AutoCloseable {
		@Override
		public void close() {
			System.out.println("close (resource) without exception");
		}
	}
	
	/**
	 * {@link AutoCloseable} with exception resource
	 * @author Tony
	 *
	 */
	public static class AutoCloseableResourceWithException implements AutoCloseable {
		@Override
		public void close() throws IOException {
			System.out.println("close (resource) with exception");
			throw new IOException("io exception from auto closeable resource");
		}
	}
}
