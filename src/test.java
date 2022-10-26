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
        System.out.println(WordCount.countWords(testSentence1));
        assertTrue(WordCount.countWords(testSentence1)== 5);
        assertTrue(WordCount.countWords(testSentence2) == 4);
    }
}