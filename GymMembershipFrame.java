package za.ac.tut.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class GymMembershipFrame extends JFrame {

    // Panels
    private JPanel mainPnl;
    private JPanel headingsPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel clientDetailsPnl;
    private JPanel contractTypePnl;
    private JPanel personalTraninerPnl;
    private JPanel contractOptionsPnl;
    private JPanel textAreaPnl;
    private JPanel btnPnl;

    // labels
    private JLabel headingsLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel personalTrainerLbl;

    // textField
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNoTxtFld;

    // comboBox
    private JComboBox<String> genderComborBox;

    // radio buttons
    private JRadioButton monToMonRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    private ButtonGroup contractGroup;

    // checkbox 
    private JCheckBox personalTrainerBox;

    // Text Area 
    private JTextArea commentsTxtArea;

    // JScrollPane
    private JScrollPane scrollpane;

    // normal Button
    private JButton applyBtn;

    public GymMembershipFrame() {
        setTitle("Gym membership");
        setSize(550, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        // MAIN PANEL WITH BORDERLAYOUT
        mainPnl = new JPanel(new BorderLayout(10, 10));

        // HEADING
        headingsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingsLbl = new JLabel("Membership Form");
        headingsLbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        headingsLbl.setForeground(Color.BLUE);
        headingsLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingsPnl.add(headingsLbl);

        // CLIENT DETAILS PANEL
        clientDetailsPnl = new JPanel(new GridLayout(4, 1,1,1));
        clientDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.red),"Client details"));

        // Name row
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameLbl = new JLabel("Name:        ");
        nameTxtFld = new JTextField(15);
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);

        // Surname row
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnameLbl = new JLabel("Surname:  ");
        surnameTxtFld = new JTextField(15);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);

        // ID row
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoLbl = new JLabel("Id no:          ");
        idNoTxtFld = new JTextField(15);
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);

        // Gender row
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderLbl = new JLabel("Gender:      ");
        genderComborBox = new JComboBox();
        genderComborBox.addItem("Male");
        genderComborBox.addItem("Female");
        genderPnl.add(genderLbl);
        genderPnl.add(genderComborBox);
        
        clientDetailsPnl.add(namePnl);
        clientDetailsPnl.add(surnamePnl);
        clientDetailsPnl.add(idNoPnl);
        clientDetailsPnl.add(genderPnl);

        // CONTRACT OPTIONS
        contractOptionsPnl = new JPanel(new GridLayout(2, 1));
        contractOptionsPnl.setBorder(new TitledBorder(new LineBorder(Color.green),"Contract options"));

        // contract type row
        contractTypePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractTypeLbl = new JLabel("Type of contract: ");
        monToMonRadBtn = new JRadioButton("Month-to-month");
        sixMonthsRadBtn = new JRadioButton("Six months");
        annualRadBtn = new JRadioButton("Annual");

        // Group radio buttons
        contractGroup = new ButtonGroup();
        contractGroup.add(monToMonRadBtn);
        contractGroup.add(sixMonthsRadBtn);
        contractGroup.add(annualRadBtn);

        contractTypePnl.add(contractTypeLbl);
        contractTypePnl.add(monToMonRadBtn);
        contractTypePnl.add(sixMonthsRadBtn);
        contractTypePnl.add(annualRadBtn);

        // personal trainer row
        personalTraninerPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerLbl = new JLabel("Select the checkbox if you need a personal trainer");
        personalTrainerBox = new JCheckBox();
        personalTraninerPnl.add(personalTrainerLbl);
        personalTraninerPnl.add(personalTrainerBox);

        contractOptionsPnl.add(contractTypePnl);
        contractOptionsPnl.add(personalTraninerPnl);

        // TEXT AREA
        textAreaPnl = new JPanel(new BorderLayout());
        textAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.blue),"Comments"));
        
        commentsTxtArea = new JTextArea(8, 40);
        scrollpane = new JScrollPane(commentsTxtArea);
        textAreaPnl.add(scrollpane, BorderLayout.CENTER);

        // BUTTON
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        applyBtn = new JButton("APPLY");
        btnPnl.add(applyBtn);

        // assemble main panel
        mainPnl.add(headingsPnl, BorderLayout.NORTH);
        mainPnl.add(clientDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(contractOptionsPnl, BorderLayout.SOUTH);

        add(mainPnl, BorderLayout.NORTH);
        add(textAreaPnl, BorderLayout.CENTER);
        add(btnPnl, BorderLayout.SOUTH);

        setVisible(true);
    }

  
}
