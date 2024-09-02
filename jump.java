public class jump {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i = 0;i < nums.length;i++){
            if(maxIndex < i)return false;
            maxIndex = Math.max(maxIndex,i + nums[i]);
            if(maxIndex >= nums.length - 1)return true;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
