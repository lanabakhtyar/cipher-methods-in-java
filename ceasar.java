package studysesh;

import java.util.Scanner;

public class ceasar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner (System.in);
       String plain= in.nextLine();
       int shift=3; /// becuase its ceasar it uses a shift of three
       int []index = new int [plain.length()]; 
       int[] ciphercode= new int[plain.length()];
       char [] ciphertext = new char[plain.length()];
       int[]deciphercode= new int [plain.length()];
       char[]deciphertext= new char[plain.length()];
       
      
       System.out.println(" plaintext : "+ plain);
       System.out.print(" cipherCODE: ");
      for ( int i= 0; i<plain.length();i++) {
    	  index[i]= (int)plain.charAt(i)-'A';
       
      }
      for ( int i=0; i<plain.length();i++) {
    	  ciphercode[i]=(index[i]+shift)%26;
    
    	  ciphertext[i]= (char)(ciphercode[i]+'A');
          System.out.print(ciphertext[i]);
      }
      System.out.print(" decipherCODE: ");
      for ( int i= 0; i<plain.length();i++) {
    	  deciphercode[i]= (ciphercode[i]+23)%26; // labar mod nabe salb be
    	  deciphertext[i]= (char)(deciphercode[i]+'A');
    	  
          System.out.print(deciphertext[i]);
         
      }
      
      
      
      /// in order to do this using scanner we first take a string input
      // and then take each letter or char of that string and find out its index0-25 
      /// 
      
      

}
}
