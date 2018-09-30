/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import java.util.Scanner;
/**
 *
 * @author NASRUDDIN
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tugas 2 tipe data byte
        //deklarasi variabel
        byte tes;
        //inisialisasi variabel
        tes=1;
        //operasi variabel
        tes=1+2;
        // tampilkan nilai variabel
        System.out.println(tes);
        
        // input data dari keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan data byte : ");
        tes = keyboard.nextByte();
        tes += 4;
        // tampilkan isi baru
        System.out.println(tes);        
    }
    
}
