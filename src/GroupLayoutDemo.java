import javax.swing.*;

public class GroupLayoutDemo extends JFrame {

    GroupLayoutDemo() {

        setTitle("JFrame Title");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel label = new JLabel("label text");
        JTextField textField = new JTextField("textfield");

        JCheckBox match = new JCheckBox("match");
        JCheckBox wrap = new JCheckBox("wrap");
        JCheckBox whole = new JCheckBox("whole");
        JCheckBox search = new JCheckBox("search");
        JButton find = new JButton("find");
        JButton cancel = new JButton("cancel");

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textField)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(match)
                                        .addComponent(whole))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(wrap)
                                        .addComponent(search))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(find)
                        .addComponent(cancel)));

        layout.linkSize(SwingConstants.HORIZONTAL, find, cancel);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(find)
                        .addComponent(textField))
                .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(match)
                                        .addComponent(wrap))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(whole)
                                        .addComponent(search)))
                        .addComponent(cancel)));

        pack();
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
