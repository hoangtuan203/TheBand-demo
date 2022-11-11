package OOP.Chuong_0;
import java.util.Scanner;
public class bai8 {
    static Scanner sc=new Scanner(System.in);
     static public  boolean ktraSNT(int n) {
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
//    caua
    public static int tongpttn (int[] a){
        int tong=0;
            for(int i=0;i<a.length;i++){
                tong+=a[i];
            }
        return tong;
    }
    public static void caua(int N, int[] array){
        for(int i=0;i<N;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("Tong: "+tongpttn(array));
    }
//   caub
    public static int tongchan(int[] a){
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                tong+=a[i];
        }
        return tong;
    }
    public static void caub(int[] array, int N){
        for(int i=0;i<N;i++){
            if(array[i]%2==0)
                System.out.print(array[i]+" ");
        }
        System.out.println("Tong chan: "+tongchan(array));
    }
//    cauc
    public static int tongle(int[] a){
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1)
                tong+=a[i];
        }
        return tong;
    }
    public static void cauc(int [] array, int N){
        for(int i=0;i<N;i++){
            if(array[i]%2==1)
                System.out.print(array[i]+" ");
        }
        System.out.println("Tong le: "+tongle(array));
    }
//    caud
    public static int tongSNT(int[] a){
        int tong=0;
        for(int i=0;a.length>i;i++){
            if(ktraSNT(a[i]))
                tong+=a[i];
        }
        return tong;
    }
    public static void caud(int[] array, int N){
        for(int i=0;i<N;i++){
            if(ktraSNT(array[i]))
                System.out.print(array[i]+" ");
        }
        System.out.println("Tong phan tu SNT: "+tongSNT(array));
    }
//    caue
    public static void caue(int[] array, int N){
        int[] nArray=new int[N+1];
        System.arraycopy(array, 0, nArray, 0, N);
        System.out.print("Nhap phan tu can them vao mang: ");
        int x=sc.nextInt();
        nArray[N]=x;
        System.out.println("Mang moi: ");
        for(int i=0;i<nArray.length;i++){
            System.out.print(nArray[i]+" ");
        }
        System.out.println("\n");
    }
//    cauf
    public static void cauf(int[] array, int N){
        System.out.print("Nhap vi tri k muon xoa: ");
        int k=sc.nextInt();
        int[] nArray1= new int[N];
        System.arraycopy(array, 0, nArray1, 0, N);        
        for(int i=k;i<N-1;i++){
            nArray1[i]=nArray1[i+1];
        }
        int[] nArray2=new int[N-1];
        System.arraycopy(nArray1, 0, nArray2, 0, nArray2.length);
        System.out.println("Mang moi: ");
        for(int i=0;i<nArray2.length;i++){
            System.out.print(nArray2[i]+" ");
        }
        System.out.println("\n");
        
    }
    
//    caug
    public static int timX(int [] a,int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x)
                return i;
        }
        return -1;
    }
    public static void caug(int[] array, int N){
        System.out.print("Nhap gia tri x: ");
        int x=sc.nextInt();
        System.out.println(timX(array,x)==-1?"Khong tim thay x":("x o vi tri so "
                +timX(array,x)));
    }
    
    
    public static void main() {
        System.out.print("Nhap so tu nhien N: " );
        int N=sc.nextInt();
        System.out.println("Nhap mang "+N+" phan tu");
        int[] array=new int[N];        
        for(int i=0;i<N;i++){
            System.out.print("Nhap phan tu thu "+i+": ");
            array[i]=sc.nextInt();
        }
        int luaChon;
        do{
        System.out.println("==========MENU==========");
        System.out.println("1.Cac phan tu &tong:");
        System.out.println("2.Cac phan tu chan &tong:");
        System.out.println("3.Cac phan tu le &tong");
        System.out.println("4.Cac phan tu nguyen to &tong:");
        System.out.println("5.Them 1 phan tu moi vao mang:");
        System.out.println("6.Xoa phan tu thu k cua mang:");
        System.out.println("7.Kiem tra x(nhap tu ban phim) co trong mang khong, "
                + "tra ve vi tri cua x(neu co)");

        System.out.println("8.Ket thuc");
        System.out.println("========================");
        System.out.print("Nhap lua chon: ");
        luaChon=sc.nextInt();
        switch (luaChon) {
            case 1 -> caua(N, array);
            case 2 -> caub(array, N);
            case 3 -> cauc(array, N);
            case 4 -> caud(array, N);
            case 5 -> caue(array, N);
            case 6 -> cauf(array, N);
            case 7 -> caug(array, N);
        }       
        }while(1<=luaChon && luaChon<=7);
    }
}
