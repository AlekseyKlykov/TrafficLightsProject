package hw07_TrafficLightsProject.TrafficLights;

public class GreenLight implements ColorTrafficLights {

  private  int timeSleep = 0;

    public GreenLight(int timesllep){ this.timeSleep = timesllep;
    }
    @Override
    public void setTimeSleep(int value) {

        this.timeSleep = value;
    }

    @Override
    public String getTrafficLights() {
        return "Green";
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
