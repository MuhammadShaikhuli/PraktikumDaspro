 import java.util.Scanner;
public class tugas3AksesWifi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Identitas Anda: ");
        String identitas = sc.nextLine();

        if (identitas == "Dosen") {
            System.out.println("AKSES DIBERIKAN (DOSES)");
        } else if (identitas == "Mahasiswa") {
            System.out.print("MASUKKAN JUMLAH SKS: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("AKSES DIBERIKAN (MAHASISWA AKTIF)");
            }
            else {
                System.out.println("AKSES DITOLAK (SKS < 12)");
            }
            }
        else {
            System.out.println("AKSES DITOLAK");
        }
    }}