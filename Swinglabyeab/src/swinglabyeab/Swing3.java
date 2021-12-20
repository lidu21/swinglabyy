package swinglabyeab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Swing3 extends JFrame  {
    Swing3() throws IOException {
    setTitle("My frame");
    setSize(500,500);    setLayout(new FlowLayout());
    setBackground(Color.yellow);
    TextField text = new TextField(20);
    String[] sl={"ETHIOPIA","AFRICA","EGYPT","ERITREA"};
    JComboBox jc = new JComboBox(sl);
    setIconImage(new ImageIcon(getClass().getResource("Javapic.jpg")).getImage());
    JButton bt = new JButton();
    Image img= ImageIO.read(getClass().getResource("Javapic.jpg"));
    bt.setIcon(new ImageIcon(img));
    bt.setBackground(Color.lightGray);
    bt.setSize(50,50);
    setResizable(false);
    JRadioButton rbtn1=new JRadioButton("male",true);
    rbtn1.setToolTipText("please press me");
    JRadioButton rbtn2=new JRadioButton("female");
    ButtonGroup gbtn=new ButtonGroup();
    gbtn.add(rbtn1);
    gbtn.add(rbtn2);
    bt.setText("my button");
    Panel proj=new Panel ();
    proj.setSize (800,800);
    proj.setBackground(Color.black);
    proj.add(rbtn1);
    proj.add(rbtn2);
    add(proj);
    add(text);
    add(jc);
    add(bt);
    setLocationRelativeTo(null);
    setVisible(true);
     
    bt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"what..?");
        }
    });

 
   JLabel lyd = new JLabel();

       //Image img = ImageIO.read(getClass().getResource("Javapic.jpg"));
       lyd.setIcon((Icon) img);
       lyd.setSize(200, 200);
lyd.setIcon((Icon) img);

   add(lyd);
}
    public static void main(String[] args) throws IOException{
        new Swing3();
    }
}

   
    
