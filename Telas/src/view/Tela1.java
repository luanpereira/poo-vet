package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JEditorPane;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsurio.setBounds(102, 129, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(102, 193, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(169, 273, 89, 23);
		contentPane.add(btnEntrar);
		
		textField = new JTextField();
		textField.setBounds(99, 154, 232, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(102, 218, 229, 28);
		contentPane.add(passwordField);
		
		JLabel lblColocarImagemAqui = new JLabel("COLOCAR IMAGEM AQUI");
		lblColocarImagemAqui.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblColocarImagemAqui.setBounds(102, 58, 218, 14);
		contentPane.add(lblColocarImagemAqui);
		
		JPanel panel = new JPanel();
		panel.setBounds(81, 106, 276, 161);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
