package Opgave1;

public class FilterClass implements Filter{
    private double limit;

    public FilterClass(double limit){
        this.limit = limit;
    }

    @Override
    public boolean accept(Measurable x) {
        return x.getMeasure() > limit;
    }
}
