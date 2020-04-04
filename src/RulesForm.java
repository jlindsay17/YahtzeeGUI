import javax.swing.*;

public class RulesForm extends JFrame {
    private JTextPane youWillRoll5TextPane;
    private JPanel rulesPanel;

    public RulesForm (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(rulesPanel);
        this.pack();
    }
}
