package Single_Number_136;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 1, 1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
// HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else
        // {
        //     map.put(nums[i],1);
        // }
        // }
        // for(Integer key:map.keySet())
        // {
        //     if(map.get(key)==1)
        //     {
        //         return key;
        //     }
        // }
        // return -1;
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }

}
