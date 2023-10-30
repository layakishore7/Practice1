public class StrongNum {
    public static void main(String[] args) {
        int n = 145;

        if (strongNum(n)){
            System.out.println("strong num");
        } else {
            System.out.println("not strong num");
        }
    }
    static int facto(int n) {
        int fact =1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    static boolean strongNum(int n) {
        int last, sum =0;
        int temp = n;

        while (temp!=0){
            last = temp%10;
            sum = sum + facto(last);
            temp = temp/10;
        }

        if (sum==n){
            return true;
        } else {
            return false;
        }
    }
}
