package swing.companygui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompanyFrame extends JFrame {

  private DefaultListModel employeeListModel;

  public CompanyFrame(DefaultListModel employeeListModel) {
    super("Company GUI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.employeeListModel = employeeListModel;
    setLayout(new BorderLayout());
    JList empList = new JList(employeeListModel);
    add(new JScrollPane(empList), BorderLayout.CENTER);
    add(createButtonPanel(), BorderLayout.SOUTH);
  }

  private JPanel createButtonPanel() {
    JButton newSalariedEmpButton = new JButton("New Salaried Employee...");
    newSalariedEmpButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        SalariedEmployeeDialog sed =
                new SalariedEmployeeDialog(CompanyFrame.this);
        if (sed.showDialog()) {
          employeeListModel.addElement(sed.getEmployee());
        }
      }
    });
    JButton newHourlyEmpButton = new JButton("New Hourly Employee...");
    newHourlyEmpButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        HourlyEmployeeDialog hed =
                new HourlyEmployeeDialog(CompanyFrame.this);
        if (hed.showDialog()) {
          employeeListModel.addElement(hed.getEmployee());
        }
      }
    });


    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    panel.add(Box.createHorizontalGlue());
    panel.add(newSalariedEmpButton);
    panel.add(newHourlyEmpButton);
    panel.add(Box.createHorizontalGlue());
    return panel;
  }

}
