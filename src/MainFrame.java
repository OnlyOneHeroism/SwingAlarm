import model.Time;
import view.SingleAlarmPanel;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JScrollPane jScrollPane;

    public MainFrame() {
        jScrollPane = new JScrollPane();
        setContentPane(new SingleAlarmPanel(new Time(10, 10), new Time(1, 1)));
    }

}
