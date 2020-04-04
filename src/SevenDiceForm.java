/**
 * This class performs the game operation while there are 7 dice in play
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SevenDiceForm extends JFrame {
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JButton rulesButton7;
    private JButton rollButton7;
    private JButton scorecardButton7;
    private JPanel sevenDicePanel;
    private JLabel dice1Label;
    private JLabel dice2Label;
    private JLabel dice3Label;
    private JLabel dice4Label;
    private JLabel dice5Label;
    private JLabel dice6Label;
    private JLabel dice7Label;

    public SevenDiceForm (String title){
        super(title);


        dice1Label.setIcon(new ImageIcon("src/9-sided.png"));
        dice2Label.setIcon(new ImageIcon("src/10-sided.png"));
        dice3Label.setIcon(new ImageIcon("src/11-sided.png"));
        dice4Label.setIcon(new ImageIcon("src/12-sided.png"));
        dice5Label.setIcon(new ImageIcon("src/9-sided.png"));
        dice6Label.setIcon(new ImageIcon("src/9-sided.png"));
        dice7Label.setIcon(new ImageIcon("src/9-sided.png"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(sevenDicePanel);
        this.pack();

        rulesButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame rulesFrame = new RulesForm("RULES");
                rulesFrame.setVisible(true);
                rulesFrame.setSize(300, 250);
            }
        });
        rollButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        scorecardButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame scoreCard6Frame = new Scorecard6D("Scorecard");
                scoreCard6Frame.setVisible(true);
            }
        });
    }
}
