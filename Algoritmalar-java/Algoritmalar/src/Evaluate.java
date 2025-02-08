import java.util.Scanner;
import java.util.Stack;
import java.util.zip.ZipEntry;

public class Evaluate {
	
	
	public static void main(String[] args) {
		Stack<String>operatorler = new Stack<String>();
		Stack<Double>degerler = new Stack<Double>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Deðerinizi giriniz : " + " ");
		
		int i=0;
		String input = sc.nextLine();
		
		while(i < input.length())
		{
			
			String g = String.valueOf(input.charAt(i));
			i++;
			if(g.equals("("))
			{
				
			}
			else if(g.equals("+"))
			{
				operatorler.push(g);
			}
			else if(g.equals("-"))
			{
				operatorler.push(g);
			}
			else if(g.equals("*"))
			{
				operatorler.push(g);
			}
			else if(g.equals("/"))
			{
				operatorler.push(g);
			}
			else if(g.equals(")"))
			{
				String op = operatorler.pop();
				double val = degerler.pop();
				if(op.equals("+"))
				{
					val = degerler.pop() + val;
				}
				else if(op.equals("-"))
				{
					val = degerler.pop() - val;
				}
				else if(op.equals("*"))
				{
					val = degerler.pop() * val;
				}
				else if(op.equals("/"))
				{
					val = degerler.pop() / val;
				}
				degerler.push(val);
			}
			else {
				degerler.push(Double.parseDouble(g));
					
				
			}
			
			
		}
		System.out.println(degerler.pop());
		
		sc.close();
	}

}
