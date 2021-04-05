public class Score {
    private double result;


    public Score() {
        result = 0.0;
    }

    public Score init() {
        result = 0.0;
        return this;
    }
    
    public Score pow(double value, double rank) {
        result += Math.pow(value, rank);
        return this;
    }
}