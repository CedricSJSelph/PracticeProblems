public class WeekFourAssignments {

    public static double averageGrade(int[] userData){
        double totalGrades= 0;
        int totalStduents = 0;
        for(int i = 0; i < userData.length; i++){
            totalGrades += userData[i];
            totalStduents+=1;
        }
        return (totalGrades/totalStduents);
    }

    public static int heightDifference(int[] heights){
        int tallest= 0;
        int shortest = 0;

        //Find tallest person
        for(int t = 0; t < heights.length; t++){
            if(heights[t] > tallest){
                tallest = heights[t];
            }
        }
        shortest = tallest;
        //Find shortest person
        for(int s = 0; s < heights.length; s++){
            if(heights[s] < shortest){
                shortest = heights[s];
            }
        }
        return tallest-shortest;
    }

    public static int mostCommonAges(int[] ages){
        int mostCommon = ages[0];
        int count = 0;

        for(int i = 0; i < ages.length; i++){
            int tempCount = 0;
            for(int y = 0; y < ages.length; y++){
                if(ages[i] == ages[y]){
                    tempCount+=1;
                }
            }
            if(tempCount > count){
                count = tempCount;
                mostCommon = ages[i];
            }
        }
        return mostCommon;
    }
}

