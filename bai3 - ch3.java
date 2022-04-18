package Bai3a;
import java.util.Scanner;
public class SACH{
   public String masach,tensach,tentg,loaisach,Nxb;
   public int sotrang,sotap;
   public Float gia;
    Scanner scanner = new Scanner(System.in);   
    SACH(){
        System.out.println("Nhap ma sach: ");
        masach=scanner.nextLine();
        System.out.println("Nhap ten sach: ");
        tensach=scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
       tentg=scanner.nextLine();
       System.out.println("Nhap so trang: ");
        sotrang=scanner.nextInt();
       scanner.nextLine(); //Fix bug trôi lệnh
        System.out.println("Nhap loai sach: ");
        loaisach=scanner.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        Nxb=scanner.nextLine();
        System.out.println("Nhap so tap: ");
       sotap=scanner.nextInt();
       System.out.println("Nhap gia: ");
        gia=scanner.nextFloat();
    }
    public void INSACH(){
    System.out.println("\n\n=====THONG TIN SACH=====\n");
    System.out.printf("Ma sach     : %s\n",masach);
    System.out.printf("Ten sach    : %s\n",tensach);
    System.out.printf("Ten tac gia : %s\n",tentg);
    System.out.printf("Ma sach     : %d\n",sotrang);
    System.out.printf("Loai sach   : %s\n",loaisach);
    System.out.printf("Nha xuat ban: %s\n",Nxb);
    System.out.printf("So tap      : %d\n",sotap);
    System.out.printf("Gia sach    : %f",gia);
    }
    public static void main(String[] args){
    SACH a = new SACH();
    a.INSACH();
    }
}