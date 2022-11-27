import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    public void heightDifferenceTest(){
        WeekFourAssignments heightDifference = new WeekFourAssignments();
        int[] heights = {1,2,3,4,5,6,7,8,9,10};
        int[] heights2 = {1,1,1,1,1};
        assertTrue(heightDifference.heightDifference(heights) == 9);
        assertTrue(heightDifference.heightDifference(heights2) == 0);
    }

    @Test
    public void averageGradeTest(){
        WeekFourAssignments averageGrades = new WeekFourAssignments();
        int[] grades = {50, 100};
        int[] grades2 = {100,100,100,100};
        assertTrue(averageGrades.averageGrade(grades) == 75);
        assertTrue(averageGrades.averageGrade(grades2) == 100);
    }

    @Test
    public void mostCommonAgeTest(){
        WeekFourAssignments mostcommongage = new WeekFourAssignments();
        int[] ages = {1,2,3,3,3,4,5,6};
        int[] ages2 = {1,3,56,56,17,17,18,28};

        //Due to how function is written we should expect 56, since its the first with 2
        assertTrue(mostcommongage.mostCommonAges(ages2) == 56);
        assertFalse(mostcommongage.mostCommonAges(ages2) == 17);
    }

    @Test
    public void sumOfMultiplesTest(){
        WeekOneAssignments sumOf3and5Multiples = new WeekOneAssignments();
        WeekOneAssignments sumIf2and7Multiples = new WeekOneAssignments();

        assertTrue(sumOf3and5Multiples.sumOfMultiples3And5(10) == 23);
        assertTrue(sumOf3and5Multiples.sumOfMultiples3And5(12) == 33);

        assertTrue(sumIf2and7Multiples.sumOfMultiples2And7(8)==19);
    }

    @Test
    public void countWordsTest(){
        WeekFiveAssignments WordCount = new WeekFiveAssignments();
        String testSentence1 = " HOW MANY WORDS IS THIS "; // Should be 5
        String testSentence2 = "How about this test? "; // 4?
        assertTrue(WordCount.countWords(testSentence1)== 5);
        assertTrue(WordCount.countWords(testSentence2) == 4);
    }

    @Test
    public void reverseWordsTest(){
        WeekFiveAssignments reversedWord = new WeekFiveAssignments();
        String testSentence1 = "SwagMoney"; //Backwords is "yenoMgawS"
        String testSentece2 = "| What about spaces ? |";
        System.out.println(reversedWord.reverseWord(testSentece2));
        //assertTrue(reversedWord.reverseWord(testSentence1).equals("yenoMgawS"));
      // assertTrue(reversedWord.reverseWord(testSentece2).equals("| ? secaps tuoba tahW || ? secaps tuoba tahW |"));
    }

    @Test
    public void multiplyNumsTest(){
        WeekSixAssignments multiplyArray = new WeekSixAssignments();
        int[] values = {1,2,3,4,5}; //Answer should be {2,4,6,8,10}
        int[] NewValues = multiplyArray.scaleValues(values, 2);
        int[] answers = {2,4,6,8,10};
        assertTrue(NewValues[0] == 2);
        assertTrue(NewValues[1] == 4);
        assertTrue(NewValues[2] == 6);
        assertTrue(NewValues[3] == 8);
        assertTrue(NewValues[4] == 10);
        assertArrayEquals(NewValues,answers);
    }

    @Test
    public void removeElementTest(){
        WeekSixAssignments removeAnElement = new WeekSixAssignments();
        //Ex1: [1,2,3,4], 2 => [1,2,4] //Test 1. Length should = 3, Test 2.Values should match
        int[] values = {1,2,3,4};
        int[] NewValues = removeAnElement.removeElement(values,2);
        //1)
        assertTrue(NewValues.length == 3);

        //2)
        assertTrue(values[0] == NewValues[0]);
        assertTrue(values[1] == NewValues[1]);

        //This test case proves original number is removed
        //If function is wrong it will equal and this will be a false test case
        assertTrue(values[2]!=NewValues[2]);
        assertTrue(values[3] == NewValues[2]);

    }

    @Test
    public void shiftArray(){
        WeekSixAssignments ShiftACount = new WeekSixAssignments();
        //x1: [1,2,3,4,5], 2 => [3,4,5,1,2]
        int[] values = {1,2,3,4,5};
        int[] answers = {3,4,5,1,2};
        assertArrayEquals(answers,ShiftACount.shiftArray(values,2));
    }

    @Test
    public void multiplesOf2And7(){
        WeekSevenAssignments multiples = new WeekSevenAssignments();
        /*
        Ex1: 4 => 6
        Ex2: 7 => 19
        Ex3: 10 => 37
         */
        assertEquals(multiples.twoAndSevenMultipleSum(4),6);
        assertEquals(multiples.twoAndSevenMultipleSum(7),19);
        assertEquals(multiples.twoAndSevenMultipleSum(10),37);
    }

    @Test
    public void burdBuzzMultiples(){
        /*
        Ex1: 3,5,3 => 12Burd
        Ex2: 2,3,6 => 1BurdBuzzBurd5BurdBuzz
        Ex3: 2,7,5 => 1Burd3Burd5
         */
        WeekSevenAssignments burdBuzz = new WeekSevenAssignments();
        String test_one = "12Burd";
        String test_two = "1BurdBuzzBurd5BurdBuzz";
        String test_three = "1Burd3Burd5";

        assertEquals(test_one, burdBuzz.burdBuzz(3,5,3));
    }

    @Test
    public void mostCommonAge(){

        WeekSevenAssignments mostCommon = new WeekSevenAssignments();
        int[] test_one = new int[]{30, 45, 22, 30};     //Answer: 30
        int[] test_two = new int[]{3, 3, 3, 1};         //Answer: 3
        int[] test_three = new int[]{1, 2, 3, 4,5,6,2}; //Asnwer: 2

        assertEquals(30,mostCommon.mostCommon(test_one));
        assertEquals(3,mostCommon.mostCommon(test_two));
        assertEquals(2,mostCommon.mostCommon(test_three));
    }

    @Test
    public void reverseWordTest(){
        WeekSevenAssignments reversed = new WeekSevenAssignments();
//        x1: Hello world => olleH dlrow
//        Ex2: My name is => yM eman si
//        Ex3: Slim Shady => milS ydahS

        String test_one = "olleH dlrow";
        String test_two = "yM eman si";
        String test_three = "milS ydahS";

        assertTrue(test_one.equals(reversed.reverseWords("Hello world")));
        assertTrue(test_two.equals(reversed.reverseWords("My name is")));
        assertTrue(test_three.equals(reversed.reverseWords("Slim Shady")));
    }

    /*
        public static void main(String[] args){
//        System.out.println(romanNumeralToNumber("X")); //10
//        System.out.println(romanNumeralToNumber("I")); //1
//        System.out.println(romanNumeralToNumber("II"));//2
//        System.out.println(romanNumeralToNumber("IV"));//4
//        System.out.println(romanNumeralToNumber("VI"));//6
//        System.out.println(romanNumeralToNumber("IX"));//9
//    }
     */
    @Test
    public void romanToReal(){
        WeekEightAssignments roman = new WeekEightAssignments();
        assertEquals(1, roman.romanNumeralToNumber("I"));
        assertEquals(2, roman.romanNumeralToNumber("II"));
        assertEquals(3, roman.romanNumeralToNumber("III"));
        assertEquals(4, roman.romanNumeralToNumber("IV"));
        assertEquals(5, roman.romanNumeralToNumber("V"));
        assertEquals(6, roman.romanNumeralToNumber("VI"));
        assertEquals(7, roman.romanNumeralToNumber("VII"));
        assertEquals(8, roman.romanNumeralToNumber("VIII"));
        assertEquals(9, roman.romanNumeralToNumber("IX"));
        assertEquals(10, roman.romanNumeralToNumber("X"));
    }

    /*
    Ex1: [1,2,3] => 3 //Three different socks so Three socks with pairs
    Ex2: [1,1,2,2] => 0 //Two types of socks and two of each type, each has a pair
    Ex3: [1,1,1,2] => 2 //Two pair have a match, two socks do not
     */

    @Test
    public void sockMatch(){
        WeekEightAssignments matches = new WeekEightAssignments();
        int[] basketOne = {1,2,3}; // 3
        int[] basketTwo = {1,1,2,2}; // 0
        int[] basketThree = {1,1,1,2}; //2
        int[] basketFour = {1,2,3,1,2,3,4,5,6}; //3

        assertEquals(3,matches.looseSocks(basketOne));
        assertEquals(0,matches.looseSocks(basketTwo));
        assertEquals(2,matches.looseSocks(basketThree));
        assertEquals(3,matches.looseSocks(basketFour));
    }

    /*
    Ex1: Kaleb, Burd => 1 //The two names only share the letter B
    Ex2: Marshall Mathers => 5 //The two names share the letters m, a, r, s, and h
    Ex3: Sherlock Holmes => 5 //The two names share s, h, e, l, and o
     */
    @Test
    public void commonLetters(){
        WeekEightAssignments letters = new WeekEightAssignments();

        assertEquals(1,letters.commonLetters("Kaleb", "Burd")); //only B
        assertEquals(5,letters.commonLetters("Marshall", "Mathers")); // Only M,A,R,S,H
        assertEquals(5,letters.commonLetters("Sherlock", "Holmes")); // Only S,H,E,L,O
    }
}