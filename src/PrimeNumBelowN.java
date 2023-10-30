public class PrimeNumBelowN {
    public static void main(String[] args) {
        int n=100,pc=0;
        for (int i=1;i>0;i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                pc++;
                System.out.println(i);
            }
            if(pc==20){
                break;
            }
        }

    }
}
