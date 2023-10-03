import java.util.Scanner;

public class Pemilihan2Percobaan208{
    public static void main(String[] args){
        Scanner input08 =new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut ;
      
        System.out.println("Masukkan sudut 1");
        sudut1 = input08.nextInt();
        System.out.println("Masukkan sudut 2");
        sudut2 = input08.nextInt();
        System.out.println("Masukkan sudut 3");
        sudut3 = input08.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("total sudut" + totalSudut);

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah Segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan Segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");
    }
}