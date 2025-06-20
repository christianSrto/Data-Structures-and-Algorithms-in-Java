import java.util.Arrays;

public class binary_search {
    // binary search = Search algo that finds the position
    //                 of a target value within a sorted array.
    //                 Half of the array is eliminated during each "step"
    //                 time complexity: O(logn) works better with larger data sets

    public static void main(String[] args) {
        
        int array[] = new int[1000000];
        int target = 764323;

        for(int i =0; i<array.length; i++){
            array[i] = i;
        }

        //using built in arrays binary search
        //int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);

        if (index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println(target + " found at index: " + index);
        }

       
    }
     private static int binarySearch(int[] array, int target){
        int low = 0;    
        int high = array.length -1;
        int steps = 0;

        while(low<= high){
            int middle = low +(high - low)/2;
            int value = array[middle];

            System.out.println("Middle: " + value);
            steps++;

            if(value < target){
                low = middle +1 ;
            }
            else if(value > target){
                high = middle -1;
            }
            else{
                System.out.println("Search took " + steps + " steps");
                return middle;
            }
        }

        return -1;
    }
}
