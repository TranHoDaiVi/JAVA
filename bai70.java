import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bai70 {

	private JFrame frmTnhGiTr;
	private JTextField txtsl;
	private JTextField txtdg;
	private JTextField txttt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai70 window = new bai70();
					window.frmTnhGiTr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bai70() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhGiTr = new JFrame();
		frmTnhGiTr.setTitle("Tính giá trị hóa đơn");
		frmTnhGiTr.setBounds(100, 100, 450, 300);
		frmTnhGiTr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhGiTr.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính giá trị hóa đơn");
		lblNewLabel.setBounds(149, 33, 154, 31);
		frmTnhGiTr.getContentPane().add(lblNewLabel);
		
		JLabel lblSLng = new JLabel("Số lượng");
		lblSLng.setBounds(12, 76, 154, 31);
		frmTnhGiTr.getContentPane().add(lblSLng);
		
		JLabel lblnGi = new JLabel("Đơn giá");
		lblnGi.setBounds(12, 104, 154, 31);
		frmTnhGiTr.getContentPane().add(lblnGi);
		
		JLabel lblThnhTin = new JLabel("Thành tiền");
		lblThnhTin.setBounds(12, 141, 154, 31);
		frmTnhGiTr.getContentPane().add(lblThnhTin);
		
		txtsl = new JTextField();
		txtsl.setBounds(149, 82, 114, 19);
		frmTnhGiTr.getContentPane().add(txtsl);
		txtsl.setColumns(10);
		
		txtdg = new JTextField();
		txtdg.setColumns(10);
		txtdg.setBounds(149, 110, 114, 19);
		frmTnhGiTr.getContentPane().add(txtdg);
		
		txttt = new JTextField();
		txttt.setEditable(false);
		txttt.setColumns(10);
		txttt.setBounds(149, 147, 114, 19);
		frmTnhGiTr.getContentPane().add(txttt);
		
		JButton btnNewButton = new JButton("tính tiền");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtsl.getText());
				int b = Integer.parseInt(txtdg.getText());
				int c= a*b;
				txttt.setText(c+"");
			}
		});
		btnNewButton.setBounds(146, 206, 117, 25);
		frmTnhGiTr.getContentPane().add(btnNewButton);
	}

}
