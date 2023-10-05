import java.util.Scanner;

public class Searching08 {
    public static void main(String[] args) {

        int pilihan, pencarian = 0;
        String namaKar;
        int nomorIdentitas;

        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukan pilihan : ");
        pencarian = input08.nextInt();

        if (pencarian == 1) {
            System.out.println("Mencari berdasarkan : ");
            System.out.println("1. Berdasarkan Nama ");
            System.out.println("2.Berdasarkan nomor identitas");
            System.out.print("Masukan pilihan : ");
            pilihan = input08.nextInt();
            if (pilihan == 1) {
                System.out.print("Masukan nama : ");
                input08.nextLine();
                namaKar = input08.nextLine();
                System.out.println("nama karyawan : " + namaKar);
                System.out.println("Tempat tanggal lahir : ..... ");
                System.out.println("Umur : .......");
                System.out.println("Jabatan: ........");

            } else if (pilihan == 2) {
                System.out.print("  Masukan nomor identitas   ");
                nomorIdentitas = input08.nextInt();
                System.out.println("Nomor identitas : " + nomorIdentitas + "Dengan nama karyawan :......... " );
            }

        }

    }
}