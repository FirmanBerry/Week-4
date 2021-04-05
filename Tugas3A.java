/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3a;

import java.util.Scanner;

/**
 *
 * @author Berry
 */
public class Tugas3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int awal, akhir;

        System.out.print("Masukkan Nilai Awal : ");
        awal = scan.nextInt();

        System.out.print("Masukkan Nilai Akhir : ");
        akhir = scan.nextInt();

        System.out.print("Deret Bilangan Genap : ");
        for (int x = awal; x <= akhir; x++){
            if (x % 2 == 0){
                System.out.print(x + " ");
            }
        }
    }   
}