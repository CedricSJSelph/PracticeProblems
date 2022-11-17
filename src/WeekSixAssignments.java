public class WeekSixAssignments {

    int[] scaleValues(int[] nums, int scale){
        /*
        x1: [1,2,3,4], 2 => [2,4,6,8] Multiply
        Ex2: [1,1,1,3], 3 => [3,3,3,9]
        Ex3: [8,5,5,6], 0 => [0,0,0,0]
         */
        int[] NewValues = new int[nums.length];
        for(int y = 0; y < NewValues.length;y++){
            nums[y] = nums[y]*scale;
        }
        return nums;
    }

    int[] removeElement(int[] nums, int i){
        /*
        Ex1: [1,2,3,4], 2 => [1,2,4]
        Ex2: [1,1,1,3], 3 => [1,1,1]
        Ex3: [8,5,5,6], 0 => [5,5,6]
         */
        int[] NewValues = new int[nums.length-1];
        int nEWaRRAYiNDEX = 0;
        for(int y = 0; y <nums.length; y++){
            if(y!= i){
                NewValues[nEWaRRAYiNDEX] = nums[y];
                nEWaRRAYiNDEX++;
            }
        }
        return NewValues;
    }

    int[] shiftArray(int[] nums, int shift){
        /*
        x1: [1,2,3,4,5], 2 => [3,4,5,1,2]
        Ex2: [1,1,1,3], 3 => [3,1,1,1]
        Ex3: [8,5,5,6], 0 => [8,5,5,6]
         */
        /*
        Idea; Scroll through list amount of times as shfit
        can this be done in one loop? Possibly, algorithmic?
        x[0] == y[3];
        x[1] == y[4];
        x[2] == y[1];
        x[3] == y[0];
        x[4] == y[2]
         */
        int[] NewValues = new int[nums.length];
        int count = 0;
        for(int i = shift; i < nums.length; i++){
            NewValues[count] = nums[i];
            count++;
        }
        for(int y = 0; y< shift; y++){
            NewValues[count] = nums[y];
            count++;
        }
        return NewValues;
    }

}
