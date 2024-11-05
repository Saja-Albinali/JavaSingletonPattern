public class Main {
    public static void main(String[] args) {
        IPhoneSettings settings = IPhoneSettings.getInstance();

        settings.setBrightness(75);
        System.out.println("brightness: " + settings.getBrightness());

        settings.enableWiFi();
        System.out.println("is WiFi Enabled? " + settings.isWiFiEnabled());

        settings.disableWiFi();
        System.out.println("is WiFi Enabled? " + settings.isWiFiEnabled());

    }
}