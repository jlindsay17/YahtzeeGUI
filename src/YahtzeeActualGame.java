/**
 * This class performs the game operation while there are 5 dice in play
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.FileNotFoundException;
import java.util.Random;

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
    private JScrollBar scrollBar1;
    private static Dice d1;
    private static Dice d2;
    private static Dice d3;
    private static Dice d4;
    private static Dice d5;

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

        //Initial Dice Roll
//        d1.rollDice(d1);
//        System.out.println(d1.getSideUp());
//        d2.rollDice(d2);
//        System.out.println(d2.getSideUp());
//        d3.rollDice(d3);
//        System.out.println(d3.getSideUp());
//        d4.rollDice(d4);
//        System.out.println(d4.getSideUp());
//        d5.rollDice(d5);
//        System.out.println(d5.getSideUp());

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

                        rollCount++;
                    }
                }
            }
        });
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {

            }
        });
    }

    public void rollDiceImages(){
        if (!checkBox1.isSelected()){
            //roll dice 1
            Random rand1 = new Random();
            int randInt = rand1.nextInt(12) + 1;
            if (randInt == 1){
                dice1Label.setIcon(new ImageIcon("src/1-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 2){
                dice1Label.setIcon(new ImageIcon("src/2-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 3){
                dice1Label.setIcon(new ImageIcon("src/3-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 4){
                dice1Label.setIcon(new ImageIcon("src/4-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 5){
                dice1Label.setIcon(new ImageIcon("src/5-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 6){
                dice1Label.setIcon(new ImageIcon("src/6-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 7){
                dice1Label.setIcon(new ImageIcon("src/7-sidedsmall.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 8){
                dice1Label.setIcon(new ImageIcon("src/-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 9){
                dice1Label.setIcon(new ImageIcon("src/9-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 10){
                dice1Label.setIcon(new ImageIcon("src/10-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 11){
                dice1Label.setIcon(new ImageIcon("src/11-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 12){
                dice1Label.setIcon(new ImageIcon("src/12-sided.png"));
                actualGamePanel.setVisible(true);
            }

        }
        if (!checkBox2.isSelected()){
            //roll dice 2
            Random rand1 = new Random();
            int randInt = rand1.nextInt(12) + 1;
            if (randInt == 1){
                dice2Label.setIcon(new ImageIcon("src/1-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 2){
                dice2Label.setIcon(new ImageIcon("src/2-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 3){
                dice2Label.setIcon(new ImageIcon("src/3-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 4){
                dice2Label.setIcon(new ImageIcon("src/4-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 5){
                dice2Label.setIcon(new ImageIcon("src/5-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 6){
                dice2Label.setIcon(new ImageIcon("src/6-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 7){
                dice1Label.setIcon(new ImageIcon("src/7-sidedsmall.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 8){
                dice2Label.setIcon(new ImageIcon("src/-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 9){
                dice1Label.setIcon(new ImageIcon("src/9-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 10){
                dice2Label.setIcon(new ImageIcon("src/10-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 11){
                dice2Label.setIcon(new ImageIcon("src/11-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 12){
                dice2Label.setIcon(new ImageIcon("src/12-sided.png"));
                actualGamePanel.setVisible(true);
            }

        }
        if (!checkBox3.isSelected()){
            //roll dice 3
            Random rand1 = new Random();
            int randInt = rand1.nextInt(12) + 1;
            if (randInt == 1){
                dice3Label.setIcon(new ImageIcon("src/1-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 2){
                dice3Label.setIcon(new ImageIcon("src/2-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 3){
                dice3Label.setIcon(new ImageIcon("src/3-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 4){
                dice3Label.setIcon(new ImageIcon("src/4-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 5){
                dice3Label.setIcon(new ImageIcon("src/5-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 6){
                dice3Label.setIcon(new ImageIcon("src/6-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 7){
                dice3Label.setIcon(new ImageIcon("src/7-sidedsmall.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 8){
                dice3Label.setIcon(new ImageIcon("src/-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 9){
                dice3Label.setIcon(new ImageIcon("src/9-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 10){
                dice3Label.setIcon(new ImageIcon("src/10-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 11){
                dice3Label.setIcon(new ImageIcon("src/11-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 12){
                dice3Label.setIcon(new ImageIcon("src/12-sided.png"));
                actualGamePanel.setVisible(true);
            }
        }
        if (!checkBox4.isSelected()){
            //roll dice 4
            Random rand1 = new Random();
            int randInt = rand1.nextInt(12) + 1;
            if (randInt == 1){
                dice4Label.setIcon(new ImageIcon("src/1-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 2){
                dice4Label.setIcon(new ImageIcon("src/2-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 3){
                dice4Label.setIcon(new ImageIcon("src/3-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 4){
                dice4Label.setIcon(new ImageIcon("src/4-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 5){
                dice4Label.setIcon(new ImageIcon("src/5-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 6){
                dice4Label.setIcon(new ImageIcon("src/6-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 7){
                dice4Label.setIcon(new ImageIcon("src/7-sidedsmall.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 8){
                dice4Label.setIcon(new ImageIcon("src/-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 9){
                dice4Label.setIcon(new ImageIcon("src/9-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 10){
                dice4Label.setIcon(new ImageIcon("src/10-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 11){
                dice4Label.setIcon(new ImageIcon("src/11-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 12){
                dice4Label.setIcon(new ImageIcon("src/12-sided.png"));
                actualGamePanel.setVisible(true);
            }
        }
        if (!checkBox5.isSelected()){
            //roll dice 5
            Random rand1 = new Random();
            int randInt = rand1.nextInt(12) + 1;
            if (randInt == 1){
                dice5Label.setIcon(new ImageIcon("src/1-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 2){
                dice5Label.setIcon(new ImageIcon("src/2-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 3){
                dice5Label.setIcon(new ImageIcon("src/3-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 4){
                dice5Label.setIcon(new ImageIcon("src/4-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 5){
                dice5Label.setIcon(new ImageIcon("src/5-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 6){
                dice5Label.setIcon(new ImageIcon("src/6-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 7){
                dice5Label.setIcon(new ImageIcon("src/7-sidedsmall.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 8){
                dice5Label.setIcon(new ImageIcon("src/-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 9){
                dice5Label.setIcon(new ImageIcon("src/9-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 10){
                dice5Label.setIcon(new ImageIcon("src/10-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 11){
                dice5Label.setIcon(new ImageIcon("src/11-sided.png"));
                actualGamePanel.setVisible(true);
            }
            if (randInt == 12){
                dice5Label.setIcon(new ImageIcon("src/12-sided.png"));
                actualGamePanel.setVisible(true);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Initializes 5 dice objects


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
