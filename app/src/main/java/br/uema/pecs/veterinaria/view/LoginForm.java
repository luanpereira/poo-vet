package br.uema.pecs.veterinaria.view;

import br.uema.pecs.veterinaria.exceptions.UsuarioSenhaInvalidosException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	static LoginForm frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsurio.setBounds(102, 129, 46, 14);
		contentPane.add(lblUsurio);
		
		final JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(102, 193, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(169, 273, 89, 23);
		btnEntrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog d = new JDialog(frame, "LoginForm Sistema" , true);
				d.setLocationRelativeTo(frame);

				try {

					if (!txtUsuario.getText().equals("admin") ||
							!txtSenha.getText().equals("123456")) {
						throw new UsuarioSenhaInvalidosException("Usuário ou senha inválidos!");
					}

					PrincipalForm principalForm = new PrincipalForm();
					principalForm.setVisible(true);

					frame.setVisible(false);
				} catch (UsuarioSenhaInvalidosException ex){
					d.setContentPane(new JOptionPane(ex.getMessage(),
							JOptionPane.ERROR_MESSAGE));
					d.pack();
					d.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
					d.setContentPane(new JOptionPane(ex.getMessage(),
							JOptionPane.ERROR_MESSAGE));
					d.pack();
					d.setVisible(true);
				}
			}
		});
		contentPane.add(btnEntrar);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(99, 154, 232, 28);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(102, 218, 229, 28);
		contentPane.add(txtSenha);

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
