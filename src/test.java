import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    public void heightDifferenceTest(){
        WeekFourAssignments heightDifference = new WeekFourAssignments();
        int[] heights = {1,2,3,4,5,6,7,8,9,10};
        assertTrue(heightDifference.heightDifference(heights) == 9);
    }

    @Test
    public void averageGradeTest(){
        WeekFourAssignments averageGrades = new WeekFourAssignments();
        int[] grades = {50, 100};
        assertTrue(averageGrades.averageGrade(grades) == 75);
    }

    @Test
    public void mostCommonAgeTest(){
        WeekFourAssignments mostcommongage = new WeekFourAssignments();
        int[] ages = {1,2,3,3,3,4,5,6};
        assertTrue(mostcommongage.mostCommonAges(ages) == 3);
    }
}