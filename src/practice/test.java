package practice;

import java.util.Scanner;

public class test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		String st=sc.nextLine();
		String nstr="";
		char ch[] = st.toCharArray();
	
		for(int i=0; i<ch.length/2; i++){
			char t = ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		
		nstr=new String(ch);
		System.out.println(nstr);
	}
}

