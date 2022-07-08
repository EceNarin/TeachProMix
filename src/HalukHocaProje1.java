import java.util.ArrayList;
import java.util.Scanner;

public class HalukHocaProje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
		 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
		 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
		 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
		 *
		 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
		 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
		 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
		 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
		 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
		 *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
		 *            ortalama kazançtan yüksekse o günleri return yap.
		 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
		 *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
		 *            ortalama kazançtan aşağıysa o günleri return yap.
		 * */
		ArrayList<String> days=new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		System.out.println(days.size());
		int dayNmb=days.size();
		ArrayList<Integer> dailyIncome=new ArrayList<>();
		int i=0;
		while(i<days.size()) {
			System.out.println(days.get(i)+" gunu icin kazancinizi giriniz");
			dailyIncome.add(sc.nextInt());
			i++;
		}
		System.out.println(dailyIncome);
		avarageIncome(dailyIncome, days);
		System.out.println("Haftalik ortalama kazanciniz" + avarageIncome(dailyIncome, days));
		System.out.println("gunlerde ortalama ustu kazanc yaptiniz" + " " + aboveAvarage(dailyIncome, days));
		System.out.println( underAvarage(dailyIncome,days)+"gunlerde ortalama alti kazanc yaptıniz");
		
	}

	private static String aboveAvarage(ArrayList<Integer> dailyIncome, ArrayList<String>days ) {
		
		String aboveAvarage="";
	   for(int i=0;i<days.size();i++) {
		   if(dailyIncome.get(i)>avarageIncome(dailyIncome, days)) {
			   aboveAvarage+=days.get(i);
		   }
	   }
		return aboveAvarage;
	}

	private static String underAvarage(ArrayList<Integer>dailyIncome,ArrayList<String>days) {
		String underAvarage="";
		for(int i=0;i<days.size();i++) {
			   if(dailyIncome.get(i)<avarageIncome(dailyIncome, days)) {
				  underAvarage += days.get(i);
				  // underAvarage(dailyIncome, days);
			   }
		   }
	
		return underAvarage;
	}

	private static int avarageIncome(ArrayList<Integer> dailyIncome,ArrayList<String>days) {
		// TODO Auto-generated method stub
		int avarage=0;
		for(int i=0;i<days.size();i++) {
			avarage+=dailyIncome.get(i);
		} avarage=avarage/days.size();
	
		return avarage;
	}

}
