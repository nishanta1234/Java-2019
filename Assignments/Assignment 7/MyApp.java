import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyApp implements ActionListener {
	JFrame f;

	JPanel topPanel;
	JButton btn1, btn2, btn3, btn4;

	JPanel popPanels;

	JPanel pop1;
	JButton newPop, savePop, saveAsPop;

	JPanel pop2;

	JPanel pop3;
	JButton windowView, panelView;

	JPanel pop4;
	JButton openFile, openFolder;

	Popup pop;

	PopupFactory popFactory;

	MyApp() {
		// Frame
		f = new JFrame("App");
		f.setSize(800, 800);
		f.setVisible(true);
		f.setLayout(new GridLayout(5, 1, 0, 2));

		// Making the frame closeable
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		
		topPanel = new JPanel();

		topPanel.setLayout(new GridLayout(1, 8));

		btn1 = new JButton("File");
		btn2 = new JButton("Edit");
		btn3 = new JButton("View");
		btn4 = new JButton("Open");

		topPanel.add(btn1);
		topPanel.add(btn2);
		topPanel.add(btn3);
		topPanel.add(btn4);

		popPanels = new JPanel();

		newPop = new JButton("New File");
		savePop = new JButton("Save");
		saveAsPop = new JButton("Save As");

		btn1.add(newPop);
		btn1.add(savePop);
		btn1.add(saveAsPop);

		pop1.setLayout(new GridLayout(3, 1));

		pop3 = new JPanel();

		pop3 = new JPanel();

		windowView = new JButton("Window View");
		panelView = new JButton("Panel View");

		pop3.add(windowView);
		pop3.add(panelView);
		// Layout
		pop3.setLayout(new GridLayout(2, 1));

		// popOpen
		pop3 = new JPanel();
		// Buttons
		openFile = new JButton("Open File");
		openFolder = new JButton("Open Folder");

		pop4.add(openFile);
		pop4.add(openFolder);
		pop4.setLayout(new GridLayout(2, 1));

		popPanels = new JPanel();
		popPanels.add(pop1);
		popPanels.add(pop2);
		popPanels.add(pop3);
		popPanels.add(pop4);
		popPanels.setLayout(new GridLayout(1, 4));

		// Adding panels to Frame
		f.add(topPanel);
		f.add(popPanels);

		pop1.setVisible(false);
		pop2.setVisible(false);
		pop3.setVisible(false);
		pop4.setVisible(false);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			btn1.setVisible(true);
			btn2.setVisible(false);
			btn3.setVisible(false);
			btn4.setVisible(false);
		} else if (e.getSource() == btn2) {
			btn2.setVisible(true);
			btn1.setVisible(false);
			btn3.setVisible(false);
			btn4.setVisible(false);
		} else if (e.getSource() == btn3) {
			btn3.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn4.setVisible(false);
		} else if (e.getSource() == btn4) {
			btn4.setVisible(true);
			btn1.setVisible(false);
			btn2.setVisible(false);
			btn3.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new MyApp();
	}
}