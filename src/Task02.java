import java.util.Scanner;

public class Task02 {
	  /*
     * Kullanicidan gelen datayi methodda parametre olarak alan
     * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
     */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir int deger giriniz");
		int num=scan.nextInt();
		isPowNum(num);
		System.out.println(isPowNum(num));
		}
	public static boolean isPowNum(int num) {
		if(num==1) {
			return false; 
		}
		while(num>2) {
			if(num%2==0) {
				num/=2;
			}else {
				break;
			}
		}
		if(num==2) {
			return true;
		}
		return false;
	}
	
}
