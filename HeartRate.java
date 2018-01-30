//HeartRate.java

import java.util.*;
import java.sql.Timestamp;

public class HeartRate extends Observable {
    private int rate;
    private String history;
    Timestamp time;


    public HeartRate(){
        history = "";
    }

    public void rateChanged(){
        setChanged();
        notifyObservers();
    }

    public void setRate(int rate){
        this.rate = rate;
        time = new Timestamp(System.currentTimeMillis());
        history += time + "\t" + rate + "\n";
        rateChanged();
    }
    public int getRate(){
        return rate;
    }

    public String getHistory(){
        return history;
    }

}
