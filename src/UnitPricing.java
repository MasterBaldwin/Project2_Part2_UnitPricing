import javax.swing.*;

public class UnitPricing {
// Written by: Mike Baldwin
// Calculates the numerical value of a specified quantity of items at a specific price point

public static void main(String[] args) {
    JPanel panel = new JPanel();
    JTextField quantityVar = new JTextField(3);
    JTextField unitPriceVar = new JTextField(3);
    int quantity, unitPrice, confirmCode;

    panel.add(new JLabel("Quantity:"));   panel.add(quantityVar);  panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("Unit price:")); panel.add(unitPriceVar);

    confirmCode = JOptionPane.showConfirmDialog(
            null,
            panel,
            "Unit Pricing",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null);

    if (confirmCode == JOptionPane.OK_OPTION) {
        quantity = Integer.parseInt(quantityVar.getText());
        unitPrice = Integer.parseInt(unitPriceVar.getText());
        JOptionPane.showMessageDialog(
                null,
                "The Quantity desired is: " + quantity + "\n" +
                        "The Unit Price is: $" + unitPrice + "\n" +
                        "The Total Amount is: $" + (quantity * unitPrice),
                "Unit Pricing",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
}
