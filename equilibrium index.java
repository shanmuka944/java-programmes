import java.util.Scanner;
class Solution {
    static int searchInsert(int[] nums, int target) {
        
    
        int start = 0 ;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
            {
                System.out.println(mid);
                return mid;
                
            }
            else if(nums[mid]>target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        System.out.println(start);
        

return -1;
    }
        
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int target= sc.nextInt();
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++)
    {
        nums[i]=sc.nextInt();
    }
    Solution searcharr=new Solution();
    Solution.searchInsert(nums,target);
}
}