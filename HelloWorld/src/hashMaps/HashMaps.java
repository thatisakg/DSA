package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2,3,4,5,5};
		findCommon(arr);
	}
	
	public static void findCommon(int arr[])
	{
		int arr2[]=new int[10];
		int freq=0;
		for(int i=0;i<arr.length-1;i++)
		{
			freq=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					freq+=1;
				}
			}
			if(freq>=1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}