package week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionInList {

	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<Integer>();
		//{3,2,11,4,6,7};	
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		
		List<Integer> arr1=new ArrayList<Integer>();
		//{1,2,8,4,9,7};
		arr1.add(1);
		arr1.add(2);
		arr1.add(8);
		arr1.add(4);
		arr1.add(9);
		arr1.add(7);
		
		int size=arr.size();
		int size1=arr1.size();
      
	   int brr[]=new int[size];
       int brr1[]=new int[size1];
       
         		
		for(int i=0;i<size;i++)
		{
			brr[i] = arr.get(i);
                for (int j = 0; j < size1; j++) 
                {
                	brr1[j]= arr1.get(j);
                
				if (brr[i]==brr1[j])
				{
					
					System.out.println("Intersection Values is:  "+brr[j]);

				}
                }
		}
	}

}
