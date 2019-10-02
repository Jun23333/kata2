package prac2;

class DisplayHistogram {
    private final Histogram histogram;

    public DisplayHistogram(Histogram histogram) {
        
        this.histogram = histogram;
    }
    
    void excute() {
        for (int value : histogram.getValue()) {
            System.out.println(value + " " + histogram.getCount(value));
        }
    }

}
