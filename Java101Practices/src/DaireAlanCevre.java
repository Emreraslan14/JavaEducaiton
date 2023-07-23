
import java.util.Scanner;

public class DaireAlanCevre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        double alan = pi * Math.pow(yaricap,2);
        double cevre = 2 * pi * yaricap;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        System.out.print("Merkez açısının ölçüsünü girin: ");
        double aci = scanner.nextDouble();

        double dilimAlan = (pi * Math.pow(yaricap,2) * aci) / 360;
        System.out.println("Daire diliminin alanı: " + dilimAlan);

}
}
