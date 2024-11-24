import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snaaaake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370,390);
        setLocation(370,390);
        add(new SnakeGame());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
