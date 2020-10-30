package com.latihan;

import java.util.Scanner;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Ejaan Nama Latihan 25
 *
 */
public class EjaanNama {
    public static void main(String[] args) {
        String nama;
        int j = 1;
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Input Nama
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = keyboard.nextLine();

        System.out.println("Ejaan untuk \"" + nama + "\"adalah : ");
        System.out.println(nama.length());
        for (int i = 0; i < nama.length(); i++){
            System.out.println("Huruf ke-" + j + " : " + nama.charAt(i));
            j++;
        }

    }
}
