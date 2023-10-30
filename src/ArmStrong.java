public class ArmStrong {

    public static void main(String[] args) {

        int n = 121, temp,last,sum=0;
        temp = n;


        while (temp!=0) {
             last = temp % 10;
             sum += (int) Math.pow(last,3);
             temp=temp/10;
        }

        if (sum==n){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }


    }
}
