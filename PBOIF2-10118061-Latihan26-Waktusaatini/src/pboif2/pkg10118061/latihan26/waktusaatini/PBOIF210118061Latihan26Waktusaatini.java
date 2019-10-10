/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan26.waktusaatini;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
/**
 *
 * @author
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Waktu Saat Ini
 */
public class PBOIF210118061Latihan26Waktusaatini {

    /**
     * @param args the command line arguments
     */private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210118061Latihan26Waktusaatini tgl = new PBOIF210118061Latihan26Waktusaatini();  
        System.out.println("Sekarang tanggal : "+tgl.getTanggal()); 
        System.out.println("Waktu sekarang : "+tgl.getWaktu());
    }
    
}
