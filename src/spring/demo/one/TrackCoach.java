package spring.demo.one;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return  "Run a hard 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
