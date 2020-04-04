/**
 * Class to create dice objects
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int sideUp;
    private boolean isKept;

    /**
     * DVC
     */
    public Dice(){
        sideUp = 1;
        isKept = false;
    }

    /**
     * EVC
     */
    public Dice(int sideUP, boolean isKept){
        this.sideUp = sideUP;
        this.isKept = isKept;
    }

    public int getSideUp() {
        return sideUp;
    }

    public boolean getKept() {
        return isKept;
    }

    public void setSideUp(int sideUp){
        this.sideUp = sideUp;
    }

    public void setKept(boolean isKept){
        this.isKept = isKept;
    }

    /**
     * Function to roll dice based on parameters in the txt file
     */
    public void rollDice(Dice dice) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/yahtzeeConfig.txt"));
        String sidesPerDice = input.nextLine();
        int sidesPerDiceResult = Integer.parseInt(sidesPerDice);
        String diceInHand = input.nextLine();
        String rollsPerTurn = input.nextLine();

        Random rand = new Random();
        int randInt = rand.nextInt(sidesPerDiceResult) + 1;
        dice.setSideUp(randInt);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
