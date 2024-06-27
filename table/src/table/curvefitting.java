package table;
import java.util.Scanner;
class curve
{
	Double x, y, x2, xy;
	Scanner input= new Scanner(System.in);
	void read()
	{
		System.out.println("enter x");
		x = input.nextDouble();
		System.out.println("enter y");
		y = input.nextDouble();
		x2 = x*x;
		xy = x*y;	
	}
	void display()
	{
		double X,Y,X2,XY;
		System.out.printf("%-20s%-20s%-20s%-20s",x,y,x2,xy);
		X = Double.sum(x, x);
		Y=Double.sum(y, y);
		X2 = Double.sum(x2,x2);
		XY = Double.sum(xy,xy);
		System.out.println();
	    System.out.println(+X);
		System.out.println(+Y);
		System.out.println(+X2);
		System.out.println(+XY);
		System.out.println("\n");
	}
}

public class curvefitting
{
	public static void main(String args[])
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("enter number of values");
		int number=input1.nextInt();
		curve c[]=new curve[number];
		for(int i=0;i<number;i++)
		{
			c[i]=new curve();
			c[i].read();
		}
		//aSuM(x)+nb=sum(y)
		//asum(x*x)+sum(x)=sum(xy)
		//Double.sum(x, y);
		//Double.sum(x2, xy);
				
		System.out.printf("%-20s%-20s%-20s%-20s","x","y","x2","xy");
		for(int i=0;i<number;i++)
		{
			System.out.println();
			c[i].display();
			input1.close();
		}
	}

}
