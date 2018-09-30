/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas12;
import java.util.Scanner;
/**
 *
 * @author UA
 */
public class Tugas12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TUGAS 12 - ARRAY Char
        
        // deklarasi array
        char[] arr = new char[10];
        
        // inisialiasi nilai
        for(int i = 0; i < 10; i++)
        {
            arr[i] = '*';
        }
        
        // operasi nilai
        arr[7] = 'm';
        
        // munculkan nilai
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
        
        // masukkan nilai dari keyboard
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan nilai pada index 9 : ");
        arr[9] = key.next().charAt(0);
        
        // munculkan ulang data
        System.out.println("----------------------------");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
