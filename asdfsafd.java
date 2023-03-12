package javacozumleri;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//Examples
//"This is an example!" ==> "sihT si na !elpmaxe"
//"double  spaces"      ==> "elbuod  secaps"




public class asdfsafd {

	
	public static String reverseWords(final String metin)
	
	{
		String yeniMetin = "";
		int k = 0;
		int count = 0;
		for(int i =0; i <= metin.length(); i++)
		{
			if(i == metin.length())
			{
				for(int t = i; t >= k; t--)
				{
					if(t==k)
						break;
					
					yeniMetin += metin.charAt(t-1);
				}
				
				
			
			}
			else if(metin.charAt(i) == ' ')
			{
				count++;
			 
			  for(int j = i; j >= k; j--)
			  {
				  if(j==k) {
					  yeniMetin +="";
					  break;
				  }
				
				  yeniMetin += metin.charAt(j-1);
			  }
			  if(count == 1)
				  yeniMetin +=" ";
			  k= i;
			}
			
		}
		 return yeniMetin;
		
	}
	
	public static void main(String[] args) {
		
	String metinolusturucu = reverseWords("<ORNEK1> 2 []ORNEK 2 lorem ipsum sor dolor amet");
	System.out.println(metinolusturucu);
	}


}
