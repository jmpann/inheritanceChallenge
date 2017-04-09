package com.company;

/**
 * Created by flatironschool on 4/9/17.
 */
public class Honda extends Car {
    private int roadServiceMonths;

    public Honda(int roadServiceMonths) {
        super("Honda", "2WD", 4, 4, 4, false);

        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

        if(newVelocity == 0) {
            stop();
            changeCurrentGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeCurrentGear(1);
        } else if(newVelocity > 10 && newVelocity <= 25){
            changeCurrentGear(2);
        } else if(newVelocity > 25 && newVelocity <= 40){
            changeCurrentGear(3);
        } else {
            changeCurrentGear(4);
        }
    }
}
