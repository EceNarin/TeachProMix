import java.util.Scanner;

public class FlyingPro {
	 /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */  
	static int AB;
	static int AC;
	static int AD;
	 double kmP=0.10;
	public FlyingPro(int AB, int AC, int AD, double kmP) {
		this.AB=AB;
		this.AC=AC;
		this.AD=AD;
		this.kmP=kmP;
	}
	 static double flyP(int city) {
		double sum1=0;
		switch(city) {
		case 1:
			sum1= AB*(0.10);
			break;
		case 2:
			sum1=AC*0.10;
			break;
		case 3:
			sum1=AD*0.10;
			break;
		}
		return sum1;
	 }
	  static double Age(double flyP ,int age) {
		  double totalP=0;
		  if(age<12) {
			  totalP=flyP*(0.5);
		  }else if(age<12 || age<24) {
			  totalP=flyP*(0.1);
		  }else if(age>65) {
			  totalP=flyP*(0.3);
		  }
		  return totalP;
	  }
	  static double gidisDonus(int choice,double currentPrice) {
		 double lastPrice=0;
		  switch(choice) {
		  case 1:
			  break;
		  case 2:
			 lastPrice= currentPrice*(0.2);
			break;
		  }
		  return lastPrice;
	  }
	public static void main(String[] args) {
		FlyingPro fp=new FlyingPro(500,700,900,0.10);
		Scanner scan=new Scanner(System.in);
		System.out.println("\n A-B arasi seyahat icin 1'i,\n A-C sehirleri arasi seyahat etmek icin 2'yi,\n A-D sehirleri arasi seyhat etmek icin 3'u seciniz");
		int city=scan.nextInt();
		System.out.println(flyP(city)+"$");
		System.out.println("yasinizi giriniz");
		int age=scan.nextInt();
		double currentPrice=(flyP(city)-Age(flyP(city), age));
		System.out.println(Age(flyP(city), age) + "$ indirim aldiniz" + "\n Net Fiyat=" + currentPrice);
		System.out.println("Gidis icin 1, \t\nGidis-Donus icin 2'yi seciniz");
		int choice=scan.nextInt();
		gidisDonus(choice, currentPrice);
		double lPrice= (int) currentPrice-(gidisDonus(choice, currentPrice));
		System.out.println("Tebrikler bilet alim isleminiz tamamlandi!. \n==================\nIndirim tutariniz= "+ gidisDonus(choice, currentPrice)+ "$");
		System.out.println("============================= \nMevcut odeme tutariniz= " + lPrice+ "$");
		
		
	}

}
