/**
 * This class performs the game operation while there are 6 dice in play
 * All comments should apply as seen in "YahtzeeActualGameForm" except with 6 dice
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        scorecardButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame scoreCard6Frame = new Scorecard6D("Scorecard");
                scoreCard6Frame.setVisible(true);
            }
        });
        rollButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rulesButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame rulesFrame = new RulesForm("RULES");
                rulesFrame.setVisible(true);
                rulesFrame.setSize(300, 250);
            }
        });
    }
}
