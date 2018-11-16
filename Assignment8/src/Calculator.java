import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private final String[] KEYS = { "7", "8", "9", "/", "4", "5", "6",
            "*","1", "2", "3", "-","0", ".", "+", "=" };
    private final String[] COMMAND = { "C" };
    private JButton keys[] = new JButton[KEYS.length];
    private JButton commands[] = new JButton[COMMAND.length];
    private JTextField resultText = new JTextField("0");

    private boolean firstDigit = true;
    private double resultNum = 0.0;
    private String operator = "=";
    private boolean operateValidFlag = true;

    public Calculator(){
        super();
        init();
        this.setBackground(Color.LIGHT_GRAY);
        this.setTitle("Calculator");
        this.setLocation(500, 300);
        this.setResizable(false);
        this.pack();

    }

    private void init(){
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        resultText.setEditable(false);
        resultText.setBackground(Color.white);
        JPanel calckeysPanel = new JPanel();
        calckeysPanel.setLayout(new GridLayout(4, 5, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            calckeysPanel.add(keys[i]);
            keys[i].setForeground(Color.blue);
        }


        JPanel commandsPanel = new JPanel();
        commandsPanel.setLayout(new GridLayout(1, 3, 3, 3));
        for (int i = 0; i < COMMAND.length; i++) {
            commands[i] = new JButton(COMMAND[i]);
            commandsPanel.add(commands[i]);
            commands[i].setForeground(Color.red);
        }

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(3, 3));
        panel1.add("North", commandsPanel);
        panel1.add("West", calckeysPanel);


        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.add("Center", resultText);


        getContentPane().setLayout(new BorderLayout(3, 5));
        getContentPane().add("North", top);
        getContentPane().add("Center", panel1);


        for (int i = 0; i < KEYS.length; i++) {
            keys[i].addActionListener(this);
        }
        for (int i = 0; i < COMMAND.length; i++) {
            commands[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        if(label.equals(COMMAND[0])){
            handleC();
        }else if ("0123456789.".indexOf(label) >= 0) {
            handleNumber(label);
        } else {
            handleOperator(label);
        }
    }

    private void handleNumber(String key) {
        if(firstDigit){
            resultText.setText(key);
        } else if ((key.equals(".")) && (resultText.getText().indexOf(".") < 0))
            resultText.setText(resultText.getText() + ".");
        else if (!key.equals(".")) {
            resultText.setText(resultText.getText() + key);
        }

        firstDigit = false;
    }

    private void handleC() {
        resultText.setText("0");
        firstDigit = true;
        operator = "=";
    }

    private void handleOperator(String key) {
        if(operator.equals("/")){
            if (getNumberFromText() == 0.0) {
                operateValidFlag = false;
                resultText.setText("The divisor can not be Zero");
            } else {
                resultNum /= getNumberFromText();
            }
        }else if (operator.equals("+")) {
            // 加法运算
            resultNum += getNumberFromText();
        }else if (operator.equals("-")) {
            // 减法运算
            resultNum -= getNumberFromText();
        }else if (operator.equals("*")) {
            // 乘法运算
            resultNum *= getNumberFromText();
        }else if (operator.equals("=")) {
            // 赋值运算
            resultNum = getNumberFromText();
        }if (operateValidFlag) {
            long t1;
            double t2;
            t1 = (long) resultNum;
            t2 = resultNum - t1;
            if (t2 == 0) resultText.setText(String.valueOf(t1));
            else {
                resultText.setText(String.valueOf(resultNum));
            }
        }
        operator = key;
        firstDigit = true;
        operateValidFlag = true;
    }

    private double getNumberFromText() {
        double result = 0;
        try {
            result = Double.valueOf(resultText.getText()).doubleValue();
        } catch (NumberFormatException e) {
        }
        return result;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
