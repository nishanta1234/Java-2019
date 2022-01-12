// Java Program to create a popup and display
// it on a parent frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PopupMenu extends JFrame implements ActionListener {
	// popup
	Popup p;

	// constructor
	PopupMenu()
	{
		// create a frame
		JFrame frame = new JFrame("pop");

		// create a label
		JLabel label = new JLabel("This is a popup");

		frame.setSize(400, 400);

		PopupFactory popupFactory= new PopupFactory();

		// create a panel
		JPanel p2 = new JPanel();

		// set Background of panel
		p2.setBackground(Color.green);

		p2.add(label);

		// create a popup
		p = popupFactory.getPopup(frame, p2, 200, 80);

		// create a button
		JButton b = new JButton("click");

		// add action listener
		b.addActionListener(this);

		// create a panel
		JPanel p1 = new JPanel();

		p1.add(b);
		frame.add(p1);
        frame.show();
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e)
	{
		p.show();
	}
	// main class
	public static void main(String args[])
	{
		new PopupMenu();
	}
}
