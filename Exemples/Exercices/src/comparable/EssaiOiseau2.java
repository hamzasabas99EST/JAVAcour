class EssaiOiseau2
{
    public static void main(String[] arg) throws Exception
    {
	Oiseau[] table;
	int i = 0;
	
	table = new Oiseau [arg.length];
	for (i = 0; i < arg.length; i++)
	    table[i] = (Oiseau)Class.forName(arg[i]).newInstance();
	for (Oiseau oiseau : table) oiseau.decrire();
    }
}
