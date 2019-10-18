public class MinutenToSekunden {
    private int minuten;
    private int sekunden;


    public int summiren(int minuten, int sekunden) {
        if (minuten< 0 ){
            throw new IllegalStateException("Minutes cannot be negative");
        }
        if (sekunden <0 ){
            throw new IllegalStateException("Sekunden cannot be negative");
        }
        if(minuten > 60){
            throw new IllegalStateException("Please don't enter more than 60 minutes");
        }
        if (sekunden >60){
            throw new IllegalStateException("Please dont't enter more than 60 sekunden");
        }
    return minuten *60 + sekunden;
    }
    public int getMinuten(){
        return minuten;
    }

    public void setsekunde(int sekunden) {
        this.sekunden = sekunden;
    }

    public int getSekunden(){
        return sekunden;
    }
    public void setminuten(int minuten) {
        this.minuten = minuten;
    }
}
