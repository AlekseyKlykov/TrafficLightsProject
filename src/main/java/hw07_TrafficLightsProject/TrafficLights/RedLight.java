package hw07_TrafficLightsProject.TrafficLights;

public class RedLight implements ColorTrafficLights {

    private int timeSleep = 0;
    @Override
    public String getTrafficLights() {
        return "Red";
    }
    public RedLight(int timesllep){ this.timeSleep = timesllep;
    }

    @Override
    public int getTimeSleep() {
        return timeSleep;
    }

    @Override
    public String getNextTrafficLights() {
        return "Yellow";
    }
    @Override
    public void setTimeSleep( int value) {
        this.timeSleep = value;
    }
}
