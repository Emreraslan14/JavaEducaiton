
import java.util.Scanner;

public class UcgenAlanHesabi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1. kenar uzunluğunu giriniz : ");
        int a = inp.nextInt();

        System.out.print("2. kenar uzunluğunu giriniz : ");
        int b = inp.nextInt();

        System.out.print("3. kenar uzunluğunu giriniz : ");
        int c = inp.nextInt();

        double u = (a+b+c) / 2;

        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı : " + alan);
    }
}
