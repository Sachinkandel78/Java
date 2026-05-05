import java.awt.*;

class Demo extends Frame {
    Button btn_OK;
    MenuBar mb;
    Menu mFile, mFont, mColor;
    MenuItem miNew, miClose, miSeparator1;
    MenuItem miFont1, miSeparator2, miFont2, miFont3, miSeparator3;
    MenuItem miRed, miSeparator4, miGreen;
    
    Panel pTop, pMiddle, upper, pBottom, pGender, pMarital;

    Label lbl_maritalstatus, lblcmt, lblhobby, lbl_name, lbl_lastname, lbl_Gender;
    Choice ch;
    TextField txtname, txtln;
    TextArea txtcmt;

    Font fon = new Font("Arial", Font.BOLD, 11);
    Font fon1 = new Font("Arial", Font.ITALIC, 11);
    Font fon0 = new Font("Arial", Font.PLAIN, 11);

    public Demo() {
        super("This is my first Frame");
        setSize(700, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.RED);
        setLayout(null);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Menu bar
        mb = new MenuBar();
        setMenuBar(mb);

        mFile = new Menu("File");
        mFont = new Menu("Font");
        mColor = new Menu("Color");

        mb.add(mFile);
        mb.add(mFont);
        mb.add(mColor);

        miNew = new MenuItem("New");
        miSeparator1 = new MenuItem("-");
        miClose = new MenuItem("Close");

        mFile.add(miNew);
        mFile.add(miSeparator1);
        mFile.add(miClose);

        miFont1 = new MenuItem("Arial - Bold");
        miSeparator2 = new MenuItem("-");
        miFont2 = new MenuItem("Arial - Italic");
        miFont3 = new MenuItem("Arial - Normal");
        miSeparator3 = new MenuItem("-");

        mFont.add(miFont1);
        mFont.add(miSeparator2);
        mFont.add(miFont2);
        mFont.add(miSeparator3);
        mFont.add(miFont3);

        miRed = new MenuItem("Red");
        miSeparator4 = new MenuItem("-");
        miGreen = new MenuItem("Green");

        mColor.add(miRed);
        mColor.add(miSeparator4);
        mColor.add(miGreen);

        // Top panel
        pTop = new Panel();
        pTop.setLayout(null);
        pTop.setBounds(10, 50, 680, 290);
        pTop.setBackground(Color.GREEN);

        // Upper panel
        upper = new Panel();
        upper.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        upper.setBackground(Color.WHITE);
        upper.setBounds(5, 5, 670, 30);
        
        ch = new Choice();
        ch.addItem("Choose");
        ch.addItem("MR");
        ch.addItem("Miss");
        upper.add(ch);

        lbl_name = new Label("First Name");
        upper.add(lbl_name);

        txtname = new TextField(15);
        upper.add(txtname);

        lbl_lastname = new Label("Last Name");
        upper.add(lbl_lastname);

        txtln = new TextField(15);
        upper.add(txtln);

        // Gender panel
        pGender = new Panel();
        pGender.setBounds(5, 40, 670, 30);
        lbl_Gender = new Label("Gender");
        pGender.add(lbl_Gender);

        // Marital status panel
        pMarital = new Panel();
        pMarital.setBounds(5, 75, 670, 30);
        lbl_maritalstatus = new Label("Marital Status");
        pMarital.add(lbl_maritalstatus);

        // Hobby label
        lblhobby = new Label("Hobbies");
        lblhobby.setBounds(300, 110, 100, 30);
        lblhobby.setBackground(Color.RED);
        lblhobby.setForeground(Color.BLACK);

        // Comment label and textarea
        lblcmt = new Label("Comment");
        lblcmt.setBounds(10, 145, 70, 30);
        txtcmt = new TextArea();
        txtcmt.setBounds(90, 145, 580, 70);

        // OK Button
        btn_OK = new Button("OK");
        btn_OK.setBounds(300, 250, 50, 20);
        pTop.add(btn_OK);

        // Add everything to top panel
        pTop.add(upper);
        pTop.add(pGender);
        pTop.add(pMarital);
        pTop.add(lblhobby);
        pTop.add(lblcmt);
        pTop.add(txtcmt);

        add(pTop);
        show();
    }

    public static void main(String[] str) {
        new Demo();
    }
}