import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, tarih;
        int notSayisi = 0;
        int toplamNot = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            notSayisi++;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            notSayisi++;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            notSayisi++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            notSayisi++;
        }

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();
        if (tarih >= 0 && tarih <= 100) {
            toplamNot += tarih;
            notSayisi++;
        }

        double ortalama = (double) toplamNot / notSayisi;
        if (notSayisi > 0) {
            if (ortalama <= 55) {
                System.out.println("Sınıfta Kaldınız.");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz.");
            }
            System.out.println("Ortalamanız: " + ortalama);
        }
        else {
            System.out.println("Ortalama hesaplanamadı.");
        }
    }
}
