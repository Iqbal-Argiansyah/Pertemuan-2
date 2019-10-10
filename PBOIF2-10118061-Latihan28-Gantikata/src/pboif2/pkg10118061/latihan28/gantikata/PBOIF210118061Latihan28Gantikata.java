/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan28.gantikata;
 import java.util.Scanner;

/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Ganti Kata PBO
 */
public class PBOIF210118061Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sandu = new Scanner(System.in);
    
  System.out.print("Masukkan kalimat\t: ");
  String kernel = sandu.nextLine();
    
                StringBuilder pretelan = new StringBuilder(kernel);

  System.out.print("Kata yang diganti\t: ");
  String crul = sandu.nextLine();
  
  int id = kernel.indexOf(crul);
  
  System.out.print("Kata pengganti\t: ");
  String maho = sandu.nextLine();
  
  StringBuffer man = new StringBuffer(maho);
  
  int id1 = crul.length();
  pretelan.delete(id,id+id1);
  pretelan.insert(id,man);
  
  System.out.print("Menjadi\t: ");
  System.out.println(pretelan.toString());
    }
    
}
