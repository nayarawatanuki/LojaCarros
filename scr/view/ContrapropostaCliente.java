package view;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ContrapropostaCliente {

	private JFrame frame;
	private JTextField txtNome;

	
	public ContrapropostaCliente() {
		frame = new JFrame();
		frame.setBounds(100, 100, 437, 284);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "CadastroCliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		JFormattedTextField ftxtEmail = new JFormattedTextField();
		
		JFormattedTextField ftxtTelefone = new JFormattedTextField();
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		GroupLayout gl_panelCliente = new GroupLayout(panelCliente);
		gl_panelCliente.setHorizontalGroup(
			gl_panelCliente.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCliente.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panelCliente.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addComponent(lblTelefone)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 10, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panelCliente.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome)
						.addComponent(ftxtTelefone, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
						.addComponent(ftxtEmail, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
					.addGap(31))
		);
		gl_panelCliente.setVerticalGroup(
			gl_panelCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(ftxtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(ftxtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		panelCliente.setLayout(gl_panelCliente);
		
		JPanel panelContraproposta = new JPanel();
		panelContraproposta.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Contraproposta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JFormattedTextField ftxtValor = new JFormattedTextField();
		GroupLayout gl_panelContraproposta = new GroupLayout(panelContraproposta);
		gl_panelContraproposta.setHorizontalGroup(
			gl_panelContraproposta.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelContraproposta.createSequentialGroup()
					.addContainerGap(140, Short.MAX_VALUE)
					.addComponent(ftxtValor, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		gl_panelContraproposta.setVerticalGroup(
			gl_panelContraproposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContraproposta.createSequentialGroup()
					.addComponent(ftxtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(10, Short.MAX_VALUE))
		);
		panelContraproposta.setLayout(gl_panelContraproposta);
		
		JButton button = new JButton("Cancelar");
		
		JButton btnEnviar = new JButton("Enviar");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(237)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelContraproposta, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
								.addComponent(panelCliente, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))
					.addGap(15))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(panelCliente, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelContraproposta, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEnviar)
						.addComponent(button))
					.addGap(192))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
