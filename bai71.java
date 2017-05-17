import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bai71 {

	private JFrame frmHnhTrn;
	private JTextField txtBK;
	private JTextField txtCV;
	private JTextField txtDT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai71 window = new bai71();
					window.frmHnhTrn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bai71() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHnhTrn = new JFrame();
		frmHnhTrn.setTitle("Hình Tròn");
		frmHnhTrn.setBounds(100, 100, 450, 300);
		frmHnhTrn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHnhTrn.getContentPane().setLayout(null);
		
		JLabel lblTnhChuVi = new JLabel("Tính chu vi và diện tích hình tròn");
		lblTnhChuVi.setBounds(81, 12, 287, 42);
		frmHnhTrn.getContentPane().add(lblTnhChuVi);
		
		JLabel lblBnKnh = new JLabel("Bán Kính");
		lblBnKnh.setBounds(26, 66, 96, 23);
		frmHnhTrn.getContentPane().add(lblBnKnh);
		
		JLabel lblChuVi = new JLabel("Chu Vi");
		lblChuVi.setBounds(26, 111, 96, 23);
		frmHnhTrn.getContentPane().add(lblChuVi);
		
		JLabel lblDinTch = new JLabel("Diện tích");
		lblDinTch.setBounds(26, 161, 96, 23);
		frmHnhTrn.getContentPane().add(lblDinTch);
		
		txtBK = new JTextField();
		txtBK.setBounds(159, 68, 114, 19);
		frmHnhTrn.getContentPane().add(txtBK);
		txtBK.setColumns(10);
		
		txtCV = new JTextField();
		txtCV.setEditable(false);
		txtCV.setColumns(10);
		txtCV.setBounds(159, 113, 114, 19);
		frmHnhTrn.getContentPane().add(txtCV);
		
		txtDT = new JTextField();
		txtDT.setEditable(false);
		txtDT.setColumns(10);
		txtDT.setBounds(159, 163, 114, 19);
		frmHnhTrn.getContentPane().add(txtDT);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtBK.getText());
				double cv = 2*a*Math.PI;
				double dt = a*a*Math.PI;
				txtCV.setText(String.format("%2f", cv));
				txtDT.setText(String.format("%2f", dt));
			}
		});
		btnNewButton.setBounds(156, 218, 117, 25);
		frmHnhTrn.getContentPane().add(btnNewButton);
	}
}
