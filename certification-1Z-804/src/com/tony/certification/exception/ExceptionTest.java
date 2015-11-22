package com.tony.certification.exception;

import java.util.Random;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

public class ExceptionTest {
	
	/**
	 * catch(Exception e) inferred
	 * @throws ParseException
	 * @throws ClassNotFoundException
	 */
	public void genericExceptionHiddenRealExceptions() throws ParseException, ClassNotFoundException {
		try {
			Random random = new Random();
			if(random.nextBoolean()) {
				throw new ParseException();
			} else {
				throw new ClassNotFoundException();
			}
			
		} catch(Exception e) { // Java infère le type des exceptions réellement jetées par le code du bloc
//			e = new SecurityException(); // Si ce code est décommenté, le code se comporte comme Java 6, et demande d'avoir Exception comme type jeté par la méthode
			throw e;
		}
	}
	
	/**
	 * Multi catch exception
	 */
	public void multiCatchException() throws ParseException, ClassNotFoundException {
		try {
			Random random = new Random();
			if(random.nextBoolean()) {
				throw new ParseException();
			} else {
				throw new ClassNotFoundException();
			}
			
		} catch(ParseException | ClassNotFoundException e) {
//			e = new SecurityException(); // Si ce code est décommenté, le code ne compile plus, les exception en multi catch sont final
			throw e;
		}
	}

}
