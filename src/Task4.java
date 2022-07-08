import java.util.Random;
import java.util.Scanner;

public class Task4 {
	  /*
     * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
     * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
     * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
     *
     * TRICK : Random rnd = new Random();
               int sayi = rnd.nextInt(101); ===> random
       class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
       int sayi variable'a assign edilmeli.
     */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rnd=new Random();
     	int count=3;
		int puan=0;
		while(true) {
			int rnD=rnd.nextInt(101);
			for(int i=3;i>0;i--) {
				System.out.println("sayi tahmin ediniz." + i + " hakkiniz vardir" );
				int num=scan.nextInt();
				if(num!=rnD) {
					if(rnD<num) {
						System.out.println("hatali tahmin. girdiginiz degrden kucuk sayi giriniz");
					}else {
						System.out.println("hatali tahmin. girdiginiz degerden buyuk sayi giriniz");
					}
				}else {
					++puan;
					System.out.println("tebrikler basarili tahmin. Puaniniz= "+ puan);
					break;
				}
				--count;
				if(count==0) {
					System.out.println("tum hakkiniz bitmistir. diskalifiye oldunuz");
				}
			}
			System.out.println("devam etmek istiyor musunuz? \nEvet ise 1 \nHayir ise 0 tuslayiniz");
			int num1=scan.nextInt();
			if(num1==1) {
				continue;
			}else {
				break;
			}
		}
		

	}

}
