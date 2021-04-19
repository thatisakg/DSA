import java.util.Scanner;

public class Pattern {
	public static void main(String[] agrs) {
      pattern8(4);
	}

/*	public static void pattern1(int a)
		{
		int i=1;
		while(i<=a)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
	
/*public static void pattern2(int a)
{
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	System.out.println();
	}
}
*/
	
/*	public static void pattern3(int a)
	{
		int k=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k+=1;
			}
		System.out.println();
		}
	}
*/	

/*	public static void pattern4(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}	
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
		System.out.println();
	    }
	}   
*/
	
/*	public static void pattern6(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}	
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				for(int l=2;l<=i;l++)
				{
					System.out.print("*");
				}
		System.out.println();
	    }
	}
*/
	
public static void pattern7(int a)
	{
	for(int i=1;i<=a;i++)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}	
		
			for(int k=1;k<=(i+i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
	for(int i=1;i<a;i++)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(" ");
		}	
		
			for(int k=1;k<2*(a-i);k++)
			{
				System.out.print("*");
			}
			System.out.println();
	}	
}

	
public static void pattern8(int a)
	{
		int count=0;
		int b=0;
		for(int i=1;i<=a;i++)
		{
			count+=i;
			b=count;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b);
				b--;
			}
			
		System.out.println();
		}
}

}

