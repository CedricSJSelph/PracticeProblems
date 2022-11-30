import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WeekEightAssignments {

    int convert(char num){
        int value = 0;
        switch(num){
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
        }
        return value;
    }
    int romanNumeralToNumber(String numeral){
        int value = 0;                                      //total of roman numeral in decimal form
        for(int i = 0; i < numeral.length(); i++){          //Scan each item
            int num1 = convert(numeral.charAt(i));          // Get first value
            if(i+1 < numeral.length()){                     //No out of index errors please
                int num2 = convert(numeral.charAt(i+1));    //Get the next value for comparison, how we handle IV and VI, is it 4 or 6?
                if(num1>=num2){                             //Handling the thing i just mentioned
                    value = value + num1;
                }else{
                    value = value + num2 - num1;            //IV is 5-1 and VI is 5+1, the else statement handles this
                    i++;
                }
            }else{
                value = value + num1;                       //If no next index then just add it
            }
        }
        return value;
    }

    /*
    Ex1: [1,2,3] => 3 //Three different socks so Three socks with pairs
    Ex2: [1,1,2,2] => 0 //Two types of socks and two of each type, each has a pair
    Ex3: [1,1,1,2] => 2 //Two pair have a match, two socks do not

    Ideas:
        1) take one and compare to each, remove both from arraylist, increment counter(or restart?)(Whileloop?)
         and start loop over, ~~~~ Didnot work, too much code to really find the problem, number 2 is simpler and works
        2)Sort first, check if f[x] and f[x+1] match, if so add one to incrementer, if no match add 1.
     */
    static int looseSocks(int[] socks){
        int unMatchedCount =socks.length;
        ArrayList<Integer> unMatchedSocks = new ArrayList<>();
        for(int i : socks){
            unMatchedSocks.add(i);
        }
        //[1,1,2,2] => 0
        Collections.sort(unMatchedSocks);
        for(int i = 0; i < unMatchedSocks.size()-1;i++){
            if(unMatchedSocks.get(i).equals(unMatchedSocks.get(i+1))){
                unMatchedCount-=2;
                i+=1;
            }
        }
        return unMatchedCount;
    }

    /*/
    What is int? return type integer
    What is addNums? Name of function
    What is parameter of this function? a and b are param. "inputs"
    Explain the last two lines?
     */
    static int addNums(int a, int b){
        System.out.println(a);
        int variable = a+b;
        return variable;
    }

    /*
    Ex1: Kaleb, Burd => 1 //The two names only share the letter B
    Ex2: Marshall Mathers => 5 //The two names share the letters m, a, r, s, and h
    Ex3: Sherlock Holmes => 5 //The two names share s, h, e, l, and o

    Find common letters
     */
    int commonLetters(String first, String last){
        int count = 0;
        ArrayList<Character> firstString = new ArrayList<Character>();
        ArrayList<Character> secondString = new ArrayList<Character>();
        ArrayList<Character> usedLetters = new ArrayList<Character>();
        for(int i = 0; i < first.length(); i++){firstString.add(first.toLowerCase().charAt(i));}//Add all chars individually
        for(int y = 0; y < last.length(); y++){secondString.add(last.toLowerCase().charAt(y));}
        for(char z : firstString){
            if(secondString.contains(z) && !(usedLetters.contains(z))){
                usedLetters.add(z);
                count+=1;
            }
        }
        return count;
    }

}
