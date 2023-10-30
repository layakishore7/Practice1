import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<String> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.add(scan.next());
        }

        String m = scan.next();

        boolean modif = nums.stream()
                .map(nu->"+91"+nu)
                .filter(num->!morethanthree(num))
                .anyMatch(match -> match.startsWith(m));
        if(modif){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean morethanthree(String num){
        return num.chars().filter(c->c=='9').count()>3;
    }
}
