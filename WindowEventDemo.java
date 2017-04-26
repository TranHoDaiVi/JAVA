import java.awt.*;
import java.awt.event.*;
import java.awt.Event.*;
public class WindowEventDemo extends Frame implements ActionListener, WindowListener {

		private Label lblCount;
		private TextField tfCount;
		private Button btnCount;
		private int count = 0; 
// cài đặt các thuộc tính
		public WindowEventDemo (){
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
		    addWindowListener(this);
			setTitle("WindowEventDemo");
			setSize(250, 100);
			System.out.println(this);

			setVisible(true); 

		}
		 public void actionPerformed(ActionEvent evt) {
		     // tang gia tri 
			 ++count;
		      // hien thi gia tri tren textfield
		      tfCount.setText(count + ""); // chuyen doi in sang string
		   }
		   public void windowClosing(WindowEvent evt) {
		      System.exit(0);
		   }
		   //Không sử dụng, nhưng cần phải cung cấp hàm trống để biên dịch
		   public void windowOpened(WindowEvent evt) { }
		   public void windowClosed(WindowEvent evt) { }
		   public void windowIconified(WindowEvent evt) {}
		   public void windowDeiconified(WindowEvent evt) { }
		   public void windowActivated(WindowEvent evt) { }
		   public void windowDeactivated(WindowEvent evt) { }

	public static void main(String[] args) {
		WindowEventDemo app = new WindowEventDemo();

	}

}
