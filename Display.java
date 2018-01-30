 //Display.java
 //

import java.util.*;

public class Display implements Observer, DisplayElement {
    private int rate;

    public Display(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg){
        if(observable instanceof HeartRate){
            HeartRate heart = (HeartRate)observable;
            rate = heart.getRate();
            if(rate > 120 || rate < 40)
            {
                System.out.println("WARNING HEART RATE IS IN DANGER SPOT");
                display();
            }
        }
    }

    public void display() {
        System.out.println("Current " + rate);
    }
}


