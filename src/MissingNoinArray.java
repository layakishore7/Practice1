import java.util.Scanner;

public class MissingNoinArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 5, 6, 7};
        int n = ar.length+1;
        int total = (n*(n+1))/2;
        int sum =0;
        for (int num : ar){
            sum = sum+num;
        }

        System.out.println(total-sum);
    }
}
