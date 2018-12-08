package br.uema.pecs.veterinaria.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ProprietarioForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the frame.
	 */
	public ProprietarioForm() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospitalVeterinrioUniversitrio = new JLabel("HOSPITAL VETERIN\u00C1RIO UNIVERSIT\u00C1RIO - UEMA");
		lblHospitalVeterinrioUniversitrio.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblHospitalVeterinrioUniversitrio.setBounds(22, 11, 664, 61);
		contentPane.add(lblHospitalVeterinrioUniversitrio);
		
		JLabel lblCadastroDeProprietrio = new JLabel("Cadastro de Propriet\u00E1rio");
		lblCadastroDeProprietrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeProprietrio.setBounds(32, 93, 203, 39);
		contentPane.add(lblCadastroDeProprietrio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(92, 143, 39, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(101, 186, 30, 14);
		contentPane.add(lblCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(29, 233, 110, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(101, 277, 30, 14);
		contentPane.add(lblCep);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(64, 324, 67, 14);
		contentPane.add(lblLogradouro);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(85, 368, 50,14);
		contentPane.add(lblNmero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(92, 414, 39, 14);
		contentPane.add(lblBairro);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(92, 458, 39, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(216, 458, 39, 14);
		contentPane.add(lblCidade);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(92, 504, 39, 14);
		contentPane.add(lblCelular);
		
		JLabel lblFixo = new JLabel("Fixo:");
		lblFixo.setBounds(101, 545, 30, 14);
		contentPane.add(lblFixo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 570, 962, 14);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBounds(136, 143, 349, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 183, 349, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 230, 349, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(136, 274, 349, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(136, 321, 349, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(136, 365, 349, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(136, 411, 349, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 501, 122, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(133, 539, 122, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(265, 455, 220, 20);
		contentPane.add(textField_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 455, 65, 20);
		contentPane.add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 83, 962, 14);
		contentPane.add(separator_1);
		
		JButton button = new JButton("Cancelar");
		button.setBounds(746, 604, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Voltar");
		button_1.setBounds(627, 604, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Salvar");
		button_2.setBounds(869, 604, 89, 23);
		contentPane.add(button_2);
	}
}
