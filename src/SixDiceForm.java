/**
 * This class performs the game operation while there are 6 dice in play
 */
import javax.swing.*;

public class SixDiceForm extends JFrame {
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JButton scorecardButton6;
    private JButton rollButton6;
    private JButton rulesButton6;
    private JPanel sixDicePanel;

    public SixDiceForm (String title){
        super(title);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(sixDicePanel);
        this.pack();

    }
}
