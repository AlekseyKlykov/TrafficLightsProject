package hw07_TrafficLightsProject;

import hw07_TrafficLightsProject.TrafficLights.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, ColorTrafficLights> trafficLightsPool;

        trafficLightsPool = new HashMap<>(){{
            put("Red",new RedLight(5000));
            put("Yellow",new YellowLight(3000));
            put("Green",new GreenLight(3000));}};



        TrafficLights trafficLights = new TrafficLightsImpl(trafficLightsPool);
        trafficLights.run();
        Map<String, ColorTrafficLights> trafficLightsPool2;

        trafficLightsPool2 = new HashMap<>(){{
            put("Red",new RedLight(5000){
                @Override
                public String getNextTrafficLights() {
                    return "Green";
                }
            });

            put("Green",new GreenLight(3000));}};

        TrafficLights pdl = new PedestrianTrafficLights(trafficLightsPool2);

        pdl.run();

        Map<String, ColorTrafficLights> trafficLightsPool3;

        trafficLightsPool3 = new HashMap<>(){{
            put("Red",new RedLight(5000));
            put("Yellow",new YellowLight(3000));
            put("Green",new GreenLight(3000){
                @Override
                public String getNextTrafficLights() {
                    return "Left arrow";
                }


            });
            put("Left arrow",new LeftArrowLight(3000));

        }};

        TrafficLights trafficLightWithAdditionalSection = new TrafficLightWithAdditionalSection(trafficLightsPool3);
        trafficLightWithAdditionalSection.run();

    }
}