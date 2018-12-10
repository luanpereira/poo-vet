package br.uema.pecs.veterinaria.view;

import br.uema.pecs.veterinaria.controller.ProprietarioController;
import br.uema.pecs.veterinaria.model.Proprietario;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ProprietarioForm extends JFrame {

    private JPanel contentPane;
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtDtNascimento;
    private JTextField txtCep;
    private JTextField txtLogradouro;
    private JTextField txtNumero;
    private JTextField txtBairro;
    private JTextField txtCelular;
    private JTextField txtFixo;
    private JTextField txtCidade;
    private static ProprietarioForm frame;

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

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(101, 143, 30, 14);
        contentPane.add(lblCpf);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(92, 186, 39, 14);
        contentPane.add(lblNome);

        JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
        lblDataDeNascimento.setBounds(10, 233, 150, 14);
        contentPane.add(lblDataDeNascimento);

        JLabel lblCep = new JLabel("CEP:");
        lblCep.setBounds(101, 277, 30, 14);
        contentPane.add(lblCep);

        JLabel lblLogradouro = new JLabel("Logradouro:");
        lblLogradouro.setBounds(60, 324, 87, 14);
        contentPane.add(lblLogradouro);

        JLabel lblNmero = new JLabel("N\u00FAmero:");
        lblNmero.setBounds(80, 368, 50, 14);
        contentPane.add(lblNmero);

        JLabel lblBairro = new JLabel("Bairro:");
        lblBairro.setBounds(92, 414, 39, 14);
        contentPane.add(lblBairro);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(82, 458, 59, 14);
        contentPane.add(lblEstado);

        JLabel lblCidade = new JLabel("Cidade:");
        lblCidade.setBounds(216, 458, 59, 14);
        contentPane.add(lblCidade);

        JLabel lblCelular = new JLabel("Celular:");
        lblCelular.setBounds(82, 504, 59, 14);
        contentPane.add(lblCelular);

        JLabel lblFixo = new JLabel("Fixo:");
        lblFixo.setBounds(101, 540, 30, 14);
        contentPane.add(lblFixo);

        JSeparator separator = new JSeparator();
        separator.setBounds(23, 570, 962, 14);
        contentPane.add(separator);

        txtNome = new JTextField();
        txtNome.setBounds(136, 183, 349, 20);
        contentPane.add(txtNome);
        txtNome.setColumns(10);

        txtCpf = new JTextField();
        txtCpf.setBounds(136, 143, 349, 20);
        txtCpf.setColumns(10);
        contentPane.add(txtCpf);

        txtDtNascimento = new JTextField();
        txtDtNascimento.setColumns(10);
        txtDtNascimento.setBounds(136, 230, 349, 20);
        contentPane.add(txtDtNascimento);

        txtCep = new JTextField();
        txtCep.setColumns(10);
        txtCep.setBounds(136, 274, 349, 20);
        contentPane.add(txtCep);

        txtLogradouro = new JTextField();
        txtLogradouro.setColumns(10);
        txtLogradouro.setBounds(136, 321, 349, 20);
        contentPane.add(txtLogradouro);

        txtNumero = new JTextField();
        txtNumero.setColumns(10);
        txtNumero.setBounds(136, 365, 349, 20);
        contentPane.add(txtNumero);

        txtBairro = new JTextField();
        txtBairro.setColumns(10);
        txtBairro.setBounds(136, 411, 349, 20);
        contentPane.add(txtBairro);

        JComboBox cmbCidade = new JComboBox();
        cmbCidade.setBounds(275, 455, 220, 20);
        cmbCidade.addItem("--SELECIONE A CIDADE--");
        cmbCidade.addItem("SÃO LUÍS");
        cmbCidade.addItem("IMPERATRIZ");
        cmbCidade.addItem("SÃO JOSÉ DE RIBAMAR");
        cmbCidade.addItem("TIMIN");
        cmbCidade.addItem("CAXIAS");
        cmbCidade.addItem("CODÓ");
        cmbCidade.addItem("PAÇO DO LUMIAR");
        cmbCidade.addItem("ACAILÂNDIA");
        cmbCidade.addItem("BACABAL");
        contentPane.add(cmbCidade);

        txtCelular = new JTextField();
        txtCelular.setColumns(10);
        txtCelular.setBounds(136, 501, 122, 20);
        contentPane.add(txtCelular);

        txtFixo = new JTextField();
        txtFixo.setColumns(10);
        txtFixo.setBounds(133, 539, 122, 20);
        contentPane.add(txtFixo);


        JComboBox cmbEstado = new JComboBox();
        cmbEstado.setBounds(141, 455, 65, 20);
        cmbEstado.addItem("MA");
        contentPane.add(cmbEstado);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(23, 83, 962, 14);
        contentPane.add(separator_1);

        JButton button = new JButton("Cancelar");
        button.setBounds(746, 604, 89, 23);
        contentPane.add(button);

        JButton button_2 = new JButton("Salvar");
        button_2.setBounds(869, 604, 89, 23);
        button_2.addActionListener(e -> {
            JDialog d = new JDialog(this, "Proprietário Animal Sistema", true);
            d.setLocationRelativeTo(this);

            try {

                ProprietarioController proprietarioController = new ProprietarioController();

                Proprietario proprietario = new Proprietario();
                proprietario.setCpf(txtCpf.getText());
                proprietario.setNome(txtNome.getText());

                proprietarioController.salvar(proprietario);

                d.setContentPane(new JOptionPane("Proprietário Cadastrado com Sucesso.",
                        JOptionPane.ERROR_MESSAGE));
                d.pack();
                d.setVisible(true);
            } catch (Exception ex) {
                d.setContentPane(new JOptionPane(ex.getMessage(),
                        JOptionPane.ERROR_MESSAGE));
                d.pack();
                d.setVisible(true);
            }
        });
        contentPane.add(button_2);
    }
}
