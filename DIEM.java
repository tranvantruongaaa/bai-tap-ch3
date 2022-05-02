import java.util.Scanner;
public class Diem{
    protected int x,y;
    Scanner sc=new Scanner(System.in);
    public Diem(int x,int y){
        this.x=x;
        this.y=y;
    
    System.out.println("Nhap x:");
    x=sc.nextInt();
    System.out.println("Nhap y:");
    y=sc.nextInt();
    }
}