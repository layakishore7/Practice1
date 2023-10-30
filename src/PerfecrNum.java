public class PerfecrNum {

    public static void main(String[] args) {

        int n=496, sum =0;

        for (int i=1;i<=n/2;i++){
            if (n%i==0){
                sum = sum +i;
            }
        }
        if (sum==n){
            System.out.println("perfect num");
        } else {
            System.out.println("not a perfect num");
        }

    }
}
