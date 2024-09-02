public class lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0,i;
        for ( i = 0; i < bills.length; i++) {
            if (bills[i] == 5)five++;
            else if (bills[i] == 10) {
                if (five >= 1){
                    five--;
                    ten++;
                }
                else break;
            }
            else {
                 if(five >= 1 && ten >= 1){
                    ten--;
                    five--;
                }
                 else if (five >= 3) {
                     five -= 3;
                 }
                 else break;
            }
        }
        return i == bills.length;
    }
    public static void main(String[] args) {

    }
}
