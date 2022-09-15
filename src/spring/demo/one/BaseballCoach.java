package spring.demo.one;

public class BaseballCoach implements Coach {
    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return  "Run for 2 km";
    }

    @Override
    public String getDailyFortune() {
        // use fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
