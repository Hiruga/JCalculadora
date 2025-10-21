import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraView extends JFrame implements ActionListener {

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
    private JTextField resultado;

    void soma(){
        double n1;
        double n2;
        double result;
    }

    public CalculadoraView() {
        setTitle("Calculadora");
        setContentPane(contentPane);
        setSize(400,300);

        a0Button.addActionListener(e -> resultado.setText(resultado.getText() + "0"));
        a1Button.addActionListener(e -> resultado.setText(resultado.getText() + "1"));
        a2Button.addActionListener(e -> resultado.setText(resultado.getText() + "2"));
        a3Button.addActionListener(e -> resultado.setText(resultado.getText() + "3"));
        a4Button.addActionListener(e -> resultado.setText(resultado.getText() + "4"));
        a5Button.addActionListener(e -> resultado.setText(resultado.getText() + "5"));
        a6Button.addActionListener(e -> resultado.setText(resultado.getText() + "6"));
        a7Button.addActionListener(e -> resultado.setText(resultado.getText() + "7"));
        a8Button.addActionListener(e -> resultado.setText(resultado.getText() + "8"));
        a9Button.addActionListener(e -> resultado.setText(resultado.getText() + "9"));

        String textoAtual = resultado.getText();
        virgulaButton.addActionListener(e-> {if (!textoAtual.contains(",")) resultado.setText(resultado.getText() + ",");
        });

        somaButton.addActionListener(e -> resultado.setText(resultado.getText() + "+"));
        //fazer as operações matemáticas
        setVisible(true);
    }
        @Override
        public void actionPerformed (ActionEvent e){

        }
}
