import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame implements ActionListener {
	private Label lbinput;
	private Label lboutput;
	private TextField tfinput;
	private TextField tfoutput;
	private int sum;
	
	public AWTAccumulator (){
		
		setLayout(new FlowLayout());
		
		//Label dau vao`
		lbinput = new Label("Nhập một số nguyên: ");
		add(lbinput);
		// text field dau vao
		tfinput = new TextField(15);
		add(tfinput);
		
		// khi nhap 1 so vao tfinput
		// bam Enter se goi ham xử lý actionPerformed()
		tfinput.addActionListener(this);
		
		// label dau ra
		lboutput = new Label("      Số tích lũy: ");
		add(lboutput); 
		
		// text field dau ra
		tfoutput = new TextField(10);
		tfoutput.setEditable(false); // chi duoc doc
		add(tfoutput);
		
		setTitle("AWTAccumlator");
		setSize(350, 120);
		setVisible(true);
		
	}
	 public void actionPerformed(ActionEvent evtint) {
	      // lấy chuỗi nhập vào textfield input, chuyển thành kiểu 
	      int numberIn = Integer.parseInt(tfinput.getText());
	      sum += numberIn;      // Tich luy vao bien sum
	      tfinput.setText("");  // xoa chuoi trong tfinput
	      tfoutput.setText(sum + ""); // hien thi bien sum ra textfield dau ra
	                                  // chuyen int thanh chuoi
	   }

	public static void main(String[] args) {
		AWTAccumulator app = new AWTAccumulator();
	}

}
