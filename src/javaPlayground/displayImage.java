package javaPlayground;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class displayImage {
    public static void main(String avg[]) throws IOException
    {
        displayImage abc=new displayImage();
    }

    public displayImage() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("C:\\Users\\cvr2n\\OneDrive\\Desktop\\CS 121\\CS121\\JPG Images\\beach.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1000,1000);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
