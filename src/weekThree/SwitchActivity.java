package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String sport = JOptionPane.showInputDialog(null, "Enter a main sport in the United States").toLowerCase();
        String sportInfo = "";

        switch (sport) {
            case "baseball":
                sportInfo = "This sport is fun to play but boring to watch.";
                break;
            case "football":
                sportInfo = "College football is way better than the NFL.";
                break;
            case "basketball":
                sportInfo = "Michael Jordan is the GOAT";
                break;
            case "soccer":
                sportInfo = "This is the real football";
                break;
            default:
                sportInfo = "Either the input was not a sport or there is not any info for said sport.";
                break;


        }
        JOptionPane.showMessageDialog(null,sportInfo);
    }
}
