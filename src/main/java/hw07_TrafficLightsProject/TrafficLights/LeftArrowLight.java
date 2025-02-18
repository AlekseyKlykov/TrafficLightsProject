package hw07_TrafficLightsProject.TrafficLights;

public class LeftArrowLight implements ColorTrafficLights{

    private  int timeSleep = 0;

    public LeftArrowLight(int timesllep){ this.timeSleep = timesllep;
    }

    @Override
    public void setTimeSleep(int value) {
        this.timeSleep = value;
    }

    @Override
    public String getTrafficLights() {
        return "Left arrow";
    }

    @Override
    public int getTimeSleep() {
        return this.timeSleep;
    }

    @Override
    public String getNextTrafficLights() {
        return "Red";
    }
}
