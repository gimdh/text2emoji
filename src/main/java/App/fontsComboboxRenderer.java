package App;

import javax.swing.*;
import java.awt.*;

public class fontsComboboxRenderer extends JLabel implements ListCellRenderer {
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        var fontFamily = (String) value;
        var originalFont = getFont();

        setText(fontFamily);
        setFont(new Font(fontFamily, originalFont.getStyle(), originalFont.getSize()));

        return this;
    }
}
