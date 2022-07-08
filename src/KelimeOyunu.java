	import java.util.Scanner;
	public class KelimeOyunu {
		static Scanner scan = new Scanner(System.in);
		static int point1 = 0;
		static int point2 = 0;
		static boolean endGame = false;
		static StringBuilder sb;
		static String addWord;
		public static void main(String[] args) {
			
			int turn = 2;
			int player = 1;
			
			System.out.println("1. Oyuncunun kelimesi:");
			addWord = scan.next();
			sb = new StringBuilder(addWord);
			System.out.println(sb);
			
			while(!endGame) {
				switch(turn) {
				case 1: // 1. Oyuncunun sırası
					turnBuilder(player, turn);
					turn = 2;
					player = 1;
					break;
				case 2: // 2. Oyuncunun sırası	
					turnBuilder(player, turn);
					turn = 1;
					player = 2;
					break;
				}
			}
		}
		
		public static void turnBuilder(int player, int turn) {
			System.out.println(player + ". Oyuncunun kelimesini kabul ediyor musunuz? \n\t Evet ise 1, \n\tHayir ise 0 tuslayiniz");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				switch(player) {
				case 1:
					point1 += addWord.length();
					break;
				case 2:
					point2 += addWord.length();
					break;
				}
				System.out.println("Devam etmek istiyor musunuz? \n\tEvet ise E, \n\tHayir ise H tuslayiniz.");
				char choice = scan.next().toUpperCase().charAt(0);
				switch(choice) {
				case 'E':
					System.out.println("Kelimenin basina mi sonuna mi ekleme yapmak istiyorsunuz?.\n\tBasina ise B, \n\tsonuna ise S");
					char str = scan.next().toUpperCase().charAt(0);
					System.out.println("Ekleyeceginiz kelimeyi yaziniz.");
					addWord=scan.next();
					switch(str) {
					case 'B':
						sb.insert(0, addWord);
						System.out.println("Kelimenin son hali = " + sb);
						break;
					case 'S':
						sb.append(addWord);
						System.out.println("Kelimenin son hali = " + sb);
						break;
					}
					break;
				case 'H':
					System.out.println("Game Over");
					System.out.println("firstGamer point is = " +point1 + "SecondGamer point is = " + point2);
					endGame = true;
					break;
				}
				break;
			case 0:
				System.out.println("Gecersiz kelime");
				System.out.println("firstGamer point is = " +point1 + "SecondGamer point is = " + point2);
				endGame = true;
				break;
			}
		}
	}

