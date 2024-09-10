/*
Izayah Briggs

04/25/24

COMP167-003

This program creates the GUI for a rudimentary scientific calculator that can solve simple equations and trig/elementary functions
The program was built using the SwingUI designer in IntelliJ.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Import statements allow for the use of the swing and awt libraries
 */

public class Calculating extends JFrame { // Class declaration

    /*
    All buttons for the calculator are declared in the following lines:

    - Numbers 0-9
    - Basic arithmetic (+, -, *, /, %)
    - Power functions (x^2, x^3)
    - +/-, 1/x, number as a percentage, and sqrt
    - trig, inverse trig, and hyperbolic trig
    - log base 10 and natural log
    - 10^x and absolute value
    - Clear and exit

     */

    private JButton b3;
    private JButton b6;
    private JButton b9;
    private JButton bdec;
    private JButton b2;
    private JButton b5;
    private JButton b8;
    private JButton b0;
    private JButton b1;
    private JButton b4;
    private JButton b7;
    private JButton bmult;
    private JButton badd;
    private JButton bsub;
    private JButton bdiv;
    private JButton beq;
    private JButton bfrac;
    private JButton bperc;
    private JButton bsqrt;
    private JButton bmod;
    private JButton bcube;
    private JButton bsq;
    private JButton bclear;
    private JButton bsin;
    private JButton bcos;
    private JButton btan;
    private JButton bln;
    private JButton blog;
    private JButton btenn;
    private JButton babsval;
    private JButton bexit;
    private JButton batan;
    private JButton bacos;
    private JButton basin;
    private JButton bsinh;
    private JButton bcosh;
    private JButton btanh;
    private JButton bpm;
    private JPanel textPanel; // I made an error while building the GUI and created a panel that holds the main panel. Deleting this broke the program, so it is left unimplemented
    private JPanel mainPanel; // Panel that holds all the buttons in the frame
    private JTextField inputField; // Input field containing numbers to do work on
    private JTextField outputField; // Output field where result is posted
    private JButton extra_bdel; // Added a backspace button for extra functionality
    private JButton extra_bANS; // Added a copy answer button for extra functionality

