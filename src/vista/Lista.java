package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

import modelo.Persona;

public class Lista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombreTextBox;
	private JTextField apellidoTextBox;
	private JTextField edadTextBox;
	private JTextField pesoTextBox;
	private JButton agregarButton;
	private JButton btnBorrar;
	private JButton btnModificar;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	Persona p = new Persona(14554, "Israel", "Quenta", 26, 58);
	private JTextField ciTextBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
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
	public Lista() {
		// table
		table = new JTable();
		model = new DefaultTableModel();
		String titles[] = { "CI", "Nombre", "Apellido", "Edad", "Peso" };
		model.setColumnIdentifiers(titles);
		table.setModel(model);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Formulario");
		setBounds(100, 100, 591, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		nombreTextBox = new JTextField();
		nombreTextBox.setBounds(223, 56, 124, 20);
		contentPane.add(nombreTextBox);
		nombreTextBox.setColumns(10);

		JLabel lblnombre = new JLabel("Nombre:");
		lblnombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblnombre.setBounds(80, 56, 89, 14);
		contentPane.add(lblnombre);

		apellidoTextBox = new JTextField();
		apellidoTextBox.setColumns(10);
		apellidoTextBox.setBounds(223, 87, 124, 20);
		contentPane.add(apellidoTextBox);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setBounds(80, 87, 89, 14);
		contentPane.add(lblApellido);

		edadTextBox = new JTextField();
		edadTextBox.setColumns(10);
		edadTextBox.setBounds(223, 118, 124, 20);
		contentPane.add(edadTextBox);

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setBounds(80, 118, 89, 14);
		contentPane.add(lblEdad);

		pesoTextBox = new JTextField();
		pesoTextBox.setColumns(10);
		pesoTextBox.setBounds(223, 149, 124, 20);
		contentPane.add(pesoTextBox);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setBounds(80, 149, 89, 14);
		contentPane.add(lblPeso);

		agregarButton = new JButton("Agregar");
		agregarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String citxt = ciTextBox.getText();
				String nombretxt = nombreTextBox.getText();
				String apellidotxt = apellidoTextBox.getText();
				String edadtxt = edadTextBox.getText();
				String pesotxt = pesoTextBox.getText();
				Persona np = new Persona(Integer.parseInt(citxt), nombretxt, apellidotxt, Integer.parseInt(edadtxt),
						Integer.parseInt(pesotxt));
				Object[] nuevo = new Object[] { np.getCi(), np.getNombre(), np.getApellido(), np.getEdad(),
						np.getPeso() };
				model.addRow(nuevo);
				ciTextBox.setText("");
				nombreTextBox.setText("");
				apellidoTextBox.setText("");
				edadTextBox.setText("");
				pesoTextBox.setText("");
			}
		});
		agregarButton.setBounds(415, 42, 89, 23);
		contentPane.add(agregarButton);

		btnBorrar = new JButton("Eliminar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeRow(table.getSelectedRow());
			}
		});
		btnBorrar.setBounds(415, 86, 89, 23);
		contentPane.add(btnBorrar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setValueAt(ciTextBox.getText(), table.getSelectedRow(), 0);
				model.setValueAt(nombreTextBox.getText(), table.getSelectedRow(), 1);
				model.setValueAt(apellidoTextBox.getText(), table.getSelectedRow(), 2);
				model.setValueAt(edadTextBox.getText(), table.getSelectedRow(), 3);
				model.setValueAt(pesoTextBox.getText(), table.getSelectedRow(), 4);
				ciTextBox.setText("");
				nombreTextBox.setText("");
				apellidoTextBox.setText("");
				edadTextBox.setText("");
				pesoTextBox.setText("");
			}
		});
		btnModificar.setBounds(415, 131, 89, 23);
		contentPane.add(btnModificar);

		table.setBounds(72, 181, 430, 136);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 195, 430, 136);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);

		ciTextBox = new JTextField();
		ciTextBox.setColumns(10);
		ciTextBox.setBounds(223, 25, 124, 20);
		contentPane.add(ciTextBox);

		JLabel lblCi = new JLabel("CI:");
		lblCi.setHorizontalAlignment(SwingConstants.CENTER);
		lblCi.setBounds(80, 25, 89, 14);
		contentPane.add(lblCi);

	}
}
