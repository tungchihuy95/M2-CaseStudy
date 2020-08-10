import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Employee<Employees> extends JFrame {

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
    private JPanel deptfield;
    private JPanel wagefield;

    private JLabel HRname;
    private JLabel HRyear;
    private JLabel HRgender;
    private JLabel HRfrom;
    private JLabel HRphone;
    private JLabel HRemail;
    private JLabel HRedu;
    private JLabel HRdept;
    private JLabel HRwage;

    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textName;
    private JTextField textID;
    private JTextField textYear;
    private JTextField textAge;
    private JTextField textGender;
    private JTextField textFrom;
    private JTextField textPhone;
    private JTextField textEmail;
    private JTextField textEdu;
    private JTextField textDept;
    private JTextField textWage;

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
    private JLabel MNdept;
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
    private JButton ADDNEW6;
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


    Employee() {
        super("Employee Management");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<Employee>();
        listPeopleModel = new DefaultListModel();
        mainList.setModel(listPeopleModel);
        SAVEEXIST6.setEnabled(false);


//        ADDNEW.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        SAVEEXIST.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        DELETEButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        ADDNEW6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person person = new Person(

                        textID.getText(),
                        textName.getText(),
                        textYear.getText(),
                       textAge.getText(),
                        textGender.getText(),
                        textFrom.getText(),
                        textPhone.getText(),
                        textEmail.getText(),
                        textEdu.getText(),
                        textDept.getText(),
                        textWage.getText()

                );
                people.add(person);
                refreshPeopleList();
            }
        });

//                Employee person = people.get(employeeID);
//                person.setName(textName.getText());
//                person.setId(Integer.parseInt(textID.getText()));
//                person.setYear(textYear.getText());
//                person.setGender(textGender.getText());
//                person.setFrom(textFrom.getText());
//                person.setPhone(textPhone.getText());
//                person.setEmail(textEmail.getText());
//                person.setEdu(textEdu.getText());
//                person.setDept(textDept.getText());
//                person.setWage(textWage.getText());
//                refreshPeopleList();
//            }

        SAVEEXIST6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int employeeID = mainList.getSelectedIndex();
                if (employeeID >= 0) {
                    Employee person = people.get(employeeID);
                    person.setName(textName.getText());
                    person.setId(Integer.parseInt(textID.getText()));
                    person.setYear(textYear.getText());
                    person.setGender(textGender.getText());
                    person.setFrom(textFrom.getText());
                    person.setPhone(textPhone.getText());
                    person.setEmail(textEmail.getText());
                }
            }
        });
        DELETEButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mainList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int employeeID = mainList.getSelectedIndex();
                if (employeeID >= 0) {
                    Employee person = people.get(employeeID);
                    textID.setText(String.valueOf(person.getId()));
                    textName.setText(person.getName());
                    textYear.setText(person.getYear().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    textAge.setText(Integer.toString(person.getAge()));
                    textGender.setText(person.getGender());
                    textFrom.setText(person.getFrom());
                    textPhone.setText(person.getPhone());
                    textEmail.setText(person.getEmail());
                    textEdu.setText(person.getEdu());
                    textDept.setText(person.getDept());
                    textWage.setText(person.getWage());
                    SAVEEXIST6.setEnabled(true);
                } else {
                    SAVEEXIST6.setEnabled(false);
                }
            }
        });

    }



//    public JTable getTable1() {
//        return table1;
//    }

    private void createTable() {
        table1.setModel(new DefaultTableModel());
    }



    public void refreshPeopleList() {
        listPeopleModel.removeAllElements();
        System.out.println("Remove all people from list");
        for (Employee person: people) {
            System.out.println("Adding Employee to list:" + person.getName());
            listPeopleModel.addElement(person.getName());

        }
    }

    public void addPerson(Employee person) {
        people.add(person); //everytime adding a person// , --> refresh the list
        refreshPeopleList();
    }



    public static void main(String[] args) {
           Employee screenpersonManagement = new Employee();
        screenpersonManagement.setVisible(true);

        Color color = new Color(80, 10, 5);

        screenpersonManagement.getContentPane().setBackground(Color.pink);

        Employee Tung = new Employee(001, "NGUYEN QUOC TUNG", "19/02/1995", "Male", "Hung yen", "0985671295", "tunghaha@gmail.com", "University", "MN", "100,000,000");
        Employee Quan = new Employee(002, "LE HONG QUAN", "20/06/1995", "Male", "Hoa binh", "0992771295", "quankun@gmail.com", "University", "HR", "100,000,000");
        Employee Huy = new Employee(003, "TRINH VAN HUY", "04/05/1995", "Male","Nghe an", "0985671295", "hitachi@gmail.com", "College", "Sale", "100,000,000");
        Employee Thuy = new Employee(004, "LE THI THUY", "25/11/1988", "Female", "Thanh hoa","0985671295", "thuythuy@gmail.com", "University", "MKT", "100,000,000");
        Employee Trang = new Employee(005, "PHAM THUY TRANG", "31/12/1993", "Female", "Quang ninh", "0985671295", "trangtrong@gmail.com", "Master", "ACC", "100,000,000");

        screenpersonManagement.addPerson(Tung);
        screenpersonManagement.addPerson(Quan);
        screenpersonManagement.addPerson(Huy);
        screenpersonManagement.addPerson(Thuy);
        screenpersonManagement.addPerson(Trang);
    }

}


