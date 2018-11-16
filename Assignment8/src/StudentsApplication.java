import javafx.scene.control.RadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentsApplication extends JFrame {

    private JTable studentsTable;

    public StudentsApplication(Students students) {
        JFrame jf = new JFrame("Student Table");
        jf.setSize(500, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton btn = new JButton("Add");
        panel.add(btn);
        JTextField textfield2 = new JTextField("Roll");
        textfield2.setColumns(5);
        panel.add(textfield2);
        JTextField textfield = new JTextField("First");
        textfield.setColumns(5);
        panel.add(textfield);
        JTextField textfield1 = new JTextField("Last");
        textfield1.setColumns(5);
        panel.add(textfield1);
        JRadioButton randioButton = new JRadioButton("Gender");
        panel.add(randioButton);
        StudentsTableModel model = new StudentsTableModel(students);
        studentsTable = new JTable(model);
        JScrollPane jsp = new JScrollPane(studentsTable);
        panel.add(jsp);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(isNumeric(textfield2.getText())){
                    students.addStudent(new Student(Integer.valueOf(textfield2.getText()),textfield.getText(),textfield1.getText(), randioButton.isSelected()));
//                new StudentsApplication(students);
                    studentsTable.updateUI();
                }
            }
        });
        jf.setContentPane(panel);
        jf.setVisible(true);
    }

    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            JFrame jf = new JFrame("Error");
            jf.setSize(250, 250);
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            JLabel t1 = new JLabel("Please Type Digit in Roll");
            t1.setFont(new Font("TimesRoman",Font.PLAIN,20));
            t1.setForeground(Color.red);
            t1.setBounds(20,40,250,100);
            panel.add(t1);

            jf.setContentPane(panel);
            jf.setVisible(true);
//            System.out.println("Wrong");
            return false;
        }
    }



    public static void main(String[] args) {
        Students s = new Students();
        s.addStudent(new Student(100, "Divya", "Sharma", true));
        s.addStudent(new Student(101, "Mihir", "Salunke", false));
        new StudentsApplication(s);
    }

}

class Students {
    private Collection<Student> students = new ArrayList<Student>();

    public Collection<Student> getStudents() {
        return students;

    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public int getNumberOfStudents() {
        return getStudents().size();
    }

}

class Student {
    int roll;
    String first;
    String last;
    boolean gender = false;

    public Student(int roll, String first, String last, boolean gender) {
        this.roll = roll;
        this.first = first;
        this.last = last;
        this.gender = gender;
    }
}

class StudentsTableModel implements TableModel {

    private Students students;

    public StudentsTableModel(Students students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.getNumberOfStudents();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ROLL";
        }
        if (columnIndex == 1) {
            return "First";
        }
        if (columnIndex == 2)
            return "Last";
        if (columnIndex == 3)
            return "Gender";
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 3) {
            return Boolean.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Collection<Student> s = students.getStudents();
        int row = -1;
        for (Student student : s) {
            row++;
            if (row == rowIndex) {
                if (columnIndex == 0) {
                    return student.roll + "";
                }
                if (columnIndex == 1) {
                    return student.first;
                }
                if (columnIndex == 2) {
                    return student.last;
                }
                if (columnIndex == 3) {
                    return student.gender;
                }
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }

}


