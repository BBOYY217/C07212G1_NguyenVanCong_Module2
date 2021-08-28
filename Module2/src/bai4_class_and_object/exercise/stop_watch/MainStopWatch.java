package bai4_class_and_object.exercise.stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.star();
        System.out.println(stopWatch.starTime);
        int s = 0 ;
        for (int i = 1; i <=1000000 ; i++) {
            for (int j = 0; j < 100000 ; j++) {
               s = i + j;
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.endTime);
        System.out.println("thời gian hết : "+ stopWatch.getElapsedTime());
    }
}
