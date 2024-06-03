import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new JFrameApp();
    }
}

class JFrameApp extends JFrame {

    public JFrameApp() {
        setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setMinimumSize(new Dimension(250, 400));
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JPanelApp());
        setVisible(true);
    }
}

class MethodCalc {
    public int calc(int n1, String op, int n2) {
        int res = 0;
        switch (op) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}