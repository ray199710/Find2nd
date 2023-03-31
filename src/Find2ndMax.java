public class Find2ndMax {
    public static void main(String[] args) {
        int ans = find(new int[]{-90,-5,-70,-2,-6,-5,-4});
        System.out.println(ans);
    }
    public static int find(int[] nums){
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                sec=max;
                max=nums[i];

            }
            if(nums[i]<max && nums[i]>sec)sec=nums[i];

        }


        return sec;
    }
}
