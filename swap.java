public class swap {
    public static void main(String[] args) {
        //this the logic one
        int num1 = 5;
        int num2 = 10 ;
        System.out.println(num1+","+num2);
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println(num1+","+num2);

        ///the logic two  +,-,- without third variable
        int a5 = 10;
        int b5 = 20;
        a5=a5+b5;
        b5=a5-b5;
        a5=a5-b5;
        System.out.println(a5+","+b5);

        //the third logic using the *,/ a=b!=0;
        int a2= 6;
        int b2=10;
        System.out.println(a2+","+b2);
        a2=a2*b2;
        b2=a2/b2;
        a2=a2/b2;
        System.out.println(a2+","+b2);

        //using the bitwise xor ^
        int a1 = 9;
        int b1 = 19;
        System.out.println(a1+","+b1);
        a1=a1^b1;
        b1=a1^b1;
        a1=a1^b1;
        System.out.println(a1+","+b1);

        //using b,+-=
        int a = 12;
        int b = 16;
        System.out.println(a+","+b);
        b=a+b-(a=b);
        System.out.println(a+","+b);



    }
}
