import java.util.Scanner;
class TemperatureConverter 
{
	public static void main(String[] args) 
	{
       System.out.println("Enter the unit of the temperature to be converted:");
	   Scanner sc= new Scanner(System.in);

	   String temp1 = sc.nextLine();
	   System.out.println("Enter the unit of the temperature to be converted into:");

	   String temp2 =sc.nextLine();
	   System.out.println("Enter the temperature");

	   if (temp1.equals("celsius") && temp2.equals("fahrenheit"))
	   {
		   System.out.println((sc.nextInt() *1.8) +32);
	   }
	   else if (temp1.equals("celsius") && temp2.equals("kelvin"))
	   {
		   System.out.println(sc.nextInt() +273.15);
	   }
	   else if (temp1.equals("fahrenhit") && temp2.equals("celsius"))
	   {
		   System.out.println((sc.nextInt() -32) /1.8);
	   }
	   else if (temp1.equals("fahrenheit") && temp2.equals("kelvin"))
	   {
		   double cel= (sc.nextInt() -32) /1.8;
		   System.out.println(cel +273.15);
	   }
	   else if (temp1.equals("kelvin")&& temp2.equals("celsius"))
	   {
		   System.out.println(sc.nextInt() -273.15);
	   }
	   else if (temp1.equals("kelvin")&& temp2.equals("fahrenheit"))
	   {
		   double xyz =(sc.nextInt() -273.15);
		   System.out.println((xyz *1.8) + 32);
	   }
	}
}
