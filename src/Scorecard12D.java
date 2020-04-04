import javax.swing.*;

public class Scorecard12D extends JFrame {
    private JLabel upperScorecardLabel;
    private JLabel oneScore;
    private JLabel twoScore;
    private JLabel threeScore;
    private JLabel fourScore;
    private JLabel fiveScore;
    private JLabel sixScore;
    private JLabel sevenScore;
    private JLabel eightScore;
    private JLabel nineScore;
    private JLabel tenScore;
    private JLabel elevenScore;
    private JLabel twelveScore;
    private JLabel threeKindScore;
    private JLabel fourKindScore;
    private JLabel fullHouseScore;
    private JLabel smallStraightScore;
    private JLabel largeStraightScore;
    private JLabel yahtzeeScore;
    private JLabel chanceScore;
    private JLabel bonusScore;
    private JPanel twelveSidedDiceForm;
    private JLabel totalScoreLabel;
    private JLabel totalScore;

    public Scorecard12D (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(twelveSidedDiceForm);
        this.pack();
    }
}
