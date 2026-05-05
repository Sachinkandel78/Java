import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Demomenu extends Frame {
    MenuBar mb;
    Menu mFile, mFont, mColor;
    MenuItem miNew, miClose, miSeparator1;
    MenuItem miFont1, miSeparator2, miFont2, miFont3, miSeparator3;
    MenuItem miRed, miSeparator4, miGreen;

    Panel pTop;
    Panel upper;
    Panel pGender;
    Panel pMarital;
    Panel pMiddle;
    Panel pBottom;

    public Demo() {
        super("This is my first Frame");
        setSize(700, 500);
        setBackground(Color.RED);
        setLayout(null);

        // ---------- MENU BAR ----------
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
        miSeparator2 = new MenuItem("-");
        miFont2 = new MenuItem("Arial-Italic");
        miFont3 = new MenuItem("Arial-Normal");
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

        setMenuBar(mb);   // Add MenuBar to Frame

        // ---------- PANELS ----------
        // Top Panel
        pTop = new Panel();
        pTop.setLayout(null);
        pTop.setBounds(10, 50, 680, 200);
        pTop.setBackground(Color.GREEN);

        // Upper panel
        upper = new Panel();
        upper.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        upper.setBackground(Color.WHITE);
        upper.setBounds(5, 5, 670, 30);
        pTop.add(upper);

        // Gender panel
        pGender = new Panel();
        pGender.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pGender.setBounds(5, 55, 670, 30);
        pGender.setBackground(Color.WHITE);
        pTop.add(pGender);

        // Marital panel
        pMarital = new Panel();
        pMarital.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pMarital.setBounds(5, 105, 670, 30);
        pMarital.setBackground(Color.WHITE);
        pTop.add(pMarital);

        // Middle panel
        pMiddle = new Panel();
        pMiddle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pMiddle.setBounds(10, 250, 680, 70);
        pMiddle.setBackground(Color.RED);

        // Bottom panel
        pBottom = new Panel();
        pBottom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pBottom.setBounds(10, 340, 680, 100);
        pBottom.setBackground(Color.WHITE);

        // Add panels to frame
        add(pTop);
        add(pMiddle);
        add(pBottom);

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}