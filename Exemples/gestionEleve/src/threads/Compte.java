package threads;

class Compte extends Thread {
	   int valeur;

	   Compte(int val) {
	      valeur = val;
	   }

	   public void run() {
	      try {
	         for (;;) {
	            System.out.print(valeur + " ");
	            sleep(100);
	         }
	      } catch (InterruptedException e) {
	           return;
	        }   
	   }

	   public static void main(String[] args) {
	      new Compte(1).start();
	      new Compte(2000).start();
	   }
}

