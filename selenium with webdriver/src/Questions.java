import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        int i;
//        for (i=1;i<6;i++){
//            if (i>3)
//                continue;
//
//        }
//        System.out.println(i);

//        double sum=0;
//        for (double d=0;d<10;){
//            d+=0.1;
//            sum+=sum+d;
//        }

//        int i=0;
//        while (i++<=10){
//            i++;
//        }
//        System.out.println(i);

//        int i,j;
//        for (i=1,j=0;i<10;i++)j+=i;
//        System.out.println(i);

//        int i=1;
//        do {
//            i--;
//        }while (i>2);
//        System.out.println(i);

//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        int a=1;
//        int b=10;
//        for (int i=a;i<=b;i++){
//            if (i%2==0){
//                System.out.print(i+" ");
//            }
//        }
        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int count = 1;
//        for(int i=1;i<=a;i++)
//        {
//            for(int j=1;j<=b;j++)
//            {
//                System.out.print(count +" ");
//                count++;
//            }
//            System.out.println();
//        }


        //multiplication table

        int n=sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.print(n+"x "+i+"= "+(n*i));
            System.out.println();
        }




    }
}
