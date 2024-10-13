package Assignment3.Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void sendData() {
        mediator.collectData("Temperature: 22°C");
    }
}