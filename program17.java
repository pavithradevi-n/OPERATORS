import java.util.Scanner;
public class program17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPowerOfTwo=(n>0)&&((n&(n-1))==0);
        System.out.println(isPowerOfTwo);
        sc.close();
    }
}
