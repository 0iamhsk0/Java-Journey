import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

    JFrame frame;
    JLabel lable;

    public App() {
        createFrame();
        lable = new JLabel("||||Swing Demo||||");
        lable.setBounds(500, 500, 500, 50);
        frame.add(lable);
    }

    public void createFrame() {
        frame = new JFrame("Swing Demo");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}