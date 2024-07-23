import java.awt.*;
import java.awt.event.*;

public class DateSelectionApp {
    private Frame frame;
    private Choice dayChoice;
    private Choice monthChoice;
    private Choice yearChoice;
    private Label dateLabel;

    public DateSelectionApp() {
        frame = new Frame("Date Selection");
        frame.setLayout(new FlowLayout());

        // Create and add Day choice
        dayChoice = new Choice();
        for (int i = 1; i <= 31; i++) {
            dayChoice.add(Integer.toString(i));
        }
        dayChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateDateLabel();
            }
        });
        frame.add(dayChoice);

        // Create and add Month choice
        monthChoice = new Choice();
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                           "August", "September", "October", "November", "December"};
        for (String month : months) {
            monthChoice.add(month);
        }
        monthChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateDateLabel();
            }
        });
        frame.add(monthChoice);

        // Create and add Year choice
        yearChoice = new Choice();
        for (int i = 1990; i <= 2050; i++) {
            yearChoice.add(Integer.toString(i));
        }
        yearChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateDateLabel();
            }
        });
        frame.add(yearChoice);

        // Create and add Date label
        dateLabel = new Label("Selected Date: 01/01/2000");
        frame.add(dateLabel);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    private void updateDateLabel() {
        String selectedDate = dayChoice.getSelectedItem() + "/" +
                              (monthChoice.getSelectedIndex() + 1) + "/" +
                              yearChoice.getSelectedItem();
        dateLabel.setText("Selected Date: " + selectedDate);
    }

    public static void main(String[] args) {
        new DateSelectionApp();
    }
}

