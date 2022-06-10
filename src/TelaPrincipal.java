import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaPrincipal implements ActionListener{
 
 JFrame frame = new JFrame("Convertor de números");
 JButton myButton = new JButton("Decimal > Binário");
 JButton myButton1 = new JButton("Decimal > Octal");
 JButton myButton2 = new JButton("Decimal > Hexadecimal");
 JButton myButton3 = new JButton("Binario > Decimal");
 JButton myButton4 = new JButton("Octal > Decimal");
 JButton myButton5 = new JButton("Hexadecimal > Decimal");
 JButton myButton6 = new JButton("Operacao Binaria");
 
 TelaPrincipal(){ 
  
     
  myButton.setBounds(100,10,200,50);
  myButton.setFocusable(false);
  myButton.addActionListener((ActionListener) this);
  
  frame.add(myButton);
  
  myButton1.setBounds(100,70,200,50);
  myButton1.setFocusable(false);
  myButton1.addActionListener((ActionListener) this);
  
  frame.add(myButton1);
  
  myButton2.setBounds(100,130,200,50);
  myButton2.setFocusable(false);
  myButton2.addActionListener((ActionListener) this);
  
  frame.add(myButton2);
  
  myButton3.setBounds(100,190,200,50);
  myButton3.setFocusable(false);
  myButton3.addActionListener((ActionListener) this);
  
  frame.add(myButton3);
  
  myButton4.setBounds(100,250,200,50);
  myButton4.setFocusable(false);
  myButton4.addActionListener((ActionListener) this);
  
  frame.add(myButton4);
  
  myButton5.setBounds(100,310,200,50);
  myButton5.setFocusable(false);
  myButton5.addActionListener((ActionListener) this);
  
  frame.add(myButton5);
   
  myButton6.setBounds(100,370,200,50);
  myButton6.setFocusable(false);
  myButton6.addActionListener((ActionListener) this);
  
  frame.add(myButton6);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,500);
  frame.setLayout(null);
  frame.setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==myButton) {
   frame.dispose();
   DecimalBinario myWindow = new DecimalBinario();
  }
  if(e.getSource()==myButton1) {
   frame.dispose();
   DecimalOctal myWindow = new DecimalOctal();
  }
  if(e.getSource()==myButton2) {
   frame.dispose();
   DecimalHex myWindow = new DecimalHex();
  }
  if(e.getSource()==myButton3) {
   frame.dispose();
   BinarioDecimal myWindow = new BinarioDecimal();
  }
  if(e.getSource()==myButton4) {
   frame.dispose();
   OctalDecimal myWindow = new OctalDecimal();
  }
  if(e.getSource()==myButton5) {
   frame.dispose();
   HexDecimal myWindow = new HexDecimal();
  }
  if(e.getSource()==myButton6) {
   frame.dispose();
   OperacaoBinaria myWindow = new OperacaoBinaria();
  }
 }
}