import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.omg.CORBA.portable.ValueBase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bai69 {

	private JFrame frmTngS;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai69 window = new bai69();
					window.frmTngS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bai69() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTngS = new JFrame();
		frmTngS.setTitle("Tổng 2 số nguyên");
		frmTngS.setBounds(100, 100, 450, 300);
		frmTngS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTngS.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính tổng 2 số nguyên");
		lblNewLabel.setBounds(136, 31, 174, 34);
		frmTngS.getContentPane().add(lblNewLabel);
		
		JLabel lblSNguynTh = new JLabel("Số nguyên thứ nhất:");
		lblSNguynTh.setBounds(27, 88, 153, 34);
		frmTngS.getContentPane().add(lblSNguynTh);
		
		txt1 = new JTextField();
		txt1.setBounds(198, 96, 158, 19);
		frmTngS.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel label = new JLabel("Số nguyên thứ nhất:");
		label.setBounds(27, 134, 153, 34);
		frmTngS.getContentPane().add(label);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(198, 142, 158, 19);
		frmTngS.getContentPane().add(txt2);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setBounds(27, 180, 153, 34);
		frmTngS.getContentPane().add(lblKtQu);
		
		txt3 = new JTextField();
		txt3.setEditable(false);
		txt3.setColumns(10);
		txt3.setBounds(198, 188, 158, 19);
		frmTngS.getContentPane().add(txt3);
		
		JButton btnNewButton = new JButton("Tổng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(txt1.getText());
			int b = Integer.parseInt(txt2.getText());
			int s = a + b;
			txt3.setText(s+"");
			}
		});
		btnNewButton.setBounds(178, 235, 117, 25);
		frmTngS.getContentPane().add(btnNewButton);
	}
}
