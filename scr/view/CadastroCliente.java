package view;

import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import control.ClienteBLL;
import model.entities.Cliente;

public class CadastroCliente {

	private JFrame frame;
	private JTextField txtNome;
	private JFormattedTextField ftxtTelefone;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente window = new CadastroCliente();
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
	public CadastroCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 394);
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
			
		}catch (Exception e){
		}
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		JLabel lblSenha = new JLabel("Senha:");
		
		pwdSenha = new JPasswordField();
		
		JFormattedTextField ftxtEmail = new JFormattedTextField();
		
		JLabel lblCarros = new JLabel("Carros de interesse:");
		
		JButton btnBuscar = new JButton("buscar");
		
		JList list = new JList();
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(pwdSenha))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNome)
								.addComponent(lblTelefone)
								.addComponent(lblEmail))
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ftxtEmail, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(ftxtTelefone)))
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCarros, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscar)))
					.addContainerGap(31, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(pwdSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCarros)
						.addComponent(btnBuscar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(txtNome.getText() == null | ftxtTelefone.getText() == null | ftxtEmail.getText() == null | pwdSenha.getText() == null) {
					JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
				}else {
					ClienteBLL cli = new ClienteBLL();
					cli.insertCliente(new Cliente(
							txtNome.getText().toString(), 
							ftxtTelefone.getText(), 
							ftxtEmail.getText(), 
							pwdSenha.getText().toString()));
					
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
		
		JButton btnLimparTudo = new JButton("Limpar Tudo");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLimparTudo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalvar))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar)
						.addComponent(btnLimparTudo))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
