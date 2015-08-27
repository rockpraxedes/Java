import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.io.*;

public class Calculadora extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel j_janela,j_texto,j_numeros;
	private JTextField Area_Texto;
	private JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,mai,men,div,mul,igu,cc;
	int valor1 =0, valor2 =0, resultado =0;
	char operacao;
	
	public Calculadora(){
		
		super("CALCULADORA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container j_janela;
		j_janela = getContentPane();
		JPanel j_numeros = new JPanel();
		JPanel j_texto = new JPanel();
		j_janela.setLayout (new BorderLayout());
		j_texto.setLayout (new FlowLayout());
		j_numeros.setLayout (new GridLayout(4,4,1,1));
		JFrame frame = new JFrame();
		
		frame.add(j_janela);
		
		Area_Texto = new JTextField (12);
		Area_Texto.setEditable(true);
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
		cc = new JButton ("CC");
		cc.addActionListener(this);
		
		pack();

		
		j_numeros.add(div);
		j_numeros.add(mul);
		j_numeros.add(men);
		j_numeros.add(mai);
		j_numeros.add(n7);
		j_numeros.add(n8);
		j_numeros.add(n9);
		j_numeros.add(cc);
		j_numeros.add(n4);
		j_numeros.add(n5);
		j_numeros.add(n6);
		j_numeros.add(igu);
		j_numeros.add(n1);
		j_numeros.add(n2);
		j_numeros.add(n3);
		j_numeros.add(n0);
		j_texto.add(Area_Texto);
		j_janela.add(j_texto, BorderLayout.NORTH);
		j_janela.add(j_numeros, BorderLayout.CENTER);
	
		
		
		frame.setVisible(true);
		frame.setSize(250,300);
		
	}
	
	public static void main(String[] args) {
		Calculadora Calculadora = new Calculadora();
		//JFrame.setDefaultLookAndFeelDecorated(true);

	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de método gerado automaticamente
		
		if (e.getSource() == cc){
		Area_Texto.setText("");
		}if (e.getSource() == n0){
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
			operacao = '+';
		}if(e.getSource() == men){
			valor1 = Integer.parseInt(Area_Texto.getText());
			Area_Texto.setText("");
			operacao = '-';
		}if(e.getSource() == div){
			valor1 = Integer.parseInt(Area_Texto.getText());
			Area_Texto.setText("");
			operacao = '/';
		}if(e.getSource() == mul){
			valor1 = Integer.parseInt(Area_Texto.getText());
			Area_Texto.setText("");
			operacao = '*';
		}if(e.getSource() == igu){
			valor2 = Integer.parseInt(Area_Texto.getText());
			switch (operacao) {
				case '+': {
					resultado = valor1 + valor2;
					break;
				}
				case '-': {
					resultado = valor1 - valor2;
					break;
				}
				case '/': {
					resultado = valor1 / valor2;
					break;
				}
				case '*': {
					resultado = valor1 * valor2;
					break;
				}
            }
			Area_Texto.setText("" + resultado);
		}
		
		
		else{
		//JOptionPane.showMessageDialog(null, "PRESSIONOU CANCELAR");
		}
	}
			
}
