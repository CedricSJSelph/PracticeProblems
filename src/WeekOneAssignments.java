import java.util.ArrayList;

public class WeekOneAssignments {
    public static void main(String[] args){
        System.out.println(sumOfMultiples3And5(12));
    }
    public static int sumOfMultiples3And5(int n){
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int total = 0;
        for(int i = 1; i <n; i++){
            if(i%3==0 || i%5==0){
                multiples.add(i);
            }
        }
        for(int y = 0; y < multiples.toArray().length; y++){
            total += multiples.get(y);
        }
        return total;
    }
    public static int sumOfMultiples2And7(int n){
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int total = 0;
        for(int i = 1; i <n; i++){
            if(i%2==0 || i%7==0){
                multiples.add(i);
            }
        }
        for(int y = 0; y < multiples.toArray().length; y++){
            total += multiples.get(y);
        }
        return total;
    }
}
