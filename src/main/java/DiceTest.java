import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class DiceTest {

    @Test
    public void numberOfDiceTest(){
        //given
        Dice dice = new Dice();
        int expected = 2;


        //when
        int actual = dice.getNumberOfDice();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test//always have to put this for test classes
    public void getNumberOfDiceTest(){
        //given
        Dice dice = new Dice(20);
        int expected = 20;


        //when
        int actual = dice.getNumberOfDice();

        //then
        Assert.assertEquals(expected, actual);
    }



    @Test//always have to put this for test classes
    public void setNumberOfDiceTest(){
        //given
        Dice dice = new Dice();
        int expected = 5;


        //when
        dice.setNumberOfDice(5);//setting the value of the parm
        int actual = dice.getNumberOfDice();

        //then
        Assert.assertEquals(expected, actual);
    }
}