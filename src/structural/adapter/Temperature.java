package structural.adapter;

public interface Temperature {
    void showTemperatureFahrenheit();
}

class Thermostat {
    private int temperature;

    public void showTemperatureCelsius() {
        System.out.println("Градус по Цельсию: " + temperature);
    }

    public Thermostat(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

class Adapter extends Thermostat implements Temperature {

    public Adapter(int temperature) {
        super(temperature);
    }

    @Override
    public void showTemperatureFahrenheit() {
        System.out.println("Градус по Фаренгейту: " + (getTemperature() * 1.8 + 32));
    }
}

class Runner {
    public static void main(String[] args) {
        Temperature temperature = new Adapter(new Thermostat(5).getTemperature());
        temperature.showTemperatureFahrenheit();
    }
}
