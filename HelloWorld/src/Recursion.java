import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		printDec(5);
		//printInc(5);
		//hiBye(5);
		//System.out.println(factorial(5));
		/*int total=15;
		fibonacci(total);
		for(int i=0;i<total;i++)
		{
		System.out.println(fibonacci(i)+" ");
		}	
		*/
		//System.out.println(power(3,2));
		//System.out.println(powerBtr(3,2));
	    	
	    // int arr[]= {10,20,30,10};
	    // array(arr,0);
	    //arrayRev(arr,0);
	    // System.out.println(max(arr,0));
	    // System.out.println(lastIndex(arr,0,10));
	}
	
	 public static void printDec(int n)
	 {

			if(n==0)
			{
				return;
			}
			System.out.println(n);
			printDec(n-1);
	 }
		
	
	public static void printInc(int n)
	{
		if(n==0)
		{
			return;
		}
		printInc(n-1);
		System.out.println(n);
	}
	
    public static void hiBye(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2!=0)
		{
		System.out.println("hi "+n);
		hiBye(n-1);
		}
		else
		{
		hiBye(n-1);
		System.out.println("bye "+n);
		}
	}
	
    public static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		int fact1=factorial(n-1);
		int fact2=fact1*n;
		return fact2;
	}
    
    public static int fibonacci(int n)
    {
    	if(n==0||n==1)
    	{
    		return n;
    	}
    	return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static int power(int x,int y)
    {
    	if(y==0)
    	{
    		return 1;
    	}
    	int n=power(x,y-1);
    	return x*n;
       
    }
    
    public static int powerBtr(int x,int y)
    {
    	if(y==0)
    	{
    		return 1;
    	}
    	int xpnby=powerBtr(x,y/2);
    	if(y%2==0)
    	{
    		return xpnby*xpnby;
    	}
    	else {
    		return xpnby*xpnby*x;
    	}  
    }
    
    public static void array(int arr[],int vidx)
    {
    	if(vidx==arr.length)
    	{
    		return;
    	}
    	System.out.println(arr[vidx]);
    	array(arr,vidx+1);
    }
    
    public static void arrayRev(int arr[],int vidx)
    {
    	if(vidx==arr.length)
    	{
    		return;
    	}
    	arrayRev(arr,vidx +1);
    	System.out.println(arr[vidx]);
    }
    
    public static int max(int []arr,int vidx)
    {
    	if(vidx==arr.length-1)
    	{
    		return arr[vidx];
    	}
    	int maxAfterMe=max(arr,vidx+1);
    	if(maxAfterMe>arr[vidx])
    	{
    		return maxAfterMe;
    	}
    	else {
    		return arr[vidx];
    	}
    }
    
    public static boolean find(int arr[],int val,int vidx)
    {
    	if(vidx==arr.length-1)
    	{
    		return false;
    	}
    	boolean fnm1=find(arr,val,vidx+1);
    	if(fnm1==true)
    	{
    		return true;
    	}
    	else
    	{
    		if(arr[vidx]==val)
    				{
    					return true;
    				}
    		else
    		{
    			return false;
    		}
    	}
    }
    
    
    public static boolean findbtr(int arr[],int val,int vidx)
    {
    	if(vidx==arr.length-1)
    	{
    		return false;
    	}
    	if(arr[vidx]==val)
		{
			return true;
		}
    	boolean fnm1=find(arr,val,vidx+1);
    	return fnm1;
    }
    
    public static int firstIndex(int arr[],int vidx,int val)
    {
    	if(vidx==arr.length)
    	{
    		return -1;
    	}
    	if(arr[vidx]==val)
    	{
    		return vidx;
    	}
    	else
    	{
    		return firstIndex(arr,vidx+1,val);
    	}
    }
}
  /*  public static int lastIndex(int arr[],int vidx,int val)
    {
    	if(vidx==arr.length)
    	{
    		return -1;
    	}
    	int foundIndx=firstIndex(arr,vidx+1,val);
        if(foundIndx==-1)
        {
        	if(arr[vidx]==val)
        	{
        		return vidx;
        	}
        	else
        	{
        		return -1;
        	}
        }else
        {
        	return foundIndx;
        }
    }
    */
    
 /*   public static int[] allIndices(int arr[],int vidx,int data,int fsf)
    {
    	if(vidx==arr.length)
    	{
    		return new int[fsf];
    	}
    	if(arr[vidx]==data)
    	{
    		allIndices(arr,vidx+1,data,fsf+1);
    	}
    	else
    	{
    		allIndices(arr,vidx+1,data,fsf);
    	} 		
    }
    */
    
   