import java.util.*;
public class array {
	public static void main(String args[])
	{

/*		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
*/
		
/*		int arr[]= {1,2,3,4,5};
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.println(arr[i]);
		}
*/
		
	//int arr[]= {-1,2,-4,6,-2,4};
	//largestSumSubarray(arr);
		
	//int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};	
	//trap(arr);	
	

/*	public static void targetPairSumSorted(int target,int arr[])
	{
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			int currSum=arr[l]+arr[r];
			if(currSum<target)
			{
				l++;
			}else if(currSum>target)
			{
				r--;
			}
			else
			{
				System.out.println(arr[l]+" "+arr[r]);
				l++;
				r--;
			}
		}

	}
*/
	
/*public static void largestSumSubarray(int arr[])
 {
	int maxsum=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=i;j<arr.length;j++)
		{
			sum+=arr[j];
		    maxsum=Math.max(maxsum,sum);
		}
	}
	System.out.println(maxsum);
}
*/
	
/*	public static void trap(int[] height)
	{
		int leftmax[]=new int[height.length];
		int rightmax[]=new int [height.length];
		
		leftmax[0]=height[0];
		for(int i=1;i<height.length;i++)
		{
			leftmax[i]=Math.max(leftmax[i-1],height[i]);
		}
		
		rightmax[height.length-1]=height[height.length-1];
		for(int i=height.length-2;i>=0;i--)
		{
			rightmax[i]=Math.max(rightmax[i+1], height[i]);
		}
		
		int sum=0;
		for(int i=0;i<height.length;i++)
		{
			int minwall=Math.min(leftmax[i], rightmax[i]);
			if(minwall>height[i])
			{
				sum+=minwall-height[i];
			}
		}
		System.out.println(sum);
	}
*/	
	
	//ArrayList
    

	/*	ArrayList<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(6);
		l.add(7);
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.size());
		l.remove(0);
		System.out.println(l);
	*/
		
	/*	ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		ArrayList<Integer> list3=mergeTwoSortedLists(list1,list2);
		System.out.println(list3);
		
	}
		
		public static ArrayList<Integer> mergeTwoSortedLists(ArrayList<Integer> list1,ArrayList<Integer> list2)
		{
		ArrayList<Integer> list3=new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		return list3;
		}
		*/
		
/*		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(4);
		list1.add(7);
		list1.add(9);
		list1.add(11);
		

		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(2);
		list2.add(8);
		list2.add(10);
		list2.add(12);
		
		System.out.println(mergeTwoSortedLists(list1,list2));
		
	}
		
		public static ArrayList<Integer> mergeTwoSortedLists(ArrayList<Integer> list1,ArrayList<Integer> list2)
		{
	    int ptr1=0;
	    int ptr2=0;
	    ArrayList<Integer> list3=new ArrayList<>();
	    while(ptr1<list1.size() && ptr2<list2.size())
	    {
	    	if(list1.get(ptr1)<list2.get(ptr2))
	    	{
	    		list3.add(list1.get(ptr1));
	    		ptr1++;
	    	}
	    	else
	    	{
	    		list3.add(list2.get(ptr2));

	    		ptr2++;
	    	}
	    }
	    while(ptr1<list1.size())
	    {
	    	list3.add(list1.get(ptr1));
	    	ptr1++;
	    	
	    }
	    while(ptr2<list2.size())
	    {
	    	list3.add(list2.get(ptr2));
	    	ptr2++;
	    }
	    return list3;
		}
}

*/
		
//	int arr[]= {3,3,4,2,4,4,2,4,4};
//	majorityElement(arr);
//}
//public static void majorityElement(int[] arr)
//{
//int majIndx=0;
//int count=1;
//for(int i=0;i<arr.length;i++)
//{
//	if(arr[i]==arr[majIndx])
//	{
//		count++;
//	}
//	else
//	{
//		count--;
//	}
//	if(count==0)
//	{
//		majIndx=i;
//		count=1;
//	}
//}
//System.out.println(arr[majIndx]);
//}


/*		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		 
		int[] array = new int[size];
		for(int i = 0; i < size ; i++) {
		    array[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++){
		    array[array[i] - 1] += size+1;
		}
		int min = 0;
		int max = 0;
		for(int i = 0; i < size; i++){
		    if(array[i] / (size+1) == 0){
		        min = i+1;
		    }
		    if(array[i] / (size+1) == 2){
		        max = i+1;
		    }
		}
		System.out.println(min + " " + max);

		}
		}	
*/
		
/*	int arr[]= {1,2,3,5,6,7};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	int nsum=0;
	for(int i=1;i<=arr.length+1;i++)
	{
		nsum+=i;
	}
	System.out.println(nsum-sum);
	}
}
	*/
		
// painters algorithm
		
/*	int k=2;
	int arr[]= {10,20,30,40,50};
	paintersPartition(arr,k);
	}
		public static void paintersPartition(int arr[],int k)
		{
			int sum=0;
			int max=Integer.MIN_VALUE;
			for(int val:arr)
			{
				sum+=val;
		        max=Math.max(val, max);
		    }
			int lo=max;
			int hi=sum;
			while(lo<hi)
			{
				int mid=(lo+hi)/2;
				int paintersReqd=paintersCalc(arr,mid);
				if(paintersReqd<=k)
				{
					hi=mid;
				}
				else
				{
					lo=mid+1;
				}
			}
			System.out.println(lo);
	    } 
		public static int paintersCalc(int arr[],int time)
		{
			int paintersCount=1;
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
				if(sum>time)
				{
					sum=arr[i];
					paintersCount++;
				}
			}
			return paintersCount;
		}
}
		*/
		
/*		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		boolean flag=false;
		for(int j=0;j<arr[0].length;j++)
		{
			if(flag==false)
			{
			for(int i=0;i<arr.length;i++)
			{
				
				{
					System.out.print(arr[i][j]+" ");
				}	
			}
			}
				else
				{
					for(int i=arr.length-1;i>=0;i--)
				
					System.out.print(arr[i][j]+" ");
				}
		flag=!flag;

		System.out.println();
		}
		}
		}
		*/
		
//		int arr[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15,},{16,17,18,19,20}};
//		printSpiral(arr);
//	}
//
//	private static void printSpiral(int[][] arr) {
//		int startRow=0;
//		int startCol=0;
//		int endRow=arr.length-1;
//		int endCol=arr[0].length-1;
//		while(startRow<=endRow && startCol<=endCol)
//		{
//			for(int i=startCol;i<=endCol;i++)
//			{
//				System.out.println(arr[startRow][i]);
//			}
//			startRow++;
//			for(int i=startRow;i<=endRow;i++)
//			{
//				System.out.println(arr[i][endCol]);
//			}
//			endCol--;
//			for(int i=endCol;i>=startCol;i--)
//			{
//				System.out.println(arr[endRow][i]);
//			}
//			endRow--;
//			for(int i=endRow;i>=startRow;i--)
//			{
//				System.out.println(arr[i][startCol]);
//			}
//			startCol++;
//		}
	}
}