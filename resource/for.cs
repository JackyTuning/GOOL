using System;
using System.IO;

class Test {
    
    public int x;
    public bool y;
    public string z;
    
    static int addition(int x, int y)
    {
        return x+y;  
    }
    // un commentaire
    private static void Main() {
    		int j = 0;
				int k;
				k = "0";
        for (int i = 0; i <= 5000; i++) {
							j = addition(1,2);
							if(j<=2500)
							{
								k = 30;
							}
							else
							{
								k = 50;
							}
        }
    }
}
