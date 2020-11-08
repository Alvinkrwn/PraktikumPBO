/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2praktikum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alvinkrwn
 */
public class Tebakan {

    //attribut yang akan digunakan
    int angkarandom;
    int angkatebakan;
    int score = 100;
    int jumlahpercobaan= 0;

    //contructor
    public Tebakan() {
        Random rand = new Random();
        this.angkarandom = rand.nextInt(101);
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d\n"
                + "100. Silakan tebak ya!!!");
    }

    //method
    void jawab() {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Tebakan Anda: ");
            this.angkatebakan = input.nextInt();
            input.nextLine();
            this.jumlahpercobaan += 1;
            if (this.angkarandom < this.angkatebakan) {
                this.jikaSalah();
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if (this.angkarandom > this.angkatebakan) {
                this.jikaSalah();
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            }

        } while (this.angkarandom != this.angkatebakan);
       

    }
    //untuk internal class
    public void jikaSalah() {
        score -= 2;
    }
}
