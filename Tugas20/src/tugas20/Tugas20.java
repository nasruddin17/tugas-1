/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas20;
import java.util.Scanner;
import tugas20.Mahasiswa;
/**
 *
 * @author UA
 */
public class Tugas20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TUGAS 20 - ARRAY Object Mahasiswa
        
        // deklarasi array
        Mahasiswa[] arr = new Mahasiswa[2];
        
        // inisialiasi nilai
        for(int i = 0; i < 2; i++)
        {
            arr[i] = new Mahasiswa("", "", "", "", "", 0);
        }
        
        // operasi nilai
        arr[0].nim = "D0217379";     
        arr[0].nama = "Nasruddin";
        arr[0].kelas = "TI E";
        arr[0].jurusan = "Teknik Informatika";
        arr[0].fakultas = "Teknik";
        arr[0].angkatan = 2017;

        
        // munculkan nilai
        for(int i = 0; i < 2; i++)
        {
            System.out.print(arr[i].nama);
        }
        
        // masukkan nilai dari keyboard
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan nama dari mahasiswa kedua : ");
        arr[1].nama = key.next();
        
        // munculkan ulang data
        System.out.println("----------------------------");
        for(int i = 0; i < 2; i++)
        {
            System.out.println(arr[i].nama);
        }
    }
    
}
