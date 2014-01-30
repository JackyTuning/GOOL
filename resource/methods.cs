public class methods {


void inutile() {

}

static int addition(int x, int y)
{
    inutile();
	return x+y;  
}

public static int addition()
{
	int x = 1;
	int y = 2;
	return x+y;  
}

private static void Main()
{
	int x = addition();
	int y = addition(2,3);
	String nom = "JackyTuning";
}


}