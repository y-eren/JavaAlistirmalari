package Solution;

import java.util.*;

public class Soru3 {
	 public static int lengthOfLongestSubstring(String s) {
	    
	     int sayi =s.length();
	     String[] a = new String[sayi];
	     int b[] = new int[5];
	      a = s.split("");
	     int max=1;
	    int i=0;
	    int j=i+1;
	    int u =0;
	     while(i < a.length && j< a.length)
	     {
				if(!a[i].equals(a[j]))
				{
					max++;
					j++;
					
				}
				else {
					i = i + max;
					j++;
					int temp=max;
					b[u]=temp;
					u++;
					max = 0;
					
					
					
				}
	     }
	    
	     
	      return max;
	      
	    }
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
	}

}
