import javax.swing.*;
import java.awt.*;

public class ComboBox {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Year Selector");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Integer[] years = {2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035};
                JComboBox<Integer> yearComboBox = new JComboBox<>(years);

                // Set the selected item to 2035
                yearComboBox.setSelectedItem(2035);

                // Add combo box to a panel
                JPanel panel = new JPanel();
                panel.add(yearComboBox);

                // Add panel to the frame
                frame.add(panel);

                // Print the selected year when combo box selection changes
                yearComboBox.addActionListener(e -> {
                    System.out.println("Selected year: " + yearComboBox.getSelectedItem());
                });

                frame.setVisible(true);
            }
        });
    }
}
