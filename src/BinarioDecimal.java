import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class BinarioDecimal extends JFrame implements ActionListener {

 JFrame frame = new JFrame("Binario > Decimal");
 JButton button;
 JTextField textField;
 JTextField textField2;
 JLabel label;
 JButton button2;
 
 BinarioDecimal(){
 
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
            int decimal = 0;     
            int numero = 0;   
            int binario;
            String valor = textField.getText();
            for (binario=0;binario<valor.length();binario++) {
                char auxiliar = valor.charAt(valor.length()-binario-1); 
                numero = Character.getNumericValue(auxiliar);
                decimal = (int) (decimal + numero*Math.pow(2,binario)); 
            }    
                textField2.setText(String.valueOf(decimal));
        }
        if(e.getSource()==button2) {
            frame.dispose();
            TelaPrincipal principal = new TelaPrincipal();
  }
    }
}



