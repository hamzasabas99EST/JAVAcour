package threads;

public class Robinet extends Thread{
	private int debit;
	public Robinet(int debit) {
		this.debit=debit;
	}
	public void run() {
		while(Bainoire.volum <100 && Bainoire.volum>0) {
			Bainoire.volum+=this.debit;
			System.out.println("==> "+Bainoire.volum);
			
		}
	}

}
