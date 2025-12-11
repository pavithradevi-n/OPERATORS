import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int middleDigit=(number/10)%10;
        System.out.println(middleDigit);
        sc.close();
    }
}
