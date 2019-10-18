import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Gui  {
        public static void main(String[] args){
        JTextField firstnumber = new JTextField();
        JTextField secondnumber = new JTextField();

        Object[]Message={
                "First Number: ", firstnumber,
                "Second Number: ", secondnumber};
        int option = JOptionPane.showConfirmDialog(null,Message,"Guess Game", JOptionPane.OK_CANCEL_OPTION);

        ReadWerte obj = new ReadWerte();
        obj.setFirstNumber(firstnumber.getText());
        obj.setSecondNumber(secondnumber.getText());

        GuessGame.guessGame(obj);

    }

}
