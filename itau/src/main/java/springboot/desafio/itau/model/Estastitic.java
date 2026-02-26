package springboot.desafio.itau.model;

import java.util.DoubleSummaryStatistics;

public class Estastitic {
    private long count;
    private double sun;
    private double avg;
    private double min;
    private double max;


    public Estastitic (long count, double sun, double avg, double min, double max){
        this.avg = avg;
        this.count = count;
        this.sun = sun;
        this.min = min;
        this.max = max;
    }

    public Estastitic (DoubleSummaryStatistics statistics){
        this.avg = statistics.getAverage();
        this.count = statistics.getCount();
        this.max = statistics.getMax();
        this.min = statistics.getMin();
        this.sun = statistics.getSum();
    }

    public long getCount(){
        return this.count;
    }

    public double getSun(){
        return this.sun;
    }

    public double getAvg(){
        return this.avg;
    }

    public double getMin(){
        return this.min;
    }
    public double getMax(){
        return this.max;
    }


}
