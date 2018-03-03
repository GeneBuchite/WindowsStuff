package MDI;

import javax.swing.JButton;

public class FillZero extends javax.swing.JFrame {
    
    public FillZero() {
      System.out.println("FillZero Initialized");
      JButton btnGo = new JButton("Go Man Go");
      add(btnGo);
      
    }

    /**
     * @param argublic FillZeros the command line arguments
     */
    public static void main(String[] args) {
        FillZero fx = new FillZero();
        
        // TODO code application logic here
    }
    
}