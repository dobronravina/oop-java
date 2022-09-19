import java.util.ArrayList;
import java.util.List;


public class StringCalculator {


    public int add(String numbers){
        int sum = 0;


        if ((numbers.isEmpty()) || (numbers.equals(" "))){
            return  sum;
        }



       String[] splnum = numbers.split(",|\\\\n");




            try{
                for (String s : splnum) {
                    int nums = Integer.parseInt(s);
                    negativeNums(nums);
                    if (nums > 1000) {
                        continue;
                    }
                    sum += nums;
                }
            }
            catch (NumberFormatException ex){
                System.out.println("Не числа рахувати складно...)");
                sum = 0;
            }


        return sum;
    }
     private void negativeNums(int nums){
         List<Integer> negative = new ArrayList<>();
        if (nums < 0){
            negative.add(nums);}

            if(negative.size() != 0){
                for(int i: negative){
                throw new
                ArithmeticException("Не люблю від'ємні значення. Недозволені числа: "+ negative);}
            }



     }
     private void afterdell(String numbers){
        if(starts(numbers)){
            if(!numbers.contains("\\\\n")){
                
            }
        }
     }

     private boolean starts(String numbers){
        return numbers.length() > 2 && numbers.startsWith("//");
     }
}
