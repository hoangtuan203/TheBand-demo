package OOP.Chuong_0;

import java.util.Scanner;

public class bai7 {
    static  Scanner sc= new Scanner(System.in);
    private int n;
    public bai7(){
        this.n=0;
    }
    public bai7(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n=n;
    }
    public void nhap(){
        do {
            System.out.println("nhap so tu nhien N:");
            n=sc.nextInt();
        } while (n<0);
    }
    public void bai7a(){
        int sum=0;
        System.out.println("cac so tu nhien nho hon hoac bang "+n+" la:");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
       for(int i=1;i<=n;i++){
        sum+=i;
       }
       System.out.println();
       System.out.print("tong :"+sum);
       System.out.println();
    }
    public  void bai7b() {
        int sum=0;
        System.out.println("cac so tu nhien chan nho hon hoac bang  "+n+" la:");
        for(int i=1;i<=n;i++){
            if(i%2==0){
            System.out.print(i+" ");
        
            sum+=i;
            }
        }
        System.out.println();
        System.out.println("tong :"+sum);
        System.out.println();
    }
    public void bai7c() {
        int sum=0;
        System.out.print("cac so tu nhien le nho hon hoac bang "+n+" la:");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            System.out.print(i+" ");
            sum+=i;
            }
        }
         System.out.println();
        System.out.println("tong :"+sum);
        System.out.println();
    }
    public  boolean isPrime() {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void bai7d(){
    int sum=0;
    System.out.print("cac so nguyen to nho hon hoac bang"+n+":");
    for(int i=1;i<=n;i++){
        if(isPrime()) {
            System.out.print(i+" ");
            sum+=i;
        }
    }
    System.out.println();
    System.out.println("tong:"+sum);
    System.out.println();
}
//bai 7e
    public void bai7e(){
    int dem=0;
    int i=2; //so nguyen to dau tien bat dau la 2
    System.out.println(n+" so nguyen to dau tien la:");
    while(dem<n){
        if(isPrime()){
            System.out.print(i+" ");
            dem++;
        }
        i++;
        }
    }
}
