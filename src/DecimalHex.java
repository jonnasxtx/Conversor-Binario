import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DecimalHex extends JFrame implements ActionListener {

 JFrame frame = new JFrame("Decimal > Hexadecimal");
 JButton button;
 JTextField textField;
 JTextField textField2;
 JLabel label;
 JButton button2;
 
 DecimalHex(){
 
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
            int decimal = Integer.parseInt(textField.getText());
            ArrayList<String> lista = new ArrayList<>(); 
            StringBuilder hexadecimal = new StringBuilder(); 
            do{
                if (decimal % 16 < 10){ 
                    lista.add(Integer.toString(decimal%16)); 
                } else { 
                    switch (decimal % 16) {
                        case 10 : 
                            lista.add("A");
                            break;
                        case 11:
                            lista.add("B");
                            break;
                        case 12:
                            lista.add("C");
                            break;
                        case 13:
                            lista.add("D");
                            break;
                        case 14:
                            lista.add("E");
                            break;
                        case 15:
                            lista.add("F");
                    }
                }decimal = decimal / 16; 
        } while (decimal != 0);

        for (int i = lista.size() -1; i >= 0; i--) 
            hexadecimal.append(lista.get(i)); 
            textField2.setText(String.valueOf((hexadecimal)));

    }
        if(e.getSource()==button2) {
            frame.dispose();
            TelaPrincipal principal = new TelaPrincipal();
  }
        }
    }