    public Calculating() { // Constructor declaration

        // JFrame setup, creates display window with all the buttons and text fields

        setContentPane(mainPanel);
        setTitle("Calculator");
        setSize(450, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputField.setEditable(false);
        outputField.setEditable(false);
        setVisible(true);

        // Action listener methods

        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                outputField.setText("");
            }
        }); // Clear button action listener

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "0");
            }
        }); // 0 button action listener

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "1");
            }
        }); // 1 button action listener

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "2");
            }
        }); // 2 button action listener

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "3");
            }
        }); // 3 button action listener

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "4");
            }
        }); // 4 button action listener

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "5");
            }
        }); // 5 button action listener

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "6");
            }
        }); // 6 button action listener

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "7");
            }
        }); // 7 button action listener

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "8");
            }
        }); // 8 button action listener

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "9");
            }
        }); // 9 button action listener

        bdec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().contains(".")) {
                    inputField.setText(inputField.getText() + ".");
                } else {
                    JOptionPane.showMessageDialog(null, "Number already contains decimal");
                }
            }
        }); // decimal button action listener

        bpm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numString = inputField.getText();
                if (!inputField.getText().isEmpty()) {
                    if (numString.contains(".")) {
                        double currentNum = Double.parseDouble(numString);
                        currentNum *= -1;
                        outputField.setText(String.valueOf(currentNum));
                    } else {
                        int currentNum = Integer.parseInt(numString);
                        currentNum *= -1;
                        outputField.setText(String.valueOf(currentNum));
                    }
                } else {
                    inputField.setText("-");
                }
            }
        }); // plus/minus button action listener

        bsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.sin(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // sinx button action listener

        bcos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.cos(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // cosx button action listener

        btan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.tan(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // tanx button action listener

        basin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.asin(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // sin^-1x button action listener

        bacos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.acos(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // cos^-1x button action listener

        batan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.atan(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // tan^-1x button action listener

        bsinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.sinh(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // sinhx button action listener

        bcosh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.cosh(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // coshx button action listener

        btanh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.tanh(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // tanhx button action listener

        bsq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    if (numString.contains(".")) {
                        double currentNum = Double.parseDouble(numString);
                        outputField.setText(String.valueOf(currentNum * currentNum));
                    } else {
                        int currentNum = Integer.parseInt(numString);
                        outputField.setText(String.valueOf(currentNum * currentNum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // x^2 button action listener

        bcube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    if (numString.contains(".")) {
                        double currentNum = Double.parseDouble(numString);
                        outputField.setText(String.valueOf(currentNum * currentNum * currentNum));
                    } else {
                        int currentNum = Integer.parseInt(numString);
                        outputField.setText(String.valueOf(currentNum * currentNum * currentNum));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // x^3 button action listener

        bsqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    if (numString.contains(".")) {
                        double currentNum = Double.parseDouble(numString);
                        outputField.setText(String.valueOf(Math.sqrt(currentNum)));
                    } else {
                        int currentNum = Integer.parseInt(numString);
                        outputField.setText(String.valueOf(Math.sqrt(currentNum)));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // sqrt(x) button action listener

        blog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.log10(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // log base 10 button action listener

        bln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(Math.log(currentNum)));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // natural log button action listener

        btenn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    if (inputField.getText().contains(".")) {
                        double currentNum = Double.parseDouble(numString);
                        outputField.setText(String.valueOf(Math.pow(10, currentNum)));
                    } else {
                        int currentNum = Integer.parseInt(numString);
                        outputField.setText(String.valueOf(Math.pow(10, currentNum)));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // 10^x button action listener

        babsval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    if (inputField.getText().contains(".")) {
                        double currentNum = Double.parseDouble(numString);
                        outputField.setText(String.valueOf(Math.abs(currentNum)));
                    } else {
                        int currentNum = Integer.parseInt(numString);
                        outputField.setText(String.valueOf(Math.abs(currentNum)));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // absolute value action listener

        extra_bdel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    inputField.setText(inputField.getText().substring(0, inputField.getText().length() - 1));
                } else {
                    inputField.setText("");
                }
            }
        }); // backspace button action listener

        extra_bANS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!outputField.getText().isEmpty()) {
                    inputField.setText(outputField.getText());
                    outputField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No answer to copy");
                }
            }
        }); // copy answer button action listener

        bfrac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(1 / currentNum));
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // 1/x button action listener

        badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    inputField.setText(inputField.getText() + "+");
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // + button action listener

        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    inputField.setText(inputField.getText() + "-");
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // - button action listener

        bmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    inputField.setText(inputField.getText() + "*");
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // * button action listener

        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    inputField.setText(inputField.getText() + "/");
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // / button action listener

        bmod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    inputField.setText(inputField.getText() + "%");
                } else {
                    JOptionPane.showMessageDialog(null, "No number entered");
                }
            }
        }); // % button action listener

        beq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String[] numsArray = inputField.getText().split("[+\\-*/%]");
                    double result = Double.parseDouble(numsArray[0]);

                    for (int i = 1; i < numsArray.length; i++) {
                        char operator = inputField.getText().charAt(numsArray[i - 1].length());
                        double nextNum = Double.parseDouble(numsArray[i]);

                        switch (operator) {
                            case '+':
                                result += nextNum;
                                break;
                            case '-':
                                result -= nextNum;
                                break;
                            case '*':
                                result *= nextNum;
                                break;
                            case '/':
                                result /= nextNum;
                                break;
                            case '%':
                                result %= nextNum;
                                break;
                        }
                    }
                    if (result % 1 == 0) {
                        outputField.setText(String.valueOf((int) result));
                    } else {
                        outputField.setText(String.valueOf(result));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No equation entered.");
            }
        }
    }); // = button action listener

        bperc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputField.getText().isEmpty()) {
                    String numString = inputField.getText();
                    double currentNum = Double.parseDouble(numString);
                    outputField.setText(String.valueOf(currentNum / 100.0));
                }
            }
        }); // % button action listener

        bexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }); // exit button action listener
    } // Constructor closer

    public static void main(String[] args) {
        Calculating calculator = new Calculating(); // Calculator object created in main
    } // Main closer
} // Calculating class closer
