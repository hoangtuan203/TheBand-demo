package OOP.Chuong_2;

import java.util.Scanner;
public class bai6 {
    static Scanner sc= new Scanner(System.in);
    private static int n;
    public bai6(){
        this.n=0;
    }
    public bai6(int n){
        this.n=n;
    }
    public void nhap(){
        System.out.println("nhap so nguyen :");
        n=sc.nextInt();
    }
    public static boolean isPrime() {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int find_square_number(){
        //flag = 1 => số chính phương
        //flag = 0 => không phải số chính phương
        
        int flag = 0;

        //Tìm số bất kỳ nhỏ hơn hoặc bằng n mà bình phương bằng n
        int i = 0;
        while(i <= n){
            if( Math.pow( i, 2) == n ) {   
                flag = 1;
                break; /*Chỉ cần tìm thấy 1 số là đủ và thoát vòng lặp*/
            }
            i++;
        }
        return flag;
    }
    public boolean ktraSoHH(){
        int sum = 0;
        for(int i=1;i<=n/2;i++){
          if(n%i==0) 
            //tổng các ước số của a
            sum+=i;
        }
        if(sum==n) return true;
        return false;
      }
     // tinh can bac hai
     public  double squareRoot() {
        double temp;
        double sr =n / 2;
        do {
            temp = sr;
            sr = (temp + (n / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }
    public void InNSNT(){
        int status=1;
        int num=3;
        if (n >= 1)
        {
            System.out.println(n+" so nguyen to dau tien la:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}
