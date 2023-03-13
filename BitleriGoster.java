package javacozumleri;

//Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
//
//Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


public class BitleriGoster {
	
	public static String binaryCode(int n)
	{
		
		if(n == 1)
		{
			return "1";
		}
		else if(n  % 2 == 0)
		{
			return binaryCode(n/ 2) + "0";
		}
		else {
			
			return binaryCode(n / 2) + "1";
		}
	}
	
public static int countBits(int n){
	if(n > 0) {
	String metin = binaryCode(n);
		String dizim [] = metin.split("");
		int counter = 0;
		for(int i = 0; i < dizim.length; i++)
		{
			if(Integer.parseInt(dizim[i])  == 1)
			{
				counter++;
			}
		}
		return counter;
	}
	else return -1;
	
}
	public static void main(String[] args) {
		System.out.println(countBits(7));

	}

}
