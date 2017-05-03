import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class ANamedInnerClassasEventListener extends Frame {
   // This class is NOT a ActionListener, hence, it does not implement ActionListener interface
 
   // The event-handler actionPerformed() needs to access these "private" variables
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   // Constructor to setup the GUI components and event handlers
   public ANamedInnerClassasEventListener () {
      setLayout(new FlowLayout());  // "super" Frame sets to FlowLayout
      add(new Label("Counter"));    // An anonymous instance of Label
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   // read-only
      add(tfCount);                 // "super" Frame adds tfCount
 
      btnCount = new Button("Count");
      add(btnCount);                // "super" Frame adds btnCount
 
      // Construct an anonymous instance of BtnCountListener (a named inner class).
      // btnCount adds this instance as a ActionListener.
      btnCount.addActionListener(new BtnCountListener());
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 

   public static void main(String[] args) {
      new ANamedInnerClassasEventListener();
   }
 

   private class BtnCountListener implements ActionListener {
 
      public void actionPerformed(ActionEvent evt) {
         ++count;
         tfCount.setText(count + "");
      }
   }
}