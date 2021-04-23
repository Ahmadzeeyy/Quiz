import java.util.*;
public class display {
    void Display (){
        segitiga segi3 = new segitiga();
        persegi persegi = new persegi();
        persegiPanjang persegiP = new persegiPanjang();
        lingkaran lingkaran = new lingkaran();
        Scanner inp = new Scanner(System.in);


        System.out.println("+===========================================+");
        System.out.println("| MENGHITUNG LUAS DAN KELILING BANGUN DATAR |");
        System.out.println("+===========================================+");
        System.out.println("1. luas dan keliling segitiga \n2. luas dan keliling persegi \n3. luas dan keliling persegi panjang \n4. luas dan keliling lingkaran");
        System.out.print("masukkan pilihan menu (1-5) :");
        int pilih = inp.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("masukkan sisi : ");
                segi3.sisi = inp.nextInt();
                System.out.print("masukkan alas : ");
                segi3.alas = inp.nextInt();
                System.out.print("masukkan tinggi : ");
                segi3.tinggi = inp.nextInt();
                segi3.keliling();
                segi3.luas();   
                break;
            case 2:
                System.out.print("masukkan sisi : ");
                persegi.sisi = inp.nextInt();
                persegi.keliling();
                persegi.luas();
                break;
            case 3:
                System.out.print("masukkan panjang : ");
                persegiP.panjang = inp.nextInt();
                System.out.print("masukkan lebar : ");
                persegiP.lebar = inp.nextInt();
                persegiP.keliling();
                persegiP.luas();
                break;
            case 4: 
                System.out.print("masukkan jari-jari : ");
                lingkaran.jarijari = inp.nextInt();
                lingkaran.keliling();
                lingkaran.luas();
                break;
            default:
                break;
        }


        }
}
