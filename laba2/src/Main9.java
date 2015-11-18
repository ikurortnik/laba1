public class Main9 {
    public static void main(String[] args) {
        final int a=10000;
        int m=1;
        int res=0;
        int p=1;
        while(m<a)
        {
            res=m*p;
            if(res>=a)
                break;
            System.out.println(p);
            p+=2;
            m=res;
        }
    }}