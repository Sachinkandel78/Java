import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

class Demo3 extends Frame {
    MenuBar mb;
    Menu mFile, mFont, mColor;
    MenuItem miNew, miSeparator1, miClose;
    MenuItem miFont1, miFont2, miFont3;
    MenuItem miRed, miGreen;
    Panel pTop, upper, pGender, pMarital, pMiddle, pBottom;
    Choice ch;
    Label lbl_maritalstatus;
    Label lbl_gender;
    Label lbl_comment;
    Label lbl_Firstname;
    Label lbl_Lastname;
    Label lbl_hobbies;
    choice ch;
    TextField txtFname;
    TextField txtLname;
    TextArea txtcomment;

    public Demo3() {
        super("This is my first frame bujis ni");
        setLayout(null);
        setBounds(750, 350, 600, 400);  // Set width & height
        setBackground(Color.RED);
        

        mb = new MenuBar();
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

        miFont1 = new MenuItem("Arial-Bold");
        miFont2 = new MenuItem("Arial-Italic");
        miFont3 = new MenuItem("Arial-Normal");
        mFont.add(miFont1);
        mFont.add(miFont2);
        mFont.add(miFont3);

        miRed = new MenuItem("Red");
        miGreen = new MenuItem("Green");
        mColor.add(miRed);
        mColor.add(miGreen);

        setMenuBar(mb);

       pTop=new Panel();
       pTop.setLayout(null);
       pTop.setBounds(10,50,680,290);
       pTop.setBackground(Color.GREEN);

       upper=new Panel();
       upper.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
       upper.setBounds(5,5,670,30);
       upper.setBackground(Color.WHITE);

       ch=new Choice();
       ch.addItem("Choose");
       ch.addItem("Mr.");
       ch.addItem("Mrs");
       ch.addItem("Miss");
       upper.add(ch);
       pTop.add(upper);

      pGender=new Panel();
      pGender.setLayout(new  FlowLayout(FlowLayout.CENTER,5,5));
      pGender.setBounds(5,31,670,30);
      pGender.setBackground(Color.WHITE);
      pTop.add(pGender);

      pMarital=new Panel();
      pMarital.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
      pMarital.setBounds(5,61,670,30);
      pMarital.setBackground(Color.WHITE);
      pTop.add(pMarital);

      pMiddle=new Panel();
      pMiddle.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
      pMiddle.setBounds(5,90,670,30);
      pMiddle.setBackground(Color.RED);
       lbl=new Label("This is a label");
       pMiddle.add(lbl);
      pTop.add(pMiddle);

      pBottom=new Panel();
      pBottom.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
      pBottom.setBounds(5,130,670,100);
      pBottom.setBackground(Color.WHITE);
      pTop.add(pBottom);


         add(pTop);

        setVisible(true);

        // Close button functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Demo3();
    }
}
