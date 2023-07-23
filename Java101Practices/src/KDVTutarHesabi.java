
import java.util.Scanner;

public class KDVTutarHesabi {

    public static void main(String[] args) {

        double tutar, kdv , kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        if (tutar < 1000){
            double kdvOran = 0.18;
            kdvliTutar = tutar +(tutar * kdvOran);
            kdv = kdvliTutar - tutar;
            System.out.println("KDV Tutarı " + kdv);
        }
        else{
            double kdvOran = 0.08;
            kdvliTutar = tutar +(tutar * kdvOran);
            kdv = kdvliTutar - tutar;
            System.out.println("KDV Tutarı " + kdv);
        }
}
}
