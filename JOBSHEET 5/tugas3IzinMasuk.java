 import java.util.Scanner;
public class tugas3IzinMasuk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Anda bawa Kartu Mahasiswa? (TRUE/FALSE): ");
        boolean kMhs = sc.nextBoolean();

        System.out.print("Apakah Anda terdaftar secara online? (TRUE/FALSE): ");
        boolean regOnline = sc.nextBoolean();

        if (kMhs) {
            System.out.println("BOLEH MASUK");
        } else if (regOnline) {
            System.out.println("BOLEH MASUK");
            }
        else {
            System.out.println("TIDAK BOLEH MASUK");
        }
    }}