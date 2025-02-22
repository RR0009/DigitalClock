package digitalclock;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

    JLabel jlabClock;
    ClockThread ct;

    public DigitalClock() {
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 50));
        add(jlabClock);
        setSize(1200, 200);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);

    }
    public static void main(String[] args) {

        new DigitalClock();

    }


}
