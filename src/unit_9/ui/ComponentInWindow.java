package unit_9.ui;

import javax.swing.*;
import java.awt.*;

public class ComponentInWindow extends JFrame {
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox<String> comboBox;
    ButtonGroup group;

    public ComponentInWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 初始化UI
     */
    private void init() {
        setLayout(new FlowLayout());
        comboBox = new JComboBox<String>();
        checkBox1 = new JCheckBox("喜欢音乐");
        checkBox2 = new JCheckBox("喜欢旅游");
        group = new ButtonGroup();
        radioButtonM = new JRadioButton("男");
        radioButtonF = new JRadioButton("女");
        group.add(radioButtonM);
        group.add(radioButtonF);
        add(checkBox1);
        add(checkBox2);
        add(radioButtonM);
        add(radioButtonF);
        comboBox.addItem("音乐天地");
        comboBox.addItem("武术天地");
        add(comboBox);
        setBounds(100, 100, 450, 260);
        setTitle("test");
    }
}
