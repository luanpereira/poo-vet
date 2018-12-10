package br.uema.pecs.veterinaria.view;

import br.uema.pecs.veterinaria.exceptions.UsuarioSenhaInvalidosException;
import br.uema.pecs.veterinaria.model.Proprietario;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;

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

//					geraBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void geraBanco() {
		ServiceRegistry serviceRegistry;
		MetadataImplementor metadata;

		serviceRegistry = new StandardServiceRegistryBuilder()
				.applySetting( Environment.GLOBALLY_QUOTED_IDENTIFIERS, "true" )
				.applySetting( Environment.DEFAULT_SCHEMA, "public" )
				.build();

		metadata = (MetadataImplementor) new MetadataSources( serviceRegistry )
				.addAnnotatedClass( Proprietario.class )
				.buildMetadata();

		System.out.println( "********* Starting SchemaExport for START-UP *************************" );
		new SchemaExport().create( EnumSet.of( TargetType.DATABASE, TargetType.STDOUT ), metadata );
		System.out.println( "********* Completed SchemaExport for START-UP *************************" );

		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create( EnumSet.of( TargetType.DATABASE, TargetType.STDOUT ), metadata );
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
