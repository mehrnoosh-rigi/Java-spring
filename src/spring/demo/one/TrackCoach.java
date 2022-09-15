package spring.demo.one;

public class TrackCoach implements Coach {
    public FortuneService fortuneService;

    public TrackCoach(){}

    public TrackCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return  "Run a hard 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Next message: "+fortuneService.getFortune();
    }
}
