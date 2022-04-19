package zaroyunu;

import java.util.Scanner;

public class ZarOyunu {

    public static void main(String[] args) {
       Scanner cagla = new Scanner (System.in);
       
       System.out.println("Zar Tahmin Oyununa Hoşgeldiniz !!! ");
       System.out.println("Başlangıç puanınız 100 !");
       System.out.println("0 ile oyunu sonlandırabilirsiniz...");
       System.out.println("Bir tahmin yapınız : ");
       
       int rastgele = (int)(Math.random ()*6+1);//1 ile 6 arasında rastgele değer üretildi
       rastgele =(int)(Math.random()*6+1);
       int tahmin = 0;
       tahmin =cagla.nextInt();
       
       while (tahmin == 0){
         System.out.println("Oyundan Çıktınız ...");
         tahmin++;
         }
         
           if (tahmin == rastgele)
             System.out.println("Doğru Tahmin Tebrikler !!! ");
         
         else if (tahmin != rastgele);
         System.out.println("Yanlış Tahmin ... Zar : " + rastgele);
         
         }
}
