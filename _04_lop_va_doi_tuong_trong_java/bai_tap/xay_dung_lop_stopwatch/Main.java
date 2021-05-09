package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class Main {
    public static void main(String[] args) {
        // tao dong ho
        StopWatch stopWatch = new StopWatch();
        // bam start()
        stopWatch.start();
        // thuc hien cong viec gi do
        int count = 0;
        for (int i = 0; i < 10000000; i++) {
            count++;
        }
        // bam stop()
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
