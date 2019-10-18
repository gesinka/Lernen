import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Java6Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMusik {
    @Test
    public void testMinutenToSekunden () {
        MinutenToSekunden t = new MinutenToSekunden();
        int minuten = 2;
        int sekunden = 34;

        int ergebnis = t.summiren(minuten, sekunden);
        System.out.print(ergebnis);
    }
    @Test
    public void testNegativMinuten(){
        MinutenToSekunden t = new MinutenToSekunden();
        int minuten = -9;
        int sekunden= 34;

        Throwable result = catchThrowable(() -> t.summiren(minuten,sekunden));
        assertThat(result).hasMessage("Minutes cannot be negative");
    }

    @Test
    public void testNegativeSekunden(){
        MinutenToSekunden t = new MinutenToSekunden();
        int minuten = 4;
        int sekunden = -55;
        Throwable result = catchThrowable(()->t.summiren(minuten,sekunden));
        assertThat(result).hasMessage("Sekunden cannot be negative");
    }
    @Test
    public void testToManyMinutes(){
        MinutenToSekunden t = new MinutenToSekunden();
        int minuten = 65;
        int sekunden = 40;
        Throwable result = catchThrowable(()-> t.summiren(minuten,sekunden));
        assertThat(result).hasMessage("Please don't enter more than 60 minutes");
    }
    @Test
    public void testToManySekunden(){
        MinutenToSekunden t = new MinutenToSekunden();
        int minuten = 54;
        int sekunden = 789;
        Throwable result = catchThrowable(()->t.summiren(minuten,sekunden));
        assertThat(result).hasMessage("Please dont't enter more than 60 sekunden");
    }
    @Test
    public void setterMinutenSekundenForMoreThanOneSong() {
        ArrayList<MinutenToSekunden> songs = new ArrayList<MinutenToSekunden>();
        MinutenToSekunden keeno = new MinutenToSekunden();
        keeno.setminuten(3);
        keeno.setsekunde(56);
        songs.add(keeno);
        MinutenToSekunden toto = new MinutenToSekunden();
        toto.setminuten(4);
        toto.setsekunde(55);
        songs.add(toto);
        MinutenToSekunden rayCharles = new MinutenToSekunden();
        rayCharles.setminuten(2);
        rayCharles.setsekunde(40);
        songs.add(rayCharles);
        MinutenToSekunden koven = new MinutenToSekunden();
        koven.setminuten(4);
        koven.setsekunde(54);
        songs.add(koven);


        MinutenToSekunden t = new MinutenToSekunden();

        int result = 0;
        for (MinutenToSekunden s : songs) {
            result += t.summiren(s.getMinuten(), s.getSekunden());
        }
        assertEquals(985,result);

    }
}
