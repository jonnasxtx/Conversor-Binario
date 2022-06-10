import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DecimalBinario extends JFrame implements ActionListener {

 JFrame frame = new JFrame("Decimal > Binário");
 JButton button;
 JTextField textField;
 JTextField textField2;
 JLabel label;
 JButton button2;
 
 DecimalBinario(){
 
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
  frame.add(textField);
  frame.add(button);
  frame.add(Box.createRigidArea(new Dimension(0,60)));
  frame.add(label);
  frame.add(textField2);
  frame.add(Box.createRigidArea(new Dimension(0,240)));
  frame.add(button2);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,400);
  frame.setLayout(new FlowLayout());
  
  
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            int decimal = Integer.parseInt(textField.getText());
            int numero = decimal;
            StringBuffer binario = new StringBuffer();
            while (numero > 0){
            int resultado = numero%2; 
            numero = numero/2;  
            binario.append(resultado);
            
        }
            textField2.setText(binario.reverse().toString());
        }
        if(e.getSource()==button2) {
            frame.dispose();
            TelaPrincipal launchPage = new TelaPrincipal();
  }
    }
}

