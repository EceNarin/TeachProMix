import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manavv {


	private static ArrayList<String> urunSec(List<String> names, int choice) {
	 ArrayList<String> sepet=new ArrayList<String>();
	       names.get(choice);
	sepet.add(names.get(choice));
		  return sepet;
	       } 
	private static double fiyat(List<Double>price, int choice){
		double totalPrice=0;
		 totalPrice+=price.get(choice);
		return totalPrice;
	}
	private static void odeme(double lastFiyat, int money) {
		double paraUstu=0;
		System.out.println(  Math.round(money-lastFiyat) + " dolar para ustunuz almayi unutmayiniz ");
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Marketimize HosGeldiniz.Secmek istediginiz urunleri kodlariyla aliniz");
		List<String> names= List.of("Domates","Patates","Biber","Sogan","Havuc","Elma","Muz","Cilek","Kavun","Uzum","limon");
		List<Double> price= List.of(2.10,3.20,1.5,2.5,3.10,1.20,1.90,6.30,4.10,0.50);
	    	System.out.println("seciminizi yapiniz");
	    	double currentPrice=0;
	    	double lastFiyat=0;
            ArrayList<String> sepet=new ArrayList<>();
	    	while(true) {
	    		int choice=scan.nextInt();
	    		urunSec(names, choice);
	    		fiyat(price, choice);
	    		System.out.println(urunSec(names, choice) +" urununu aldiniz "+ "\nkilosu " +price.get(choice)+"$");
	    		System.out.println("kac kilo almak istiyorsunuz");
	    		int kg=scan.nextInt();
	    		sepet.addAll(urunSec(names, choice));
	    		currentPrice=fiyat(price, choice)*kg;
	    		lastFiyat+=currentPrice;
	    		System.out.println(kg +" kilo " + urunSec(names, choice)+" aldiniz. \nOdenecek tutar= " + currentPrice+ " $ ");
	    		System.out.println("sepete ekleme yapacak misiniz? \nEvet ise E \nHayir ise H ");
	    		String secim=scan.next().toUpperCase();
	    		if(secim.equals("E")) {
	    			System.out.println("lutfen secmek istediniz urunu giriniz ");
	    			continue;
	    		}else {
	    			System.out.println("aldiginiz urunler " + sepet + "mevcut odenecek tuttariniz= " + lastFiyat+ "\n================ Lutfen odeme icin sepete geciniz ");
	    			break;
	    		}
	    	}
	    	System.out.println("odeme tutarinizi giriniz");
	    	int money=scan.nextInt();
	    	odeme(lastFiyat,money);
	    	
	}
	
}
