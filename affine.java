package studysesh;

import java.util.Scanner;

public class affine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner out = new Scanner(System.in);
		 String plain = out.nextLine();
		 
		 int a =5;
		 int b=8;
		 
		 int [] cipher=  new int[plain.length()];
		 char ct[]= new char[plain.length()];
		 
		 for ( int i =0; i< plain.length(); i++) {
			 
			 int p_index= (int)plain.charAt(i)-'a';
			 cipher[i]= ((a*p_index)+b)%26;
			 ct[i]= (char)(cipher[i]+'a');
			 
				System.out.print(ct[i]);
			 
		 }
		 
		 
		 
		 
		
	}

}
