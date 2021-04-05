/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3b;

import java.util.Scanner;

/**
 *
 * @author Berry
 */
public class Tugas3B {
Scanner in = new Scanner(System.in);
        public void counter() {
        int hitung = 1;
        do {
            System.out.print(" " + hitung);
            hitung=(hitung*2);
        }
        while(hitung<=100);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Bilangan kelipatan 2 (1-100)");
    Tugas3B start= new Tugas3B();
    start.counter();
    System.out.println();
    }
 }

