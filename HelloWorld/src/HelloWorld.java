import java.util.Scanner;

class HelloWorld {
public static void main(String[] args)
{
//program to print hello world	
System.out.println("Hello World");

//program to print integer,character,string,float value 	
/*int a=10;
char b='a';
String s="Geekster";
double c=10.2;
System.out.println(a+"\n"+b+"\n"+s+"\n"+c);
*/
	
//conditional statement program 	
/*int a=10;
if(a<7)
{
	System.out.println("Geekster 1");
}
else
{
	System.out.println("Geekster 2");
}
*/

//program to find greatest of three no.	
/*int a=20,b=25,c=15;
if(a>b)
{
	if(b>c)
	{
		System.out.println(a);
	}
	else
	{
		System.out.println(c);
	}
}
else
{
	if(b>c)
	{
		System.out.println(b);
	}
	else
	{
		System.out.println(c);
    }
}
*/
	
//for loop program	
/*for(int i=0;i<5;i++)
{
	System.out.println("Geekster");
}
*/
	
//program to convert temperature from celcius to fehrenheit	
/*int c=72;
double f;
f=((9/5)*c)+32;
System.out.println(f);
*/
	
//program to calculate sum of first 10 no.	
/*int sum=0;
for(int i=0;i<=10;i++)
{
	sum+=i;
}
System.out.println(sum);
*/
	
//program to input two no. from user and find the sum	
/*Scanner sc=new Scanner(System.in);
System.out.println("enter first no.");
int a=sc.nextInt();
System.out.println("enter second no.");
int b =sc.nextInt();
int c=a+b;
System.out.println("total = "+c);	
*/

//program to find greatest integer among the no. of input int from the user
/*Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int max=Integer.MIN_VALUE;
for(int i=0;i<a;i++)
{
	int val=sc.nextInt();
	if(val>max)
	{
		max=val;
	}
}	
System.out.println(max);
*/

//program to find whether the no. is prime or not		
/*Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=0;
for(int i=2;i<=Math.sqrt(a);i++)
{
	if(a%i==0)
	{
		n+=1;
	}
}
if(n==0)
{
    System.out.println("no. is prime");
}
else
{
	System.out.println("no. is not prime");
}
*/
	
//program to find whether the no. is prime or not		
/*Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
boolean isPrime=true;
for(int i=2; i<=Math.sqrt(a);i++)
{
	if(a%i==0)
	{
		isPrime=false;
	}
}
if(isPrime==true)
{
	System.out.println(a+" is a prime no.");
}
else
{
	System.out.println(a+" is not a prime no.");
}
*/

//program to reverse a no. using function	
/*reverse(1237);	
}	
public static void reverse(int num)
{
	int rem,rev=0;
	while(num>0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
System.out.println(rev);	
}
*/
}
}