
import java.util.Scanner;

public class pecahan {
    public static void main(String[] args) {
        double pembilang;
        double penyebut;
        double hasil;

        Scanner input = new Scanner(System.in);
        
        System.out.println("masukan Pembilang");
        pembilang=input.nextDouble();
        System.out.println("");
        System.out.println("masukan penyebut");
        penyebut=input.nextDouble();
        System.out.println("");
        
        hasil = pembilang/penyebut;
        System.out.println(" pecahan nya adalah " +pembilang+ "/" + penyebut);
        System.out.println("Hasilnya adalah : "+hasil);
    } 
}