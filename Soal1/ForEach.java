package Soal1;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna untuk memasukkan ukuran array
        System.out.println("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Buat array berdasarkan input ukuran
        int[] ar = new int[n];

        // Minta pengguna untuk memasukkan elemen-elemen array
        System.out.println("Masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": ");
            ar[i] = scanner.nextInt();
        }

        // Hitung jumlah elemen array menggunakan for-each
        int sum = 0;
        for (int num : ar) {
            sum += num; // Menambahkan setiap elemen ke variabel sum
        }

        // Tampilkan hasil
        System.out.println("Jumlah elemen array: " + sum);

        scanner.close();
    }
}
