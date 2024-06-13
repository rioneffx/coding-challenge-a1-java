/*
"PALINDROME CHECKER"

Deskripsi:
Diberikan sebuah string, periksa apakah string tersebut merupakan palindrome. Sebuah string dianggap palindrome jika string tersebut dibaca sama dari kiri ke kanan dan dari kanan ke kiri.

Input:
- Satu baris string `s`.

Output:
- Cetak "Palindrome" jika string tersebut palindrome, dan "Bukan Palindrome" jika tidak.

Batasan:
- 1 ≤ |s| ≤ 1000

--------------------
Contoh 1:
Input:
belajar coding

Output:
Bukan Palindrome

--------------------
Contoh 2:
Input:
Never Odd or Even

Output:
Palindrome

--------------------
Contoh 3:
Input:
hello

Output:
Bukan Palindrome

--------------------
Contoh 4:
Input:
11-02-2011

Output:
Palindrome
*/

import java.util.Scanner;

public class PalindromeChecker {
  public static boolean IsPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while(left < right) {
      if(str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left += 1;
      right -= 1;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print(">> ");
    String input = scn.nextLine();
    input = input.replaceAll("[^a-zA-Z0-9]", "");
    input = input.toLowerCase();

    if (IsPalindrome(input)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Bukan Palindrome");
    }
    scn.close();
  }
}
