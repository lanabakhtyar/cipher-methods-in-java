package studysesh;

import java.util.Scanner;

public class vigCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner out= new Scanner(System.in);
		String plain = out.nextLine();
		String key = out.nextLine();
		
		int[]plainIndex= new int[plain.length()];
		int[]keyIndex= new int[key.length()];
		int[]cipherIndex= new int[plain.length()];
		char[]ciphertext= new char[plain.length()];
		
		System.out.println(" the plaintext is: "+ plain);
		System.out.print(" the plaintext index is: " );
		
		for ( int i =0; i<plain.length();i++) {
			char  ci=plain.charAt(i);
			if(ci >='a' && ci<='z') {
			plainIndex[i]= plain.charAt(i)-'a';
			System.out.print(plainIndex[i] +" ");
			}
		}
		
		

		System.out.println(" ");
		System.out.println(" the key is: "+ key);
		System.out.print(" the key index is: " );
		
		for (int i=0; i<key.length();i++) {
			char  ci=plain.charAt(i);
			if(ci >='a' && ci<='z') {
			keyIndex[i]=key.charAt(i)-'a';
			System.out.print(keyIndex[i]+" ");
     		}
		
		}
		
		System.out.println(" ");
		System.out.print(" the cipher index  is: ");
		
		for ( int i=0 ; i<plain.length(); i++) {
			
			cipherIndex[i]=plainIndex[i]+keyIndex[i];
			if (cipherIndex[i]>=26) {
				cipherIndex[i]=cipherIndex[i]-26;
			}
			System.out.print(cipherIndex[i]+" ");
		
		}
		
		System.out.println(" ");
		System.out.print(" the cipher text  is: ");
		
		for (int i=0; i<plain.length();i++) {
			ciphertext[i]=(char)(cipherIndex[i]+'a');
			System.out.print(ciphertext[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
