public class IphoneSettings {

    private static IphoneSettings instance;
    private  boolean Wifi= false;
    private String Brightness;


    private IphoneSettings() {

    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

    public void enableWifi(){

    Wifi=true;

    }

    public void disableWifi(){

    Wifi=false;

    }

public void increaseBrightness(){

    Brightness="high";
}
   
public void decreaseBrightness(){

    Brightness="low";
}


public String getBrightness() {
    return Brightness;
}




}
