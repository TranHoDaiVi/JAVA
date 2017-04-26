import java.awt.*;
import java.awt.event.*;
import java.awt.Event.*;
public class AWTCounter extends Frame implements ActionListener {

		private Label lblCount;
		private TextField tfCount;
		private Button btnCount;
		private int count = 0; 
// cài đặt các thuộc tính
		public AWTCounter (){
			setLayout(new FlowLayout());
			// label
			lblCount = new Label("Counter");
			add(lblCount);
			// text field
			tfCount = new TextField("0",10);
			tfCount.setEditable(false);// thiet lap thuoc tinh chi duoc doc
			add(tfCount);
			//Button
			btnCount = new Button("Count");
			add(btnCount);
			// se chay ham addActionListener khi clicked vao button
			btnCount.addActionListener(this);	
			setTitle("AWTCounter");
			setSize(250, 100);
			System.out.println(this);
			System.out.println(lblCount);
			System.out.println(tfCount);
			System.out.println(btnCount);
			setVisible(true); 
			System.out.println(this);
			System.out.println(lblCount);
			System.out.println(tfCount);
			System.out.println(btnCount);
		}
		 public void actionPerformed(ActionEvent evt) {
		     // tang gia tri 
			 ++count;
		      // hien thi gia tri tren textfield
		      tfCount.setText(count + ""); // chuyen doi in sang string
		   }

	public static void main(String[] args) {
		AWTCounter app = new AWTCounter();

	}

}
