import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //to check the string is emprty or not
        String str=" ";
        if(str.isEmpty()){
            System.out.println(" string is empty");
        }else{
            System.out.println(" string is not empty");
        }


        String str1 = "deav";
        int length = str1.length();
        if(length==0){
            System.out.println("str is empty");

        }else{
            System.out.println("is not empty");
        }


        //palidrome ckeck
       String name = "ded";
       int num = name.length();
       boolean isPalidrome = true;
       for(int i=0;i<num/2;i++){
        if(name.charAt(i)!=name.charAt(num-i-1)){
            isPalidrome=false;
            break;
        }
           
       }
       if(isPalidrome){
        System.out.println("string is the palidrome");
       }else{
        System.out.println("string is not palidrome");
       }

      //sum of digit =>123 = 1+2+3

      int mum = sc.nextInt();
      int sum=0;
      while(mum!=0){
        int digit = mum%10;
        sum=sum+digit;
        mum/=10;
      }System.out.println(sum);

      //largest in array

    int[] nums = {1,2,3,4,5};
    int largest = nums[0];
    for(int i=0;i<nums.length;i++){
        if(largest<nums[i]){
            largest=nums[i];
        }
    }System.out.println(largest);




    

  






        
    }
}
