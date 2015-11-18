public class Main10 {
    public static void main(String[] args) {
        final int a=100;
        int [] x = new int [a];
        for(int i=2;i<x.length;i++ ){
            if(x[i]==0)
            {
                for(int j=i;j<x.length;j+=i) {
                    x[j]=2;
                }x[i]=1;
                }
                }
        int format=0;
                for(int i=0;i<x.length;i++)
                {
                    if(x[i]==1)
                    {
                        System.out.print(i+" ");
                        format++;
                        if((format % 5) == 0) System.out.println();
                    }
                }
    }
}
