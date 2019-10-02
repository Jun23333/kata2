package prac2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(4,3,8,-1,3,1,1,2,5,4,8);
        DisplayHistogram display = new DisplayHistogram(histogram);
        display.excute();
    }
    
}
