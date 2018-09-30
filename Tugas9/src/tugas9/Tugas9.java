/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9;
import java.util.Scanner;
/**
 *
 * @author UA
 */
public class Tugas9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TUGAS 09 - TIPE DATA STRING
        // deklarasi variabel
        String kata;
        
        // inisialiasi
        kata = "hai";
        
        // munculkan
        System.out.println("Kata sekarang : " + kata);
        
        // masukkan dari keyboard
        System.out.print("Masukkan kata baru : ");
        Scanner k = new Scanner(System.in);
        kata = k.next();
        
        // Munculkan ulang
        System.out.println("Kata sekarang bernilai : " + kata);

    }
    
}
