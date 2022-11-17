public class WeekFiveAssignments {

    public static void main(String[] args){

        String testSentence1 = " HOW MANY WORDS IS THIS ";
        System.out.println(" TEST ");
        System.out.println("~~~~~~~~~~~");
        reverseWord(testSentence1);
    }
    public static int countWords(String sentence){
        int count = 0;
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            if(!words[i].isEmpty()){
                count++;
            }
        }
         return count;
    }

    public static String reverseWord(String sentence){
        String reversedSentence = "";
        for(int i = sentence.length()-1; i >= 0; i--){
            reversedSentence+=sentence.charAt(i);
            //System.out.print(sentence.charAt(i));
        }
        return reversedSentence;
    }
}
