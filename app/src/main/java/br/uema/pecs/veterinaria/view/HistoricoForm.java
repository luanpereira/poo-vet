package br.uema.pecs.veterinaria.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistoricoForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the frame.
	 */
	public HistoricoForm() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 908);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospitalVeterinrioUniversitrio = new JLabel("HOSPITAL VETERIN\u00C1RIO UNIVERSIT\u00C1RIO - UEMA");
		lblHospitalVeterinrioUniversitrio.setBounds(22, 11, 664, 61);
		lblHospitalVeterinrioUniversitrio.setFont(new Font("Tahoma", Font.PLAIN, 29));
		contentPane.add(lblHospitalVeterinrioUniversitrio);
		
		JLabel lblCadastroDeProprietrio = new JLabel("Consulta");
		lblCadastroDeProprietrio.setBounds(32, 93, 78, 39);
		lblCadastroDeProprietrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblCadastroDeProprietrio);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 782, 962, 14);
		contentPane.add(separator);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(745, 807, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(868, 807, 89, 23);
		contentPane.add(btnSalvar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 83, 962, 14);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 143, 961, 14);
		contentPane.add(separator_2);
		
		JLabel lblAnimal = new JLabel("Animal:");
		lblAnimal.setBounds(64, 168, 42, 14);
		lblAnimal.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblAnimal);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(70, 205, 36, 14);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(75, 244, 31, 14);
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblSexo);
		
		JLabel lblProprietrio = new JLabel("Propriet\u00E1rio:");
		lblProprietrio.setBounds(434, 168, 71, 14);
		lblProprietrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblProprietrio);
		
		JLabel lblRaa = new JLabel("Ra\u00E7a:");
		lblRaa.setBounds(474, 205, 31, 14);
		lblRaa.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblRaa);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(475, 244, 30, 14);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblPeso);
		
		JLabel lblTemperatura = new JLabel("Temperatura:");
		lblTemperatura.setBounds(28, 281, 78, 14);
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblTemperatura);
		
		JLabel lblQueixa = new JLabel("Queixa:");
		lblQueixa.setBounds(64, 314, 42, 14);
		lblQueixa.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblQueixa);
		
		JLabel lblNomeDoAnimal = new JLabel("Nome do animal - BD");
		lblNomeDoAnimal.setBounds(121, 168, 98, 14);
		lblNomeDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblNomeDoAnimal);
		
		JLabel lblIdadeDoAnimal = new JLabel("Idade do animal - BD");
		lblIdadeDoAnimal.setBounds(121, 205, 99, 14);
		lblIdadeDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblIdadeDoAnimal);
		
		JLabel lblSexoDoAnimal = new JLabel("Sexo do animal - BD");
		lblSexoDoAnimal.setBounds(121, 244, 95, 14);
		lblSexoDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblSexoDoAnimal);
		
		JLabel lblTemperaturaDoAnimal = new JLabel("Temperatura do animal - BD");
		lblTemperaturaDoAnimal.setBounds(121, 281, 133, 14);
		lblTemperaturaDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblTemperaturaDoAnimal);
		
		JLabel lblProprietrioDoAnimal = new JLabel("Propriet\u00E1rio do animal - BD");
		lblProprietrioDoAnimal.setBounds(523, 168, 127, 14);
		lblProprietrioDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblProprietrioDoAnimal);
		
		JLabel lblRaaDoAnimal = new JLabel("Ra\u00E7a do animal - BD");
		lblRaaDoAnimal.setBounds(523, 205, 95, 14);
		lblRaaDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblRaaDoAnimal);
		
		JLabel lblPesoDoAnimal = new JLabel("Peso do animal - BD");
		lblPesoDoAnimal.setBounds(523, 244, 94, 14);
		lblPesoDoAnimal.setFont(new Font("Tahoma", Font.ITALIC, 11));
		contentPane.add(lblPesoDoAnimal);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(105, 449, 791, 308);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Dados da Consulta", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblAnamnese = new JLabel("Anamnese");
		lblAnamnese.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAnamnese.setBounds(21, 22, 60, 14);
		panel.add(lblAnamnese);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(21, 47, 730, 76);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblUsarEsseJlabel = new JLabel("Usar esse Jlabel para descrever anamnese no DB.");
		lblUsarEsseJlabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblUsarEsseJlabel.setBounds(10, 11, 240, 14);
		panel_5.add(lblUsarEsseJlabel);
		
		JLabel lblDiagnstico = new JLabel("Diagn\u00F3stico");
		lblDiagnstico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDiagnstico.setBounds(21, 151, 66, 14);
		panel.add(lblDiagnstico);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(21, 176, 730, 76);
		panel.add(panel_6);
		
		JLabel lblUsarEsseJlabel_1 = new JLabel("Usar esse Jlabel para descrever diagnostico no DB.");
		lblUsarEsseJlabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblUsarEsseJlabel_1.setBounds(10, 11, 245, 14);
		panel_6.add(lblUsarEsseJlabel_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Procedimentos", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo.setBounds(21, 27, 27, 14);
		panel_1.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(55, 24, 122, 17);
		panel_1.add(comboBox);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescrio.setBounds(203, 27, 58, 14);
		panel_1.add(lblDescrio);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(634, 23, 89, 23);
		panel_1.add(btnAdicionar);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(269, 23, 349, 23);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adicionar descri\u00E7\u00E3o neste Jlabel - DB");
		lblNewLabel.setBounds(0, 0, 343, 14);
		panel_7.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		table = new JTable();
		table.setBounds(47, 86, 676, 170);
		panel_1.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(724, 86, 17, 170);
		panel_1.add(scrollBar);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Exames", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Hist\u00F3rico", null, panel_3, null);
		panel_3.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(48, 28, 676, 221);
		panel_3.add(table_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(725, 28, 17, 221);
		panel_3.add(scrollBar_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(116, 314, 775, 121);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblQueixaDoProprietrio = new JLabel("Queixa do propriet\u00E1rio - BD");
		lblQueixaDoProprietrio.setBounds(10, 11, 131, 14);
		panel_4.add(lblQueixaDoProprietrio);
		lblQueixaDoProprietrio.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblInserirNomeDo = new JLabel("Inserir Nome do Dr. aqui - DB");
		lblInserirNomeDo.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblInserirNomeDo.setBounds(733, 108, 140, 14);
		contentPane.add(lblInserirNomeDo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVoltar.setBounds(626, 807, 89, 23);
		contentPane.add(btnVoltar);
	}
}
