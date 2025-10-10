import java.util.Scanner;
public class ifElseCetakKRSTugas19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (TRUE/FALSE): ");
        boolean ukt = sc.nextBoolean();

        String pesan = ukt
        ? "Pembayaran UKT terverifikasi,\nsilahkan cetak KRS dan minta tanda tangan DPA"
        : "Registrasi ditolak silahkan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }}