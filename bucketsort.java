package algoritmalar;

import java.util.ArrayList;
import java.util.Arrays;

public class bucketsort {

	public static void main(String[] args) {
		 float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
			        (float) 0.51 };
		 
		 
			ArrayList<Float>[] buckets = new ArrayList[arr.length]; 
			
			for(int i = 0; i < arr.length; i++)
			 {
				 buckets[i] = new ArrayList<Float>();
			 }
			
			for(int i = 0; i < arr.length; i++)
			 {
				 int index = (int) (arr[i] * arr.length);
				 buckets[index].add(arr[i]);
				 
			 }
			//insertion sort algoritmasý
			for(int k = 0; k < buckets.length; k++)
			{
				
				for(int i = 1; i < buckets[k].size(); i++)
				{
					int j = i -1;
					float key = buckets[k].get(i);
					while(j >= 0 && key < buckets[k].get(j))
					{
						buckets[k].set(j+1,buckets[k].get(j));
						j--;
					}
					
					buckets[k].set(j + 1, key);
					
					
				}
				
			}
			int index = 0;
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < buckets[i].size(); j++)
				{
					arr[index++] = buckets[i].get(j);
				}
			}
			
			System.out.println(Arrays.toString(arr));
		 

	}

}
