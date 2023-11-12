package algoritmalar;

import java.io.DataInput;
import java.util.Arrays;

public class radixsort {

	public static int max(int arr[])
	{
		int max = arr[0];
		for(int i =0; i < arr.length; i++) {
		if(arr[i] > max)
			max = arr[i];
		}
		return max;
		
	}
	public static void radixsort(int arr[], int bas)
	{
		int max = arr[0];
		for(int i =0; i <arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =arr[i];
			}
		}
		int dizi2[] = new int[arr.length];
		int sayma[] = new int[max + 1];
		
		for(int i = 0; i <sayma.length; i++)
		{
			sayma[i] = 0;
		}
		for(int i = 0; i  <arr.length; i++)
			
		{
			sayma[(arr[i] / bas) % 10]++;
		}
		for(int i = 1; i < sayma.length; i++)
		{
			sayma[i] = sayma[i-1] + sayma[i];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
		    dizi2[sayma[(arr[i] / bas) % 10] - 1] = arr[i];
		    sayma[(arr[i] / bas) % 10]--;
		}
		for(int i = 0; i < arr.length; i++)
		{
			arr[i]=dizi2[i];
		}
	}
	public static void main(String[] args) {
		int[] data = { 121, 432,3, 564, 23, 1, 45, 788 };
		
		int max = max(data);
		
		for(int basamak = 1; max / basamak > 0; basamak*=10)
		{
			radixsort(data, basamak);
		}
		
		System.out.println(Arrays.toString(data));

	}

}
