//Original Code For HW3: Not Clone

/**
 * //Author: Jackson Lindsay
 * //CPSC 224 HW3
 * //This program replicates a single hand of yahtzee with scoring and user alteration to the rules
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Yahtzee {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * Main Function to start the game.
         * Game based on a file so if the file is not found it throws an exception
         */

        scanParameters();
        Scanner configurationChoice = new Scanner(System.in);
        System.out.println("Enter 'y' if you would like to change the configuration.");
        System.out.println("Enter 'n' to continue with current configuration.");
        String configChoice = configurationChoice.nextLine();

        /**
         * Asks for user input whether or not they would like to change the game parameters
         */
        if (configChoice.equals("y") || configChoice.equals("Y")){
            editConfig();
            playGame();
        }
        else if (configChoice.equals("n") || configChoice.equals("N")){
            playGame();
        }
        else {
            System.out.println("Invalid input, please try again");
        }

    }

    /**
     *Main game functionality function
     */
    private static void playGame() throws FileNotFoundException {
        int amountOfRounds = 0;
        Scorecard scorecard = new Scorecard();

        //TODO change to 13 later
        while (amountOfRounds < 3){

            /**
             *Gathers values scanned from file and parses them as integers so they can be used later
             */

            Scanner input = new Scanner(new File("src/yahtzeeConfig.txt"));
            String sidesPerDice = input.nextLine();
            int sidesPerDiceResult = Integer.parseInt(sidesPerDice);
            String diceInHand = input.nextLine();
            int diceInHandResult = Integer.parseInt(diceInHand);
            String rollsPerTurn = input.nextLine();
            int rollsPerTurnResult = Integer.parseInt(rollsPerTurn);
            int rollCount = 0;

            /**
             * Inintializes dice objects
             */
            ArrayList<Dice> diceArray = new ArrayList<Dice>();
            for (int i = 0; i < diceInHandResult; i++){
                diceArray.add(new Dice());
            }

            /**
             * Initial roll for dice
             * stores dice in integer array so they can be used later
             */
            int[] hand = new int[diceInHandResult];

            for (int i = 0; i < diceInHandResult; i++){
                diceArray.get(i).rollDice(diceArray.get(i));
            }

            Scanner scanner = new Scanner(System.in);

            /**
             * Sets turn/roll limit for the game
             */
            while (rollCount < (rollsPerTurnResult - 1)){

                System.out.println("Your Roll is: ");
                for (int i = 0; i < diceInHandResult; i++){
                    System.out.print(diceArray.get(i).getSideUp() + " ");
                }
                System.out.println(" ");

                /**
                 * Different strings used for verifying user input
                 */
                StringBuilder allY = new StringBuilder();
                StringBuilder allN = new StringBuilder();
                StringBuilder allNums = new StringBuilder();

                for (int i = 0; i < diceInHandResult; i ++){
                    allY.append("y");
                }
                for (int i = 0; i < diceInHandResult; i ++){
                    allN.append("n");
                }
                for (int i = 0; i < diceInHandResult; i ++){
                    allNums.append(i+1);
                }

                String allYString = allY.toString();

                System.out.println("Choose Which Dice You Would Like to Keep");
                System.out.println("In the format " + allY + " or " + allN + " corresponding to " + allNums + " respectively");
                String rollChoice = scanner.nextLine();
                /**
                 * Checks the length of the string entered
                 */
                if (rollChoice.length() != diceInHandResult){
                    System.out.println("Invalid Selection. Please Try Again.");
                }


                /**
                 * Decides whether or not each dice should be rerolled
                 */
                else if (rollChoice.equals(allYString)){
                    rollCount += rollsPerTurnResult;
                }

                else {
                    for(int i = 0; i < diceInHandResult; i++){
                        if (rollChoice.equals("s")){
                            scorecard.displayScorecard();
                        }
                        else if (rollChoice.charAt(i) == 'y'){
                            diceArray.get(i).setKept(true);
                        }
                        else {
                            diceArray.get(i).rollDice(diceArray.get(i));
                        }
                    }

                    rollCount ++;
                }

                for (int i = 0; i < diceInHandResult; i ++){
                    hand[i] = diceArray.get(i).getSideUp();
                }
            }
            Arrays.sort(hand);
            System.out.println("Your Sorted Hand Is:");
            System.out.println(Arrays.toString(hand));

            /**
             * Variables used to keep score per number
             */
            int[] varCount = new int[sidesPerDiceResult];
            for (int i = 0; i < sidesPerDiceResult; i++){
                varCount[i] = 0;
            }
            int totalScore = 0;

            for (int i = 0; i < diceInHandResult; i++){
                totalScore += diceArray.get(i).getSideUp();
            }

            /**
             * Variables used to track how many of a kind
             */
            int[] varTracker = new int[sidesPerDiceResult];

            for (int i = 0; i < sidesPerDiceResult; i++){
                varTracker[i] = 0;
            }

            /**
             *Tracks score value of each type of score
             */
            int threeOfaKind = 0;
            int fourOfaKind = 0;
            int largeStraight = 0;
            int smallStraight = 0;
            int fullHouse =0;
            int yahtzee = 0;

            for (int i = 0; i < diceInHandResult; i++){
                for (int k = 1; k < (sidesPerDiceResult +1); k++){
                    if (hand[i] == k){
                        varCount[hand[i]-1] += hand[i];
                        varTracker[hand[i]-1] += 1;
                    }
                }
            }

            int twoKind = 0;
            int threeKind = 0;
            int fourKind = 0;

            /**
             * 2 of a kind check
             */
            for (int i = 0; i < sidesPerDiceResult; i++){
                if(varTracker[i] >= 2){
                    twoKind = 1;
                }
            }

            /**
             * 3 of a kind check
             */
            for (int i = 0; i < sidesPerDiceResult; i++){
                if(varTracker[i] >= 3){
                    threeKind = 1;
                }
            }
            if (threeKind == 1){
                threeOfaKind = totalScore;
            }

            /**
             * 4 of a kind check
             */
            for (int i = 0; i < sidesPerDiceResult; i++){
                if(varTracker[i] >= 4){
                    fourKind = 1;
                }
            }
            if (fourKind == 1){
                fourOfaKind = totalScore;
            }

            /**
             * Full House check
             */
            if(threeKind == 1 && twoKind == 1){
                fullHouse = 25;
            }
            /**
             * Yahtzee check
             */
            for (int i = 0; i < sidesPerDiceResult; i++){
                if(varTracker[i] == diceInHandResult){
                    yahtzee = 50;
                }
            }

            int maxLength = 1;
            int curLength = 1;
            for (int i = 0; i < (diceInHandResult -1); i++){
                if(hand[i] + 1 == hand[i+1]){
                    curLength++;
                }
                else if (hand[i] + 1 < hand[i +1]){
                    curLength = 1;
                }
                if (curLength > maxLength){
                    maxLength = curLength;
                }
            }
            if (curLength >= 4){
                smallStraight = 30;
            }
            if (curLength == 5){
                largeStraight = 40;
            }

            /**
             * Outputs the score for each line
             */
            for (int i = 0; i < sidesPerDiceResult; i++){
                System.out.println("Possible Score of " + varCount[i] + " on the " + (i+1) + " line");
            }
            if (!scorecard.isThreeKindKept()){
                System.out.println("Possible Score of " + threeOfaKind + " on the 3 of a Kind Line (3K)");
            }

            if (!scorecard.isFourKindKept()){
                System.out.println("Possible Score of " + fourOfaKind + " on the 4 of a Kind Line (4K)");
            }

            if (!scorecard.isFullHouseKept()){
                System.out.println("Possible Score of " + fullHouse + " on the Full House Line (FH)");
            }

            if (!scorecard.issStraightKept()){
                System.out.println("Possible Score of " + smallStraight + " on the Small Straight Line (SS)");
            }

            if (!scorecard.islStraightKept()){
                System.out.println("Possible Score of " + largeStraight + " on the Large Straight Line (LS)");
            }

            if (!scorecard.isYahtzeeKept()){
                System.out.println("Possible Score of " + yahtzee + " on the YAHTZEE Line (Y)");
            }

            if (!scorecard.isChanceKept()){
                System.out.println("Possible Score of " + totalScore + " on the Chance Line (C)");
            }

            System.out.println(" ");
            System.out.println("SELECT WHICH LINE YOU WOULD LIKE TO BE SCORED ON");
            System.out.println("Press 'S' if you would like to view your current scorecard");

            Scanner scoreChoice = new Scanner(System.in);
            String scoreSelected = scoreChoice.nextLine();

            //TODO fix this idk why it does not work
//            for(int i = 0; i < sidesPerDiceResult; i++){
//                scorecard.upperScorecardStrings[i] = Integer.toString(scorecard.upperScorecard[i]);
//            }
//            for (int i = 0; i < sidesPerDiceResult; i ++){
//                if (scoreSelected.equals(scorecard.upperScorecardStrings[i])){
//                    scorecard.upperScorecard[i] = i+1;
//                }
//            }

            if (scoreSelected.equals("s") || scoreSelected.equals("S")){
                scorecard.displayScorecard();
            }
            else {
                continue;
            }

            Scanner scoreChoice2 = new Scanner(System.in);
            String scoreSelected2 = scoreChoice2.nextLine();

            if (scoreSelected2.equals("1")){
                if (scorecard.isOneKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setOneKept(true);
                    scorecard.setOneCount(varTracker[0]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("2")){
                if (scorecard.isTwoKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setTwoKept(true);
                    scorecard.setTwoCount(varTracker[1]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("3")){
                if (scorecard.isThreeKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setThreeKept(true);
                    scorecard.setThreeCount(varTracker[2]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("4")){
                if (scorecard.isFourKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setFourKept(true);
                    scorecard.setFourCount(varTracker[3]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("5")){
                if (scorecard.isFiveKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setFiveKept(true);
                    scorecard.setFiveCount(varTracker[4]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("6")){
                if (scorecard.isSixKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setSixKept(true);
                    //scorecard.setSixCount(varTracker[5]);
                    scorecard.upperScorecard[5] = varTracker[5];
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("7")){
                if (scorecard.isSevenKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setSevenKept(true);
                    scorecard.setSevenCount(varTracker[6]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("8")){
                if (scorecard.isEightKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setEightKept(true);
                    scorecard.setEightCount(varTracker[7]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("9")){
                if (scorecard.isNineKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setNineKept(true);
                    scorecard.setNineCount(varTracker[8]);
                    amountOfRounds++;
                }
            }
            if (scoreSelected2.equals("10")){
                if (scorecard.isTenKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setTenKept(true);
                    scorecard.setTenCount(varTracker[9]);
                    amountOfRounds++;
                }
            }

            if(scoreSelected2.equals("3K") || scoreSelected2.equals("3k")){
                if (scorecard.isThreeKindKept()) {
                    System.out.println("That line is already scored. Please select another line");
                }
                else{
                    scorecard.setThreeOfaKind(threeOfaKind);
                    scorecard.setThreeKindKept(true);
                    amountOfRounds++;
                }
            }
            else if(scoreSelected2.equals("4K") || scoreSelected2.equals("4k")){
                if (scorecard.isFourKindKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else{
                    scorecard.setFourOfaKind(fourOfaKind);
                    scorecard.setFourKindKept(true);
                    amountOfRounds++;
                }
            }
            else if(scoreSelected2.equals("fh") || scoreSelected2.equals("FH")){
                if (scorecard.isFullHouseKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setFullHouse(fullHouse);
                    scorecard.setFullHouseKept(true);
                    amountOfRounds++;
                }
            }
            else if(scoreSelected2.equals("ss") || scoreSelected2.equals("SS")){
                if (scorecard.issStraightKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setSmallStraight(smallStraight);
                    scorecard.setsStraightKept(true);
                    amountOfRounds++;
                }
            }
            else if(scoreSelected2.equals("ls") || scoreSelected2.equals("LS")){
                if (scorecard.islStraightKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setLargeStraight(largeStraight);
                    scorecard.setlStraightKept(true);
                    amountOfRounds++;
                }
            }
            else if(scoreSelected2.equals("y") || scoreSelected2.equals("Y")){
                if (scorecard.isYahtzeeKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setYahtzee(yahtzee);
                    scorecard.setYahtzeeKept(true);
                    amountOfRounds++;
                }
            }
            else if(scoreSelected2.equals("c") || scoreSelected2.equals("C")){
                if (scorecard.isChanceKept()){
                    System.out.println("That line is already scored. Please select another line");
                }
                else {
                    scorecard.setChance(totalScore);
                    scorecard.setChanceKept(true);
                    amountOfRounds++;
                }
            }
            else{
                System.out.println("Invalid Line Selection. Please select a different line.");
            }

            /**
             * Calculates if a bonus is given
             */
            int bonusScore = 0;
            for (int i = 0; i < sidesPerDiceResult; i++){
                bonusScore += varCount[i];
            }
            if (bonusScore >= 63){
                scorecard.setBonus(35);
            }

        }
        scorecard.displayScorecard();
    }

    /**
     * Writes edited configuration data back to the file for later use
     */
    //TODO fix?
    private static void editConfig(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides on each dice: ");
        int sides = scanner.nextInt();
        System.out.println("Enter the number of dice in play: ");
        int dice = scanner.nextInt();
        System.out.println("Enter the number of rolls per hand: ");
        int rolls = scanner.nextInt();
        try{
            PrintStream editConfig = new PrintStream(new File("src/yahtzeeConfig.txt"));
            editConfig.println(sides);
            editConfig.println(dice);
            editConfig.println(rolls);
            editConfig.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }

    private static void scanParameters() throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/yahtzeeConfig.txt"));
        String sidesPerDice = input.nextLine();
        String diceInHand = input.nextLine();
        String rollsPerTurn = input.nextLine();
        System.out.println("Sides per dice: " + sidesPerDice);
        System.out.println("Dice in Hand: " + diceInHand);
        System.out.println("Rolls per turn: " + rollsPerTurn);
    }
}

