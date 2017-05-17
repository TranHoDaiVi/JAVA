import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bai72 {

	private JFrame frmTnhTinin;
	private JTextField txtCu;
	private JTextField txtMoi;
	private JTextField txtTong;
	private JTextField txtTt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai72 window = new bai72();
					window.frmTnhTinin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bai72() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhTinin = new JFrame();
		frmTnhTinin.setTitle("Tính tiền điện");
		frmTnhTinin.setBounds(100, 100, 520, 357);
		frmTnhTinin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhTinin.getContentPane().setLayout(null);
		
		JLabel lblTnhTinin = new JLabel("Tính tiền điện theo chỉ số đồng hồ");
		lblTnhTinin.setBounds(76, 29, 307, 30);
		frmTnhTinin.getContentPane().add(lblTnhTinin);
		
		JLabel lblChSC = new JLabel("Chỉ số cũ");
		lblChSC.setBounds(36, 71, 97, 21);
		frmTnhTinin.getContentPane().add(lblChSC);
		
		JLabel lblChSMi = new JLabel("Chỉ số mới");
		lblChSMi.setBounds(36, 112, 97, 21);
		frmTnhTinin.getContentPane().add(lblChSMi);
		
		JLabel lblTngSin = new JLabel("Tổng số điện");
		lblTngSin.setBounds(36, 169, 97, 21);
		frmTnhTinin.getContentPane().add(lblTngSin);
		
		JLabel lblThnhTin = new JLabel("Thành tiền");
		lblThnhTin.setBounds(36, 225, 97, 21);
		frmTnhTinin.getContentPane().add(lblThnhTin);
		
		JButton btnTnh = new JButton("TÍnh");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(txtCu.getText());
				float b = Float.parseFloat(txtMoi.getText());
				float c = b-a;
				float d = tinhtien(c);
				txtTong.setText(String.format("%.2f", c));
				txtTt.setText(String.format("%.2f", d));
				
			}
		});
		btnTnh.setBounds(174, 262, 117, 25);
		frmTnhTinin.getContentPane().add(btnTnh);
		
		txtCu = new JTextField();
		txtCu.setBounds(174, 71, 114, 19);
		frmTnhTinin.getContentPane().add(txtCu);
		txtCu.setColumns(10);
		
		txtMoi = new JTextField();
		txtMoi.setBounds(174, 113, 114, 19);
		txtMoi.setColumns(10);
		frmTnhTinin.getContentPane().add(txtMoi);
		
		txtTong = new JTextField();
		txtTong.setEditable(false);
		txtTong.setBounds(177, 170, 114, 19);
		txtTong.setColumns(10);
		frmTnhTinin.getContentPane().add(txtTong);
		
		txtTt = new JTextField();
		txtTt.setEditable(false);
		txtTt.setBounds(174, 226, 114, 19);
		txtTt.setColumns(10);
		frmTnhTinin.getContentPane().add(txtTt);
	}
	
	private float tinhtien(float tongsodien) {
		float itongsodien = tongsodien;
		float ithanhtien = 	0f;
		if(itongsodien>300){
			ithanhtien += (itongsodien-300)*4000;
			itongsodien = 300;
		}
		if(itongsodien>200){
			ithanhtien += (itongsodien - 200)* 2500;
			itongsodien = 200;
		}
		if ( itongsodien>100){
			ithanhtien += (itongsodien  - 100 ) * 2000;
			itongsodien = 100;
		}
		if ( itongsodien>50){
			ithanhtien += (itongsodien  - 50 ) * 1000;
			itongsodien = 50;
		}
		ithanhtien += itongsodien*500;

		return ithanhtien;
		
	}

}
