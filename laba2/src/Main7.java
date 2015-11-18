public class Main7 {
    public static void main(String[] args) {
        int oxx=0xD123;
        System.out.println("Value in before shift "+Integer.toHexString(oxx));
        int oxx1=oxx>>8;
        int oxx2=oxx>>>2;
        System.out.println("Value after shift: "+Integer.toHexString(oxx1)+ " & "+Integer.toHexString(oxx2));
    }
}
