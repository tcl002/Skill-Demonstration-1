public class CoinCounter {

    // money value as an integer, 100 = $1.00
    int money;

    // 0 = quarters, 1 = dimes, 2 = nickels, 3 = pennies
    int[] change;

    public CoinCounter(int money){
        this.money = money;
        this.change = new int[4];
    }

    // return the number of each coin that adds up to the value of the money value
    public int[] getChange(){
        int temp = this.money;
        this.change[0] = (int) (temp / 25);
        temp = temp % 25;
        this.change[1] = (int) (temp / 10);
        temp = temp % 10;
        this.change[2] = (int) (temp / 5);
        temp = temp % 5;
        this.change[3] = temp;

        return this.change;
    }

}