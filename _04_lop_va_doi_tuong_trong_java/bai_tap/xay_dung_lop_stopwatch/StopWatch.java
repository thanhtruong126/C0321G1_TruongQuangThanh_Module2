package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class StopWatch {
    // tao dong ho dem so mili giay
    private long startTime, endTime;
    //
    public StopWatch() {

    }
    //
    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }
    //
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void end() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

}
