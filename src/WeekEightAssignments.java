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
}
