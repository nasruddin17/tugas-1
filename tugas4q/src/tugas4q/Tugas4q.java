/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4q;
import java.util.Scanner;
/**
 *
 * @author NASRUDDIN
 */
public class Tugas4q {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TUGAS 4 tipe data short
        // deklarasi variabel
        short tes;
        // inisialisasi variabel
        tes = 3;
        // operasi
        tes = 4 + 4;
        // tampilkan nilai variabel
        System.out.println(tes);
        
        // input data dari keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan data short : ");
        tes = keyboard.nextShort();
        // tampilkan isi baru
        System.out.println(tes);
    }
    
}
