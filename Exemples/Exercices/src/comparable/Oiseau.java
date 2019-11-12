abstract class Oiseau
{
    abstract void decrire();

    public String toString()
    {
	return "Famille des oiseaux : ";
    }
}

class Merle extends Oiseau
{
    void decrire()
    {
	System.out.println(this + "je suis un merle");
    }
}

class Pie extends Oiseau
{
    void decrire()
    {
	System.out.println(this + "je suis une pie");
    }
}

class EssaiOiseau
{
    public static void main(String[] arg) throws Exception
    {
	Oiseau[] table;
	int i = 0;
	
	table = new Oiseau [5];
	table[0] = new Merle();
	table[1] = new Pie();
	table[2] = new Pie();
	table[3] = new Merle();
	table[4] = new Pie();
	for (i = 0; i < 5; i++) table[i].decrire();
    }
}
