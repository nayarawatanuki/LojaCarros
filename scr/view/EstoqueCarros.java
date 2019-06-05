package view;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import model.entities.Carros;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EstoqueCarros {
	
	private static JTextField txtBusca;
	private static JTable tabela;
	private static DefaultTableModel modelo = new DefaultTableModel();
	private static ArrayList<Carros> carros;
	
	public EstoqueCarros(ArrayList<Carros> carrosP) {
		
		carros = carrosP;
		JTable();

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 594, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCarro = new JLabel("Carro:");
		
		txtBusca = new JTextField();
		txtBusca.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				frame.dispose();				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCarro, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtBusca, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscar))
						.addComponent(btnVoltar, Alignment.LEADING)
						.addComponent(barraRolagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCarro))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtBusca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnBuscar)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(barraRolagem, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVoltar)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
	
	private static void JTable() {
		try {
			tabela = new JTable(modelo);
	        modelo.addColumn("ID");
	        modelo.addColumn("Modelo");
	        modelo.addColumn("Marca");
	        modelo.addColumn("Ano");
	        modelo.addColumn("Cidade");
	        modelo.addColumn("Estado");
	        modelo.addColumn("Placa");
	        modelo.addColumn("Chassi");
	        modelo.addColumn("KM rodados");
	        modelo.addColumn("Preço");
	        modelo.addColumn("Combustível");
	        
	        tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
	        tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
	        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
	        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
	        tabela.getColumnModel().getColumn(4).setPreferredWidth(80);
	        tabela.getColumnModel().getColumn(5).setPreferredWidth(50);
	        tabela.getColumnModel().getColumn(6).setPreferredWidth(80);
	        tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
	        tabela.getColumnModel().getColumn(8).setPreferredWidth(100);
	        tabela.getColumnModel().getColumn(9).setPreferredWidth(80);
	        tabela.getColumnModel().getColumn(10).setPreferredWidth(50);
	        
	        pesquisar(modelo, carros);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar tabela.");
		}
		
	}
     
	private static void pesquisar(DefaultTableModel modelo, ArrayList<Carros> carros) {
		modelo.setNumRows(0);
        
        try {
	        for (Carros car : carros) {
	            modelo.addRow(new Object[]{car.getId(), car.getModelo(), car.getMarca(), car.getAno(),
	            		car.getCidade(), car.getEstado(), car.getPlaca(), car.getChassi(), car.getKm(),
	            		car.getPreco(), car.getCombustivel()});
	        }
        } catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela.");
		}
	}
}
