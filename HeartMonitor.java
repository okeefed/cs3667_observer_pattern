//HeartMonitor

public class HeartMonitor {

    public static void main(String[] args) {
        HeartRate heartRate = new HeartRate();

        Display display = new Display(heartRate);

        heartRate.setRate(144);
    }
}
