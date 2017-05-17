import java.awt.EventQueue;

import javax.management.modelmbean.ModelMBean;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bai73 {

	private JFrame frmTnhGiaiTha;
	private JTextField txtx;
	private JTextField txtKq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai73 window = new bai73();
					window.frmTnhGiaiTha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bai73() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhGiaiTha = new JFrame();
		frmTnhGiaiTha.setTitle("tính giai thừa");
		frmTnhGiaiTha.setBounds(100, 100, 450, 300);
		frmTnhGiaiTha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhGiaiTha.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tính giai thừa của x");
		lblNewLabel.setBounds(150, 12, 156, 31);
		frmTnhGiaiTha.getContentPane().add(lblNewLabel);
		
		JLabel lblNhpX = new JLabel("Nhập x:");
		lblNhpX.setBounds(30, 63, 84, 23);
		frmTnhGiaiTha.getContentPane().add(lblNhpX);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setBounds(30, 111, 84, 23);
		frmTnhGiaiTha.getContentPane().add(lblKtQu);
		
		txtx = new JTextField();
		txtx.setBounds(132, 65, 114, 19);
		frmTnhGiaiTha.getContentPane().add(txtx);
		txtx.setColumns(10);
		
		txtKq = new JTextField();
		txtKq.setEditable(false);
		txtKq.setColumns(10);
		txtKq.setBounds(132, 113, 114, 19);
		frmTnhGiaiTha.getContentPane().add(txtKq);
		
		JButton btnTnh = new JButton("Tính");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long x = Integer.parseInt(txtx.getText());
				long kq = tinhgiaithua(x);
				txtKq.setText(kq +"");
			}
		});
		btnTnh.setBounds(129, 199, 117, 25);
		frmTnhGiaiTha.getContentPane().add(btnTnh);
		
		JButton btnNhpLaij = new JButton("Nhập lại");
		btnNhpLaij.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNhpLaij.setBounds(284, 199, 117, 25);
		frmTnhGiaiTha.getContentPane().add(btnNhpLaij);
	}
private long tinhgiaithua(long x) {
	long kq=1;
	if (x==1){
		return 1;
	}
	if (x<0){
		return -1;
	}
	for (int i=1;1<=x;i++){
		kq=kq*i;
	}
	return kq;
}

}
