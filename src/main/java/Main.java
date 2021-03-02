import App.MainApp;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {
    public static void main(String[] args) {
        FlatLightLaf.install();
        new MainApp().setVisible(true);
    }
}
