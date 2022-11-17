package view;

import model.Time;

import javax.swing.*;
import java.awt.*;

public class SingleAlarmPanel extends JPanel {

    private JLabel textFieldRingAt;

    private JLabel textFieldRemain;

    private JCheckBox checkBoxSwitch;

    private Time timeToRingAt;

    private Time timeRemain;

    public SingleAlarmPanel(Time timeToRingAt, Time timeRemain) {
        this.timeToRingAt = timeToRingAt;
        this.timeRemain = timeRemain;
        textFieldRingAt = new JLabel(timeToRingAt.getHour() + ":" + timeToRingAt.getMinute());
        textFieldRemain = new JLabel(timeRemain.getHour() + ":" + timeRemain.getMinute());
        checkBoxSwitch = new JCheckBox("Enable");

        textFieldRingAt.setMaximumSize(new Dimension(100, 20));
        textFieldRingAt.setHorizontalAlignment(SwingConstants.CENTER);

        textFieldRemain.setMaximumSize(new Dimension(100, 20));
        textFieldRemain.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(textFieldRingAt)
                        .addComponent(textFieldRemain))
                .addComponent(checkBoxSwitch));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldRingAt)
                        .addComponent(textFieldRemain))
                .addComponent(checkBoxSwitch));

    }

}
