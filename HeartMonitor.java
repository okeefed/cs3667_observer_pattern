//HeartMonitor

import java.util.Scanner;

public class HeartMonitor {

    public static void main(String[] args) {
        int read = 0;
        Scanner keyboard = new Scanner(System.in);
        
        HeartRate heartRate = new HeartRate();

        Display display = new Display(heartRate);
        System.out.println("Welcome Heart Monitor ENTER -1 to quit");

        while (read > -1)
        {
            System.out.println("Enter your heart rate below");
            read = keyboard.nextInt();
            if(read != -1){
                heartRate.setRate(read);
            }
        }
        
    }
}
