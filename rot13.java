package studysesh;

import java.util.Scanner;

public class rot13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input= new Scanner(System.in);
       System.out.println(" please enter the plain text ");
       String plain= input.nextLine();
       int [] pencoding= new int[plain.length()];
       char [] cipher13= new char[plain.length()];
       int [] decipherIndex= new int[plain.length()];
	   char [] deciphertext = new char[plain.length()];
       
       System.out.println(" ciphertext ");
       for ( int i=0; i<plain.length(); i++) {
    	   pencoding[i]= plain.charAt(i);
    	   if (Character.isAlphabetic(pencoding[i])) {
    		   pencoding[i]= (pencoding[i]-'a'+13)%26;
    		   cipher13[i]= (char)(pencoding[i]+'a');
    		   
    	   }
           System.out.print(cipher13[i]);
       }
       
       System.out.println("\n deciphertext ");
       for( int i=0; i<plain.length(); i++) {
    	   decipherIndex[i]=(cipher13[i]-'a'+13)%26;
    	   deciphertext[i]= (char)(decipherIndex[i]+'a');
           System.out.print(deciphertext[i]);
       }
       
       
	}

}
