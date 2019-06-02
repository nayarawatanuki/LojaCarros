package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;

public class Catalogo {

	private JFrame frame;

	public Catalogo() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1243, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				frame.dispose();
			}
		});
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(6, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1031, GroupLayout.PREFERRED_SIZE)
					.addGap(96))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(108)
					.addComponent(btnVoltar)
					.addContainerGap(1054, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(39, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 572, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVoltar)
					.addGap(24))
		);
		
		JButton btnNissanVersa = new JButton("NISSAN VERSA - 10% off");
		btnNissanVersa.setIcon(new ImageIcon("/Users/nayarawatanuki/git/LojaCarros/img/2017-Nissan-Versa-01-2.jpg"));
		
		JButton btnFordKa = new JButton("FORD KA - 40% off");
		btnFordKa.setIcon(new ImageIcon("/Users/nayarawatanuki/git/LojaCarros/img/Ford-Ka-SE-Plus-2019-traseira-2.jpg"));
		
		JButton btn50off = new JButton("FOX - 50% off");
		btn50off.setIcon(new ImageIcon("/Users/nayarawatanuki/git/LojaCarros/img/volkswagen-fox-2018-2.jpg"));
		btn50off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ContrapropostaCliente();
			}
		});
		
		JButton btnHondaFit = new JButton("HONDA FIT - 20% off");
		btnHondaFit.setIcon(new ImageIcon("/Users/nayarawatanuki/git/LojaCarros/img/Honda-Fit-EX-2018-CVT-2.jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(98)
					.addComponent(btn50off, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
					.addGap(89)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNissanVersa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnHondaFit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
						.addComponent(btnFordKa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
					.addGap(125))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(69, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnFordKa, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHondaFit, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNissanVersa, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 58, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn50off, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
							.addGap(37)))
					.addGap(17))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
