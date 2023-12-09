package com.rajeshbammidi.SpringDemo.common;


// Observer there is no @Component here, which means not elegible foe DI ,so create Bean for this
public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("SwimCoach cons");
    }

    @Override
    public String getWorkOut() {
        return "SwimCoach is me";
    }
}
