import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Task {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Cumle giriniz");
			String word=scan.nextLine().trim();
			longestWord(word);
			System.out.println(longestWord(word));
			}
     static String longestWord(String word) {
    	 String []arr= word.split(" ");
    	 String word2="";
    	int length=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i].length()>length) {
    			length=arr[i].length();
    			word2=arr[i];
    		}
    	}
		return word2 ;
	}

}
