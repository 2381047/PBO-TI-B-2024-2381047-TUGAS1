package Soal2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan ukuran tangga: ");
            int n = scanner.nextInt();

            // Membuat array dua dimensi untuk tangga
            char[][] tangga = new char[n][];
            int i = 0;

            // Mengisi array dengan karakter '#';
            do {
                tangga[i] = new char[i + 1];
                int j = 0;
                do {
                    tangga[i][j] = '#';
                    j++;
                } while (j < tangga[i].length);
                i++;
            } while (i < tangga.length);

            // Mencetak pola tangga
            int k = 0;
            do {
                int l = 0;
                do {
                    System.out.println(tangga[k][l]);
                    l++;
                } while (l < tangga[k].length);
                System.out.println();
                k++;
            } while (k < tangga.length);

            scanner.close();
        }
    }
