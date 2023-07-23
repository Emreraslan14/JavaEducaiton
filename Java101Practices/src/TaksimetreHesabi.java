
import java.util.Scanner;

public class TaksimetreHesabi {
    public static void main(String[] args) {

        int km;
        double Kmbasina = 2.20, tutar, baslangic = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz: ");
        km = input.nextInt();

        tutar = (km * Kmbasina) + baslangic;

        tutar = (tutar < 20) ? 20 : tutar;
        System.out.print("Toplam Tutar: " + tutar);

    }
}
