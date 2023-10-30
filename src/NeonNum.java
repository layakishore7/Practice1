public class NeonNum {
    public static void main(String[] args) {
        int n=121,sqr,r,sum = 0;
        
        sqr = n*n;
        while (sqr!=0) {
            r=sqr%10;
            sum=sum+r;
            sqr=sqr/10;
        }
        if (sum==n) {
            System.out.println("neon num");
        } else {
            System.out.println("not neon num");
        }
        
    }
}
