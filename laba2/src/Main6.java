import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        final double btc = 340.45d;
        double i;
        double res;
        System.out.println("Enter usd :");
        Scanner scn= new Scanner(System.in);
         i=scn.nextInt();
        res=i/btc;
        System.out.println(res+"= btc");
    }
}
