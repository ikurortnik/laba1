import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        final int maxfloor = 10;
        int i;
        System.out.println("Please, enter the floor what you need from 1 to 10 : ");
        Scanner scn = new Scanner(System.in);
        i=scn.nextInt();
        if(i<= maxfloor& i>0)
            System.out.println("OK");
        else System.out.println("Ne ok");

    }
}
