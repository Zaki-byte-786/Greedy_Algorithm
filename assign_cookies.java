import java.util.Arrays;
public class assign_cookies {
    static int function(int[] greed,int[] size){
        Arrays.sort(greed);
        Arrays.sort(size);
        int i = 0,j = 0,child = 0;
        while (i < greed.length && j < size.length){
            if (greed[i] < size[j] || greed[i] == size[j]){
                child++;
                i++;
            }
            j++;
        }
        return child;
    }
    public static void main(String[] args) {

    }
}
