import java.util.Scanner;
public class Main5 {
    enum Num {One, Two, Three, Four, Five};
    public static void main(String[] args) {
    int i;
        System.out.println("Enter the number :");
        Scanner scn= new Scanner(System.in);
        i=scn.nextInt();
        switch (i)
        {
            case 1:System.out.println("One");;break;
            case 2: System.out.println("Two");break;
            case 3: System.out.println("Three");break;
            case 4: System.out.println("Four");break;
            case 5: System.out.println("Five");break;
        }
    }
    }

