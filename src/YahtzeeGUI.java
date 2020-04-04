import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YahtzeeGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel gameplayPanel;
    private JLabel configMenuLabel;
    private JComboBox dicePerHandCB;
    private JComboBox sidesPerDiceCB;
    private JComboBox rollsPerTurnCB;
    private JButton playButton;
    private JLabel dicePerHandLabel;
    private JLabel sidesPerDiceLabel;
    private JLabel rollsPerTurnLabel;

    public YahtzeeGUI (String title){
        super(title);
        //Add elements to Combo Boxes
        dicePerHandCB.addItem("5");
        dicePerHandCB.addItem("6");
        dicePerHandCB.addItem("7");

        sidesPerDiceCB.addItem("6");
        sidesPerDiceCB.addItem("8");
        sidesPerDiceCB.addItem("12");

        rollsPerTurnCB.addItem("3");
        rollsPerTurnCB.addItem("4");
        rollsPerTurnCB.addItem("5");



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Parses integers from combo boxes to be used as values
                int diceSides = Integer.parseInt(sidesPerDiceCB.getSelectedItem().toString());
                int turnRolls = Integer.parseInt(rollsPerTurnCB.getSelectedItem().toString());
                int diceInHand = Integer.parseInt(dicePerHandCB.getSelectedItem().toString());
                if (diceInHand == 5){
                    JFrame actualGameFrame = new YahtzeeActualGame("YAHTZEE");
                    actualGameFrame.setVisible(true);

                } else if (diceInHand == 6) {
                    JFrame sixDiceFrame = new SixDiceForm("YAHTZEE");
                    sixDiceFrame.setVisible(true);

                }
                else{
                    JFrame sevenDiceFrame = new SevenDiceForm("YAHTZEE");
                    sevenDiceFrame.setVisible(true);

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new YahtzeeGUI("Yahtzee Main Menu");
        frame.setVisible(true);
    }
}
