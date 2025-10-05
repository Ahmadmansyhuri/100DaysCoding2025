package isc100dayscooding;
import java.util.Scanner;

public class Days029 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan bilangan a : ");
        int a = in.nextInt();
        System.out.print("masukkan bilangan b : ");
        int b = in.nextInt();
        
        in.close();
        
        if (a < b){
            System.out.println("a lebih kecil dari b (a<b) ");
        }else if (a > b){
            System.out.println("a lebih besar dari b (a>b) ");
        }else{
            System.out.println("a sama dengan b (a==b) ");
        }
    }
    
}
