package example;

public class Television extends ElectronicDevice {

    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    public abstract void turnOff();
    
    public void changeChannel(int channel) {}
    public void initializeScreen() {}
}