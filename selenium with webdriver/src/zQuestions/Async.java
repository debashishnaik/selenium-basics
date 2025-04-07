package zQuestions;

public class Async {
    private static int factorial(int number) {
        int fact=1;
        for (int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number=5;
        Thread newthread=new Thread(()->{

            System.out.println("world");
            System.out.println("factorial of "+number+" is :"+factorial(number));
        });
        newthread.start();

        Thread newthread2=new Thread(()->{

            System.out.println("world");
            System.out.println("factorial of 2nd thread"+number+" is :"+factorial(number));
        });
        newthread2.start();

        System.out.println("hello");

//        System.out.println("factorial of "+number+" is :"+factorial(number));

    }





}
