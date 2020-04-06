/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removedup;

/**
 *
 * @author adari
 */
public class RemoveDup {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                }
            }
        return i+1;
    }
    
	public static void main(String[] args) {
		int nums[] = {1,1,2,2,2,2,3,4,45};
		System.out.println(removeDuplicates(nums));
	}
}
