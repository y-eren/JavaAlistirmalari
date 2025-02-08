package Solution;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Solution {
	 public static void romanToInt(String s) {
	      int sayi = s.length();
			 String dizi[] = new String[sayi];
			dizi = s.split("");
//			
//			I can be placed before V (5) and X (10) to make 4 and 9. 
//			X can be placed before L (50) and C (100) to make 40 and 90. 
//			C can be placed before D (500) and M (1000) to make 400 and 900.
			
			int sum=0;
			int i;
			for (i = 0; i < dizi.length - 1; i++) {
				if(dizi[i].equals("C"))
				{
					if(dizi[i+1].equals("D"))
					{
						sum+=400;
						i++;
					}
					else if(dizi[i+1].equals("M"))
					{
						sum+=900;
						i++;
					}
					
				
					else
						sum+=100;
				}
				else if(dizi[i].equals("X"))
				{
					if(dizi[i+1].equals("L"))
					{
						sum+=40;
						i++;
					}
					else if(dizi[i+1].equals("C"))
					{
						sum+=90;
						i++;
					}
					else
						sum+=10;
				}
				else if(dizi[i].equals("I"))
				{
					if(dizi[i+1].equals("V"))
					{
						sum+=4;
						i++;
					}
					else if(dizi[i+1].equals("X"))
					{
						sum+=9;
						i++;
					}
					else
						sum+=1;
				}
				
			
				else  if (dizi[i].equals("V")) {
	               
	                
						sum+=5;
					
				 }
				else  if (dizi[i].equals("L")) {
	                    
	                   
	    					sum+=50;
	    				
	                }
				else if (dizi[i].equals("M")) {
	                    
	                   
	    					sum+=1000;
	    				
	                }
				else if (dizi[i].equals("C")) {
	                
	               
						sum+=100;
					
	            }
				else if (dizi[i].equals("D")) {
	               
	                
						sum+=500;
					
	            }
				
				
			
			
			}
			if(sayi == 1)
			{
				if(dizi[dizi.length - 1].equals("C"))
				{
					sum+=100;
				}
				else if(dizi[dizi.length - 1].equals("I"))
				{
					sum+=1;
				}
				else if (dizi[dizi.length - 1].equals("X"))
				{
					sum+=10;
				}
				else if (dizi[dizi.length - 1].equals("M"))
				{
					sum+=1000;
				}
				else if(dizi[dizi.length - 1].equals("L"))
				{
					sum+=50;
				}
				else if(dizi[dizi.length - 1].equals("D"))
				{
					sum+=500;
				}
				else if(dizi[dizi.length - 1].equals("V"))
				{
					sum+=5;
				}
			}
			
			else if(dizi[dizi.length - 1].equals(dizi[dizi.length - 2]))
			{
				if(dizi[dizi.length - 1].equals("C"))
				{
					sum+=100;
				}
				else if(dizi[dizi.length - 1].equals("I"))
				{
					sum+=1;
				}
				else if (dizi[dizi.length - 1].equals("X"))
				{
					sum+=10;
				}
				else if (dizi[dizi.length - 1].equals("M"))
				{
					sum+=1000;
				}
				else if(dizi[dizi.length - 1].equals("L"))
				{
					sum+=50;
				}
				else if(dizi[dizi.length - 1].equals("D"))
				{
					sum+=500;
				}
				else if(dizi[dizi.length - 1].equals("V"))
				{
					sum+=5;
				}
				
			}
			else   {
				
				if(i!=dizi.length) {	
				
				if(dizi[dizi.length - 1].equals("C"))
				{
					sum+=100;
				}
				else if(dizi[dizi.length - 1].equals("I"))
				{
					sum+=1;
				}
				else if (dizi[dizi.length - 1].equals("X"))
				{
					sum+=10;
				}
				else if (dizi[dizi.length - 1].equals("M"))
				{
					sum+=1000;
				}
				else if(dizi[dizi.length - 1].equals("L"))
				{
					sum+=50;
				}
				else if(dizi[dizi.length - 1].equals("D"))
				{
					sum+=500;
				}
				else if(dizi[dizi.length - 1].equals("V"))
				{
					sum+=5;
				}
				}
			}
				
			
			
		System.out.println(sum);
		
		
	
		 
		 
		 
	    }
	 
	public static void main(String[] args) {
	romanToInt("MCMXCIV");
//	romanToInt("DCXXI");
//	ROMANTOINT("MDLXX");
//	ROMANTOINT("MCM");
	romanToInt("D");
		

	}

}
