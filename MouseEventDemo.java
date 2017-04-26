import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {
	   private TextField tfX; 
	   private TextField tfY; 
	   private Label lbx;
	   public MouseEventDemo() {
		setLayout(new FlowLayout()); 
		// them label x = cach binh thuong
		lbx = new Label("X-click");
		add(lbx);
		//textfield X
		tfX = new TextField(10); 
	    tfX.setEditable(false);  // chi doc
	    add(tfX); 
	    // them label y theo cach gon hon
	    add(new Label("Y-Click: "));
	    //textfield Y
		tfY = new TextField(10); 
	    tfY.setEditable(false);  // chi doc
	    add(tfY); 
	    
	    addMouseListener(this);
	    setTitle("MouseEvent Demo"); 
	    setSize(350, 100);          
	    setVisible(true);           
	   }
	   // được gọi khi nhâp chuột
	   public void mouseClicked(MouseEvent evt) {
	      tfX.setText(evt.getX() + "");
	      tfY.setText(evt.getY() + "");
	   }
	   
	 //Không sử dụng, nhưng cần phải cung cấp hàm trống để biên dịch
	   public void mousePressed(MouseEvent evt) { }
	   public void mouseReleased(MouseEvent evt) { }
	   public void mouseEntered(MouseEvent evt) { }
	   public void mouseExited(MouseEvent evt) { }
	
	public static void main(String[] args) {
		new MouseEventDemo();
	}

}
