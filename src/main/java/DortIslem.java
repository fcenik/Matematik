import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {

        int ilkSayi;
        int ikinciSayi;
        double sonuc;

        Scanner in = new Scanner(System.in);

        islemleriyazdir();

        System.err.print("Islem Seciniz:");
        int islem = in.nextInt();

        System.out.print("Ilk Sayiyi giriniz:");
        ilkSayi = in.nextInt();

        System.out.print("Ikinci Sayiyi giriniz:");
        ikinciSayi = in.nextInt();

        System.out.println("------------------");


        switch (islem) {
            case 1:
                sonuc = topla(ilkSayi, ikinciSayi);
                System.out.println("Toplam: " + sonuc);
                break;
            case 2:
                sonuc = cikar(ilkSayi, ikinciSayi);
                System.out.println("Cikarma: " + sonuc);
                break;
            case 3:
                sonuc = carp(ilkSayi, ikinciSayi);
                System.out.println("Carpma: " + sonuc);
                break;
            case 4:
                sonuc = bol(ilkSayi, ikinciSayi);
                System.out.println("Bolum " + sonuc);
                break;
            case 5:
                sonuc = alanHesapla(ilkSayi, ikinciSayi);
                System.out.println("Alan: " + sonuc);
                break;
            case 6:
                sonuc = modHesapla(ilkSayi, ikinciSayi);
                System.out.println("Mod: " + sonuc);
                break;
            case 7:
                sonuc = usHesapla(ilkSayi, ikinciSayi);
                System.out.println("Ussel Deger: " + sonuc);
                break;
            case 8:
                sonuc = kucukSayi(ilkSayi, ikinciSayi);
                System.out.println("Kucuk Sayi: " + sonuc);
                break;
            case 9:
                sonuc = buyukSayi(ilkSayi, ikinciSayi);
                System.out.println("Buyuk Sayi: " + sonuc);
                break;
            default:
                System.out.println("-----Hatali Secim-------");
                break;
        }
        System.out.println("------------------");
    }


    // Yusuf
    // iki sayinin toplamini hesaplar
    // return ile toplama isleminin sonucu dondurulmelidir!
    private static int topla(int ilkSayi, int ikinciSayi) {

        return 0;
    }


    // Kerem
    // ilk sayidan ikinci sayi cikarilir
    // return ile cikarma isleminin sonucu dondurulmelidir!
    private static int cikar(int ilkSayi, int ikinciSayi) {

        return 0;
    }


    // Kudret
    // iki sayinin carpma islemini yapar
    // return ile carpma isleminin sonucu dondurulmelidir!
    private static int carp(int ilkSayi, int ikinciSayi) {

        return 0;
    }

    // Erhan
    // bolme islemini yapar, ilk sayi bolunen, ikici sayi bolen
    // return ile bolme isleminin sonucu dondurulmelidir!
    private static double bol(int ilkSayi, int ikinciSayi) {

        return 0;
    }


    // Furkan
    // Dikdortgenin alan hesabi yapilir
    // return ile alan degeri dondurulmelidir!
    private static int alanHesapla(int ilkSayi, int ikinciSayi) {

        return 0;
    }


    // Bahadir
    // ilk sayinin ikinci sayiya göre mod degerini hesaplar
    // return ile hesaplanan deger dondurulmelidir!
    private static int modHesapla(int ilkSayi, int ikinciSayi) {

        System.out.println("modHesapla by Bahadir");

        return ilkSayi % ikinciSayi;
    }


    // Selim
    // ilk sayinin ikinci sayiya göre ussunu hesaplar
    // return ile sonuc dondurulur!
    private static double usHesapla(int ilkSayi, int ikinciSayi) {

        return 0;
    }


    // Asim
    // verilen iki sayidan kucuk olani bulur
    // return kucuk sayi dondurur!
    private static int kucukSayi(int ilkSayi, int ikinciSayi) {

        return 0;
    }


    //
    // verilen iki sayidan buyuk olani bulur
    // return buyuk sayi dondurur!
    private static int buyukSayi(int ilkSayi, int ikinciSayi) {
        if (ilkSayi > ikinciSayi) {
            return ilkSayi;
        } else {
            return ikinciSayi;
        }
    }


    private static void islemleriyazdir() {
        System.out.println("---- Islemler ----");
        System.out.println("Topla: 1");
        System.out.println("Cikar: 2");
        System.out.println("Carp: 3");
        System.out.println("Bol: 4");
        System.out.println("Alan Hesapla: 5");
        System.out.println("Mod Hesapla: 6");
        System.out.println("Us Hesapla: 7");
        System.out.println("Kucuk Sayi: 8");
        System.out.println("Buyuk Sayi: 9");
        System.out.println("------------------");
    }
}
