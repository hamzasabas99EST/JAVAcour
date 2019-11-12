package threads;

public class Main {
	static int a=60;
	public static void main(String[] args) {
		Bainoire b=new Bainoire(20, 10); //  volume intial, debit de fuite
		Robinet r=new Robinet(6);//  debit robinet
		b.start();
		r.start();
		
	}
}
