/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2praktikum;

/**
 *
 * @author Alvinkrwn
 */
public class Project2Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tebakan t = new Tebakan();
        t.jawab();
        System.out.println("-------------Results--------------");
        System.out.println("Score anda adalah " + t.score);
         
        if (t.jumlahpercobaan < 5){
            t.score += 50; 
            System.out.println("Bonus = 50");
        }
        System.out.println("Total score " + t.score);
    }
    
}
