package view;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.CarrosBLL;
import model.entities.Carros;

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
			public void actionPerformed(ActionEvent e) {
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
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroCliente();
				frame.dispose();
			}
		});
		menuCadastro.add(mntmCliente);
		
		JMenuItem mntmGerente = new JMenuItem("Gerente");
		mntmGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Registro();
				frame.dispose();
			}
		});
		menuCadastro.add(mntmGerente);
		
				JMenu menu = new JMenu("|");
				menuBar.add(menu);
		
		JMenu menuEstoque = new JMenu("Estoque");
		menuBar.add(menuEstoque);
		
		JMenuItem menuitemEstoqueDeCarros = new JMenuItem("Estoque de Carros");
		menuitemEstoqueDeCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarrosBLL ctrl = new CarrosBLL();
				
				ArrayList<Carros> carros = ctrl.selectCarros("");
				
				new EstoqueCarros(carros);				
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
