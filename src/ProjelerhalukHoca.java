import java.util.Random;
import java.util.Scanner;

public class ProjelerhalukHoca {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 /* TASK:
		    tas >makas
		    makas >kagit
		    kagit >tas
		Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
		Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
		While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
		Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
		Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
		Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
		En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
		dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
		*/
    System.out.println(Byte.MAX_VALUE);
 
     int kcount=0;
     int pcount=0;
	while(true) {
		System.out.println("Tas icin 0, kagit icin 1 ve makas icin 2'yi tuslayiniz seceneklerinden birini giriniz");
		int num=scan.nextInt();
		 int random= (int)(Math.random()*3);
		if(num<=2) {
			if(num==0 && random==1) {
				pcount++;
				System.out.println("kaybettiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
			}else if(num==0 && random==2) {
					kcount++;
					System.out.println("kazandiniz Pc kaybetti" + "puanınız=" + kcount + "pc puanı" + pcount);
			}else if(num==2 && random==0) {
					pcount++;
					System.out.println("kaybettiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
			}else if(num==1 && random==0) {
					kcount++;
					System.out.println("kazandiniz Pc kaybetti" + "puanınız=" + kcount + "pc puanı" + pcount);
			}else if(num==2 && random==1) {
				kcount++;
				System.out.println("kazandiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
			}else if(num==1 && random==2) {
				pcount++;
				System.out.println("kaybettiniz Pc kazandi" + "puanınız=" + kcount + "pc puanı" + pcount);
			}else if(num==0 && random==0 ||num==1 && random==1 || num==2 && random==2) {
				System.out.println("Berabere kaldiniz");
			}
			}else {
				System.out.println("2'den buyuk ya da negatif bir deger girdiniz tekrar deneyiniz");
			} System.out.println(" devam etmek isityor musunuz? evet ise 1 hayir ise 0'a basiniz");
			 int num1=scan.nextInt();
			if(num1==1) {
				continue;
			}if (num1==0) {
				if(kcount<pcount) {
					System.out.println("yarisi kaybettiniz. net puaniniz= " +kcount);
				}else if (kcount>pcount) {
					System.out.println("tebrikler kazandiniz! .Net puaniniz= " + kcount);
				}else if(kcount==pcount) {
					System.out.println("berabere bitti. Net puanınız" +kcount);
				}
				break;
			}
			
			
			
	}
		
	}
		
		
	}

	


