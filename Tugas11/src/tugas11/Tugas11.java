/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas11;
import java.util.Scanner;
/**
 *
 * @author UA
 */
public class Tugas11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TUGAS 11 - ARRAY BOOLEAN
        
        // deklarasi array boolean
        boolean[] arr = new boolean[10];
        
        // inisialiasi nilai
        for(int i = 0; i < 10; i++)
        {
            arr[i] = false;
        }
        
        // operasi nilai
        arr[7] = true;
        
        // munculkan nilai
        for(int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
        
        // masukkan nilai dari keyboard
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan nilai boolean pada index 9 : ");
        arr[9] = key.nextBoolean();
        
        // munculkan ulang data
        System.out.println("----------------------------");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
