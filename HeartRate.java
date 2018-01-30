//HeartRate.java

import java.util.*;

public class HeartRate extends Observable {
    private int rate;

    public HeartRate(){
    }

    public void rateChanged(){
        setChanged();
        notifyObservers();
    }

    public void setRate(int rate){
        this.rate = rate;
        rateChanged();
    }
    public int getRate(){
        return rate;
    }

}
