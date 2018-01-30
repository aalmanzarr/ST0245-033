/**
 * Write a description of class Punto2 here.
 * 
 * @author Andres Almanzar
 * @version 1.0
 */
public class Punto2 {
    public boolean punto2(int start, int[] nums, int target) {
        if (start >= nums.length) 
            return (target == 0);
        else
            return punto2(start+1, nums, target) 
            || punto2(start+1, nums, target - nums[start]);
    }
}