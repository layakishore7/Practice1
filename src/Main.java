public class Main {
    public static void main(String[] args) {
        String name = "Laya";

//        for (int i =name.length();i>=0;i--){
//            for (int j=i-1;j>=0;j--){
//                    System.out.print(name.charAt(j)+" ");
//            }
//            System.out.println();
//        }

        for (int i=0;i<=name.length()-1;i++){
            for (int j=0;j<=i;j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }


        int n=10,n1=0,n2=1;

        System.out.print(n1+" "+n2);

        for (int i=2;i<=n;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }





//       for (int i =5;i>0;i--){
//           for (int j=i;j>0;j--){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
    }
}