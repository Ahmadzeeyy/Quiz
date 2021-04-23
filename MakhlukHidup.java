public class MakhlukHidup {
    String nama ;
    
    void bernapas(String objek, String napas){ 
        System.out.println(objek+" hidup bisa bernapas meggunakan"+napas);
    }
    void melihat(String objek){ 
        System.out.println(objek+" hidup bisa melihat");
    }
    void berkembangbiak(String objek){
        System.out.println(objek+"makhluk hidup bisa berkembang biak");
    }
}
class harimau extends MakhlukHidup {
    void makanan (){
        System.out.println("harimau memakan daging");
    }
    void bersuara (){
        System.out.println("harimau bersuara WARGHHHH ");
    }
    void kembangbiak(){
        System.out.println("harimau berkembang biak secara vivipar");
    }

}
class hiu extends MakhlukHidup {
    void makanan (){
        System.out.println("hiu memakan daging");
    }
    void hidup(){
        System.out.println("hiu hidup di laut");
    }
    void kembangbiak(){
        System.out.println("hiu berkemang biak secara  ovipar");
    }
    void ular (){
        
    }
}
class ular extends MakhlukHidup {
    void makanan (){
        System.out.println("ular memakan daging");
    }
    void hidup(){
        System.out.println("ular  hidup di darat");
    }
    void kembangbiak(){
        System.out.println("ular berkembang biak secara  ovovivipar");
    }
    void berjalan(){
        System.out.println("ular berjalan menggunakan perut");
        
    }
    public static void main(String[] args) {
       harimau Harimau = new harimau();
       hiu hiu = new hiu();
       ular ular = new ular();
       Harimau.bernapas("harimau", "paru-paru");
       Harimau.melihat("harimau");
       Harimau.berkembangbiak("harimau");
       Harimau.makanan();
       Harimau.bersuara();
       Harimau.kembangbiak();

       hiu.bernapas("hiu", "insang");
       Harimau.melihat("hiu");
       Harimau.berkembangbiak("hiu");
       hiu.makanan();
       hiu.hidup();
       Harimau.kembangbiak();

       ular.bernapas("ular", "paru-paru");
       ular.melihat("ular");
       ular.berkembangbiak("ular");
       ular.makanan();
       ular.hidup();
       ular.kembangbiak();


    }
}

