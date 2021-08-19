package Bai4_Class_and_object.exercise.StopWatch;

public class StopWatch {
    long starTime;
    long endTime;

    public StopWatch() {
    }

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void star() {
        starTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - starTime;
    }
}
