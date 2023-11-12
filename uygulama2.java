package algoritmalar;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;

public class uygulama2 {

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		int dizi[] = new int[100];
        int basamak[] = new int[100]; 

        for (int i = 0; i < 100; i++) {
            int sayi = (int) (Math.random() * (100000 - 1000) + 1000);
            dizi[i] = sayi;
            basamak[i] = (int) Math.log10(sayi) + 1; 
        }

//        for (int bas = 1; max(dizi) / bas > 0; bas *= 10) {
//            radixsort(dizi, bas, basamak);
//        }
//        System.out.println(Arrays.toString(dizi));
//     final long duration = System.nanoTime() - startTime;
//		System.out.println(duration);
//        for (int bas = (int) Math.pow(10, (int) Math.log10(max(dizi)) + 1); bas >= 1; bas /= 10) {
//            radixsort(dizi, bas, basamak); 
//        }
//        System.out.println(Arrays.toString(dizi));
//        final long duration = System.nanoTime() - startTime;
//		System.out.println(duration);
        
//        countingsort(dizi);
//        System.out.println(Arrays.toString(dizi));
//        final long duration = System.nanoTime() - startTime;
//		System.out.println(duration);
        
        
//        bucketsort(dizi);
//        System.out.println(Arrays.toString(dizi));
//        final long duration = System.nanoTime() - startTime;
//		System.out.println(duration);
    }

    public static void radixsort(int arr[], int bas, int basamak[]) { // basamak dizisini al
        int dizi2[] = new int[arr.length];
        int sayma[] = new int[max(arr) + 1];

        for (int i = 0; i < arr.length; i++) {
            sayma[(arr[i] / bas) % 10]++;
        }

        for (int i = 1; i < sayma.length; i++) {
            sayma[i] += sayma[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            dizi2[sayma[(arr[i] / bas) % 10] - 1] = arr[i];
            sayma[(arr[i] / bas) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = dizi2[i];
        }

       
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (basamak[i] < basamak[j] || (basamak[i] == basamak[j] && arr[i] < arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        
    }
    
    public static void countingsort(int arr[])
    {
    	int dizi2[] = new int[arr.length];
    	int sayma[] = new int[max(arr)+1];
    	
    	for(int i = 0; i < sayma.length; i++)
    	{
    		sayma[i] = 0;
    	}
    	
    	for(int i = 0; i < arr.length; i++)
    	{
    		sayma[arr[i]]++;
    	}
    	
    	for(int i = 1; i < sayma.length; i++)
    	{
    		sayma[i] = sayma[i-1] + sayma[i];
    	}
    	
    	for(int i = arr.length-1; i >=0; i--)
    		
    	{
    		dizi2[sayma[arr[i]] - 1] = arr[i];
    		sayma[arr[i]]--;
    	}
    	for(int i = 0; i < dizi2.length; i++)
    	{
    		arr[i] = dizi2[i];
    	}
    }
    
    public static void bucketsort(int arr[])
    {
    	ArrayList<Integer>[] buckets = new ArrayList[arr.length]; 
		
		for(int i = 0; i < arr.length; i++)
		 {
			 buckets[i] = new ArrayList<Integer>();
		 }
		for(int i = 0; i < arr.length; i++)
		 {
			int index = (int) ((arr[i] - 1000) / (9900));
			 buckets[index].add(arr[i]);
			 
		 }
		
		for(int i =0; i < arr.length; i++)
		{
			for(int j = 1; j < buckets[i].size(); j++)
			{
				int k = j - 1;
				int key = buckets[i].get(j);
				
				while(k >= 0 && key <buckets[i].get(j))
				{
					buckets[i].set(k+1, buckets[i].get(k));
					k--;
				}
				buckets[i].set(k+1, key);
			}
		}
		
		int index = 0;
		for(int k = 0; k < arr.length; k++)
		{
			for(int i = 0; i < buckets[k].size(); i++)
			{
				arr[index++] = buckets[k].get(i);
			}
		}
    	
    }

    public static int max(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
	}

}
