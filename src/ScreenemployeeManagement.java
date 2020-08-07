import Nhansu.Employee;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ScreenemployeeManagement extends JFrame {

    private JPanel panelMain;
    private JTabbedPane tabbedPane1;
    private JPanel fix;

    private JPanel namefield;
    private JPanel yearfield;
    private JPanel genderfield;
    private JPanel fromfield;
    private JPanel phonefield;
    private JPanel emailfield;
    private JPanel edufield;
    private JPanel positionfield;
    private JPanel wagefield;

    private JLabel HRname;
    private JLabel HRyear;
    private JLabel HRgender;
    private JLabel HRfrom;
    private JLabel HRphone;
    private JLabel HRemail;
    private JLabel HRedu;
    private JLabel HRposition;
    private JLabel HRwage;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;

    private JButton ADDNEW1;
    private JButton SAVEEXIST1;


    private JButton searchButton;

    private JButton backToMainButton;
    private JButton backToMainButton1;
    private JButton backToMainButton2;
    private JButton backToMainButton3;
    private JButton backToMainButton4;
    private JButton backToMainButton5;

    private JButton DELETEButton;
    private JButton DELETEButton1;
    private JButton DELETEButton2;
    private JButton DELETEButton3;
    private JButton DELETEButton4;
    private JButton DELETEButton5;

    private JLabel MNname;
    private JLabel MNyear;
    private JLabel MNgender;
    private JLabel MNfrom;
    private JLabel MNphone;
    private JLabel MNemail;
    private JLabel MNedu;
    private JLabel MNposition;
    private JLabel MNwage;

    private JTable table1;
    private JButton ADDNEW;
    private JButton SAVEEXIST;


    private JList mainList;
    private JList MNlist;
    private JList HRList;
    private JList saleList;
    private JList mktList;
    private JList accList;
    private JList itList;
    private JButton ADDNE6;
    private JButton EXITButton;
    private JButton SAVEEXIST6;
    private JButton DELETEButton6;
    private JButton ADDNEW2;
    private JButton SAVEEXIST2;
    private JButton ADDNEW3;
    private JButton SAVEEXIST3;
    private JButton ADDNEW4;
    private JButton SAVEEXIST4;
    private JButton ADDNEW5;
    private JButton SAVEEXIST5;


    private ArrayList<Employee> people;
    private DefaultListModel listPeopleModel;


    ScreenemployeeManagement() {
        super("Employee Management");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<Employee>();
        listPeopleModel = new DefaultListModel();
        mainList.setModel(listPeopleModel);

        createTable();
        ADDNEW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        SAVEEXIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mainList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }



    public JTable getTable1() {
        return table1;
    }

    private void createTable() {
        table1.setModel(new DefaultTableModel(
                null,
                new String[] {"NAME", "YEAR", "GENDER", "PHONE", "EMAIL", "EDU", "POSITION", "WAGE"}
        ));
    }



    public void refreshPeopleList() {
        listPeopleModel.removeAllElements();
        System.out.println("Remove all people from list");
        for (Employee employee : people) {
            System.out.println("Adding Employee to list:" + employee.getName());
            listPeopleModel.addElement(employee.getName());

        }
    }

    public void addEmployee(Employee employee) {
        people.add(employee); //everytime adding a employee, --> refresh the list
        refreshPeopleList();
    }



    public static void main(String[] args) {
        ScreenemployeeManagement screenemployeeManagement = new ScreenemployeeManagement();
        screenemployeeManagement.setVisible(true);

        Color color = new Color(80, 10, 5);

        screenemployeeManagement.getContentPane().setBackground(Color.pink);

        Employee Tung = new Employee("NGUYEN QUOC TUNG", "1995", "Male", "0985671295", "tunghaha@gmail.com", "University", "CEO", "100,000,000");
        Employee Quan = new Employee("LE HONG QUAN", "1995", "Male", "0992771295", "tunghaha@gmail.com", "University", "CEO", "100,000,000");
        Employee Huy = new Employee("NGUYEN QUOC TUNG", "1995", "Male", "0985671295", "tunghaha@gmail.com", "University", "CEO", "100,000,000");
        Employee Thuy = new Employee("NGUYEN QUOC TUNG", "1995", "Male", "0985671295", "tunghaha@gmail.com", "University", "CEO", "100,000,000");
        Employee Trang = new Employee("NGUYEN QUOC TUNG", "1995", "Male", "0985671295", "tunghaha@gmail.com", "University", "CEO", "100,000,000");

        screenemployeeManagement.addEmployee(Tung);
        screenemployeeManagement.addEmployee(Quan);
        screenemployeeManagement.addEmployee(Huy);
        screenemployeeManagement.addEmployee(Thuy);
        screenemployeeManagement.addEmployee(Trang);
    }


}


