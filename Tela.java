import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.ArrayList;
import java.io.*;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.lang.*;
import java.util.Random;

public class Tela extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel total,panel_top,jogo,panel_lateral;
	private JTextField Area_Texto;
	private JLabel lab_level,lab_vitseguidas,space;
	private JTextField qnt_level,qnt_vitseguidas;
	private JButton b_new;
	private botao[][] Botao = new botao[6][6];
	private botao[] buton = new botao[20];
	private String k2 ="";
	public int aleatorio;
	public int lv1=4,lv2=6,lv3=8,lv4=10,lv5=15,lv6=20,lv7=25,lv8=30,lv9=40,lv10=50,lv0=70;
	public int lv=0;
	public String j="";



	public Tela(){
		
		//dando super da classe
		super("Pagina Principal");
		
		//iniciando janela
		JFrame frame = new JFrame("Genius Camelo");  
		
		//Setando configs da janela // pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(0,0);
		frame.setSize(290,360);
		frame.setResizable(false);	
		pack();


		//iniciando os layouts
		//GridLayout grid = new GridLayout(2,2,5,5);
		GridLayout grid2 = new GridLayout(1,13,1,1);
		GridLayout grid3 = new GridLayout(1,3,1,1);
		FlowLayout flow = new FlowLayout();
		BorderLayout border = new BorderLayout(2,2);
	
		//iniciando os paineis que vao dentro da JANELA com os layouts setados
		JPanel jogo = new JPanel(flow);
		JPanel panel_top = new JPanel(grid2);
		JPanel total = new JPanel(border);
		JPanel panel_lateral = new JPanel(grid3);
	
	//iniciando itens que irao dentro dos paineis

		JLabel space = new JLabel ("                |");
		JLabel lab_level = new JLabel ("Lvl :");	
		JLabel lab_vitseguidas = new JLabel("Quantidade de vitorias :");
	
		qnt_level = new JTextField("0");
		qnt_vitseguidas = new JTextField ("");
		//b_new = new JButton("NEW GAME");
	
		qnt_vitseguidas.setEditable(true);
		panel_top.add(lab_level);
		panel_top.add(qnt_level);
		panel_lateral.add(lab_vitseguidas);
		panel_lateral.add(qnt_vitseguidas);
		pack ();
		//Adicionando layouts
		
		frame.add(total);
		total.add(panel_top,BorderLayout.NORTH);
		total.add(jogo,BorderLayout.CENTER);
		total.add(panel_lateral,BorderLayout.SOUTH);
		jogo.setBackground(Color.BLACK);
		qnt_level.setEditable(false);
		
		for(int x=0;x<11;x++){
			buton[x]= new botao();
			panel_top.add(buton[x]);
			buton[x].addActionListener(this);
		}
		for(int x=4;x<=4;x++){
			for(int y=4;y<=4;y++){
				Botao[x][y] = new botao();
				panel_lateral.add(Botao[x][y]);
				Botao[x][y].addActionListener(this);
			}
		}
		
		for(int x=1;x<=2;x++){
			for(int y=1;y<=2;y++){
				Botao[x][y] = new botao();
				jogo.add(Botao[x][y]);
				Botao[x][y].setPreferredSize(new Dimension(130,130));
				Botao[x][y].addActionListener(this);
				Botao[x][y].setBorderPainted(false);
				
			}
		}
		Botao[4][4].setText("NEW GAME");
		buton[0].setText("0");
		buton[1].setText("1");
		buton[2].setText("2");
		buton[3].setText("3");
		buton[4].setText("4");
		buton[5].setText("5");
		buton[6].setText("6");
		buton[7].setText("7");
		buton[8].setText("8");
		buton[9].setText("9");
		buton[10].setText("10");
		
		Botao[1][1].setBackground(Color.BLACK);
		Botao[1][2].setBackground(Color.BLACK);
		Botao[2][1].setBackground(Color.BLACK);
		Botao[2][2].setBackground(Color.BLACK);
		
		
		Icon botverde = new ImageIcon("botaoverde.gif");  
		Icon verde = new ImageIcon("pisqueverde.gif");  
		Icon botvermelho = new ImageIcon("botaovermelho.gif");  
		Icon botamarelo = new ImageIcon("botaoamarelo.gif");  
		Icon botazul = new ImageIcon("botaoazul.gif");  

  		
		Botao [1][1].setIcon(botverde); 
		Botao [1][2].setIcon(botvermelho); 
		Botao [2][1].setIcon(botamarelo); 
		Botao [2][2].setIcon(botazul); 
		
		//Random random = new Random();  
		
		//aleatorio = random.nextInt(1); 
		
	}



	public void actionPerformed(ActionEvent e) {
	
		Icon botverde = new ImageIcon("botaoverde.gif");  
		Icon verde = new ImageIcon("pisqueverde.gif");  
		Icon botvermelho = new ImageIcon("botaovermelho.gif");  
		Icon vermelho = new ImageIcon("pisquevermelho.gif");  
		Icon botamarelo = new ImageIcon("botaoamarelo.gif");  
		Icon amarelo = new ImageIcon("pisqueamarelo.gif");  
		Icon botazul = new ImageIcon("botaoazul.gif");  
		Icon azul = new ImageIcon("pisqueazul.gif"); 
		Random random = new Random();  		
		
  		
		Botao [1][1].setIcon(botverde); 
		Botao [1][2].setIcon(botvermelho); 
		Botao [2][1].setIcon(botamarelo); 
		Botao [2][2].setIcon(botazul); 
		
	//____________________BOTOES COLORIDOS___________________
	
		if (e.getSource() == Botao [1][1]){
			k2 += "0";

			Botao [1][1].setIcon(verde); 
			if (j.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
			}
		}
		if (e.getSource() == Botao [1][2]){
			k2 += "1";
			Botao [1][2].setIcon(vermelho); 
			if (j.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
			}
		}
		if (e.getSource() == Botao [2][1]){
			k2 += "2";
			Botao [2][1].setIcon(amarelo); 
				if (j.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
			}
		}
		if (e.getSource() == Botao [2][2]){
			k2 += "3";
			Botao [2][2].setIcon(azul); 
			if (j.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
				
			}
		}
		
			//____________________BOTAO NEW GAME___________________
			
			
		if (e.getSource() == Botao [4][4]){
			JOptionPane.showMessageDialog(null, "Comece!");
			k2 = "";
		}
		
			//____________________BOTOES DE DIFICULDADE___________________
			
			
		if (e.getSource() == buton [0]){
			qnt_level.setText("0");
			j="";
			lv=lv0;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [1]){
			qnt_level.setText("1");
			j="";
			lv=lv1;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [2]){
			qnt_level.setText("2");
			j="";
			lv=lv2;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [3]){
			qnt_level.setText("3");
			j="";
			lv=lv3;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [4]){
			qnt_level.setText("4");
			j="";
			lv=lv4;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [5]){
			qnt_level.setText("5");
			j="";
			lv=lv5;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [6]){
			qnt_level.setText("6");
			j="";
			lv=lv6;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [7]){
			qnt_level.setText("7");
			j="";
			lv=lv7;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [8]){
			qnt_level.setText("8");
			j="";
			lv=lv8;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [9]){
			qnt_level.setText("9");
			j="";
			lv=lv9;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}if (e.getSource() == buton [10]){
			qnt_level.setText("10");
			j="";
			lv=lv10;
			for (int k =1;k<=lv;k++){
				int aleatorio = random.nextInt(4); 
				j += aleatorio;
			}
			JOptionPane.showMessageDialog(null, " " + j );
			k2 = "";
		}
		
		
	}
	
}
