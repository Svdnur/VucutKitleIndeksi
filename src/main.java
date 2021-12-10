import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy, kilo, vki;

        System.out.println("Lütfen boyunuzu giriniz:");
        boy = input.nextDouble();

        System.out.println(" Lütfen kilonuzu kg cinsinden giriniz:");
        kilo = input.nextDouble();

        vki = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz :" + vki);

    }
}
