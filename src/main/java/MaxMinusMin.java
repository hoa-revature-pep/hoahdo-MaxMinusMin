
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){

        int largestNum = nums.get(0);
        int smallestNum = nums.get(0);
        int sizeOfList = nums.size();
        
        for (int x = 0; x < sizeOfList; x++) {

            if(largestNum < nums.get(x)) {
                largestNum = nums.get(x);
            }
            
            if(smallestNum > nums.get(x)) {
                smallestNum = nums.get(x);
            }
        }

        return (largestNum - smallestNum);
    }
}


// use size() method to get size of list interface
// use size in for loop
// find largest num and smallest num
// difference between highest and lowest value