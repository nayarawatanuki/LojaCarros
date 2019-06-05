package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import control.CarrosBLL;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;

public class Catalogo {

	private JFrame frame;
	
	CarrosBLL ctrl = new CarrosBLL();

	public Catalogo() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1243, 808);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Nissan VERSA UNIQUE 1.6 16V FlexStart 4p Aut. 2017 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblDestaques = new JLabel("Destaques");
		lblDestaques.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Honda Fit Personal 1.5 Flexone 16V 5p Aut. 2018 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton button = new JButton("HONDA FIT - 20% off\n\nR$ 57.340,00");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ContrapropostaCliente();
			}
		});
		button.setIcon(new ImageIcon("img/Honda-Fit-EX-2018-CVT-2.jpg"));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(17)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Ford Ka 1.0 SE/SE Plus TiVCT Flex 5p 2019 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton button_1 = new JButton("FORD KA - 40% off\n\nR$ 40.093,00");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ContrapropostaCliente();
			}
		});
		button_1.setIcon(new ImageIcon("img/Ford-Ka-SE-Plus-2019-traseira-2.jpg"));
		button_1.setToolTipText("");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(20)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "VolksWagen Fox Connect 1.6 Flex 8V 5p 2019 Gasolina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton button_2 = new JButton("FOX - 50% off\n\nR$ 45.364,00");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ContrapropostaCliente();
			}
		});
		button_2.setIcon(new ImageIcon("img/volkswagen-fox-2018-2.jpg"));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 453, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 438, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				frame.dispose();
			}
		});
		
		JButton button_4 = new JButton("Todo o Estoque");
		
		JButton button_5 = new JButton("Mais Ofertas");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, 0, 0, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(panel_1, 0, 0, Short.MAX_VALUE)
									.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))))
						.addComponent(lblDestaques))
					.addGap(471))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblDestaques)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnVoltar)
								.addComponent(button_4)
								.addComponent(button_5)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
							.addGap(109))))
		);
		
		JButton btnNissanVersa = new JButton("NISSAN VERSA - 10% off\n\nR$ 55.063,00");
		btnNissanVersa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ContrapropostaCliente();
			}
		});
		btnNissanVersa.setIcon(new ImageIcon("img/2017-Nissan-Versa-01-2.jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(btnNissanVersa, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNissanVersa, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
