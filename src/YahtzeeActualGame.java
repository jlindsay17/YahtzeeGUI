/**
 * This class performs the game operation while there are 5 dice in play
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class YahtzeeActualGame extends JFrame{
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JPanel actualGamePanel;
    private JLabel dice1Label;
    private JLabel dice2Label;
    private JLabel dice3Label;
    private JLabel dice4Label;
    private JLabel dice5Label;
    private JButton rulesButton;
    private JButton scorecardButton;
    private JButton rollButton;

    public YahtzeeActualGame (String title) {
        super(title);

        dice1Label.setIcon(new ImageIcon("src/7-sidedsmall.png"));
        dice2Label.setIcon(new ImageIcon("src/10-sided.png"));
        dice3Label.setIcon(new ImageIcon("src/11-sided.png"));
        dice4Label.setIcon(new ImageIcon("src/12-sided.png"));
        dice5Label.setIcon(new ImageIcon("src/9-sided.png"));

        dice1Label.setSize(10, 10);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(actualGamePanel);
        this.pack();

        //BUTTON LISTENERS

        rulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame rulesFrame = new RulesForm("RULES");
                rulesFrame.setVisible(true);
                rulesFrame.setSize(300, 250);
            }
        });

        scorecardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO add if statements
                JFrame scoreCard6Frame = new Scorecard6D("Scorecard");
                scoreCard6Frame.setVisible(true);
            }
        });

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rollCount = 0;
                if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected() && checkBox4.isSelected() && checkBox5.isSelected()){
                    rollCount = 10;
                }
                else{
                    while (rollCount < 3){
                        if (!checkBox1.isSelected()){
                            //roll dice 1
                        }
                        if (!checkBox2.isSelected()){
                            //roll dice 2
                        }
                        if (!checkBox3.isSelected()){
                            //roll dice 3
                        }
                        if (!checkBox4.isSelected()){
                            //roll dice 4
                        }
                        if (!checkBox5.isSelected()){
                            //roll dice 5
                        }
                        rollCount++;
                    }
                }
            }
        });
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Initializes 5 dice objects
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();
        Dice d4 = new Dice();
        Dice d5 = new Dice();

        //Initial roll so dice have different starting values
        d1.rollDice(d1);
        d2.rollDice(d2);
        d3.rollDice(d3);
        d4.rollDice(d4);
        d5.rollDice(d5);

        System.out.println(d1.getSideUp());
        System.out.println(d2.getSideUp());
        System.out.println(d3.getSideUp());
        System.out.println(d4.getSideUp());
        System.out.println(d5.getSideUp());

    }
}
