import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class HexDecimal extends JFrame implements ActionListener {

 JFrame frame = new JFrame("Hexadecimal > Decimal");
 JButton button;
 JTextField textField;
 JTextField textField2;
 JLabel label;
 JButton button2;
 
 HexDecimal(){
 
  button = new JButton("Converter");
  button.addActionListener((ActionListener) this);
  button.setFocusable(false);
  button2 = new JButton ("Voltar");
  button2.addActionListener((ActionListener) this);
  button.setFocusable(false);
  
  label = new JLabel("Resultado");
  
  textField = new JTextField();
  textField.setForeground(Color.black);
  textField.setCaretColor(Color.blue);
  textField.setPreferredSize(new Dimension(250,40));
  textField2 = new JTextField();
  textField2.setForeground(Color.black);
  textField2.setCaretColor(Color.blue);
  textField2.setPreferredSize(new Dimension(282,40));
  frame.add(button);
  frame.add(textField);
  frame.add(label);
  frame.add(textField2);
  frame.add(button2);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,400);
  frame.setLayout(new FlowLayout());
  
  
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            String valor;
            valor = (textField.getText());
            int decimal=0;
            int numero = 0;
            String hexadecimal = valor.toUpperCase(); 
            for(int i=0;i<hexadecimal.length();i++) 
            {
                char auxiliar = hexadecimal.charAt(hexadecimal.length()-i-1);
                switch(auxiliar){
                    case 'A':
                    numero = 10;
                    case 'B':
                    numero = 11;
                    case 'C':
                    numero = 12;
                    case 'D':
                    numero = 13;
                    case 'E':
                    numero = 14;
                    case 'F':
                    numero = 15;
                    default:
                    numero = Character.getNumericValue(auxiliar);
                }
                decimal = (int) (decimal + numero*Math.pow(16,i));
                }
                
            textField2.setText(String.valueOf((decimal)));
        }
        if(e.getSource()==button2) {
            frame.dispose();
            TelaPrincipal principal = new TelaPrincipal();
        }
    }
}

