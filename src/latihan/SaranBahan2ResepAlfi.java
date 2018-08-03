/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author ONE
 */
public class SaranBahan2ResepAlfi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String identitas = "nama lengkap / kelas / no";
    System.out.println("Nashiya Alfi Ramadhani/XRPL5/29 : "+ identitas);
    
    System.out.print("\nSaran Resep dari Bahan Milik Anda");
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bahan Pertama :");
    System.out.println("1. Pisang");
    System.out.println("2. Telur");
    System.out.println("Masukkan no pilihan Anda");
    int bahan1 = scanner.nextInt();
    
    if(bahan1 == 1 || bahan1 == 2)
    {
        System.out.println("Bahan Kedua: ");
        if(bahan1 == 1) {
            System.out.println("1. susu");
            System.out.println("2.Minyak Goreng");
            System.out.println("3. tidak ada");
        }else{
            System.out.println("Minyak goreng ");
            System.out.println("2. Roti");
            System.out.println("3. Tidak Ada");
        }
        System.out.println("Masukkan nomer pilihan anda : ");
        int bahan2 = scanner.nextInt();
        
    }else
            System.out.println("Mohon maaf, Pilihan tidak ditemukan, "
                    + "tidak dapat memberikan saran resep");
    
    int bahan2 = scanner.nextInt();
     if(bahan2 >= 1 && bahan2 <= 3)
    {
        if(bahan1==1)
            switch(bahan2)
            {
                case 1: System.out.println(
                        "Anda dapat membuat milk shake banana"); break;
                case 2: System.out.println(
                        "Anda dapat membuat pisang goreng"); break;
                case 3: System.out.println(
                        "Anda dapat membuat pisang rebus");
            }
        else
            switch(bahan2)
            {
                case 1: System.out.println(
                        "Anda dapat membuat telur mata sapi"); break;
                case 2: System.out.println(
                        "Anda dapat membuat sandwich telur"); break;
                case 3: System.out.println(
                        "Anda dapat membuat telur rebus");
            }
    }else 
        System.out.println("Mohon maaf pilihan tidak ditemukan," + "tidak dapat memberikan saran resep"); 
            }
                        
            } 
    
    
    


    
    

