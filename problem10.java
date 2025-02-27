public class problem10{
    public static void main(String[] args) {
        //gratest common division

        /*int number1=12;//asingn value first
        int number2=16;//assingn valu first

        while(number2!=0){//here loop run whenever number2=0 then loop stop
            int temp = number2;//temprory value of the number two store in the temp var
             number2 = number1 % number2;//here we assing the remainder to the number 2
             number1=temp;//here we assing the valu of the number2 to one that we store in the temp var 
        }System.out.println("the gcd is\t"+number1);*/


        //the least common divisor

        // int number1 = 16;
        // int number2 = 12;
        
        // while(number2!=0){
        //     int temp = number2;
        //     number2 = number1%number2;
        //     number1=temp;

        // }
        // int gcd = number1;
        // int lcm = Math.abs(number2*number1)/gcd;
        // System.out.println(lcm);

        // public class LCMCalculator {
        //     public static void main(String[] args) {
              /*   int number1 = 16;
                int number2 = 12;
                
                // Calculate GCD
                int a = number1;
                int b = number2;                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                int gcd = a;
                
                // Calculate LCM using the GCD
                int lcm = Math.abs(number1 * number2) / gcd;
                System.out.println("The LCM of " + number1 + " and " + number2 + " is " + lcm);*/



               int a = 16;
               int b = 12;
               int number1 = a;
               int number2 = b;

               while(b!=0){
                int temp = b;
                b = a%b;
                a =temp;
                }
                int gcd = a;

                int lcm = Math.abs(number1*number2)/gcd;
                System.out.print(lcm);
            }
        }
        

