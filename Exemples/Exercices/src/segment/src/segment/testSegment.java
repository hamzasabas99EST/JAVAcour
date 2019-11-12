package segment;

public class testSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length>=3){
			Segment s=new Segment(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			System.out.println("Longueur du segment"+s+" "+s.longueure());
			if (s.appartien(Integer.parseInt(args[2])))
				System.out.println(args[2]+" Appartien a "+ s);
			else
				System.out.println(args[2]+" n'Appartient pas a "+ s);
		}
		else
			System.out.println("Manque un argument");
	}

}
