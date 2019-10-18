import org.apache.logging.log4j.core.util.JsonUtils;

public class ReadWerte {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber(){
        return this.firstNumber;
    }
    public void setFirstNumber(String firstnumber){
        int firstNumber = Integer.parseInt(firstnumber);
        this.firstNumber = firstNumber;

    }

    public int getSecondNumber(){
        return this.secondNumber;
    }
    public void setSecondNumber(String secondnumber){
        int secondNumber = Integer.parseInt(secondnumber);
        this.secondNumber = secondNumber;
    }


}
