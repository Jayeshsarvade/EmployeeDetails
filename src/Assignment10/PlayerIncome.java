package Assignment10;

public class PlayerIncome extends Player implements Tax{
    float income;

    PlayerIncome(String name,float income)
    {
        this.name=name;
        this.income=income;
    }

    @Override
    public void calculateTax() {
        // TODO Auto-generated method stub

        income=income-income*(TAX_PERCENT/100);
    }

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        System.out.println("Name of the Player is "+name);
        System.out.println("income of player is "+income);
    }
}
