package javacozumleri;
//you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
//
//Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

public class DigitDigit {

	
	public static int squareDigits(int n) {
	   
	String sayi = Integer.toString(n);
	int basamak =  sayi.length();
	String dizi[] = sayi.split("");
	String anaMetin = "";
	
	for(int i = 0; i < basamak; i++)
	{
		int sayi1 = 0;
	  sayi1 =  (int) Math.pow(Integer.parseInt(dizi[i]), 2);
	  String  donus = Integer.toString(sayi1);
	   anaMetin  += donus;
	}
	int sonSayi = Integer.parseInt(anaMetin);
	return sonSayi;
	
		
		
	  }

	public static void main(String[] args) {
		
		System.out.println(squareDigits(735));
	}

}
