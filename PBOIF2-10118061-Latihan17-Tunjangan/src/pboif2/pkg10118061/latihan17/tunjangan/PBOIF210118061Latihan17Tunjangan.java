/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Iqbal
 */
public class PBOIF210118061Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         System.out.print("Masukan nama anda :");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
         int tunjangan = scanner.next();
        System.out.println("Gaji anda adalah"+tunjangan);
    }
    
}
