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
public class OperacaoBinaria extends JFrame implements ActionListener {

 JFrame frame = new JFrame("Operacao Binaria");
 JButton button;
 JButton button2;
 JButton button3;
 JButton button4;
 JButton button5;
 JTextField textField;
 JTextField textField2;
 JTextField textField3;
 JLabel label;
 JLabel label1;
 JLabel label2;
 
 OperacaoBinaria(){
 
  button = new JButton("+");
  button3 = new JButton("-");
  button4 = new JButton("*");
  button5 = new JButton("/");
  label1 = new JLabel("1º numero");
  label2 = new JLabel("2º numero");
  button.addActionListener((ActionListener) this);
  button.setFocusable(false);
  button3.addActionListener((ActionListener) this);
  button3.setFocusable(false);
  button4.addActionListener((ActionListener) this);
  button4.setFocusable(false);
  button5.addActionListener((ActionListener) this);
  button5.setFocusable(false);
  button2 = new JButton ("Voltar");
  button2.addActionListener((ActionListener) this);
  button.setFocusable(false);
  button.setPreferredSize(new Dimension(80, 30));
  button3.setPreferredSize(new Dimension(80, 30));
  button4.setPreferredSize(new Dimension(80, 30));
  button5.setPreferredSize(new Dimension(80, 30));
  
  label = new JLabel("Resultado");
  
  textField = new JTextField();
  textField.setForeground(Color.black);
  textField.setCaretColor(Color.blue);
  textField.setPreferredSize(new Dimension(282,40));
  textField2 = new JTextField();
  textField2.setForeground(Color.black);
  textField2.setCaretColor(Color.blue);
  textField2.setPreferredSize(new Dimension(282,40));
  textField3 = new JTextField();
  textField3.setForeground(Color.black);
  textField3.setCaretColor(Color.blue);
  textField3.setPreferredSize(new Dimension(282,40));
  frame.add(label1);
  frame.add(textField);
  frame.add(label2);
  frame.add(textField3);
  frame.add(button);
  frame.add(button3);
  frame.add(button4);
  frame.add(button5);
  frame.add(Box.createRigidArea(new Dimension(0,100)));
  frame.add(label);
  frame.add(textField2);
  frame.add(Box.createRigidArea(new Dimension(0,120)));
  frame.add(button2);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,400);
  frame.setLayout(new FlowLayout());
  
  
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource()==button) {*/
        int decimal1 = 0;
        int resultado = 0;   
        int numero = 0;  
        int binario;
        String valor1 = (textField.getText());
        for (binario=0;binario<valor1.length();binario++) {//enquanto binario for menor que valor1, binario é incrementado em 1
            char auxiliar = valor1.charAt(valor1.length()-binario-1); //variave auxiliar recebe valor1 na posição binario -1
            numero = Character.getNumericValue(auxiliar);// numero recebe o valor1 de auxiliar trasnformado em numero
            decimal1 = (int) (decimal1 + numero*Math.pow(2,binario)); //decimal1 recebe o valor1 de numero vezes binario na potencia de 2 + ele mesmo
        }    
        int decimal2 = 0;    
        String valor2 = (textField3.getText());
        for (binario=0;binario<valor2.length();binario++) {//enquanto binario for menor que valor2, binario é incrementado em 1
            char auxiliar = valor2.charAt(valor2.length()-binario-1); //variave auxiliar recebe valor2 na posição binario -1
            numero = Character.getNumericValue(auxiliar);// numero recebe o valor2 de auxiliar trasnformado em numero
            decimal2 = (int) (decimal2 + numero*Math.pow(2,binario)); //decimal2 recebe o valor2 de numero vezes binario na potencia de 2 + ele mesmo
        }
        if(e.getSource()==button){
            resultado = decimal1 + decimal2;
        }
        if(e.getSource()==button3){
            resultado = decimal1 - decimal2;
        }
        if(e.getSource()==button4){
            resultado = decimal1 * decimal2;
        }
        if(e.getSource()==button5){
            resultado = decimal1 / decimal2;
        }
        
        if (resultado<0){
        resultado = resultado*-1;
        StringBuffer resultadobin = new StringBuffer();//estancia um objeto StringBuffer que permite a cocatenação de Strings para a chamada do metodo append
        while (resultado > 0){ //inicia o laço de repetição quando resultado for maior que 0
            int x = resultado%2; //x recebe o valor do resto da divisão do resultado decimal
            resultado = resultado/2;  //resultado recebe o valor da divisão por 2 para continuar o laço while
            resultadobin.append(x);//o objeto estanciado aloca o resto da divisão do x por meio do metodo append 
             
        }
        resultadobin.append("-");
        textField2.setText(((resultadobin.reverse().toString())));
        }

        else {
            StringBuffer resultadobin = new StringBuffer();//estancia um objeto StringBuffer que permite a cocatenação de Strings para a chamada do metodo append
            while (resultado > 0){ //inicia o laço de repetição quando resultado for maior que 0
                int x = resultado%2; //x recebe o valor do resto da divisão do resultado decimal
                resultado = resultado/2;  //resultado recebe o valor da divisão por 2 para continuar o laço while
                resultadobin.append(x);//o objeto estanciado aloca o resto da divisão do x por meio do metodo append 
                 
            }
            textField2.setText(((resultadobin.reverse().toString())));
            }

        if(e.getSource()==button2) {
            frame.dispose();
            TelaPrincipal principal = new TelaPrincipal();
        
        }
    }
}  


