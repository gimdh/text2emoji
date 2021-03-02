package App;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import javax.swing.colorchooser.ColorSelectionModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class MainApp extends JFrame {
    private JComboBox fontsComboBox;

    public MainApp() {
        super("Water Calculator");

        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {


        setLayout(new FlowLayout());
        setSize(300, 300);
        add(initFontsComboBox());
        add(initColorChooser());
    }

    private Component initFontsComboBox() {
        var fontsComboBoxLayout = new JPanel();

        var label = new Label("Select font");

        var availableFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        var availableDrawableFonts =
                Arrays.stream(availableFonts).filter(font -> new Font(font, Font.PLAIN, 1)
                        .canDisplayUpTo(font) == -1)
                        .toArray(String[]::new);
        var availableFontsComboBox = new JComboBox<>(availableDrawableFonts);
        availableFontsComboBox.setRenderer(new fontsComboboxRenderer());

        fontsComboBoxLayout.add(label);
        fontsComboBoxLayout.add(availableFontsComboBox);

        return fontsComboBoxLayout;
    }

    private Component initColorChooser() {
        var fontColorChooser = new JColorChooser();
        System.out.println(Arrays.stream(fontColorChooser.getChooserPanels()).map(Component::toString).toArray(String[]::new));

        return fontColorChooser;
    }
}