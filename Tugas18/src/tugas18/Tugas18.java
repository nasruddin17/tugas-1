/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas18;

import java.util.Scanner;

/**
 *
 * @author UA
 */
public class Tugas18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TUGAS 18 - ARRAY Double
        
        // deklarasi array
        double[] arr = new double[10];
        
        // inisialiasi nilai
        for(int i = 0; i < 10; i++)
        {
            arr[i] = 0.0;
        }
        
        // operasi nilai
        arr[7] = 200.50;
        
        // munculkan nilai
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
        
        // masukkan nilai dari keyboard
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan nilai pada index 9 : ");
        arr[9] = key.nextDouble();
        
        // munculkan ulang data
        System.out.println("----------------------------");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
