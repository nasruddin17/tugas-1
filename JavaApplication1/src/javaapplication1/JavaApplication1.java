/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author NASRUDDIN
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TUGAS 1 tipe data boolean
        // deklarasi variabel
        boolean tes;
        // inisialisasi variabel
        tes = true;
        // operasi
        tes = 3 > 4;
        // tampilkan nilai variabel
        System.out.println(tes);
        
        // input data dari keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan data boolean : ");
        tes = keyboard.nextBoolean();
        // tampilkan isi baru
        System.out.println(tes);
    }
    
}
