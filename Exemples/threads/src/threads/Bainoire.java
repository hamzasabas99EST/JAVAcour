package threads;

public class Bainoire extends Thread {
	public static int volum;
	private int fuite;
	public Bainoire(int vin, int f) {
		this.volum=vin;
		this.fuite=f;
	}
	
	public void run() {
		while(Bainoire.volum<100 && Bainoire.volum>0) {
			Bainoire.volum-=this.fuite;
			System.out.println("<== "+Bainoire.volum);
			
		}
	}
}
