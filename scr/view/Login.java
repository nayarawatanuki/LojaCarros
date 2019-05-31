package view;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.dao.Acesso;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Login {
	
	public static void main(String[] args) {
		
		// Criando o JFrame
		JFrame frmLogin = new JFrame("Farmacia");		
		frmLogin.setTitle("Sistema de Software | Loja de Carros");
		frmLogin.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frmLogin.setSize(409, 260);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN:");
		lblLogin.setBounds(45, 117, 46, 14);
		frmLogin.getContentPane().add(lblLogin);
		
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(94, 114, 176, 20);
		frmLogin.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(45, 142, 46, 14);
		frmLogin.getContentPane().add(lblSenha);
		
		JPasswordField pwdSenha = new JPasswordField();
		pwdSenha.setBounds(94, 142, 176, 20);
		frmLogin.getContentPane().add(pwdSenha);
		
		/** BOTÃO ENTRAR **/
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso();
				
				acesso.Logar(txtLogin.getText(), pwdSenha.getText());
				
				if(acesso.permissao == true) {
					new Menu();
					frmLogin.dispose();
				}
				
				if(acesso.permissao == false) {
					txtLogin.setText("");
					pwdSenha.setText("");
					txtLogin.requestFocus();
				}
				
				acesso.permissao = false;
			}
		});
		btnEntrar.setBounds(94, 176, 73, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		/** BOTÃO CANCELAR **/
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		btnCancelar.setBounds(177, 176, 101, 23);
		frmLogin.getContentPane().add(btnCancelar);
		
		JLabel lblFarmcia = new JLabel("Loja de Carros");
		lblFarmcia.setForeground(new Color(0, 128, 0));
		lblFarmcia.setFont(new Font("Calibri", Font.BOLD, 60));
		lblFarmcia.setBackground(new Color(255, 69, 0));
		lblFarmcia.setBounds(21, 11, 397, 74);
		frmLogin.getContentPane().add(lblFarmcia);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("")));
		label.setBounds(31, 171, 107, 122);
		frmLogin.getContentPane().add(label);
		
		frmLogin.setVisible(true);
		}
}

