package ss4.bai_tap;

import java.time.LocalDate;

public class StopWatch {
    private LocalDate startTime;
    private LocalDate endTime;

    public StopWatch(){

    }
    public void stop(){
        this.startTime = LocalDate.now();
    }
    public void start(){
        this.endTime = LocalDate.now();
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }
    public LocalDate getElapsepsedTime(){
        return getStartTime();
    }
}
