package algoritmalar;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.zip.ZipEntry;

public class uygulama {

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		int A1[] = new int[1000];
		int A2[] = new int[1000];
		int A3[] = new int[1000];
		
		for(int i = 0; i < 1000; i++)
		{
			A1[i] = i+1;
		}
		
		int j = 0;	
		for(int i = 1000; i > 0; i--)
		{
			A2[j] = i;
			j++;
		}
	for(int i =0; i < 1000; i++)
	{
		int d =	(int)(Math.random() * 1000);
		A3[i] = d;
		
	}
	
		
//		uygulama.insertionsort(A1);
//		uygulama.insertionsort(A2);
//		uygulama.insertionsort(A3);
//		for (int i = 0; i < 1000; i++) {
//			System.out.println(A1[i]);
//			System.out.println(A2[i]);
//		System.out.println(A3[i]);
//		}
//		final long duration = System.nanoTime() - startTime;
//		System.out.println(duration);
	
	
//		uygulama.bubblesort(A1);
//		uygulama.bubblesort(A2);
//		uygulama.bubblesort(A3);
//		for (int i = 0; i < 1000; i++) {
//	System.out.println(A1[i]);
//			System.out.println(A2[i]);
//	System.out.println(A3[i]);
//		}
//		final long duration = System.nanoTime() - startTime;
//		System.out.println(duration);
		
		uygulama.mergesort(A1, 0, A1.length-1);
		uygulama.mergesort(A2, 0, A2.length-1);
		uygulama.mergesort(A3, 0, A3.length-1);
		for (int i = 0; i < 1000; i++) {
//	System.out.println(A1[i]);
			System.out.println(A2[i]);
//	System.out.println(A3[i]);
		}
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);
	
	
	
	
	
	
	
		
	}
	
	public static void insertionsort(int arr[])
	{
		for(int i = 1; i < arr.length; i++)
		{
			int key = arr[i];
			int k = i -1;
			while(k >= 0 && key < arr[k])
			{
				arr[k+1] = arr[k];
				k--;
			}
			arr[k+1] = key;
		
	}
		

}
	public static void bubblesort(int arr[])
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j+1]< arr[j])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void merge(int arr[], int p, int q, int k)
	{
		int n1 = q - p + 1;
		int n2 = k - q;
		int A[] = new int[n1];
		int B[] = new int[n2];
		
		for(int i = 0; i< n1; i++)
		{
			A[i] = arr[p + i];
		}
		for(int j = 0; j < n2; j++)
		{
			B[j] = arr[q + j + 1];
		}
		
		int i = 0,j = 0;
		int r = p;
		
		while(i < n1 && j < n2)
		{
			if(A[i] <= B[j])
			{
				 arr[r] = A[i];
				 i++;
			}
			else
			{
				arr[r] = B[j];
				j++;
			}
			r++;
		}
		
		while (i < n1) {
		      arr[r] = A[i];
		      i++;
		      r++;
		    }

		    while (j < n2) {
		      arr[r] = B[j];
		      j++;
		      r++;
		    }
		
		
	}
	
	public static void mergesort(int arr[], int l, int r)
	{
		if(r > l)
		{
			int m = (l + r) / 2;
			mergesort(arr, l, m);
			mergesort(arr, m+1, r);
			
			merge(arr, l,m,r);
		}
	}
}
