public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 29,count=0;
       for (int i=1;i<=n;i++){
           if (n%i==0){
               count++;
           }
       }
       if (count==2){
           System.out.println("prime");
       } else {
           System.out.println("not prime");
       }
    }
}
