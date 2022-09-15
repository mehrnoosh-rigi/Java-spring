package spring.demo.one;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return  "Run for 2 km";
    }
}
