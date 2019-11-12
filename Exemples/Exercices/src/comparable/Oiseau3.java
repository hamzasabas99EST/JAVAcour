import static java.lang.System.*;

class Oiseau3
{
    void decrire()
    {
	out.println(this + "je suis un oiseau \"quelconque\"");
    }

    public String toString()
    {
	return "Famille des oiseaux : ";
    }
}

class Merle extends Oiseau3
{
    void decrire()
    {
	out.println(this + "je suis un merle");
    }
}

class Pie extends Oiseau3
{
    void decrire()
    {
	out.println(this + "je suis une pie");
    }
}

class EssaiOiseau3
{
    public static void main(String[] arg) throws Exception
    {
	Oiseau3[] table;
	int i = 0;
	Class classe;
	
	table = new Oiseau3 [arg.length];
	for (i = 0; i < arg.length; i++)
	    table[i] = (Oiseau3)Class.forName(arg[i]).newInstance();
	for (i = 0; i < arg.length; i++) table[i].decrire();
    }
}
