import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ComplexGuiExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Complex GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");

        // Add action to "Exit" menu item
        exitMenuItem.addActionListener(e -> System.exit(0));

        // Add action to "About" menu item
        aboutMenuItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Complex GUI Example v1.0", "About", JOptionPane.INFORMATION_MESSAGE);
        });

        // Add items to menus and the menu bar
        fileMenu.add(exitMenuItem);
        helpMenu.add(aboutMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab 1: Dashboard with a button and label
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to the Dashboard!");
        JButton clickButton = new JButton("Click Me");
        
        // Action listener for the button
        clickButton.addActionListener(e -> label.setText("Button clicked!"));

        dashboardPanel.add(label);
        dashboardPanel.add(clickButton);

        // Tab 2: Data Table
        JPanel tablePanel = new JPanel(new BorderLayout());
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "Alice", 23},
            {2, "Bob", 25},
            {3, "Charlie", 30}
        };

        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane tableScrollPane = new JScrollPane(table);

        tablePanel.add(tableScrollPane, BorderLayout.CENTER);

        // Tab 3: Form with text fields and a submit button
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();
        JButton submitButton = new JButton("Submit");
        JLabel responseLabel = new JLabel();

        // Action listener for form submission
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            responseLabel.setText("Submitted: " + name + ", Age: " + age);
        });

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(ageLabel);
        formPanel.add(ageField);
        formPanel.add(submitButton);
        formPanel.add(responseLabel);

        // Add panels to tabs
        tabbedPane.addTab("Dashboard", dashboardPanel);
        tabbedPane.addTab("Data Table", tablePanel);
        tabbedPane.addTab("Form", formPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Set the frame visible
        frame.setVisible(true);
    }
}
