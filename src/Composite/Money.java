package Composite;

public class Money {

    private int amount;

    public Money(){
        this.amount = 0;
    }

    public Money(int amount){
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
