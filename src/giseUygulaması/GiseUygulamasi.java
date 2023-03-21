package giseUygulaması;

import java.util.Scanner;

public class GiseUygulamasi {
	public static int toplamMaaliyetHesapla(int toplamGecirilenDakika) {
		int havaalaniGirisUcreti = 50;
		int dakikaMaaliyeti = 2;
		return (toplamGecirilenDakika * dakikaMaaliyeti + havaalaniGirisUcreti);
	}

	public static int toplamMaaliyetHesapla(int toplamGecirilenDakika, int otoparktaGecenSure) {
		int havaalaniGirisUcreti = 50;
		int dakikaMaaliyeti = 2;
		int otoparkUcreti = 3;
		return (toplamGecirilenDakika * dakikaMaaliyeti + otoparktaGecenSure * otoparkUcreti + havaalaniGirisUcreti);
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		String message = "Havaalanina Hosgeldiniz\n" 
				+ "Havaalani giris ucreti 50tl\n"
				+ "Havaaalanina aracsiz girisler icin A kapisindan,aracli girisler icin ise B kapisindandir\n"
				+ "geciridiginiz her sure boyunca dakikada 2 lira ucretlendirileceksiniz ve ucreti cikista odeyeceksiniz\n"
				+ "aracla geciridiğiniz zaman icinde otopark icin dakikada 3 lira ucret alınır\n";
		System.out.println(message);
		System.out.println("");
		System.out.println("");
		System.out.print("lutfen kapiyi seciniz: ");
		String kapiSecimi = scan.nextLine();

		while (true) {
			if (kapiSecimi.equals("A")) {
				String cl = "Havaalani cikis gisesine hosgeldiniz\n"
						+ "lutfen havaalanında gecirdiginiz toplam dakikayi giriniz: ";
				System.out.println(cl);
				int toplamGecirilenDakika = scan.nextInt();
				System.out.println("\ntoplam odeme miktarı:" + toplamMaaliyetHesapla(toplamGecirilenDakika));
				System.out.println("odeme isleminiz gerceklesiyor...");
				Thread.sleep(2000);
				System.out.println("odeme isleminiz basariyla tamamlandi iyi gunler dileriz");
				return;
			} else if (kapiSecimi.equals("B")) {
				String c2 = "Havaalani cikis gisesine hosgeldiniz\n\n"
						+ "Havaalaninda gecirdiginiz toplam dakikayi giriniz: ";
				System.out.println(c2);
				int toplamGecirilenDakika = scan.nextInt();
				System.out.println("araciniz otoparkta kaldigi sureyi giriniz: ");
				int otoparktaGecenSure = scan.nextInt();
				System.out.println(
						"toplam odeme miktari: " + toplamMaaliyetHesapla(toplamGecirilenDakika, otoparktaGecenSure)+" lira");
				Thread.sleep(2000);
				System.out.println("odeme isleminiz basariyla gerceklesti iyi gunler dileriz");
				return;

			} else {
				System.out.println("hatali bir secim yaptiniz");
				break;
			}

		}

	}
}
