public class tryca {
public void test() {
object o2 = null;
try
{
	int i2 = (int)o2;   // Error
}
catch (NullReferenceException e) 
{
	Console.WriteLine("Objet null");
}
}
}