import java.util.Scanner;

public class Task3 {
	 /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int point1=0;
		int point2=0;
		   while(true) {
    	System.out.println("1. oyuncu kelimesi");
		String firstGamer=scan.next();
		StringBuilder sb=new StringBuilder(firstGamer);
		System.out.println(sb);
		System.out.println("1. oyuncunun kelimesini kabul ediyor musunuz? \n\t Evet ise 1, \n\tHayir ise 0 tuslayiniz");
		int num=scan.nextInt();
		if(num==1) {
			point1+=sb.length();
			System.out.println("Devam etmek istiyor musunuz? \n\tEvet ise E, \n\tHayir ise H tuslayiniz." +point1);
			char choice=scan.next().toUpperCase().charAt(0);
			if(choice=='E') {
				System.out.println("Kelimenin basina mi sonuna mi ekleme yapmak istiyorsunuz?.\n\tBasina ise B, \n\tsonuna ise S");
				char str=scan.next().toUpperCase().charAt(0);
				System.out.println(" ekleyeceginiz kelimeyi yaziniz");
				String addWord=scan.next();
				if(str=='B') {
					sb.insert(0, addWord);
					System.out.println("kelimenin son hali =" + sb);
					continue;
				}else if(str=='S') {
					sb.append(addWord);
					System.out.println("kelimenin son hali " + sb);
					continue;
				}
				
			}else {
				System.out.println("gecersiz kelime");
				System.out.println("firstGamer point is=" +point1 + "SecondGamer point is= " +point2);
				break;
			}
			
		}
		break;
    }
	}

}
