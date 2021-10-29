package program;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st= sc.nextLine();
		String stnr="";
		char ch[]=st.toCharArray();
		for(int i=0; i<ch.length/2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i]= t;
		}
		stnr = new String(ch);
		if(stnr.equalsIgnoreCase(st)) {
			System.out.println("palindrome string");

		}
		else
			System.out.println("not palindrome");
	}
}
