package multiFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyUI2 extends JDialog {
	private static final long serialVersionUID = 1L;
	public JTextField txt1;

	public MyUI2(String title) {
		setTitle("My JDialog");
		doAddSomeControl();
	}

	public void doAddSomeControl() {
		JPanel pn = new JPanel();
		JButton btn1 = new JButton("Hi ! My name is JDialog");
		JButton btn2 = new JButton("Click me to close!");
		txt1 = new JTextField(15);
		JLabel lbl1 = new JLabel("Hello! Hello!");
		pn.add(btn1);
		pn.add(txt1);
		pn.add(lbl1);
		pn.add(btn2);

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

		Container con = getContentPane();
		con.add(pn);
		setSize(300, 200);
		setLocationRelativeTo(null);
	}
}
