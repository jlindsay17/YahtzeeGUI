import javax.swing.*;

public class Scorecard8D extends JFrame{
    private JLabel upperScorecardLabel;
    private JLabel acesScoreLabel;
    private JLabel twosScoreLabel;
    private JLabel threesScoreLabel;
    private JLabel fourssScoreLabel;
    private JLabel fivesScoreLabel;
    private JLabel sixesScoreLabel;
    private JLabel sevensScoreLabel;
    private JLabel eightsScoreLabel;
    private JLabel lowerScorecardLabel;
    private JLabel fourKindScoreLabel;
    private JLabel threeKindScoreLabel;
    private JLabel fullHouseScoreLabel;
    private JLabel smallStraightScoreLabel;
    private JLabel largeStraightScoreLabel;
    private JLabel yahtzeeScoreLabel;
    private JLabel chanceScoreLabel;
    private JLabel bonusScoreLabel;
    private JLabel oneScore;
    private JLabel twoScore;
    private JLabel threeScore;
    private JLabel fourScore;
    private JLabel fiveScore;
    private JLabel sixScore;
    private JLabel sevenScore;
    private JLabel eightScore;
    private JLabel threeKindScore;
    private JLabel fourKindScore;
    private JLabel fullHouseScore;
    private JLabel smallStraightScore;
    private JLabel largeStraightScore;
    private JLabel yahtzeeScore;
    private JLabel chanceScore;
    private JLabel bonusScore;
    private JPanel eightSidedDiceForm;
    private JLabel totalScoreLabel;
    private JLabel totalScore;

    public Scorecard8D (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(eightSidedDiceForm);
        this.pack();
    }
}
