import java.awt.*;

import javax.swing.*;

public class SingleDoorUI extends JPanel {

	JTextField textDoorStatus = null;

	public SingleDoorUI() {

		System.out.println("Creating layout");
		setLayout(new FlowLayout());
		JLabel label = new JLabel("Single Door");
		textDoorStatus = new JTextField(10);
		textDoorStatus.setText("CLOSED");
		textDoorStatus.setEnabled(false);
		add(label);
		add(textDoorStatus);

	}

	public void setDoorStatus(String doorStatus) {
		textDoorStatus.setText(doorStatus);
		if (doorStatus.equalsIgnoreCase("CLOSED") || doorStatus.equalsIgnoreCase("OPENED")) {
			textDoorStatus.setBackground(null);
		} else {
			textDoorStatus.setBackground(Color.yellow);
		}
	}

}
