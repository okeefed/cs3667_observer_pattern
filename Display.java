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
            else {
                display();
            }
        }
    }

    public void display() {
        String s = "";
        int num = (int)(rate/2.5);
        System.out.println("Current " + rate);
        for (int i = 0; i < num; i++)
        {
            s+="X";
        }
        s+="^";
        System.out.println(s);
        System.out.println("0          30          60          90          120         150         180         210");
        System.out.println("");
        System.out.println("");
    }
}


