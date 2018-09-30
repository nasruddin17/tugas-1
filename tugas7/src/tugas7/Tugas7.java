/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;
import java.util.Scanner;
/**
 *
 * @author NASRUDDIN
 */
public class Tugas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TUGAS 7 tipe data float
        // deklarasi variabel
        float tes;
        // inisialisasi variabel
        tes = 1;
        // operasi
        tes = 3 + 4;
        // tampilkan nilai variabel
        System.out.println(tes);
        
        // input data dari keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan data float : ");
        tes = keyboard.nextFloat();
        // tampilkan isi baru
        System.out.println(tes);
    }
    
}
