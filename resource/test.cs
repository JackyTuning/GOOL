using System;
using System.IO;
 public class Demo
	{
		int age;
		string name;
		public Demo(int age, string name)
		{
		// Have made change here included this keyword
			this.age = age;
			this.name = name;
		}
		public void Show()
		{
			Console.WriteLine("Your age is :" + age.ToString());
			Console.WriteLine("Your name is : " + name);
		}

	}

	class Test {

		String nom = "bonjour";
		
        
		
		static int addition(int x, int y)
		{
			return x+y;  
		}

		private static void Main() {
            Demo titi = new Demo(20,"jean");
            titi.Show();
			const int x = 100;
			int j = 0;
			int k;
			k = 0;
			double y = (double) k;
			int[] tableau = new int[6];
			for (int i = 0; i <= 5; i++) {
				j = addition(1,2);
				tableau[i] = j;
				if(i<=2)
				{
					k = 30;
				}
				else
				{
					k = 50;
					break;
				}
			}

			while(j<=5)
			{
				j=j+1;
			}

			object o2 = null;
			try
			{
				int i2 = (int)o2;   // Error
			}
			catch (NullReferenceException e) 
			{
				Console.WriteLine("Objet null");
			}

			int caseSwitch = 1;
			switch (caseSwitch)
			{
				case 1:
					Console.WriteLine("Case 1");
					break;
				case 2:
					Console.WriteLine("Case 2");
					break;
				default:
					Console.WriteLine("Default case");
					break;
			}

			Console.WriteLine(x+" "+y);
			Console.WriteLine(x.ToString());
		}
	}
