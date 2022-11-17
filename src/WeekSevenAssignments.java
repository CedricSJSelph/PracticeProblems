import java.sql.SQLOutput;

public class WeekSevenAssignments {
//
//    public static void main(String[] args){
//        String test = "Hello World";
//        System.out.println(reverseWords(test));
//    }
    int twoAndSevenMultipleSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i%2==0 || i%7 ==0){
                sum+=i;
            }
        }
        return sum;
    }

    static String burdBuzz(int a, int b, int n){
        String temp ="";
        for(int i = 1; i <=n; i++){
            if(i%a==0 && i%b ==0){
                temp += "BurdBuzz";
            }else if(i%a ==0 && i%b !=0){
                temp += "Burd";
            }else if(i%a !=0 && i%b ==0){
                temp += "Buzz";
            }else{
                temp += i;
            }
        }
        return temp;
    }

     int mostCommon(int[] ages){

        int count = 0;
        int mostCommonAge = ages[0];

        for(int i = 0; i < ages.length; i++) {       //get first value to compare to rest
            int tempCount = 0;                   //Sets base count for checking
            for (int y = 0; y < ages.length; y++) {     //Cycle through entire array
                if (ages[i] == ages[y]) {
                    tempCount += 1;
                }
                if (tempCount > count) {
                    count = tempCount;
                    mostCommonAge = ages[i];
                }
            }
        }
        return mostCommonAge;
    }

    /*x1: Hello world => olleH dlrow
    Ex2: My name is => yM eman si
    Ex3: Slim Shady => milS ydahS*/

     String reverseWords(String s){
        String answer = "";
        String[] words = s.split(" ");

        for(int i = 0; i <words.length; i++){//Grab each word
            for(int y = words[i].length()-1; y >-1; y--) {
                answer += words[i].charAt(y);
            }
            answer += " ";
        }
        return answer.substring(0,answer.length()-1);
    }


}
