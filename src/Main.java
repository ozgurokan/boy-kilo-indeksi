import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo,boyKiloIndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        kilo = input.nextDouble();

        boyKiloIndeksi = kilo / (boy * boy);

        System.out.println("Boy: " + boy + " Kilo: " + kilo);
        System.out.println("Vücut Kitle İndeksi: "+ boyKiloIndeksi);




    }
}