public class Fibonacci {

    public static void main(String[] args) {
        int num = 1;
        int a=0,b=1,n=11;

       // System.out.print(a+" "+b+" ");
        for (int i=2;i<n;i++){
            int c = a+b;
            if(c==num){
                System.out.print(c+" ");
            }
            a=b;
            b=c;
        }

        String name = "how are you";
        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

        int n1= 12345;
        int reversed=0;
            while (n1!=0) {
                int digit = n1 % 10;
                reversed = reversed*10+digit;
                n1=n1/10;
              //  System.out.println(reversed);
        }
        System.out.println(reversed);
    }
}
