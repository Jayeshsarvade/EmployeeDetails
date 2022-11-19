package Assignment10;

public class TournamentIncome extends Player implements GradeBonus{

    String grade;
    float rate;
    //float bonus;

    public TournamentIncome(String name,String grade,float rate) {
        super();
        this.name=name;
        this.grade=grade;
        this.rate=rate;
    }

    @Override
    public void calculateGradeBonus() {
        // TODO Auto-generated method stub

        rate=(rate/100)*GRADE_BONUS_PERCENT;
        //if(this.grade=="A")
    }

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        System.out.println("name of player is "+name);
        System.out.println("grade of player is "+grade);
        System.out.println("rate is "+rate);
        //System.out.println("after bonus "+bonus);
    }
}
