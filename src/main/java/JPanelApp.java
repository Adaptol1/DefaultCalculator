import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;

public class JPanelApp extends JPanel {
    JTextField textRow = null;
    int res = 0;
    int res1 = 0;
    String operation = "";

    public JPanelApp() {
        MigLayout layout = new MigLayout("wrap", "[fill, grow][fill, grow][fill, grow][fill, grow]",
                "[8%!, fill][fill, grow][fill, grow][fill, grow][fill, grow]");
        setLayout(layout);
        setVisible(true);
        final TextField textRow = new TextField();
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bRes = new JButton("=");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bMultiplication = new JButton("*");
        JButton bDivision = new JButton("/");
        JButton bLeftBracket = new JButton("(");
        JButton bRightBracket = new JButton(")");

        add(textRow, "span, wrap");
        add(bPlus, "cell 3 1");
        add(bMinus, "cell 3 2");
        add(bMultiplication, "cell 3 3");
        add(bDivision, "cell 3 4");
        add(b1, "cell 0 1");
        add(b2, "cell 1 1");
        add(b3, "cell 2 1");
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bLeftBracket);
        add(bRightBracket);
        add(bRes, "span, grow");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 1);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 2);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 3);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 4);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 5);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 6);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 7);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 8);
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 9);
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + 0);
            }
        });

        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + "+");
            }
        });

        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + "-");
            }
        });

        bMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + "*");
            }
        });

        bDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + "/");
            }
        });

        bRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int num = Integer.valueOf(res);
                int num1 = Integer.valueOf(res1);
                String strOp = operation;

                MethodCalc mc = new MethodCalc();
                String strRes = String.valueOf(mc.calc(num, strOp, num1));
                textRow.setText(strRes);
            }
        });

        bLeftBracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + "(");
            }
        });

        bRightBracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg1) {
                textRow.setText(textRow.getText() + ")");
            }
        });


    }
}
