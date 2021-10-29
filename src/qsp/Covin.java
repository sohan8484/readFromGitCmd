package qsp;

public class Covin {
	static long AadharNo=495464565L;
	static void vaccineRegister(long adno) {
		if (AadharNo==adno) {
			System.out.println("success");
		}
		else {
			@SuppressWarnings("unused")
			AdharInvalid e=new AdharInvalid();
		}
	}
public static void main(String[] args) {
	vaccineRegister(495464565L);
}	
}
