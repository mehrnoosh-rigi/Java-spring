package spring.demo.one;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside setter method - setTeam");

        this.team = team;
    }
}
