//import java.awt.event.*;
//import javax.swing.*;
//
//public class Calculator implements ActionListener {
//
//    JFrame frame;
//    JTextArea textField;
//    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
//            addButton, subtractButton, multiplyButton, divideButton, decimalButton, clearButton, equalButton;
//
//    double num1 = 0, num2 = 0, result = 0;
//    char operator;
//
//    Calculator() {
//
//        frame = new JFrame("Calculator");
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setSize(500, 500);
//
//        textField = new JTextArea();
//        textField.setBounds(50, 30, 400, 100); // Increase height to accommodate three lines
//        textField.setFont(textField.getFont().deriveFont(20f));
//        textField.setEditable(false); // Make it non-editable
//        frame.add(textField);
//
//        button1 = new JButton("1");
//        button1.setBounds(50, 150, 50, 50);
//        button1.addActionListener(this);
//        frame.add(button1);
//
//        button2 = new JButton("2");
//        button2.setBounds(110, 150, 50, 50);
//        button2.addActionListener(this);
//        frame.add(button2);
//
//        button3 = new JButton("3");
//        button3.setBounds(170, 150, 50, 50);
//        button3.addActionListener(this);
//        frame.add(button3);
//
//        button4 = new JButton("4");
//        button4.setBounds(50, 210, 50, 50);
//        button4.addActionListener(this);
//        frame.add(button4);
//
//        button5 = new JButton("5");
//        button5.setBounds(110, 210, 50, 50);
//        button5.addActionListener(this);
//        frame.add(button5);
//
//        button6 = new JButton("6");
//        button6.setBounds(170, 210, 50, 50);
//        button6.addActionListener(this);
//        frame.add(button6);
//
//        button7 = new JButton("7");
//        button7.setBounds(50, 270, 50, 50);
//        button7.addActionListener(this);
//        frame.add(button7);
//
//        button8 = new JButton("8");
//        button8.setBounds(110, 270, 50, 50);
//        button8.addActionListener(this);
//        frame.add(button8);
//
//        button9 = new JButton("9");
//        button9.setBounds(170, 270, 50, 50);
//        button9.addActionListener(this);
//        frame.add(button9);
//
//        button0 = new JButton("0");
//        button0.setBounds(50, 330, 50, 50);
//        button0.addActionListener(this);
//        frame.add(button0);
//
//        addButton = new JButton("+");
//        addButton.setBounds(230, 150, 50, 50);
//        addButton.addActionListener(this);
//        frame.add(addButton);
//
//        subtractButton = new JButton("-");
//        subtractButton.setBounds(230, 210, 50, 50);
//        subtractButton.addActionListener(this);
//        frame.add(subtractButton);
//
//        multiplyButton = new JButton("*");
//        multiplyButton.setBounds(230, 270, 50, 50);
//        multiplyButton.addActionListener(this);
//        frame.add(multiplyButton);
//
//        divideButton = new JButton("/");
//        divideButton.setBounds(230, 330, 50, 50);
//        divideButton.addActionListener(this);
//        frame.add(divideButton);
//
//        decimalButton = new JButton(".");
//        decimalButton.setBounds(110, 330, 50, 50);
//        decimalButton.addActionListener(this);
//        frame.add(decimalButton);
//
//        clearButton = new JButton("C");
//        clearButton.setBounds(170, 330, 50, 50);
//        clearButton.addActionListener(this);
//        frame.add(clearButton);
//
//        equalButton = new JButton("=");
//        equalButton.setBounds(230, 90, 50, 50);
//        equalButton.addActionListener(this);
//        frame.add(equalButton);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton button = (JButton) e.getSource();
//        String buttonText = button.getText();
//
//        if (Character.isDigit(buttonText.charAt(0))) {
//            textField.append(buttonText); // Append digit to text area
//        } else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
//            num1 = Double.parseDouble(textField.getText());
//            operator = buttonText.charAt(0);
//            textField.append("\n" + buttonText + "\n"); // Append operator to new line
//        } else if (buttonText.equals("=")) {
//            num2 = Double.parseDouble(textField.getText());
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    if (num2 == 0) {
//                        textField.setText("Error: Division by zero");
//                    } else {
//                        result = num1 / num2;
//                    }
//                    break;
//            }
//            textField.append("=" + String.valueOf(result) + "\n"); // Append result to new line
//        } else if (buttonText.equals("C")) {
//            textField.setText(""); // Clear text area
//            num1 = 0;
//            num2 = 0;
//            result = 0;
//        }
//    }
//
//    public static void main(String[] args) {
//        new Calculator();
//    }
//}
