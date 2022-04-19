package jmatematikselislemler;

import java.util.Scanner;

public class Jmatematikselislemler {

    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);
        
        
        int secim;

        System.out.println("Secim yapiniz (1 - 2 - 3)");
        secim=giris.nextInt();

        switch (secim) {
        case 1 :
            System.out.println("Ortalama hesapla");
            break;

        case 2 :
            System.out.println("Sayıyı ters çevir");
            break;

        case 3 :
            System.out.println("Palindormik sayı kontrolü");
            break;

        default :
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            break;
        
    }

    public static double ortalamaHesapla (double a,double b,double c) {
        
    System.out.println("Üç tamsayı giriniz, ortalamasını hesaplayalım: ");

       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();
       
       double sonuc = a + b + c /3;
       
       System.out.println("Ortalaması : " + sonuc);
    }    
       
}