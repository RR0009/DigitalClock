package digitalclock;

import java.util.Date;

public class ClockThread extends Thread {

    DigitalClock Ukraine;
    String time;
    public ClockThread(DigitalClock Ukraine) {
        this.Ukraine = Ukraine;

        start();
    }

    public void run(){
        while(true){
            time ="" + new Date();
            Ukraine.jlabClock.setText(time);
        }
    }


}
