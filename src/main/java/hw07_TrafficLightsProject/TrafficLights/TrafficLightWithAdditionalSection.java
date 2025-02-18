package hw07_TrafficLightsProject.TrafficLights;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

public class TrafficLightWithAdditionalSection implements TrafficLights{
    private Map<String, ColorTrafficLights> trafficLightsPool;
    private ColorTrafficLights state;
    private TrafficLightWithAdditionalSection(){};

    public TrafficLightWithAdditionalSection(Map<String, ColorTrafficLights> trafficLightsPoolval) throws InterruptedException {

        this.trafficLightsPool = new HashMap<>(){{
            put("Red",trafficLightsPoolval.get("Red"));
            put("Yellow",trafficLightsPoolval.get("Yellow"));
            put("Green",trafficLightsPoolval.get("Green"));
            put("Left arrow",trafficLightsPoolval.get("Left arrow"));
        }};
        state = trafficLightsPoolval.get("Red");

    }
    @Override
    public void run() throws InterruptedException {

        for(int i = 20; i>0;i--)
            signalSwitching();

    }
    @Override
    public void signalSwitching() throws InterruptedException {

        switch(state.getTrafficLights()){
            case "Red":
                System.out.println(this.getClass().getSimpleName()+": "+state.getTrafficLights());
                sleep(state.getTimeSleep());

                state = trafficLightsPool.get(state.getNextTrafficLights());


                break;
            case "Yellow":
                System.out.println(this.getClass().getSimpleName()+": "+state.getTrafficLights());
                sleep(state.getTimeSleep());
                state = trafficLightsPool.get(state.getNextTrafficLights());

                break;
            case "Green":
                System.out.println(this.getClass().getSimpleName()+": "+state.getTrafficLights());
                sleep(state.getTimeSleep());
                state = trafficLightsPool.get(state.getNextTrafficLights());

                break;

            case "Left arrow":
                System.out.println(this.getClass().getSimpleName()+": "+state.getTrafficLights());
                sleep(state.getTimeSleep());
                state = trafficLightsPool.get(state.getNextTrafficLights());

                break;


        }
    }

}
