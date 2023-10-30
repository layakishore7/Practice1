public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int r,sum=0,temp;
        temp=n;
        while (n>0){
            r=n%10;
            sum = sum*10+r;
            n=n/10;
        }
        if (sum == temp){
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
