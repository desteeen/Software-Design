import javax.swing.*;
import java.awt.*;

public class MainForm extends JPanel {
    NamePanel namePanel = new NamePanel();
    EmailPanel emailPanel = new EmailPanel();
    ButtonPanel buttonPanel = new ButtonPanel();

    public MainForm()
    {
        init();
    }
    private void init()
    {
        this.add(namePanel, BorderLayout.NORTH);
        this.add(emailPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);

    }
}
