package br.uema.pecs.veterinaria.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PrincipalForm extends JFrame {
    private JPanel contentPane;
    private JButton button;
    JSeparator separator;

    public PrincipalForm() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 710, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHospitalVeterinrioUniversitrio = new JLabel("HOSPITAL VETERIN\u00C1RIO UNIVERSIT\u00C1RIO - UEMA");
        lblHospitalVeterinrioUniversitrio.setFont(new Font("Tahoma", Font.PLAIN, 29));
        lblHospitalVeterinrioUniversitrio.setBounds(22, 11, 664, 61);
        contentPane.add(lblHospitalVeterinrioUniversitrio);

        separator = new JSeparator();
        separator.setBounds(23, 83, 650, 14);
        contentPane.add(separator);

        button = new JButton("CADASTROS");
        button.setBounds(150, 120, 180, 70);
        button.addActionListener(e -> {
            ProprietarioForm proprietarioForm = new ProprietarioForm();
            proprietarioForm.setVisible(true);
        });
        contentPane.add(button);

        button = new JButton("CONSULTAS");
        button.setBounds(350, 120, 180, 70);
        button.addActionListener(e -> {
            ConsultaForm consultasForm = new ConsultaForm();
            consultasForm.setVisible(true);
        });
        contentPane.add(button);

        button = new JButton("TRIAGENS");
        button.setBounds(150, 200, 180, 70);
        button.addActionListener(e -> {
            TriagemForm triagemForm = new TriagemForm();
            triagemForm.setVisible(true);
        });
        contentPane.add(button);

        button = new JButton("HISTÓRICOS");
        button.setBounds(350, 200, 180, 70);
        button.addActionListener(e -> {
            HistoricoForm historicoForm = new HistoricoForm();
            historicoForm.setVisible(true);
        });
        contentPane.add(button);

    }
}
