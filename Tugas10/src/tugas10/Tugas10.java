/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas10;

import java.util.Scanner;
import tugas10.Mahasiswa;

/**
 *
 * @author UA
 */
public class Tugas10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TUGAS 13 - Data Type Object
        
        // deklarasi
        Mahasiswa mhs1;
        
        // inisialiasi nilai
        mhs1 = new Mahasiswa("D0217379", "Nasruddin", "TI", "Teknik Informatika", "Teknik", 2017);
        
        // munculkan data
        System.out.println(mhs1.nama);
        
        // input data dari keyboard
        Scanner k = new Scanner(System.in);
        System.out.println("Masukkan nama baru : ");
        mhs1.nama = k.next();
        
        // munculkan nama baru
        System.out.println(mhs1.nama);
    }
    
}
