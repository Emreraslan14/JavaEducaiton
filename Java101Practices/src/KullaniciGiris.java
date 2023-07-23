
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        String dogruID = "emre";
        String dogruSifre = "eraslan";
        String girilenKullaniciAdi, girilenSifre;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        girilenKullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        girilenSifre = input.nextLine();

        //(==) operatörü referansları karşılaştırırken , equals() methodu sadece değer karşılaştırır.

        if (girilenKullaniciAdi.equals(dogruID) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır) : ");
            String secim = input.nextLine();

            if ("Evet".equalsIgnoreCase(secim)) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();

                if (!yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }
            } else {
                System.out.println("O zaman hatırlamaya çalış.");
            }
        }

    }
}
