package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class Tela4 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela4 frame = new Tela4();
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
	public Tela4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospitalVeterinrioUniversitrio = new JLabel("HOSPITAL VETERIN\u00C1RIO UNIVERSIT\u00C1RIO - UEMA");
		lblHospitalVeterinrioUniversitrio.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblHospitalVeterinrioUniversitrio.setBounds(22, 11, 664, 61);
		contentPane.add(lblHospitalVeterinrioUniversitrio);
		
		JLabel lblCadastroDeProprietrio = new JLabel("Consulta - Fila de Atendimento");
		lblCadastroDeProprietrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeProprietrio.setBounds(32, 93, 256, 39);
		contentPane.add(lblCadastroDeProprietrio);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 443, 962, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 83, 962, 14);
		contentPane.add(separator_1);
		
		table = new JTable();
		table.setBounds(66, 196, 845, 190);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(912, 196, 17, 190);
		contentPane.add(scrollBar);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 143, 961, 14);
		contentPane.add(separator_2);
		
		JButton button = new JButton("Cancelar");
		button.setBounds(745, 468, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Voltar");
		button_1.setBounds(626, 468, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Salvar");
		button_2.setBounds(868, 468, 89, 23);
		contentPane.add(button_2);
	}
}
