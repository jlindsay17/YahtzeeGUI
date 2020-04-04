import javax.swing.*;

public class Scorecard6D extends JFrame {
    private JPanel sixSideDiceScorecardD;
    private JLabel upperScorecardLabel;
    private JLabel acesLabel;
    private JLabel twosLabel;
    private JLabel threesLabel;
    private JLabel foursLabel;
    private JLabel fivesLabel;
    private JLabel sixesLabel;
    private JLabel lowerScorecardLabel;
    private JLabel threeKindLabel;
    private JLabel fourKindLabel;
    private JLabel fullHouseLabel;
    private JLabel smallStraightLabel;
    private JLabel largeStraightLabel;
    private JLabel yahtzeeLabel;
    private JLabel chanceLabel;
    private JLabel bonusLabel;
    private JLabel acesScoreLabel;
    private JLabel twosScoreLabel;
    private JLabel threesScoreLabel;
    private JLabel foursScoreLabel;
    private JLabel fivesScoreLabel;
    private JLabel sixesScoreLabel;
    private JLabel threeKindScoreLabel;
    private JLabel fourKindScoreLabel;
    private JLabel fullHouseScoreLabel;
    private JLabel smallStraightScoreLabel;
    private JLabel largeStraightScoreLabel;
    private JLabel yahtzeeScoreLabel;
    private JLabel chanceScoreLabel;
    private JLabel bonusScoreLabel;
    private JLabel totalScoreLabel;
    private JLabel totalScore;

    public Scorecard6D (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(sixSideDiceScorecardD);
        this.pack();
    }
}
