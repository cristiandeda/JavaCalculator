import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    int operator;

    JFrame frame = new JFrame("froh's Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");

    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonAdd = new JButton("+");
    JButton buttonSubtract = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("Delete");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonSquareRoot = new JButton("\u221A");
    JButton buttonPercentage = new JButton("%");

    Font buttonFont = new Font("Arial", Font.BOLD, 20);


    Calculator() {
        setGuiSettings();
        addComponents();
        addActions();
    }

    public void setGuiSettings() {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(buttonFont);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.LEFT);  // RIGHT
        frame.add(textField);

        onRadioButton.setBounds(10, 90, 60, 40);
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonOne.setBounds(10, 230, 60, 40);
        buttonOne.setFont(buttonFont);
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 230, 60, 40);
        buttonTwo.setFont(buttonFont);
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 230, 60, 40);
        buttonThree.setFont(buttonFont);
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(buttonFont);
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(buttonFont);
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(buttonFont);
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonSeven.setBounds(10, 350, 60, 40);
        buttonSeven.setFont(buttonFont);
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 350, 60, 40);
        buttonEight.setFont(buttonFont);
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 350, 60, 40);
        buttonNine.setFont(buttonFont);
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(buttonFont);
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(buttonFont);
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 410, 60, 40);
        buttonEqual.setFont(buttonFont);
        buttonEqual.setFocusable(false);
        buttonEqual.setBackground(Color.orange);
        frame.add(buttonEqual);

        buttonAdd.setBounds(10, 170, 60, 40);
        buttonAdd.setFont(buttonFont);
        buttonAdd.setFocusable(false);
        frame.add(buttonAdd);

        buttonSubtract.setBounds(80, 170, 60, 40);
        buttonSubtract.setFont(buttonFont);
        buttonSubtract.setFocusable(false);
        frame.add(buttonSubtract);

        buttonMultiply.setBounds(150, 170, 60, 40);
        buttonMultiply.setFont(buttonFont);
        buttonMultiply.setFocusable(false);
        frame.add(buttonMultiply);

        buttonDivide.setBounds(220, 170, 60, 40);
        buttonDivide.setFont(buttonFont);
        buttonDivide.setFocusable(false);
        frame.add(buttonDivide);

        buttonSquare.setBounds(220, 230, 60, 40);
        buttonSquare.setFont(buttonFont);
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonSquareRoot.setBounds(220, 290, 60, 40);
        buttonSquareRoot.setFont(buttonFont);
        buttonSquareRoot.setFocusable(false);
        frame.add(buttonSquareRoot);

        buttonPercentage.setBounds(220, 350, 60, 40);
        buttonPercentage.setFont(buttonFont);
        buttonPercentage.setFocusable(false);
        frame.add(buttonPercentage);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(buttonFont);
        buttonClear.setFocusable(false);
        buttonClear.setBackground(Color.red);
        frame.add(buttonClear);

        buttonDelete.setBounds(150, 110, 130, 40);
        buttonDelete.setFont(buttonFont);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);
    }

    public void addActions() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSquareRoot.addActionListener(this);
        buttonPercentage.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    public void turnCalculatorOn() {
        textField.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonSubtract.setEnabled(true);
        buttonMultiply.setEnabled(true);
        buttonDivide.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonSquareRoot.setEnabled(true);
        buttonPercentage.setEnabled(true);
    }

    public void turnCalculatorOff() {
        textField.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonSubtract.setEnabled(false);
        buttonMultiply.setEnabled(false);
        buttonDivide.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonSquareRoot.setEnabled(false);
        buttonPercentage.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (textField.getText().equals("Error")) {
            textField.setText("");
        }
        if (source == onRadioButton) {
            turnCalculatorOn();
        } else if (source == offRadioButton) {
            turnCalculatorOff();
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                textField.setText("");
            }
            textField.setText(textField.getText() + "0");
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonAdd) {
            num1 = Double.parseDouble(textField.getText());
            operator = 1;  // 1 for addition
            textField.setText("");
        } else if (source == buttonSubtract) {
            num1 = Double.parseDouble(textField.getText());
            operator = 2;  // 2 for subtraction
            textField.setText("");
        } else if (source == buttonMultiply) {
            num1 = Double.parseDouble(textField.getText());
            operator = 3;  // 3 for multiplication
            textField.setText("");
        } else if (source == buttonDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = 4;  // 4 for division
            textField.setText("");
        } else if (source == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch(operator) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0.0) {
                        textField.setText("Error");
                        return;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    result = 0;
            }
            textField.setText(String.valueOf(result));
            num1 = result;  // for further operations
        } else if (source == buttonClear) {
            textField.setText("");
        } else if (source == buttonDelete) {
            String text = textField.getText();
            if (!text.isEmpty()) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        } else if (source == buttonSquare) {
            num1 = Double.parseDouble(textField.getText());
            result = num1 * num1;
            textField.setText(String.valueOf(result));
        } else if (source == buttonSquareRoot) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sqrt(num1);
            textField.setText(String.valueOf(result));
        } else if (source == buttonPercentage) {
            num1 = Double.parseDouble(textField.getText());
            result = num1 / 100;
            textField.setText(String.valueOf(result));
        } else {
            // Handle other actions if needed
        }
    }
}
