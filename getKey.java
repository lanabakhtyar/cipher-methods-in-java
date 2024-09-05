package studysesh;

public class getKey {

	public static void main(String[] args) {
		
		   String plain= "kaxaz";
		   String cipherText="wiikk";
		   
		   System.out.print("the plain text is "+ plain+"\n" +"The ciphertext is "+cipherText+"\n" +"The key used is ");
		   
		   int [] plainIndex= new int[plain.length()];
		   int[] cipherIndex= new int[cipherText.length()];
		   int [] keyIndex= new int[plain.length()];
		   char[]keyText= new char[plain.length()];
		   
		   for ( int i =0; i<plain.length() ;i++) {
			   
			   char c=plain.charAt(i); ///characteri plaintext war agret
			   plainIndex[i]=c-'a';   ///character la ascii code agoret bo indexakai la 0 ta 25
			   cipherIndex[i]=cipherText.charAt(i)-'a';   ///characteri ciphertext war agret
			   keyIndex[i]=cipherIndex[i]-plainIndex[i];  //    leraya indexi keyaka adozinawa yasaka la vigener cipher war agrin 
			   if (keyIndex[i]<0) {
				   keyIndex[i]+=26;   /// am if'a bp awaya ka indexaka nacheta  salbakanawa ba mujabi bmenetawa la 0 ta 25
			   }
			   keyText[i]=(char)(keyIndex[i]+'a');   /// aw key indexai ka doziwmanatawa aikainawa ba char
			   
			   System.out.print(keyText[i]);   //// key'dozrawatawa printi akain
			   
		   }
		   
		}
	}