import java.util.Random;

public class Dice {

    //instance variable

    private Integer numberOfDice;
    private Random random;



    //Constructor default, does not need parameters.
    public Dice() {
        this.numberOfDice = 2;

    }
    //also a constructor that requires a parameter of how many dice we wanted.
    public Dice(Integer die){
        this.numberOfDice = die;
    }

    //getter, going to get the instance variable which is the number of dice.
    public Integer getNumberOfDice(){
        return this.numberOfDice;
    }
    //setter it's setting the number of dice to be used.
    public void setNumberOfDice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
        Random random = new Random();
        Integer sum = 0;
        Integer randomNumber = 0;

        for(int i = 1; i <= this.numberOfDice; i++){
            randomNumber = random.nextInt(6) + 1; //Simulates a roll
            sum += randomNumber;
        }
        return sum;
    }

    public String toString() {
        return "Dice{" +
                "numberOfDice=" + numberOfDice +
                '}';
    }

    }

