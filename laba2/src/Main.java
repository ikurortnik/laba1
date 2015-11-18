public class Main {
    int i;
    byte b;
    double d= 123.456d;
    float f=5678.222f;
    char c='l';
    boolean bo=true;
    long l=122+111;
    short s=555+222;
    public void print1(){
        System.out.println(String.format("0x%08X", i));
        System.out.println(String.format("0x%08X", b));
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(bo);
        System.out.println(String.format("0x%08X", l));
        System.out.println(String.format("0x%08X", s));;
    };
    public static void main(String[] args) {
        Main newmain = new Main();
        newmain.print1();
    }
}
