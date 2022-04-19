package genelnotlarhesapla;

import java.util.Scanner;

public class GenelNotlarHesapla {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println("Not Değerlendirmeleri Programına Hoşgeldiniz...");
        int a[];
        int b[];
        int c[];
         
        for (int i=0; i<a.length; i++)
           a [i]= input.nextInt();
           System.out.println("Sınıftaki öğrenci sayısını giriniz: " +a);
        
        for (int i=0; i<b.length; i++)
           b [i]= input.nextInt();
           System.out.println("Vize notlarını giriniz: " +b);
        
        for (int i=0; i<c.length; i++)
           c [i]= input.nextInt();
           System.out.println("Final notlarını giriniz: " +c);
        genelNotlariHesapla();
        
    }
    public static int genelNotlariHesapla(int[] a, int[] b, int[] c){
        int count = input.nextInt();
        
        System.out.println("Genel İşlemler");
        do {
            switch(count) {
                case 0:
                    System.out.println("Çıkış");
                    break;
                case 1:
                    System.out.println("Harf Notları Hesapla" +harfNotlariHesapla());
                    break;
                case 2:
                    System.out.println("İstatistikler"+istatistikler());
                    break;
                case 3:
                    System.out.println("Not Tablosu Görüntüle")+notTablosu();
                    break;
                case 4:
                    System.out.println("Rastgele Öğrenci İçin Bonus Puan"+rastageleBonus());
                    break;
                default:
                    System.out.println("Yanlış Seçim");
                     break;
            }
       
        System.out.println("Yapmak istediğiniz işlem nedir? => " );
       
        } while (count != 0);
    }
        
    public static int harfNotlariHesapla(int[] b, int[] c)  {
        int total = (b*30/100) + (c*40/100);
        if ( total >= 85 && total <= 100 )
            System.out.println ("Harf notu: 'A' ");
        else if ( total >= 75 && total <= 84 )
            System.out.println("Harfnotu: 'B'" );
        else if ( total >= 65 && total <= 74 )
            System.out.println("Harf not:'C' ");
        else if ( total >= 60 && total <= 64 )
            System.out.println("Harf notu: 'D' ");
       else
            System.out.println("Harf notu:'F' " );
        
    }  
    public static int istatistikler(int[] b, int[] c){
        
    }
    public static int notTablosu(int[] x) {
        
    }
       
    public static int rastgeleBonus(int[] a) {
        
    }
}

