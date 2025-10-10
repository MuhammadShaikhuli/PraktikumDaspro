import java.util.Scanner;
public class ifCetakKRS19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (TRUE/FALSE): ");
        boolean ukt = sc.nextBoolean();

        if (ukt) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");}
        else {
                System.out.println("Registrasi ditolak, harap lunasi UKT terlebih dahulu");
            }
    }}