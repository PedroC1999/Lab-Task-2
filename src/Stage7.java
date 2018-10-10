import javax.swing.JOptionPane;

public class Stage7 {
    public static void main(String[] args) {
        //Dialogue asking for user input, save as string
        String name = JOptionPane.showInputDialog("What is your name?");
        //Info boc displaying greeting using saved string as name
        JOptionPane.showInternalMessageDialog(null,name + ", I'm saying hello...");
    }
}