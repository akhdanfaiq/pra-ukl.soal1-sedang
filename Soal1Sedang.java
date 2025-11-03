/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal1sedang;

/**
 *
 * @author Faiq
 */
import java.util.Scanner;

public class Soal1Sedang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        long faktorial = 1; 

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial = faktorial * i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
