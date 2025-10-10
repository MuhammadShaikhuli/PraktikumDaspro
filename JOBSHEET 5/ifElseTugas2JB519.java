import java.util.Scanner;
public class ifElseTugas2JB519 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();

        if (angka %2 == 0) {
            System.out.println("--- Angka adalah Bilangan GENAP ---");
        } else {
            System.out.println("--- Angka adalah Bilangan GANJIL ---");
            }
    }}