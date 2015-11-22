package com.tony.certification.threads;

public class DeadLockTest {
	
	/*
	 * Le dead lock est produit car lorsque qu'un tread T appelle une méthode synchronisée sur un object O, le thread possède alors le "lock" sur cet objet, et aucun autre thread que T ne peut
	 * accèder aux méthodes synchronisées de O tant que le thread T n'a pas releasé le lock sur l'objet O
	 */
	
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                + "  has bowed to me!%n", 
                this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) { // retirer le 'synchronized' supprime le dead lock, car la méthode pourrait être appelée sans que le thread appelantn'ait besoin d'un lock sur l'objet
            System.out.format("%s: %s"
                + " has bowed back to me!%n",
                this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
            new Friend("Alphonse");
        final Friend gaston =
            new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();
    }
}
