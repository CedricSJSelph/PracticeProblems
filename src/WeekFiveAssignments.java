public class WeekFiveAssignments {

    public static void main(String[] args){

//        String testSentence1 = " HOW MANY WORDS IS THIS ";
//        System.out.println(" TEST ");
//        System.out.println("~~~~~~~~~~~");
//        countWords(testSentence1);
    }

    /*
     int castAscii = (int) ch;
     */

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
}
