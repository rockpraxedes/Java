import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.ArrayList;
import java.io.*;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

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
	String lvl;
	String lvl1="kehu";
	String lvl2="kkeu";
	String lvl3="huek";
	String lvl4="ehukhe";
	String lvl5="hekuhu";
	String lvl6="khkeuh";
	String lvl7="eeuekhkeh";
	String lvl8="ekhuuekhu";
	String lvl9="ekhuekhuekheuk";
	String lvl10="ukkhuekkeeuheh";
	String lvl0="keuhkeuhkehhuekhuekh";
	 Timer tempo = new Timer( 3000, null ); // ficar na cor por 3 segundos  

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
		lvl=lvl1;
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
		Icon botvermelho = new ImageIcon("botaovermelho.gif");  
		Icon botamarelo = new ImageIcon("botaoamarelo.gif");  
		Icon botazul = new ImageIcon("botaoazul.gif");  

  		
		Botao [1][1].setIcon(botverde); 
		Botao [1][2].setIcon(botvermelho); 
		Botao [2][1].setIcon(botamarelo); 
		Botao [2][2].setIcon(botazul); 
	}


	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == Botao [1][1]){
			k2 += "h";
			if (lvl.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
				
			}
		}
		if (e.getSource() == Botao [1][2]){
			k2 += "u";
			if (lvl.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
			}
		}
		if (e.getSource() == Botao [2][1]){
			k2 += "e";
				if (lvl.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
			}
		}
		if (e.getSource() == Botao [2][2]){
			k2 += "k";
			if (lvl.equals(k2)) {
				JOptionPane.showMessageDialog(null, "ACERTOU A SEQUENCIA! PARABENS");
				k2 = "";
				
			}
		}
		if (e.getSource() == Botao [4][4]){
			JOptionPane.showMessageDialog(null, "Comece!");
			k2 = "";
		}
		if (e.getSource() == buton [0]){
			qnt_level.setText("0");
			lvl=lvl0;
			k2 = "";
		}if (e.getSource() == buton [1]){
			qnt_level.setText("1");
			lvl=lvl1;
			k2 = "";
		}if (e.getSource() == buton [2]){
			qnt_level.setText("2");
			lvl=lvl2;
			k2 = "";
		}if (e.getSource() == buton [3]){
			qnt_level.setText("3");
			lvl=lvl3;
			k2 = "";
		}if (e.getSource() == buton [4]){
			qnt_level.setText("4");
			lvl=lvl4;
			k2 = "";
		}if (e.getSource() == buton [5]){
			qnt_level.setText("5");
			lvl=lvl5;
			k2 = "";
		}if (e.getSource() == buton [6]){
			qnt_level.setText("6");
			lvl=lvl6;
			k2 = "";
		}if (e.getSource() == buton [7]){
			qnt_level.setText("7");
			lvl=lvl7;
			k2 = "";
		}if (e.getSource() == buton [8]){
			qnt_level.setText("8");
			lvl=lvl8;
			k2 = "";
		}if (e.getSource() == buton [9]){
			qnt_level.setText("9");
			lvl=lvl9;
			k2 = "";
		}if (e.getSource() == buton [10]){
			qnt_level.setText("10");
			lvl=lvl10;
			k2 = "";
		}
		
		
	}
	
}
