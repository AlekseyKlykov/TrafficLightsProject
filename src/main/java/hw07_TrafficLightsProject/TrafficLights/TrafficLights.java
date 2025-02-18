package hw07_TrafficLightsProject.TrafficLights;

public interface TrafficLights {
    public void signalSwitching() throws InterruptedException;

    public default void run() throws InterruptedException {

        signalSwitching();

        run();


    }
}
