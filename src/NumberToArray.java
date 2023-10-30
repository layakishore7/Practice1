import java.util.Arrays;

public class NumberToArray {
    public static void main(String[] args) {
        int number = 4563219;
        
        // Count the number of digits in the number
       int temp = number;
       int count =0;
       while (temp!=0){
           temp=temp/10;
           count++;
       }

       int ar[] = new int[count];

       for (int i=count-1;i>=0;i--){
           ar[i]=number%10;
           number/=10;
       }
//       int c=ar.length;
//       Arrays.sort(ar);
//        System.out.println(ar[0]);
//        System.out.println(ar[c-1]);
//       for (int a : ar){
//           System.out.println(a);
//       }

        int n = ar.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (ar[i] < ar[j+1]){
                    int temp1 = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp1;
                }
            }
        }
        System.out.println(ar[0]);
        System.out.println(ar[n-1]);
    }
}
