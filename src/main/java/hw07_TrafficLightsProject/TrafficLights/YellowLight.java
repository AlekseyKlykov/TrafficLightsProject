package hw07_TrafficLightsProject.TrafficLights;

public class YellowLight implements ColorTrafficLights {

    private int timeSleep = 0;

    public YellowLight(int timesllep){ this.timeSleep = timesllep;
    }
    @Override
    public void setTimeSleep(int value) {
        this.timeSleep = value;
    }

    @Override
    public String getTrafficLights() {
        return "Yellow";
    }

    @Override
    public int getTimeSleep() {
        return this.timeSleep;
    }


    @Override
    public String getNextTrafficLights() {
        return "Green";
    }
}
