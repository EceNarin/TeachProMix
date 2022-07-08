import java.util.Scanner;

public class TahminOyunu {

	/*Kullanıcıya film seçmesi için numara sor
	Numaranın doğruluğunu kontrol et
	Girilen numaralı indexteki filmin harf sayısını ekrana yazdır
	Harf sayısı * 2 kadar tahmin hakkını ekrana yazdır
	Tahmin hakkı kadar tekrarlı döngü içinde
		Kullanıcıya tahminini sor
		Tahmin doğru ise
			Bildiniz de
			Kaç tahminde bildiğini göster
			Tekrar oynamak isteyip istemediğini sor
			İstiyorsa
				Baştan başlat
			İstemiyorsa
				Çık
		Tahmin yanlış ise
			Bilemediniz de
			Daha tahmin hakkı var ise
				Tahmin hakkını bir azalt
				Kaç tahmin hakkı kaldığını söyle
				Tekrar tahmin etmesini iste
			Daha tahmin hakkı yok ise
				Tahmin hakkınız doldu de*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
String [] movies= {"JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC","kILLBILL","MILLENIUMMAMBO"};
 int choice;
 int pLeft;
 int dogru=0;
 int yanlis=0;
        while(true) {
	
	            while(true) {
	            	System.out.println("Tahmin edeceginiz filmin 0-9 arasinda seciniz");
		            choice=scan.nextInt();
		           
	            	if(choice >= 0 && choice<10) {
	            		break;
	            	}else {
	            		System.out.println("1-10 arasi deger gir gerizekali");
	            	}
	            }
	            pLeft=movies[choice].length()*2;
	            System.out.println("girdiginiz filmin karakter sayisi= " + movies[choice].length() + "\t Tahmin hakkiniz= " + pLeft );
	            while(pLeft>0) {
	            	pLeft--;
	            	System.out.println("film tahmininde bulununuz");
	            	String movie=scan.next().toLowerCase().trim(); 
	       
	            	if(movies[choice].toUpperCase().equals(movie)) {
	            		++dogru;
	            		System.out.println("bildiniz. Kalan tahmin sayiniz= " + pLeft);
	            	  break;
	            	}else{
	            		++yanlis;
	            		System.out.println("bilemediniz. Kalan tahmin sayiniz= " + pLeft);
	            		
	            	}
	            } 
	            System.out.println("Butun tahmin hakkinizi kullandiniz" );
	            System.out.println("kazandiginiz oyun=" + dogru + "\nKaybettiginiz oyun sayisi= " + yanlis );
	            System.out.println("************************************************************");
	           System.out.println("devam etmek istiyor musunuz? Istiyorsaniz: \n1 \nıstemiyorsaniz \n2  ");
	           int gobreak=scan.nextInt();
	           if(gobreak==1) {
	        	   continue;
	           }else {
	        	   System.out.println("get out here!!");
	        	   break;
	           }
           }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
