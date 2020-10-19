package sample;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class sampleForm extends JFrame{
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JList list1;
    private JPanel panelMain;
    private JTextField textName;
    private JTextField textID;
    private JTextField textAge;
    private JTextField textGender;
    private JTextField textBloodtype;
    private JTextField textWeight;
    private JTextField textHeight;
    private JButton addButton;
    private JButton SaveButton;
    private ArrayList<Patient> patient;
    private DefaultListModel listpatientModel;

    sampleForm(){
        super("homework2");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        patient = new ArrayList<Patient>();
        listpatientModel = new DefaultListModel();
        list1.setModel(listpatientModel);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void refreshPatientList(){
    listpatientModel.removeAllElements();
    System.out.println("Remove all patient from list");

    for (Patient p : patient){
        System.out.println("Add patient to list: " +p.getName());
        listpatientModel.addElement(p.getName());
    }
}

    public void addPatient(Patient p) {
        patient.add(p);
        refreshPatientList();
    }


    public static void main(String[] args) {
        sampleForm sampleForm = new sampleForm();
        sampleForm.setVisible(true);


    }
}