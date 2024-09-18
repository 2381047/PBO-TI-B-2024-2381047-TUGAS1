package Soal3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata dalam camelCase: ");
        String input = scanner.next();

        // Menghitung jumlah kata, dimulai dari 1
        int wordCount = 1;
        int i = 0;

        // Looping menggunakan 'do-while'
        // Loop ini dijalankan setidaknya sekali
        do {
            char c = input.charAt(i);
            //Jika ada huruf besar, hitung sebagai kata baru
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
            i++; // Increment indeks
        }while (i < input.length()); // Lanjutkan selama 'i' kurang dari panjang string

        // Output jumlah kata
        System.out.println("Jumlah kata dalam camelCase : " + wordCount);
        }
    }
