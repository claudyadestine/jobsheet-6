import java.util.Scanner;

public class Pemilihan2Percobaan108_1{

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan tahun");
        tahun =input08.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 !=0) || tahun % 400 == 0) {
            if ((tahun % 100) != 0 )
            System.out.println("Tahun Kabisat");
        } else
        System.out.println("Bukan Tahun Kabisat");
    }
  }

