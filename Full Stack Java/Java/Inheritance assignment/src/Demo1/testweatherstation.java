package Demo1;
class WeatherStation {
    double temperature;
    double humidity;
    WeatherStation() {//default constructor
        temperature = 25.0;
        humidity = 60.0;
    }

    // Parameterized constructor
    WeatherStation(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Getters and Setters
    double getTemperature() {
        return temperature;
    }

    void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    double getHumidity() {
        return humidity;
    }

    void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    void showWeather() {
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
    }

    void display() {
        System.out.println("---- Weather Station ----");
        showWeather();
    }
}//class weatherStation ends here


class SmartWeatherStation extends WeatherStation {
    boolean wifiEnabled;
    int connectedDevices;
    SmartWeatherStation() { //default constructor
        super(); // calls WeatherStation() default constructor
        wifiEnabled = true;
        connectedDevices = 2;
    }

    // Parameterized constructor
    SmartWeatherStation(double temperature, double humidity, boolean wifiEnabled, int connectedDevices) {
        super(temperature, humidity); // call parent constructor
        this.wifiEnabled = wifiEnabled;
        this.connectedDevices = connectedDevices;
    }
    void uploadData() {
        System.out.println("Uploading weather data to the cloud...");
    }
    void sendAlert() {
        System.out.println("Weather alert sent to all connected devices!");
    }

    void display() {
        System.out.println("---- Smart Weather Station ----");
        super.showWeather(); // display base class info
        System.out.println("Wi-Fi Enabled: " + wifiEnabled);
        System.out.println("Connected Devices: " + connectedDevices);
    }
}//class smartweatherstation ends here

public class testweatherstation {
    public static void main(String[] args) {
        // Base class objects
        WeatherStation ws1 = new WeatherStation();
        System.out.println("---- Station 1 ----");
        ws1.display();
        System.out.println();

        WeatherStation ws2 = new WeatherStation(30.5, 72.4);
        System.out.println("---- Station 2 ----");
        ws2.display();
        System.out.println();

        SmartWeatherStation sws1 = new SmartWeatherStation();
        System.out.println("---- Smart Station 1 ----");
        sws1.display();
        sws1.uploadData();
        sws1.sendAlert();
        System.out.println();

        SmartWeatherStation sws2 = new SmartWeatherStation(28.3, 65.2, true, 5);
        System.out.println("---- Smart Station 2 ----");
        sws2.display();
        sws2.uploadData();
        sws2.sendAlert();
    }
}

