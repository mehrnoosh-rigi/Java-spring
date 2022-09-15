package spring.demo.one;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("Inside no-arg CricketCoach");
    }
    // Setter method
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("Inside setter method - CricketCoach");

        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "gerDailyWorkout method in CricketCoach";
    }

    @Override
    public String getDailyFortune() {
        return "gerDailyFortune method in CricketCoach: " + fortuneService.getFortune();
    }
}
