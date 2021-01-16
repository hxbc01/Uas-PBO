
package nasi.goreng;
import java.util.Scanner;

public class Bahan_bahan extends Nasgor implements Pembuat{
   String bahan1;
   String bahan2;
   String bahan3;
   String bahan4;
   String Peralatan1;
   String Peralatan2;
   String Peralatan3;
   String peralatan4;
   
   public Bahan_bahan(String nama){
       super (nama);
   }
   
   @Override
   public void Pembuatan(){
       System.out.println(" nama pembuat :" + nama_pembuat);   
   }
   public void inputan(){
       Scanner input = new Scanner (System.in);
       System.out.println("Masukan Bahan bahan yang diperlukan :");
       System.out.print("bahan : ");
       bahan1 = input.nextLine();
       System.out.print("bahan : ");
       bahan2 = input.nextLine();
       System.out.print("bahan : ");
       bahan3 = input.nextLine();
       System.out.print("bahan : ");
       bahan4 = input.nextLine();
       System.out.println("=================================");
       System.out.println("apa saja Peralatan yang diperlukan :");
       System.out.print("peralatan : ");
       Peralatan1 = input.nextLine();
       System.out.print("peralatan : ");
       Peralatan2 = input.nextLine();
       System.out.print("peralatan : ");
       Peralatan3 = input.nextLine();
       System.out.print("peralatan : ");
       peralatan4= input.nextLine();
       
   }
    public void bahan(){
        System.out.println("nama Bahan  :" + bahan1);
        System.out.println("nama Bahan  :" + bahan2);
        System.out.println("nama Bahan  :" + bahan3);
        System.out.println("nama Bahan  :" + bahan4);
    }
    public void peralatan(){
        System.out.println("nama Peralatan  :" + Peralatan1);
        System.out.println("nama Peralatan  :" + Peralatan2);
        System.out.println("nama Peralatan  :" + Peralatan3);
        System.out.println("nama Peralatan  :" + peralatan4);
        
    }
    public void tampil(){
        display();
        Pembuatan();
        System.out.println();
        inputan();
        System.out.println("=========================");
        System.out.println("bahan bahan yang di butuhkan");
        bahan();
        System.out.println("=========================");
        System.out.println("Peralatan yang di butuhkan");
        peralatan();
        System.out.println("=============cara pembuatan================");
        System.out.println("1.iris bawang putih, bawang merah, dan cabe");
        System.out.println("2.siapkan wajan dan panaskan wajan");
        System.out.println("3.masukan bahan bahan tadi yang sudah diiris");
        System.out.println("4.masukan garam lalu telur");
        System.out.println("5.lalu telur di oseng ");
        System.out.println("6.masukan nasi");
        System.out.println("7.aduk sampai rata lalu masukan kecap");
        System.out.println("8.sajikan");
    }

   
    
}
