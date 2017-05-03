import java.awt.*;
import java.awt.event.*;
 

public class KeyEventandKeyListenerInterface extends Frame implements KeyListener {
   private TextField tfInput;
   private TextArea taDisplay; 
 
  
   public KeyEventandKeyListenerInterface() {
      setLayout(new FlowLayout());
 
      add(new Label("Enter Text: "));
      tfInput = new TextField(10);
      add(tfInput);
      taDisplay = new TextArea(5, 40);
      add(taDisplay);
 
      tfInput.addKeyListener(this);

 
      setTitle("KeyEvent Demo"); 
      setSize(400, 200);         
      setVisible(true);          
   }
 

   public static void main(String[] args) {
      new KeyEventandKeyListenerInterface(); 
   }
 

   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
 
   public void keyPressed(KeyEvent evt) { }
   public void keyReleased(KeyEvent evt) { }
}