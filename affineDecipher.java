package studysesh;

import java.util.Scanner;

public class affineDecipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner out = new Scanner(System.in);
		decipher("insx");
		
		
	
	

}



public static String decipher(String ciphertextt) {
	int a=5;
	int b=8;

	
	String ciphertext=ciphertextt;
	int [] index= new int[ciphertext.length()];
	char[] decipher= new char[ciphertext.length()];
	
	
	for( int i=0; i<ciphertext.length(); i++) {
		int aInv =26-a;
		 index[i]= aInv*((ciphertext.charAt(i)-'a')-b)%26;
		 if ( index[i]<0) {
			 index[i]+=26;
		 }
		 decipher[i]=(char)(index[i]+'a');
		 System.out.print(decipher[i]);	
}
	return decipher.toString();

}}