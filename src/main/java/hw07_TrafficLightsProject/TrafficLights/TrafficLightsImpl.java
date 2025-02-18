package hw07_TrafficLightsProject.TrafficLights;


import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

public class TrafficLightsImpl implements TrafficLights {
    private Map<String, ColorTrafficLights> trafficLightsPool;
    private ColorTrafficLights state;
    private TrafficLightsImpl(){};
    public TrafficLightsImpl(Map<String, ColorTrafficLights> trafficLightsPoolval) throws InterruptedException {

        this.trafficLightsPool = new HashMap<>(){{
            put("Red",trafficLightsPoolval.get("Red"));
            put("Yellow",trafficLightsPoolval.get("Yellow"));
            put("Green",trafficLightsPoolval.get("Green"));
        }};
        state = trafficLightsPoolval.get("Red");

    }
    @Override
    public void run() throws InterruptedException {
        for(int i = 10; i>0;i--) {
            signalSwitching();
        }


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


        }

    }







}
