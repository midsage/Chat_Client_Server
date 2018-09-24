package com.chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtPort;

	

	
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtName.setBounds(58, 52, 165, 28);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblName.setBounds(58, 37, 48, 14);
		contentPane.add(lblName);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtAddress.setBounds(58, 131, 165, 28);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblIpAddress.setBounds(58, 117, 79, 14);
		contentPane.add(lblIpAddress);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblPort.setBounds(58, 217, 48, 14);
		contentPane.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtPort.setColumns(10);
		txtPort.setBounds(58, 232, 165, 28);
		contentPane.add(txtPort);
		
		JLabel lblPortDesc = new JLabel("(eg. 8192)");
		lblPortDesc.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblPortDesc.setBounds(58, 260, 63, 14);
		contentPane.add(lblPortDesc);
		
		JLabel lblIPAddressDesc = new JLabel("(eg. 192.168.0.52)");
		lblIPAddressDesc.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblIPAddressDesc.setBounds(58, 159, 122, 14);
		contentPane.add(lblIPAddressDesc);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnLogin.setBounds(58, 312, 165, 28);
		contentPane.add(btnLogin);
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
