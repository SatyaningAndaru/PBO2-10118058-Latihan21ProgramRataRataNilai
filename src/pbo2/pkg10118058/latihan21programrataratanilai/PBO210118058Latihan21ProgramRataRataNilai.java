/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan21programrataratanilai;

/**
 *
 * @author user
 * Nama : Satyaning Andaru Bawalaksana
 * Kelas : IF-2
 * NIM : 10118058
 */
import java.util.Scanner;
public class PBO210118058Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n,jml,nilai[];
        float rata,jumlah=0;
        
        //input jumlah mahasiwa        
        System.out.print("Masukan Banyaknya mahasiswa : ");
        n=input.nextInt();
        
        //inisialisasi array        
        nilai = new int[n];
        
        //Input nilai
        for (int i=0;i<= n-1; i++){
            System.out.print("Nilai mahasiswa ke- " +(i+1)+":");
            nilai[i]=input.nextInt();
        }
        //Hitung jumlah
        for (int j=0;j<= n-1; j++){
            jumlah=jumlah +nilai[j];
        }
        //Hitung rata2
        rata=jumlah/n;
        
        //output
        System.out.println("");
        System.out.println("Maka Rata-rata Nilainya adalah " +rata);
        System.out.println("developed by Satya");
    }
    
}
