// package OOP.POINT;

// import java.util.Scanner;


// public class point {
//     public int x,y;
//     public point(){
//         x=y=0;
//     }
//     public point(int x,int y){
//         this.x=x;
//         this.y=y;
//     }
//     public int getX(){
//         return x;
//     }
//     public void setX(int x){
//         this.x=x;
//     }
//     public int getY(){
//         return y;
//     }
//     public void setY(int y){
//         this.y=y;
//     }
//     public double distance(point p){
//         double kc;
//         kc = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
//         return kc;
//     }
//     public String toString(){
//         return "point[x="+ x +",y="+ y+"]";
//     }
//     public void nhap(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("nhap x,y:");
//         x=sc.nextInt();
//         y=sc.nextInt();
//     }
//     public static void main(String[] args) {
//         point pt1 = new point();
//         point pt2 = new point();
//         pt1.nhap();
//         pt2.nhap();
//         System.out.println(pt1.toString());
//         System.out.println(pt2.toString());
//         System.out.println("khoang cach 2 diem:"+pt1.distance(pt2));
        
//     }
// }
