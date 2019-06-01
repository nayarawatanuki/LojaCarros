package view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class Menu {

	private JFrame frame;

	public Menu () {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		JMenuItem menuitemCarro = new JMenuItem("Carro");
		menuitemCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastroCarros();
				frame.dispose();
				
			}
		});
		menuCadastro.add(menuitemCarro);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Funcionarios();
				frame.dispose();
			}
		});
		menuCadastro.add(mntmUsuario);
		
				JMenu menu = new JMenu("|");
				menuBar.add(menu);
		
		JMenu menuEstoque = new JMenu("Estoque");
		menuBar.add(menuEstoque);
		
		JMenuItem menuitemEstoqueDeCarros = new JMenuItem("Estoque de Carros");
		menuitemEstoqueDeCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EstoqueCarros();				
				frame.dispose();
			}
		});
		menuEstoque.add(menuitemEstoqueDeCarros);
		
		JMenuItem mntmCatalogo = new JMenuItem("Catalogo");
		mntmCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Catalogo();
				frame.dispose();
			}
		});
		menuEstoque.add(mntmCatalogo);
		
		JLabel lblUsuario = new JLabel("Bem Vindo ao Sistema!");
		frame.getContentPane().add(lblUsuario, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
