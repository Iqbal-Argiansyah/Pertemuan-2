/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * PBOIF2
 * Pilihan
 */
public class PBOIF210118061Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        String nama , nim ;
        int jurusan;
        System.out.print("Masukan nama : ");
        nama = in.nextLine();
        System.out.print("Masukan nim : ");
        nim = in.nextLine();
        System.out.print("Pilihan : \n 1. Sistem Informasi \n 2. Teknik Industri \n 3. Teknik Informatika \n\n Masukan pilihan :");
        jurusan = in.nextInt();
        switch (jurusan){
            case 1:
                System.out.println("\n"+nama+" dengan nim "+nim+" memilih jurusan Sistem Informasi");
                break;
            case 2:
                System.out.println("\n"+nama+" dengan nim "+nim+" memilih jurusan Teknik Industri");
                break;
            case 3:
                System.out.println("\n"+nama+" dengan nim "+nim+" memilih jurusan Teknik Informatika");
                break;
        }
    }
}
