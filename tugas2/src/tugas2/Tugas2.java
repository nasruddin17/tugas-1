/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author NASRUDDIN
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TUGAS 2 tipe data char
        //deklarasi variabel
        char huruf;
        // inisialisasi
        huruf='.';
        //operasi variabel
        int ascii = (int)huruf;
        ascii += 1;
        huruf = (char)ascii;
        // munculkan isi dari huruf (menampilkan nilai)
        System.out.println(huruf);
        // masukan dari keyboard dan keluarkan isinya
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan data char : ");
        huruf = keyboard.next().charAt(0);
        System.out.println(huruf);
    }
    
}
