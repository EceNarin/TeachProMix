import java.util.Scanner;

public class HalukHocaFilmahmin {
	/*
	 TASK :
	  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
	  filmin index nosuna göre sectiriniz
	  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
	  sağlayan method create ediniz...
	  Ahanda TRICK...
	  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
	  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
	  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
	  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
	  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
	 */
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
String [] movies= {"silicon valley", "The it crowd","indie game"," moneyball", "The internship","minority report","titanic","Snowden","su","stay"};
				
		   int dogru=0;
		   int yanlis=0;
			System.out.println("0-9 arasi rakamlari girerek filmseciniz vee oyuna baslayiniz");
			int choice=scan.nextInt();
			int cLeft=movies[choice].length()*2;
			System.out.println("sectiginiz filmin harf sayisi= " + (movies[choice].length()) + "ve hakkiniz" + cLeft);
			if(choice>=0 && choice<=9) {
				for(int i=cLeft;cLeft>0;i--) { 
					System.out.println("Film tahmininde bulununuz");
					String movieT=scan.nextLine().toLowerCase().trim();
				
				 if(movies[choice].toLowerCase().equals(movieT.toLowerCase())) {
					 System.out.println("Tebrikler dogru tahmin ettiniz" + "\nkalan tahmin hakkiniz=" + i + "yanlis sayniz= " + yanlis);
					 dogru++;
					 
				 }else {
					 if(i!=0) {
						 yanlis++;
						System.out.println("yanlıs tahminde bulundnuz , tekrar deneyiniz" + "yanlis tahmin sayiniz" + yanlis + "kalam hakkiniz" + i);
						continue;
					 }else {
						 System.out.println("===================================================================================");
						 System.out.println("Tahmin oyunu bitti " + " yanlis tahmin sayiniz= " + yanlis + " kalam hakkiniz= " + i 
								 +" total puaniniz= " + dogru);
						 break;
					 }
					 
				 }
				}
				
			}else {
				System.out.println("gecersiz tuslama yaptiniz lutfen");
			}
		

	}

}
