/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas17;

import java.util.Scanner;

/**
 *
 * @author UA
 */
public class Tugas17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TUGAS 17 - ARRAY Float
        
        // deklarasi array
        float[] arr = new float[10];
        
        // inisialiasi nilai
        for(int i = 0; i < 10; i++)
        {
            arr[i] = (float) 0.00;
        }
        
        // operasi nilai
        arr[7] = (float) 200.00;
        
        // munculkan nilai
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
        
        // masukkan nilai dari keyboard
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan nilai pada index 9 : ");
        arr[9] = key.nextFloat();
        
        // munculkan ulang data
        System.out.println("----------------------------");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
