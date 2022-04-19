package dizilerdeesitlik;

import java.util.Scanner;

public class DizilerdeEsitlik {

    public static void main(String[] args) {
      
        Scanner cagla= new Scanner(System.in);
        
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        
        System.out.print("Birinci dizinin elemanlarını giriniz => ");
        for(int i=0; i<a.length; i++)
            a[i]=cagla.nextInt();
        System.out.print("İkinci dizinin elemanlarını giriniz => ");
        for (int k=0; k<5; k++)
            b[k]=cagla.nextInt();
        c = dizilerEsitlik (a, b);
       
   }
    public static int[] dizilerEsitlik (int[] x, int[]y){
        
        for (int i=0; i<5; i++)
            x[i] = y[i];
    
        if ( x[4]==y[4] ) 
            System.out.println("İki dizi eşittir.");
        else 
            System.out.println("İki dizi eşit değildir.");
        
        return x;
    }

}