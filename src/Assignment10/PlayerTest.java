package Assignment10;

public class PlayerTest {
    public static void main(String[] args) {

        TournamentIncome t1 =new TournamentIncome("David warner", "A", 10000);

        t1.calculateGradeBonus();
        t1.displayDetails();

        PlayerIncome p1 = new PlayerIncome("Smith", 10000);
        p1.calculateTax();
        p1.displayDetails();
    }
}
