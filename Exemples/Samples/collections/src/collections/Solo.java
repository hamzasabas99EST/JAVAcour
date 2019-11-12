package collections;

public class Solo<T> {
	  private T valeur;
	  public Solo(){
	    this.valeur = null;
	  }
	  public Solo(T val){
	    this.valeur = val;
	  }
	  public void setValeur(T val){
	    this.valeur = val;
	  }
	  public T getValeur(){
	    return this.valeur;
	  }  
	  public static void main(String[] args) {
		  Solo<Integer> soloI = new Solo<Integer>();
		  Solo<String> soloS = new Solo<String>("TOTOTOTO");
		  Solo<Float> soloF = new Solo<Float>(12.2f);
		  Solo<Double> soloD = new Solo<Double>(12.202568);                
		}
	}

