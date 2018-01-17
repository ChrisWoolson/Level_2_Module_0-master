package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton list = new JButton();
	JPanel panel = new JPanel();
	ArrayList<String> name = new ArrayList<String>();

	void setup() {
		frame.add(panel);
		panel.add(add);
		panel.add(list);
		frame.setVisible(true);
		add.setText("Add Name");
		list.setText("View Names");
		list.addActionListener(new viewButtonHandler());
		add.addActionListener(new NameButtonHandler());
		frame.pack();

		name.add("Chris");
		name.add("Bob");
		name.add("Joe");
		name.add("Bill");
		name.add("Sam");

	}

	class viewButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(String.join(",", name));
JOptionPane.showMessageDialog(null, String.join(",", name));
		}

	}

	class NameButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name1 = JOptionPane.showInputDialog("Input your name");
name.add(name1);
		}

	}
}
