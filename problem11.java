public class problem11 {
    public static void main(String args[]){

        ///reverse the string
        String name = "deva";
        String reverse = new StringBuilder(name).reverse().toString();
        System.out.println(reverse);

        //prime puzzle 

        int a=60;
        int b=90;
        
        int number1 = a;
        int number2 = b;

        //first find the gcd
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp ;
        }
        int gcd  = a;

        //now we find the lcm
        int lcm = Math.abs(number1*number2)/gcd;

        //the prime puzzlee
        int result = gcd * lcm;

        System.out.println("gcd: "+gcd);
        System.out.println("lcm: "+lcm);
        System.out.println("puzzle complex: "+result);
    }
}
