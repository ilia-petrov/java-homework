import java.util.Date;

public class StopWatch
{
    private Date startTime = new Date();
    private Date stopTime = new Date();

    public Date getStartTime()
    {
        return startTime;
    }

    public Date getStopTime()
    {
        return stopTime;
    }

    public void start()
    {
        startTime = new Date();
    }

    public void stop()
    {
        stopTime = new Date();
    }

    public long getElapsedTime()
    {
        return stopTime.getTime() - startTime.getTime();
    }
}
