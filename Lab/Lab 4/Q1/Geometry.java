import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
public class Geometry extends JPanel{
    public void paint(Graphics g){
        //Graphics2D g2 = (Graphics2D)g.create();
        setSize(700,700);
        g.drawOval(50,50,60,60);
        g.setColor(Color.YELLOW);
        g.fillOval(50,50,60,60);
        g.setColor(Color.RED);
        g.fillPolygon(new int[]{190,120,110}, new int[]{190,200,110} ,3);
        g.setColor(Color.BLACK);
        g.fillOval(300,350,100,60);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{90,160,200,160,90,50}, new int[]{200,220,270,350,350,270},6);
        g.setColor(Color.GRAY);
        g.fillPolygon(new int[]{90,160,200,160,90}, new int[]{400,400,470,550,550},5);
        
        
    }
    public static void main(String[] args){
        JFrame frame = new JFrame();
        //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);  );
        frame.setSize(800,800);
        Geometry geometry = new Geometry();
        frame.add(geometry);
        frame.setVisible(true);
    }
}