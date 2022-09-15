package spring.demo.one;

import spring.demo.one.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
