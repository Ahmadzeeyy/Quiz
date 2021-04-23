import java.util.*;
import java.math.*;

class bangundatar{
    int sisi ;
    int panjang;
    int alas ;
    int lebar;
    int tinggi ;
    int jarijari;

    int keliling(){
        return 0;
    }
    double luas (){
        return 0;
    }
}
class segitiga extends bangundatar{
    @Override
    int keliling(){
        int keliling = sisi*3;
        System.out.println("keliling segitiga :"+keliling);
        return keliling;
    }
    double luas (){
        double luas = 0.5*alas*tinggi;
        System.out.println("luas segitiga : "+luas);
        return luas;
    }
}

class persegi extends bangundatar{
    @Override
    int keliling(){
        int keliling = sisi*4;
        System.out.println("keliling persegi :"+keliling);
        return keliling;
    }
    double luas (){
        double luas = sisi*sisi;
        System.out.println("luas persegi : "+luas);
        return luas;
    }
}
class persegiPanjang extends bangundatar{
    @Override
    int keliling(){
        int keliling = 2*panjang*+2*lebar;
        System.out.println("keliling persegi panjang :"+keliling);
        return keliling;
    }
    double luas (){
        double luas = panjang*lebar;
        System.out.println("luas persegi panjang : "+luas);
        return luas;
    }
}
class lingkaran extends bangundatar{
    @Override
    int keliling(){
        int keliling = (22/7)*jarijari*2;
        System.out.println("keliling lingkaran :"+keliling);
        return keliling;
    }
    double luas (){
        double luas = (44/7)*jarijari*jarijari;
        System.out.println("luas lingkaran : "+luas);
        return luas;
    }
}
public class saol2 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    display m = new display();
    boolean a = true;
    while( a == true){
        m.Display();
        
        System.out.println("ingin input lagi atau tidak ?[y/t]");
        System.out.print("masukkan pilihan : ");
        String pilihan = input.nextLine();
        if (pilihan == "y" ){
            a = true ;
        }
        else if (pilihan == "t"){
            System.out.println("terimakasih");
            break;
        }
        else {
            System.out.println("masukan salah!!!");
            a = true ;
        }
    }

 }   
}
