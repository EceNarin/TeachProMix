import java.util.ArrayList;
import java.util.Scanner;

public class HalukProje2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */
		ArrayList<Integer>  fiyat=new ArrayList<>();
		fiyat.add(2);
		fiyat.add(3);
		fiyat.add(4);
		fiyat.add(6);
		fiyat.add(8);
		System.out.println(fiyat);
		ArrayList<String> sebMev=new ArrayList<>();
        sebMev.add("Limon");
        sebMev.add("Domates");
        sebMev.add("Patates");
        sebMev.add("Patlican");
        sebMev.add("Salatalik");
        System.out.println(sebMev);
       int ucret=0;
       int toplamUcret=0;
		while(true) {
			 System.out.println("urun seciniz");
       int st=sc.nextInt();
       
		        if(st<sebMev.size()) {
		        	
		        	System.out.println(sebMev.get(st) +" sectiniz. Kac kilo istiyorsunuz");
		        	int st1=sc.nextInt();
		        	ucret+=((st1)*fiyat.get(st));
		        	System.out.println(sebMev.get(st)+ " 'den"+ st1 +" kg aldniz" +" ucret tutari =" + ((st1)*fiyat.get(st))+ "tl'dir");
		        	toplamUcret+=+ucret;
		        	System.out.println("baska urun almak istoyor musunuz. istiyorsaniz 1'e, degilse 0 "); 
		        	
		        	int st2=sc.nextInt();
		        	if(st2==1) {
		        		
		        		continue;
		        	}else {
		        		System.out.println("Toplam odeme tutariniz " + toplamUcret + "Tl'dir");
		        		System.out.println("bizi tercih ettiginiz icin tesekkurler");
		        		break;
		        	}
		        }else  {
		        	System.out.println("urun stoklarimizda bulunmamaktadir.Lutfen bir");
		        	
		        } 
		        
		        
		        
		}
        }
	}


