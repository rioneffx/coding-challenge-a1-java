/*
"MENEMUKAN ANGKA GANJIL"

Deksripsi:
Buat program yang menerima inputan bilangan bulat positif (N), dengan batasan maksimal adalah N = 50. Program harus menghasilkan deretan angka dari 1 sampai N, dan mengganti semua angka ganjil dalam deretan tersebut dengan kata "ganjil".

Batasan:
- Nilai N harus merupakan bilangan bulat positif.

Input:
Satu angka (N). Dimana (N) merupakan bilangan bulat positif.

Output:
- Deretan angka dari 1 sampai (N). Semua angka ganjil diubah menjadi kata "ganjil".
- Jika nilai (N) melebihi 50, maka tampilkan "Nilai maksimal adalah 50".

Test Cases:
--------------------------------------------------------------
Input         Output
--------------------------------------------------------------
5             ganjil 2 ganjil 4 ganjil
10            ganjil 2 ganjil 4 ganjil 6 ganjil 8 ganjil 10
51            Nilai maksimal adalah 50
*/
import java.util.Scanner;

public class OddNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print(">> ");
    int bilangan = scn.nextInt();
    if(bilangan > 50) {
      System.out.println("Nilai maksimal adalah 50");
    } else {
      for(int n=1; n<= bilangan; n++) {
        if (n % 2 == 1) {
          System.out.print("ganjil ");
        } else {
          System.out.print(n + " ");
        }
      }
    }
    scn.close();
  }
}
