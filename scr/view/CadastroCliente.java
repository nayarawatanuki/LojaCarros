package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import control.ClienteBLL;
import control.ContraPropostaBLL;
import model.entities.Cliente;
import model.entities.ContraProposta;

public class CadastroCliente {

	private JFrame frame;
	private JTextField txtNome;
	private JFormattedTextField ftxtTelefone;

	public CadastroCliente() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "CadastroCliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		
		try{
			MaskFormatter tel = new MaskFormatter("(##) ####-####");
			ftxtTelefone = new JFormattedTextField(tel);
			ftxtTelefone.setText("");
			
		}catch (Exception e){
		}
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		JFormattedTextField ftxtEmail = new JFormattedTextField();
		
		JLabel lblCarros = new JLabel("Carros de interesse:");
		
		JButton btnBuscar = new JButton("buscar");
		
		JList list = new JList();
		
		JFormattedTextField valor = new JFormattedTextField();
		
		JLabel lblContraproposta = new JLabel("Contraproposta");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addComponent(lblTelefone)
						.addComponent(lblEmail)
						.addComponent(lblContraproposta))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblCarros, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnBuscar))
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(ftxtEmail, Alignment.LEADING)
								.addComponent(txtNome, Alignment.LEADING)
								.addComponent(ftxtTelefone, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
						.addComponent(valor, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(52, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
					.addGap(54))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(ftxtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(ftxtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraproposta)
						.addComponent(valor, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscar)
						.addComponent(lblCarros))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNome.getText() == null | ftxtTelefone.getText() == null | ftxtEmail.getText() == null) {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					ClienteBLL cli = new ClienteBLL();
					cli.insertCliente(new Cliente(
							txtNome.getText().toString(), 
							ftxtTelefone.getText(), 
							ftxtEmail.getText(),
							null));
					
					ContraPropostaBLL car = new ContraPropostaBLL();
					car.insertContraProposta(new ContraProposta(
							Double.parseDouble(valor.getText())));
					
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					new Catalogo();	
					frame.dispose();
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Catalogo();				
				frame.dispose();
			}
		});
		
		JButton btnLimparTudo = new JButton("Limpar Tudo");
		btnLimparTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				ftxtTelefone.setValue(null);
				ftxtEmail.setText(null);
				valor.setText(null);
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLimparTudo)
							.addGap(7)
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSalvar))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSalvar)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnLimparTudo)
							.addComponent(btnCancelar)))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
