import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class Calculadora extends JFrame implements ActionListener {

  private static final long serialVersionUID = 1L;
  private JPanel janela;
  private JTextField Area_Texto;
  private JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,mai,men,div,mul,igu;
  int valor1 =0, valor2 =0, resultado =0;

  public Calculadora(){

      super("CALCULADORA");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Container janela;
      janela = getContentPane();
      janela.setLayout (new GridLayout(5,5));


      Area_Texto = new JTextField (12);
      Area_Texto.setEditable(false);
      n1 = new JButton ("1");
      n1.addActionListener(this);
      n2 = new JButton ("2");
      n2.addActionListener(this);
      n3 = new JButton ("3");
      n3.addActionListener(this);
      n4 = new JButton ("4");
      n4.addActionListener(this);
      n5 = new JButton ("5");
      n5.addActionListener(this);
      n6 = new JButton ("6");
      n6.addActionListener(this);
      n7 = new JButton ("7");
      n7.addActionListener(this);
      n8 = new JButton ("8");
      n8.addActionListener(this);
      n9 = new JButton ("9");
      n9.addActionListener(this);
      n0 = new JButton ("0");
      n0.addActionListener(this);
      mai = new JButton ("+");
      mai.addActionListener(this);
      men = new JButton ("-");
      men.addActionListener(this);
      div = new JButton ("/");
      div.addActionListener(this);
      mul = new JButton ("x");
      mul.addActionListener(this);
      igu = new JButton ("=");
      igu.addActionListener(this);




      janela.add(div);
      janela.add(mul);
      janela.add(men);
      janela.add(mai);
      janela.add(n7);
      janela.add(n8);
      janela.add(n9);
      janela.add(Area_Texto);
      janela.add(n4);
      janela.add(n5);
      janela.add(n6);
      janela.add(igu);
      janela.add(n1);
      janela.add(n2);
      janela.add(n3);
      janela.add(n0);




  }

  public static void main(String[] args) {
      Calculadora Calculadora = new Calculadora();
      JFrame.setDefaultLookAndFeelDecorated(true);
      Calculadora.setVisible(true);
      Calculadora.setSize(300,300);

      //ArrayList<int> numeros = new ArrayList<int> ();



  }


  public void actionPerformed(ActionEvent e) {
      // TODO Stub de método gerado automaticamente

      if (e.getSource() == n0){
      Area_Texto.setText(Area_Texto.getText() + "0");
      }if (e.getSource() == n1){
      Area_Texto.setText(Area_Texto.getText() + "1");
      }if (e.getSource() == n2){
      Area_Texto.setText(Area_Texto.getText() + "2");
      }if (e.getSource() == n3){
      Area_Texto.setText(Area_Texto.getText() + "3");
      }if (e.getSource() == n4){
      Area_Texto.setText(Area_Texto.getText() + "4");
      }if (e.getSource() == n5){
      Area_Texto.setText(Area_Texto.getText() + "5");
      }if (e.getSource() == n6){
      Area_Texto.setText(Area_Texto.getText() + "6");
      }if (e.getSource() == n7){
      Area_Texto.setText(Area_Texto.getText() + "7");
      }if (e.getSource() == n8){
      Area_Texto.setText(Area_Texto.getText() + "8");
      }if (e.getSource() == n9){
      Area_Texto.setText(Area_Texto.getText() + "9");
      }if(e.getSource() == mai){
          valor1 = Integer.parseInt(Area_Texto.getText());
          Area_Texto.setText("");
          if (e.getSource() == n0){
          Area_Texto.setText(Area_Texto.getText() + "0");
          }if (e.getSource() == n1){
          Area_Texto.setText(Area_Texto.getText() + "1");
          }if (e.getSource() == n2){
          Area_Texto.setText(Area_Texto.getText() + "2");
          }if (e.getSource() == n3){
          Area_Texto.setText(Area_Texto.getText() + "3");
          }if (e.getSource() == n4){
          Area_Texto.setText(Area_Texto.getText() + "4");
          }if (e.getSource() == n5){
          Area_Texto.setText(Area_Texto.getText() + "5");
          }if (e.getSource() == n6){
          Area_Texto.setText(Area_Texto.getText() + "6");
          }if (e.getSource() == n7){
          Area_Texto.setText(Area_Texto.getText() + "7");
          }if (e.getSource() == n8){
          Area_Texto.setText(Area_Texto.getText() + "8");
          }if (e.getSource() == n9){
          Area_Texto.setText(Area_Texto.getText() + "9");
          }if(e.getSource() == igu){
          valor2 = Integer.parseInt(Area_Texto.getText());
          resultado = valor1 + valor2;
          Area_Texto.setText("" + resultado);
          JOptionPane.showMessageDialog(null, resultado + valor1 + valor2 + " foi");
          }
          JOptionPane.showMessageDialog(null, valor1 + resultado + " n foi");
      }
      else{
      //  JOptionPane.showMessageDialog(null, "PRESSIONOU CANCELAR");
      }
  }
}
