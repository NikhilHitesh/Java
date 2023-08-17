package framepack;
import framepack.FrameClass;
import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class btn{

	public JFrame frame = new JFrame();
	// public JFrame frame;
	public JButton button;
	public JLabel label;
	public JTextField textfield;

	public btn(){
		button = new JButton("Click Me");
		button.setBounds(50,40,100,30);
		frame.add(button);

		label = new JLabel("This is label");
		label.setBounds(200,40,100,30);
		frame.add(label);
		new FrameClass();		

	}
	public static void main(String[] args) {
		new btn();
	}
}
