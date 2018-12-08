package br.uema.pecs.veterinaria.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TriagemForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_9;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public TriagemForm() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 838);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospitalVeterinrioUniversitrio = new JLabel("HOSPITAL VETERIN\u00C1RIO UNIVERSIT\u00C1RIO - UEMA");
		lblHospitalVeterinrioUniversitrio.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblHospitalVeterinrioUniversitrio.setBounds(22, 11, 664, 61);
		contentPane.add(lblHospitalVeterinrioUniversitrio);
		
		JLabel lblCadastroDeProprietrio = new JLabel("ProprietarioForm:");
		lblCadastroDeProprietrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeProprietrio.setBounds(32, 93, 80, 39);
		contentPane.add(lblCadastroDeProprietrio);
		
		JLabel lblNome = new JLabel("Propriet\u00E1rio:");
		lblNome.setBounds(64, 143, 67, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Nome:");
		lblDataDeNascimento.setBounds(114, 233, 46, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblCep = new JLabel("Data de Nascimento:");
		lblCep.setBounds(51, 277, 100, 14);
		contentPane.add(lblCep);
		
		JLabel lblLogradouro = new JLabel("Sexo:");
		lblLogradouro.setBounds(121, 324, 39, 14);
		contentPane.add(lblLogradouro);
		
		JLabel lblNmero = new JLabel("Esp\u00E9cie:");
		lblNmero.setBounds(114, 368, 46, 14);
		contentPane.add(lblNmero);
		
		JLabel lblBairro = new JLabel("Ra\u00E7a:");
		lblBairro.setBounds(121, 414, 30, 14);
		contentPane.add(lblBairro);
		
		JLabel lblEstado = new JLabel("Peso:");
		lblEstado.setBounds(92, 528, 39, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCidade = new JLabel("Temperatura:");
		lblCidade.setBounds(216, 528, 79, 14);
		contentPane.add(lblCidade);
		
		JLabel lblCelular = new JLabel("Queixa:");
		lblCelular.setBounds(92, 574, 39, 14);
		contentPane.add(lblCelular);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 712, 962, 14);
		contentPane.add(separator);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(161, 230, 349, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(161, 274, 349, 20);
		contentPane.add(textField_3);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(305, 525, 122, 20);
		contentPane.add(textField_9);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 83, 962, 14);
		contentPane.add(separator_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(141, 140, 344, 23);
		contentPane.add(comboBox_1);
		
		JLabel lblDadosDoAnimal = new JLabel("Dados do Animal");
		lblDadosDoAnimal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoAnimal.setBounds(52, 189, 108, 14);
		contentPane.add(lblDadosDoAnimal);
		
		JRadioButton rdbtnMacho = new JRadioButton("Macho");
		rdbtnMacho.setBounds(166, 320, 67, 23);
		contentPane.add(rdbtnMacho);
		
		JRadioButton rdbtnFmea = new JRadioButton("F\u00EAmea");
		rdbtnFmea.setBounds(235, 320, 67, 23);
		contentPane.add(rdbtnFmea);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(161, 365, 160, 23);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(161, 410, 160, 23);
		contentPane.add(comboBox_3);
		
		JLabel lblTriagem = new JLabel("ProprietarioForm");
		lblTriagem.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTriagem.setBounds(64, 484, 79, 14);
		contentPane.add(lblTriagem);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(126, 525, 72, 20);
		contentPane.add(textField);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(141, 574, 781, 55);
		contentPane.add(textPane);
		
		JLabel lblClassificar = new JLabel("Classificar:");
		lblClassificar.setBounds(72, 647, 59, 14);
		contentPane.add(lblClassificar);
		
		JRadioButton rdbtnPrioridade = new JRadioButton("Prioridade 1");
		rdbtnPrioridade.setBounds(141, 642, 89, 23);
		contentPane.add(rdbtnPrioridade);
		
		JRadioButton rdbtnPrioridade_1 = new JRadioButton("Prioridade 2");
		rdbtnPrioridade_1.setBounds(250, 642, 89, 23);
		contentPane.add(rdbtnPrioridade_1);
		
		JRadioButton rdbtnPrioridade_2 = new JRadioButton("Prioridade 3");
		rdbtnPrioridade_2.setBounds(364, 642, 89, 23);
		contentPane.add(rdbtnPrioridade_2);
		
		JButton button = new JButton("Cancelar");
		button.setBounds(744, 737, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Voltar");
		button_1.setBounds(625, 737, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Salvar");
		button_2.setBounds(867, 737, 89, 23);
		contentPane.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 171, 946, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(32, 468, 946, 226);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
