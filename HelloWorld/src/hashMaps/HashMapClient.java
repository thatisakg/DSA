package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClient {

	public static void main(String[] args) {

//		HashMap<String,Integer> hmap=new HashMap<>();
//		hmap.put("cat", 2);
//		hmap.put("mouse", 3);
//		hmap.put("dog", 1);
//		hmap.put("fish",1);
//		
//		System.out.println(hmap.get("cat"));
//		hmap.put("cat", 5);
//		System.out.println(hmap.get("cat"));
//		System.out.println(hmap);
//		hmap.remove("cat");
//		System.out.println(hmap);
//		
//		System.out.println(hmap.size());
//		
//		System.out.println(hmap.containsKey("tiger"));
//		System.out.println(hmap.containsKey("fish"));
//		
//		ArrayList<String> keyset=new ArrayList<>(hmap.keySet());
//		
//		System.out.println(keyset);
		
//		int[] one= {5,1,3,1,2,2,1};
//		int []two= {2,2,4,1,1,5,2};
//		
//		getCommon(one,two);
//		getCommonElements2(one,two);
		

	    int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
	    longestSequence(arr);
	}
	
	public static void getCommon(int one[],int two[])
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int val:one)
		{
			if(map.containsKey(val)) {
				map.put(val,map.get(val)+1);
			}else {
				map.put(val, 1);
			}
		}
		System.out.println(map);
		for(int val:two){
	           if(map.containsKey(val)){
	              System.out.print(val+" ");
	              map.remove(val);
	           }
	        }
	        System.out.println();
	     }  
	
	
	 public static void getCommonElements2(int[] one,int[] two){
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int val:one){
	           if(map.containsKey(val)){
	               map.put(val,map.get(val)+1);
	           }else{
	               map.put(val,1);
	           }
	        }

	        for(int val:two){
	           if(map.containsKey(val)){
	              System.out.println(val);
	              map.put(val,map.get(val)-1);

	              if(map.get(val)<=0){
	                 map.remove(val);
	              }
	           }
	        }
	     }
	 
	  public static void longestSequence(int[] arr){
	        HashMap<Integer,Boolean> map = new HashMap<>();
	        for(int val:arr){
	           map.put(val,false);
	        } 

	        for(int val:arr){
	           if(map.containsKey(val-1)==false){
	              map.put(val,true);
	           }
	        }

	        int sidx = -1;
	        int maxCount = 0;
	        for(int val:arr){
	           int count =1;
	           if(map.get(val)==true){
	              while(map.containsKey(val+count)){
	                 count++;
	              }
	            //   count--;
	              if(count>maxCount){
	                 maxCount = count;
	                 sidx = val;
	              }
	           }
	        }

	        System.out.println(sidx+" "+maxCount);
	     }
}
