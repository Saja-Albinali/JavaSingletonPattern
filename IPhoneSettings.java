public class IPhoneSettings {
    private static IPhoneSettings instance;
    private int Brightness;
    private boolean WifiEnabled;

    private IPhoneSettings() {
        Brightness = 50;
        WifiEnabled = false;
    }
    public static synchronized IPhoneSettings getInstance(){
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }
    public void setBrightness(int brightness) {
        if (brightness>=0 && brightness<=100) {
            this.Brightness=brightness;
        }else {
            System.out.println("error");
        }
    }

    public int getBrightness() {
        return Brightness;
    }

    public void enableWiFi() {
        WifiEnabled = true;
    }

    public void disableWiFi() {
        WifiEnabled = false;
    }

    public boolean isWiFiEnabled() {
        return WifiEnabled;
    }
}

