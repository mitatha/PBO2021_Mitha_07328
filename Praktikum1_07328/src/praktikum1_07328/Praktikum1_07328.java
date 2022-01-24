package praktikum1_07328;

import java.util.Scanner;

public class Praktikum1_07328 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x07328, y07328;
        System.out.print("Masukkan Jumlah Inputan : ");
        x07328 = scan.nextInt();

        int[] nilai07328 = new int[x07328];

        for (int i07328 = 0; i07328 < x07328; i07328++) {
            System.out.println("Nilai ke- " + i07328);
            System.out.print("Masukkan Nilai : ");
            nilai07328[i07328] = scan.nextInt();
        }
        for (int j07328 = 0; j07328 < x07328; j07328++) {
            System.out.println("Nilai :" + nilai07328[j07328]);

            if (nilai07328[j07328] <= 100 && nilai07328[j07328] >= 91) {
                System.out.println("Grade A");
            } else if (nilai07328[j07328] <= 90 && nilai07328[j07328] >= 71) {
                System.out.println("Grade B");
            } else if (nilai07328[j07328] <= 70 && nilai07328[j07328] >= 61) {
                System.out.println("Grade C");
            } else if (nilai07328[j07328] <= 60 && nilai07328[j07328] >= 51) {
                System.out.println("Grade D");
            } else {
                System.out.println("Grade E");
            }

            if (nilai07328[j07328] >= 75) {
                y07328 = 1;
            } else {
                y07328 = 2;
            }
            switch (y07328) {
                case 1:
                    System.out.println("ANDA DINYATAKAN 'LULUS' ");
                    break;
                case 2:
                    System.out.println("ANDA DINYATAKAN 'TIDAK LULUS' ");
                    break;
            }
        }
    }
}
