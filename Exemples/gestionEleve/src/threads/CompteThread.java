package threads;

class CompteThread extends Thread {
	   int valeur;

	   CompteThread(int val) {
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
	      new CompteThread(1).start();
	      new CompteThread(2000).start();
	   }
	}
