import java.util.Arrays;

public class ClassPracticeProblems {

    public static void main(String[] args) {
        //We want code that prints out all the nums 1:10..... colab
        //idk
        int[] data = justuhh1throughNArrayStylez(10);
        for(int i : data){
            System.out.println(i);
        }
    }

    //n is highest num
    static String justuhh1throughN(int n){
        String output = "";
        for(int i =1; i <= n;i++){
            output += i + "\n"; //System.out.println(i);
        }
        return output;
    }

    static int[] justuhh1throughNArrayStylez(int n){
        int[] arrays = new int[n];
        for(int i =1; i < n; i++){
            arrays[i] = i;
        }
        return arrays;
    }
}
