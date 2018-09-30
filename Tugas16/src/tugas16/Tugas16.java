/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas16;

import java.util.Scanner;

/**
 *
 * @author UA
 */
public class Tugas16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TUGAS 16 - ARRAY Long
        
        // deklarasi array
        long[] arr = new long[10];
        
        // inisialiasi nilai
        for(int i = 0; i < 10; i++)
        {
            arr[i] = 0;
        }
        
        // operasi nilai
        arr[4] = 900;
        
        // munculkan nilai
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
        
        // masukkan nilai dari keyboard
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan nilai pada index 3 : ");
        arr[3] = key.nextLong();
        
        // munculkan ulang data
        System.out.println("----------------------------");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
