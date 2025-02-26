import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // //direct given value
        // int num1 =12;
        // int num2 =16;
        // int add =num1+num2;
        // System.out.println(add);

        // //addtion using the input
        // int number1=sc.nextInt();
        // int number2 = sc.nextInt();
        // int aadd= number1+number2;
        // System.out.println(aadd);

        //convert minute to second
        // float minute =sc.nextFloat();
        // double second = minute*60;
        // System.out.println(second);


        //factorial
        // int num=sc.nextInt();
        // int fact=1;
        // if(num==1 || num==0){
        //     System.out.println("the factorial is :1");
        // }else{
            
        //     for(int i=1;i<=num;i++){
        //         fact=fact*i;
        //     }
        // }
        // System.out.println("the factorial of "+num+" is the :"+fact);
       
       
        // int value = sc.nextInt();
        // boolean isPrime = true;
        // if(value<=1){
        //     isPrime=false;
        // }else{
        //     for(int i=2;i<=Math.sqrt(value);i++){
        //         if(value%i==0){
        //             isPrime=false;
        //             break;
        //         }
        //     }
        // }
        // if(isPrime){
        //     System.out.println(value+" this is the prime");
        // }else{
        //     System.out.println(value+" this not prime");
        // }

       //faboniacci series
    //    int num=sc.nextInt();
    //    int a=0;
    //    int b=1;
    //    System.out.print(a+" "+b+" ");
    //    for(int i=2;i<num;i++){
    //     int num1=a+b;
    //     System.out.print(num1+" ");
    //     a=b;
    //     b=num1;
    //    }

    //reverse string
        // String name=sc.next();
        // int num1=name.length();
        // for(int i=num1-1;i>=0;i--){
        //     System.out.print(name.charAt(i));
        // }
       

        String name = sc.nextLine();
        int num5 = name.length();
        for(int i=num5-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
        
