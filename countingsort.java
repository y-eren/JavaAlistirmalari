package algoritmalar;

import java.sql.Array;


public class countingsort {
public static int max(int arr[])
{
	int max = arr[0];
	
	for(int i=1; i < arr.length; i++)
	{
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	return max;
}
	
	public static void main(String[] args) {
		int dizi[] = {1,2,5,7,8,8,8,9,4,2,5};
		
		int sayi = max(dizi);
		int dizi2[] = new int[dizi.length];
		
		int sayma[] = new int[sayi+1];
		
		for(int i =0; i <= sayi; i++)
		{
			sayma[i] = 0;
		}
		
		for(int j = 0; j< dizi.length; j++)
		{
			sayma[dizi[j]]= sayma[dizi[j]] + 1;
		}
		for(int j = 1; j <=sayi; j++)
		{
			sayma[j] = sayma[j] + sayma[j-1];
		}
		for(int j = dizi.length-1; j >= 0; j--)
		{
			dizi2[sayma[dizi[j]]-1] = dizi[j];
			sayma[dizi[j]]--; 
		}
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		
		
		
		

	}

}
