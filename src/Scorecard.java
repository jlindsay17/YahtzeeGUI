import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scorecard {

    Scanner input = new Scanner(new File("src/yahtzeeConfig.txt"));
    String sidesPerDice = input.nextLine();
    int sidesPerDiceResult = Integer.parseInt(sidesPerDice);

    int upperScorecard[] = new int[sidesPerDiceResult];
    String upperScorecardStrings[] = new String[sidesPerDiceResult];

    private int oneCount;
    private boolean oneKept;
    private int twoCount;
    private boolean twoKept;

    public boolean isFullHouseKept() {
        return fullHouseKept;
    }
    //Upper Scorecard Variables
    private int threeCount;
    private boolean threeKept;
    private int fourCount;
    private boolean fourKept;
    private int fiveCount;
    private boolean fiveKept;
    private int sixCount;
    private boolean sixKept;

    private int sevenCount;
    private boolean sevenKept;

    public int getSevenCount() {
        return sevenCount;
    }

    public void setSevenCount(int sevenCount) {
        this.sevenCount = sevenCount;
    }

    public boolean isSevenKept() {
        return sevenKept;
    }

    public void setSevenKept(boolean sevenKept) {
        this.sevenKept = sevenKept;
    }

    public int getEightCount() {
        return eightCount;
    }

    public void setEightCount(int eightCount) {
        this.eightCount = eightCount;
    }

    public boolean isEightKept() {
        return eightKept;
    }

    public void setEightKept(boolean eightKept) {
        this.eightKept = eightKept;
    }

    public int getNineCount() {
        return nineCount;
    }

    public void setNineCount(int nineCount) {
        this.nineCount = nineCount;
    }

    public boolean isNineKept() {
        return nineKept;
    }

    public void setNineKept(boolean nineKept) {
        this.nineKept = nineKept;
    }

    public int getTenCount() {
        return tenCount;
    }

    public void setTenCount(int tenCount) {
        this.tenCount = tenCount;
    }

    public boolean isTenKept() {
        return tenKept;
    }

    public void setTenKept(boolean tenKept) {
        this.tenKept = tenKept;
    }

    public int getElevenCount() {
        return elevenCount;
    }

    public void setElevenCount(int elevenCount) {
        this.elevenCount = elevenCount;
    }

    public boolean isElevenKept() {
        return elevenKept;
    }

    public void setElevenKept(boolean elevenKept) {
        this.elevenKept = elevenKept;
    }

    public int getTwelveCount() {
        return twelveCount;
    }

    public void setTwelveCount(int twelveCount) {
        this.twelveCount = twelveCount;
    }

    public boolean isTwelveKept() {
        return twelveKept;
    }

    public void setTwelveKept(boolean twelveKept) {
        this.twelveKept = twelveKept;
    }

    public int getThirteenCount() {
        return thirteenCount;
    }

    public void setThirteenCount(int thirteenCount) {
        this.thirteenCount = thirteenCount;
    }

    public boolean isThirteenKept() {
        return thirteenKept;
    }

    public void setThirteenKept(boolean thirteenKept) {
        this.thirteenKept = thirteenKept;
    }

    public int getFourteenCount() {
        return fourteenCount;
    }

    public void setFourteenCount(int fourteenCount) {
        this.fourteenCount = fourteenCount;
    }

    public boolean isFourteenKept() {
        return fourteenKept;
    }

    public void setFourteenKept(boolean fourteenKept) {
        this.fourteenKept = fourteenKept;
    }

    public int getFifteenCount() {
        return fifteenCount;
    }

    public void setFifteenCount(int fifteenCount) {
        this.fifteenCount = fifteenCount;
    }

    public boolean isFifteenKept() {
        return fifteenKept;
    }

    public void setFifteenKept(boolean fifteenKept) {
        this.fifteenKept = fifteenKept;
    }

    public int getSixteenCount() {
        return sixteenCount;
    }

    public void setSixteenCount(int sixteenCount) {
        this.sixteenCount = sixteenCount;
    }

    public boolean isSixteenKept() {
        return sixteenKept;
    }

    public void setSixteenKept(boolean sixteenKept) {
        this.sixteenKept = sixteenKept;
    }

    public int getSeventeenCount() {
        return seventeenCount;
    }

    public void setSeventeenCount(int seventeenCount) {
        this.seventeenCount = seventeenCount;
    }

    public boolean isSeventeenKept() {
        return seventeenKept;
    }

    public void setSeventeenKept(boolean seventeenKept) {
        this.seventeenKept = seventeenKept;
    }

    public int getEighteenCount() {
        return eighteenCount;
    }

    public void setEighteenCount(int eighteenCount) {
        this.eighteenCount = eighteenCount;
    }

    public boolean isEighteenKept() {
        return eighteenKept;
    }

    public void setEighteenKept(boolean eighteenKept) {
        this.eighteenKept = eighteenKept;
    }

    public int getNineteenCount() {
        return nineteenCount;
    }

    public void setNineteenCount(int nineteenCount) {
        this.nineteenCount = nineteenCount;
    }

    public boolean isNineteenKept() {
        return nineteenKept;
    }

    public void setNineteenKept(boolean nineteenKept) {
        this.nineteenKept = nineteenKept;
    }

    public int getTwentyCount() {
        return twentyCount;
    }

    public void setTwentyCount(int twentyCount) {
        this.twentyCount = twentyCount;
    }

    public boolean isTwentyKept() {
        return twentyKept;
    }

    public void setTwentyKept(boolean twentyKept) {
        this.twentyKept = twentyKept;
    }

    private int eightCount;
    private boolean eightKept;
    private int nineCount;
    private boolean nineKept;
    private int tenCount;
    private boolean tenKept;

    private int elevenCount;
    private boolean elevenKept;
    private int twelveCount;
    private boolean twelveKept;
    private int thirteenCount;
    private boolean thirteenKept;
    private int fourteenCount;
    private boolean fourteenKept;

    private int fifteenCount;
    private boolean fifteenKept;
    private int sixteenCount;
    private boolean sixteenKept;
    private int seventeenCount;
    private boolean seventeenKept;
    private int eighteenCount;
    private boolean eighteenKept;
    private int nineteenCount;
    private boolean nineteenKept;
    private int twentyCount;
    private boolean twentyKept;

    //Lower Scorecard Variables
    private int threeOfaKind;
    private boolean threeKindKept;
    private int fourOfaKind;
    private boolean fourKindKept;
    private int fullHouse;
    private boolean fullHouseKept;
    private int smallStraight;
    private boolean sStraightKept;
    private int largeStraight;
    private boolean lStraightKept;
    private int chance;
    private boolean chanceKept;
    private int yahtzee;
    private boolean yahtzeeKept;
    private int bonus;

    public boolean isOneKept() {
        return oneKept;
    }

    public void setOneKept(boolean oneKept) {
        this.oneKept = oneKept;
    }

    public boolean isTwoKept() {
        return twoKept;
    }

    public void setTwoKept(boolean twoKept) {
        this.twoKept = twoKept;
    }

    public boolean isThreeKept() {
        return threeKept;
    }

    public void setThreeKept(boolean threeKept) {
        this.threeKept = threeKept;
    }

    public boolean isFourKept() {
        return fourKept;
    }

    public void setFourKept(boolean fourKept) {
        this.fourKept = fourKept;
    }

    public boolean isFiveKept() {
        return fiveKept;
    }

    public void setFiveKept(boolean fiveKept) {
        this.fiveKept = fiveKept;
    }

    public boolean isSixKept() {
        return sixKept;
    }

    public void setSixKept(boolean sixKept) {
        this.sixKept = sixKept;
    }

    public boolean isThreeKindKept() {
        return threeKindKept;
    }

    public void setThreeKindKept(boolean threeKindKept) {
        this.threeKindKept = threeKindKept;
    }

    public boolean isFourKindKept() {
        return fourKindKept;
    }

    public void setFourKindKept(boolean fourKindKept) {
        this.fourKindKept = fourKindKept;
    }

    public boolean isFullHousedKept() {
        return fullHouseKept;
    }

    public void setFullHouseKept(boolean fullHousedKept) {
        this.fullHouseKept = fullHousedKept;
    }

    public boolean issStraightKept() {
        return sStraightKept;
    }

    public void setsStraightKept(boolean sStraightKept) {
        this.sStraightKept = sStraightKept;
    }

    public boolean islStraightKept() {
        return lStraightKept;
    }

    public void setlStraightKept(boolean lStraightKept) {
        this.lStraightKept = lStraightKept;
    }

    public boolean isChanceKept() {
        return chanceKept;
    }

    public void setChanceKept(boolean chanceKept) {
        this.chanceKept = chanceKept;
    }

    public boolean isYahtzeeKept() {
        return yahtzeeKept;
    }

    public void setYahtzeeKept(boolean yahtzeeKept) {
        this.yahtzeeKept = yahtzeeKept;
    }

    public boolean isBonusKept() {
        return bonusKept;
    }

    public void setBonusKept(boolean bonusKept) {
        this.bonusKept = bonusKept;
    }

    private boolean bonusKept;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //DVC
    public Scorecard() throws FileNotFoundException {
        oneCount = 0;
        twoCount = 0;
        threeCount  = 0;
        fourCount = 0;
        fiveCount = 0;
        sixCount = 0;
        threeOfaKind = 0;
        fourOfaKind = 0;
        fullHouse = 0;
        smallStraight = 0;
        largeStraight = 0;
        chance = 0;
        yahtzee = 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getOneCount() {
        return oneCount;
    }

    public void setOneCount(int oneCount) {
        this.oneCount = oneCount;
    }

    public int getTwoCount() {
        return twoCount;
    }

    public void setTwoCount(int twoCount) {
        this.twoCount = twoCount;
    }

    public int getThreeCount() {
        return threeCount;
    }

    public void setThreeCount(int threeCount) {
        this.threeCount = threeCount;
    }

    public int getFourCount() {
        return fourCount;
    }

    public void setFourCount(int fourCount) {
        this.fourCount = fourCount;
    }

    public int getFiveCount() {
        return fiveCount;
    }

    public void setFiveCount(int fiveCount) {
        this.fiveCount = fiveCount;
    }

    public int getSixCount() {
        return sixCount;
    }

    public void setSixCount(int sixCount) {
        this.sixCount = sixCount;
    }

    public int getThreeOfaKind() {
        return threeOfaKind;
    }

    public void setThreeOfaKind(int threeOfaKind) {
        this.threeOfaKind = threeOfaKind;
    }

    public int getFourOfaKind() {
        return fourOfaKind;
    }

    public void setFourOfaKind(int fourOfaKind) {
        this.fourOfaKind = fourOfaKind;
    }

    public int getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getSmallStraight() {
        return smallStraight;
    }

    public void setSmallStraight(int smallStraight) {
        this.smallStraight = smallStraight;
    }

    public int getLargeStraight() {
        return largeStraight;
    }

    public void setLargeStraight(int largeStraight) {
        this.largeStraight = largeStraight;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getYahtzee() {
        return yahtzee;
    }

    public void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    public void displayScorecard(){
        System.out.println(" ");
        System.out.println("SCORECARD");
        System.out.println("----------------------------");
        System.out.println("UPPER SCORECARD");
        System.out.println("----------------------------");
        for (int i = 0; i < sidesPerDiceResult; i++){
            System.out.println("Score of " + upperScorecard[i] * i + " on the " + (i+1) + " line");
        }
        System.out.println("----------------------------");
        System.out.println("BONUS: " + bonus);
        //TODO so far only compatible for dice with sides 6 or fewer. Might write to file as alternative?
        System.out.println("----------------------------");
        System.out.println("LOWER SCORECARD");
        System.out.println("----------------------------");
        System.out.println("Score " + threeOfaKind + " on the 3 of a Kind Line");
        System.out.println("Score " + fourOfaKind + " on the 4 of a Kind Line");
        System.out.println("Score " + fullHouse + " on the Full House Line");
        System.out.println("Score " + smallStraight + " on the Small Straight Line");
        System.out.println("Score " + largeStraight + " on the Large Straight Line");
        System.out.println("Score " + yahtzee + " on the YAHTZEE Line");
        System.out.println("Score " + chance + " on the Chance Line");
        System.out.println("----------------------------");
        System.out.println(" ");
    }
}

