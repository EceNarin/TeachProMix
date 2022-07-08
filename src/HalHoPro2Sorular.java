import java.util.Scanner;

public class HalHoPro2Sorular {
	/*1
    İki tane pozitif integer sayısı verildiğinde
    sayı 1 min degerinde
    sayı 2 max degerinde
    min ve max arasinda random sayi elde et(olustur)
    output veri tipi int olmali
     */
	 /*2
    Given a int ,
        if the age less then and equal 10
            print  too young to create a facebook account
         if the age less then and equal 16
            print  too young to get a driver's license
         if the age less then and equal 18
            print  too young to get a tattoo
        if the age less then and equal 21
            print  too young to drink alcohol
        if the age bigger or equal to 21
            print  do what ever you want to do
    Note: use if else statement.
 */
	 /*3
    Given an int check the number is even or not
    if the number is even print true
    if the number is odd print false
    result should be true or false.
 */
	//4
	 /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.
    input: Test output
           b: 0
       output 0 olmalı
    input: bucket
           b:1
       output 1 olmalı
       */


   //hint: .charAt, length(), for, index, counter,
	//5
	 /*
    Veri tipi int olan variable(değişken) verildiğinde
        Eger int 1 ise print monday
        Eger int 2 ise print tuesday
        Eger int 3 ise print wednesday
        Eger int 4 ise print thursday
        Eger int 5 ise print friday
        Eger int 6 ise print saturday
        Eger int 7 ise print sunday
        Eger int 8 den buyuk ise  print "this is not a valid day"
        NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN
 */
	/* 6
	3 tane pozitif String verildiğinde
    sayısal olmayan tüm karakterleri kaldırın.
    Stringleri int e çevirin
    ve total print edin
        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65; olmali
       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir*/
	/*7
    Bir String verildiğinde
    Eger String harf sayisi tek ise true print et değilse false print et
    */
	  /*8
    Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
    Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
   Örnek:      "abc", "cat" --> "abcat"
               "abc", "dog"  -->"abcdog"
     */
	 /*9
    Pozitif bir int  num verildiğinde, return edildiği zaman num tamkare ise true veren değilse false veren bir foksiyon yazın.
 Not: sqrt gibi MATH class method  kullanmayın.
        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16
        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25
        Example 3:
        Input: 14
        Output: false
     */ 
	/*10
    Veri tipi int olan bir sayı verildiğinde
    0 dan başlayarak verilen sayıya kadar olan tum cift sayıları print edin.
    Example 1:
    int input = 10;
    print  0 2 4 6 8 10  olmalı
    Example 2:
    int input = 15;
    print  0 2 4 6 8 10 12 14  olmalı
     */
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        String s1 = scanner.nextLine();

	        String[] elements = s1.split(" ");

	        int min = Integer.parseInt(elements[0]);
	        int max = Integer.parseInt(elements[1]);
	}

}
