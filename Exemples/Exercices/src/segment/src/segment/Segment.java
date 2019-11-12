package segment;

public class Segment {
	private int x1, x2;
	public Segment(int a, int b) {
		this.x1=a;
		this.x2=b;
		ordonne();
	}
	private void ordonne() {
		if (x1>x2) {
			int tmp=x1;
			x1=x2;
			x2=tmp;
		}
	}
	public void setX1(int x) {
		this.x1=x;
		ordonne();
	}
	public void setX2(int x) {
		this.x2=x;
		ordonne();
	}
	public int longueure() {
		return Math.abs(x1-x2);
	}
	public boolean appartien(int x) {
		return (x>x1 && x<x2);
	}
	public String toString() {
		return "segment["+x1+" , "+x2+"]";
	}
	public int getX1() {
		return this.x1;
	}
	public int getX2() {
		return this.x2;
	}
}
