import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Leith's App"); //title
        JLabel label = new JLabel("Welcome to my app!");

        //main frame
        frame.add(label);
        frame.setSize(800,600);

        //tinkering with menu
        JMenuBar menu = new JMenuBar();
        JMenu home = new JMenu("Home");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem closeItem = new JMenuItem("Close");
        home.add(openItem);
        home.addSeparator();
        home.add(closeItem);
        menu.add(home);

        //adding another menubar
        JMenu aboutMenu = new JMenu("More");
        JMenuItem aboutMe = new JMenuItem("About...");
        JMenuItem aboutHelp = new JMenuItem("Help");
        aboutMenu.add(aboutMe);
        aboutMenu.addSeparator();
        aboutMenu.add(aboutHelp);
        menu.add(aboutMenu);

        //panel with button
        JPanel panel = new JPanel();
        JButton button = new JButton("Press me");
        panel.add(button);

        //add some action to the button
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        //Create another panel with text
        JPanel textPanel = new JPanel();
        JLabel textLabel = new JLabel("WEEE!");
        textPanel.add(textLabel);

        //put the layout
        frame.setLayout(new BorderLayout());
        frame.setJMenuBar(menu);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(textPanel, BorderLayout.SOUTH);

        //exit program peacefully
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}