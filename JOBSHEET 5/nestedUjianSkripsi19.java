import java.util.Scanner;
public class nestedUjianSkripsi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bPembimbing1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bPembimbing2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bPembimbing1 >= 8 && bPembimbing2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bPembimbing1 < 8 && bPembimbing2 < 4) {
                pesan = "Gagal! Log bimbingan pembimbing 1 dan 2 belum memenuhi";
            } else if (bPembimbing1 < 8) {
                pesan = "Gagal! Log bimbingan pembimbing 1 belum memenuhi";
            } else {
                pesan = "Gagal! Log bimbingan pembimbing 2 beum memenuhi";
            } 
        }
        else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
    }