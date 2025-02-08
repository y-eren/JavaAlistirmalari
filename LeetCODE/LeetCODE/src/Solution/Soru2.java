package Solution;



public class Soru2 {

	    public static int[] twoSum(int[] nums, int target) {
	        int[]abc = new int[10];
	        int k=0;
	        for(int i=0; i < nums.length; i++)
	        {
	            for(int j=i+1; j < nums.length; j++)
	            {
	                if(nums[i] + nums[j] == target)
	                {
	                abc[k++]=i;
	                abc[k++]=j;
	                
	                   
	                }
	            }
	        }
	        return abc;
	    }
	
	public static void main(String[] args) {
		
int nums[] = {1,2,3};
	System.out.println(twoSum(nums,5));

}
}
