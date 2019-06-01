package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import model.entities.Carros;
import model.entities.Cidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JYearChooser;

import control.CarrosBLL;
import control.CidadesBLL;

public class CadastroCarros {

	JFrame frame;
	private JTextField txtModelo;
	private JTextField txtChassi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCarros window = new CadastroCarros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroCarros() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame. 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCarro = new JPanel();
		panelCarro.setBorder(new TitledBorder(null, "Carro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelDoc = new JPanel();
		panelDoc.setBorder(new TitledBorder(null, "Documenta\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblChassi = new JLabel("Chassi:");
		
		txtChassi = new JTextField();
		txtChassi.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		
		JLabel lblKm = new JLabel("Km:");
		
		JLabel lblPreo = new JLabel("Preço:");
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		
		JComboBox cbCombustivel = new JComboBox();
		cbCombustivel.setModel(new DefaultComboBoxModel(new String[] {null, "Flex", "Gasolina", "Diesel"}));
		
		
		JFormattedTextField ftxtPreco = new JFormattedTextField();
		
		JFormattedTextField ftxtPlaca = new JFormattedTextField();
		
		JFormattedTextField ftxtKm = new JFormattedTextField();
		
		JLabel lblEstado = new JLabel("Estado:");
		
		
		JComboBox<Cidades> cbEstado = new JComboBox<Cidades>();
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {null, "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		CidadesBLL cid = new CidadesBLL();
		JComboBox<Cidades> cbCidade = new JComboBox<Cidades>();
		cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
		String estado = cbEstado.getSelectedItem().toString();
		switch (estado) {
		  case "AC":
			for (Cidades c : cid.getACCidades()) {
				cbEstado.addItem(c);
			}
		    break;
		  case "SP":
			for (Cidades c : cid.getSPCidades()) {
				cbEstado.addItem(c);
			}
		    break;
		  case "":
			cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
		    break;
		}
		
		
		GroupLayout gl_panelDoc = new GroupLayout(panelDoc);
		gl_panelDoc.setHorizontalGroup(
			gl_panelDoc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDoc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(lblCombustivel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelDoc.createSequentialGroup()
									.addComponent(lblChassi, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panelDoc.createSequentialGroup()
									.addComponent(lblPlaca, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panelDoc.createSequentialGroup()
									.addComponent(lblCidade, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(lblEstado, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
							.addGap(50))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(lblPreo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(62))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(lblKm, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(71)))
					.addGap(6)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addGroup(gl_panelDoc.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelDoc.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panelDoc.createSequentialGroup()
										.addComponent(cbCidade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_panelDoc.createSequentialGroup()
										.addComponent(ftxtPlaca, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_panelDoc.createSequentialGroup()
										.addComponent(txtChassi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_panelDoc.createSequentialGroup()
										.addComponent(ftxtKm, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_panelDoc.createSequentialGroup()
										.addComponent(ftxtPreco, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addComponent(cbCombustivel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
							.addGap(6))
						.addGroup(gl_panelDoc.createSequentialGroup()
							.addComponent(cbEstado, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panelDoc.setVerticalGroup(
			gl_panelDoc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDoc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstado)
						.addComponent(cbEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(cbCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlaca)
						.addComponent(ftxtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChassi)
						.addComponent(txtChassi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKm)
						.addComponent(ftxtKm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreo)
						.addComponent(ftxtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDoc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCombustivel)
						.addComponent(cbCombustivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panelDoc.setLayout(gl_panelDoc);
		
		JLabel lblModelo = new JLabel("Modelo:");
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		
		JLabel lblAno = new JLabel("Ano:");
		
		JComboBox cbMarca = new JComboBox();
		cbMarca.setModel(new DefaultComboBoxModel(new String[] {null, "Volkswagen"}));
		
		JYearChooser yearChooser = new JYearChooser();
		GroupLayout gl_panelCarro = new GroupLayout(panelCarro);
		gl_panelCarro.setHorizontalGroup(
			gl_panelCarro.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCarro.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addComponent(lblModelo)
							.addGap(6)
							.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbMarca, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAno, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(yearChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(31))
		);
		gl_panelCarro.setVerticalGroup(
			gl_panelCarro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCarro.createSequentialGroup()
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addGap(5)
							.addComponent(lblModelo))
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addGap(4)
							.addComponent(lblMarca))
						.addComponent(cbMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panelCarro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
							.addComponent(lblAno)
							.addGap(16))
						.addGroup(gl_panelCarro.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(yearChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtModelo.getText() == " " || cbMarca.getSelectedItem() == null || yearChooser.equals(null)|| cbEstado.getSelectedItem() == null || cbCidade.getSelectedItem() == null || ftxtPlaca.getText() == " " || txtChassi.getText() == " " || ftxtKm.getText() == " " || ftxtPreco.getText() == " " || cbCombustivel.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					
					CarrosBLL car = new CarrosBLL();
					car.insertCarros(new Carros(
							txtModelo.getText(), 
							cbMarca.getSelectedItem().toString(), 
							yearChooser.getValue(),
							cbEstado.getSelectedItem().toString(), 
							cbCidade.getSelectedItem().toString(), 
							ftxtPlaca.getText(), 
							txtChassi.getText(), 
							Double.parseDouble(ftxtKm.getText()), 
							Double.parseDouble(ftxtPreco.getText()), 
							cbCombustivel.getSelectedItem().toString()));
					
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalvar))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelDoc, 0, 0, Short.MAX_VALUE)
								.addComponent(panelCarro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(panelCarro, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelDoc, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		
		panelCarro.setLayout(gl_panelCarro);
		frame.getContentPane().setLayout(groupLayout);
	}
}
