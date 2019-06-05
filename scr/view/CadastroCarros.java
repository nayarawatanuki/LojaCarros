package view;

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
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JYearChooser;

import control.CarrosBLL;
import control.CidadesBLL;

public class CadastroCarros {

	JFrame frame;
	private JTextField txtModelo;
	private JTextField txtChassi;
	
	
	public CadastroCarros() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCarro = new JPanel();
		panelCarro.setBorder(new TitledBorder(null, "Carro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelDoc = new JPanel();
		panelDoc.setBorder(new TitledBorder(null, "Documentacao", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblChassi = new JLabel("Chassi:");
		
		txtChassi = new JTextField();
		txtChassi.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		
		JLabel lblKm = new JLabel("Km:");
		
		JLabel lblPreo = new JLabel("Preco:");
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		
		JComboBox cbCombustivel = new JComboBox();
		cbCombustivel.setModel(new DefaultComboBoxModel(new String[] {null, "Flex", "Gasolina", "Diesel"}));
		
		
		JFormattedTextField ftxtPreco = new JFormattedTextField();
		
		JFormattedTextField ftxtPlaca = new JFormattedTextField();
		
		JFormattedTextField ftxtKm = new JFormattedTextField();
		
		JLabel lblEstado = new JLabel("Estado:");
		
		
		JComboBox cbEstado = new JComboBox();
		
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {null, "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		CidadesBLL cid = new CidadesBLL();
		JComboBox<Cidades> cbCidade = new JComboBox<Cidades>();
		
		cbEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbEstado.getSelectedItem().toString() == "AC") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getACCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "AL") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getALCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "AP") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getAPCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "AM") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getAMCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "BA") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getBACidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "CE") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getCECidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "DF") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getDFCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "ES") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getESCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "GO") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getGOCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MA") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMACidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MT") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMTCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MS") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMSCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "MG") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getMGCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PA") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPACidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PB") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPBCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PE") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPECidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PI") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPICidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "PR") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getPRCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RJ") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRJCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RN") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRNCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RS") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRSCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RO") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getROCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "RR") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getRRCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "SC") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getSCCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "SE") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getSECidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "SP") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getSPCidades()) {
						cbCidade.addItem(c);
					}
				}else if(cbEstado.getSelectedItem().toString() == "TO") {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
					for (Cidades c : cid.getTOCidades()) {
						cbCidade.addItem(c);
					}
				}else {
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {null}));
				}
			}
		});
		
		
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
							cbCidade.getSelectedItem().toString(),
							cbEstado.getSelectedItem().toString(), 
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
				new Menu();
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
		frame.setVisible(true);
	}
}
