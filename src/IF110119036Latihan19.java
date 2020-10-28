
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Memasukkan Data Saldo Tabungan
 */
public class IF110119036Latihan19 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int SaldoAwal, Bulan, SaldoPerbulan,Bunga;
        double BungaPersen;
        
        SaldoAwal = 2500000;
        BungaPersen = 0.15;
        Bulan = 6;
        
        
        for (int i = 1; i <= Bulan; i++) {
            Bunga = (int) (SaldoAwal * BungaPersen);
            SaldoPerbulan = SaldoAwal + Bunga;
            SaldoAwal = SaldoPerbulan;
            System.out.println("Saldo Di Bulan ke-"+i + " Rp." +SaldoPerbulan);
        } 
       
        }
    }
    

