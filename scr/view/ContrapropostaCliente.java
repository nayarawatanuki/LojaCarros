package view;

import java.awt.EventQueue;

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
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class ContrapropostaCliente {

	private JFrame frame;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContrapropostaCliente window = new ContrapropostaCliente();
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
	public ContrapropostaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCliente.createParallelGroup(Alignment.LEADING)
						.addComponent(ftxtTelefone, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
						.addGroup(gl_panelCliente.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtNome, Alignment.LEADING)
							.addComponent(ftxtEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
					.addGap(31))
		);
		gl_panelCliente.setVerticalGroup(
			gl_panelCliente.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCliente.createSequentialGroup()
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
		
		JTextPane txtpContraproposta = new JTextPane();
		GroupLayout gl_panelContraproposta = new GroupLayout(panelContraproposta);
		gl_panelContraproposta.setHorizontalGroup(
			gl_panelContraproposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContraproposta.createSequentialGroup()
					.addGap(17)
					.addComponent(txtpContraproposta, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		gl_panelContraproposta.setVerticalGroup(
			gl_panelContraproposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelContraproposta.createSequentialGroup()
					.addGap(16)
					.addComponent(txtpContraproposta, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		panelContraproposta.setLayout(gl_panelContraproposta);
		
		JButton button = new JButton("Cancelar");
		
		JButton button_1 = new JButton("Salvar");
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Carro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelContraproposta, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panelCliente, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 306, Short.MAX_VALUE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(button_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
					.addGap(29))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(panelCliente, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_1)
							.addGap(18)
							.addComponent(button))
						.addComponent(panelContraproposta, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
					.addGap(47))
		);
		
		JLabel lblCarro = new JLabel("Carro:");
		
		JLabel lblMarca = new JLabel("Marca:");
		
		JLabel lblAno = new JLabel("Ano:");
		
		JLabel lblPreco = new JLabel("Preco:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCarro)
						.addComponent(lblMarca)
						.addComponent(lblAno)
						.addComponent(lblPreco))
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCarro)
					.addGap(6)
					.addComponent(lblMarca)
					.addGap(6)
					.addComponent(lblAno)
					.addGap(6)
					.addComponent(lblPreco)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
