package sc.vsu.Kotov;

import ru.vsu.cs.util.SwingUtils;

import java.util.Locale;


public class Main {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        SwingUtils.setLookAndFeelByName("Windows");
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);

        new MainFrame().setVisible(true);
    }
}
