import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraView extends JFrame implements ActionListener {

    private double n1 = 0;
    private double n2 = 0;
    private String operador = "";
    private boolean esperando = false;
    private boolean continuidade = false;

    private JPanel contentPane;
    private JButton divisaoButton;
    private JButton multButton;
    private JButton somaButton;
    private JButton subtButton;
    private JButton calcularButton;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton virgulaButton;
    private JButton clearButton;
    private JTextField display;
    private JTextField opera;
    private JButton deleteButton;

    public CalculadoraView() {
        Operacoes operacoes = new Operacoes();

        setTitle("Calculadora");
        setContentPane(contentPane);
        setSize(400,300);

        clearButton.addActionListener(e -> {
            display.setText("");
            n1 = 0;
            n2 = 0;
            operador = "";
            esperando = false;
            continuidade = false;
            opera.setText("");
        });
        deleteButton.addActionListener(e -> {
            String texto = display.getText();
            if (!texto.isEmpty()){
                texto = texto.substring(0, texto.length() - 1);
                display.setText(texto);
            }
        });
        virgulaButton.addActionListener(e-> {
            String textoAtual = display.getText();
            if (!textoAtual.contains("."))
                display.setText(display.getText() + ".");
        });

        a0Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "0");
        }   else display.setText("0");
            continuidade = false;
        });
        a1Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "1");
            } else display.setText("1");
            continuidade = false;
        });
        a2Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "2");
            } else display.setText("2");
            continuidade = false;
        });
        a3Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "3");
            } else display.setText("3");
            continuidade = false;
        });
        a4Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "4");
            } else display.setText("4");
            continuidade = false;
        });
        a5Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "5");
            } else display.setText("5");
            continuidade = false;
        });
        a6Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "6");
            } else display.setText("6");
            continuidade = false;
        });
        a7Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "7");
            } else display.setText("7");
            continuidade = false;
        });
        a8Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "8");
            } else display.setText("8");
            continuidade = false;
        });
        a9Button.addActionListener(e -> {
            if (!continuidade){
                display.setText(display.getText() + "9");
            } else display.setText("9");
            continuidade = false;
        });

        somaButton.addActionListener(e -> {
            String vazio = display.getText();
            if (!vazio.isEmpty()){
            if (operador != "+") {
                opera.setText("");
                n1 = Double.parseDouble(display.getText());
                opera.setText(display.getText()+ " + ");
                display.setText("");
                operador = "+";
                esperando = true;
            }}else {
                operador = "+";
                vazio = opera.getText();
                vazio = vazio.substring(0, vazio.length() - 2);
                opera.setText(vazio + "+ ");
            }});
        subtButton.addActionListener(e -> {
            String vazio = display.getText();
            if (!vazio.isEmpty()){
            if (operador != "-") {
                opera.setText("");
                n1 = Double.parseDouble(display.getText());
                opera.setText(display.getText()+ " - ");
                display.setText("");
                operador = "-";
                esperando = true;
            }}else{
                operador = "-";
                vazio = opera.getText();
                vazio = vazio.substring(0, vazio.length() - 2);
                opera.setText(vazio + "- ");
            }
        });
        multButton.addActionListener(e -> {
            String vazio = display.getText();
            if (!vazio.isEmpty()){
            if (operador != "*") {
                opera.setText("");
                n1 = Double.parseDouble(display.getText());
                opera.setText(display.getText()+ " * ");
                display.setText("");
                operador = "*";
                esperando = true;
            }}else{
                operador = "*";
                vazio = opera.getText();
                vazio = vazio.substring(0, vazio.length() - 2);
                opera.setText(vazio + "* ");
            }});
        divisaoButton.addActionListener(e -> {
                String vazio = display.getText();
                if (!vazio.isEmpty()){
                    if (operador != "/") {
                        opera.setText("");
                        n1 = Double.parseDouble(display.getText());
                        opera.setText(display.getText()+ " / ");
                        display.setText("");
                        operador = "/";
                        esperando = true;
                }}else{
                    operador = "/";
                    vazio = opera.getText();
                    vazio = vazio.substring(0, vazio.length() - 2);
                    opera.setText(vazio + "/ ");
                }});

        calcularButton.addActionListener(e ->{
            if (esperando){
                n2 = Double.parseDouble(display.getText());
                opera.setText(opera.getText() + display.getText()+ " = ");
                double resultadoOperacao = 0;

                switch (operador){
                    case("+"):
                        resultadoOperacao = operacoes.soma(n1, n2);
                        break;
                    case("-"):
                        resultadoOperacao = operacoes.subtracao(n1, n2);
                        break;
                    case("*"):
                        resultadoOperacao = operacoes.multiplicacao(n1, n2);
                        break;
                    case("/"):
                        resultadoOperacao = operacoes.divisao(n1, n2);
                }
                display.setText(String.valueOf(resultadoOperacao));
                operador = "";
                esperando = false;
                continuidade = true;
            }
        });

        setVisible(true);
    }
        @Override
        public void actionPerformed (ActionEvent e){

        }
}
