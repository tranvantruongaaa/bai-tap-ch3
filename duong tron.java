import java.util.Scanner;
import Bai3b.Diem;
public class Duongtron extends Diem {
    protected  int R;
    protected double pi=3.14;
    protected double V, S;
    Scanner sc = new Scanner(System.in);
    public Duongtron(int x, int y,int R){
        super(x,y);
        this.R=R;
        System.out.println("\nNhap ban kinh: ");
        R=sc.nextInt();
    }
    public void in(){
        V=pi*R*2;
        S=pi*R*R;
        System.out.println("Chu vi cua duong tron la: "+V);
        System.out.println("Dien tich cua duong tron la: "+S);
    }
}