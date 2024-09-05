package studysesh;

public class atbash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plain="abcdefghijklmnopqrstuv";
		
		String ciphertext=" ";
		String decipher=" ";
		for ( int i=plain.length()-1; i>=0; i--) {
			ciphertext+=plain.charAt(i);
			
		}
		System.out.print(ciphertext);

	
	for (int i =ciphertext.length()-1; i>=0; i--) {
		decipher+=ciphertext.charAt(i);
	}System.out.print(decipher);

}
}