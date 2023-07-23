
import java.util.Scanner;

public class NotOrtHesabi {

    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih);
        double sonuc = toplam / 5;

        if (sonuc >= 60)
            System.out.println("Sınıfı geçtiniz. TEBRİKLER. ");
        else
            System.out.println("Sınıfta kaldınız. Geçmiş olsun.");

    }
}
