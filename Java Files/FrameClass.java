package framepack;
import framepack.btn;
// import swing lib
import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class FrameClass{

	public JFrame frame = new JFrame();
	public JButton button;
	public JLabel label;
	public JTextField textfield;

	public FrameClass(){

		// System.out.println("Hello Shiv Ji and Rajveer This Code Is Directly Puch From Editor");
	

		// frame.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){exitForm(e);}});
		// frame.setDafaultCloseOperation(JFrame.EXIT_ON_CLOSE); ---> Not Working.

		frame.setVisible(true);
		frame.setTitle("My Frame");

		// frame.setSize(600,500);
		// frame.setLocation(200,100); 

		frame.setBounds(200,100,400,400);
		frame.setLayout(null);

		// ImageIcon icon = new ImageIcon("icon.png");
		// frame.setIconImage(icon.getImage()); ---> Not Working In Linux Mey Be Work In Windows.
		// Container c = frame.getContentPane();
		// c.setBackground(Color.RED);
		// frame.setResizable(false); ----> Not Working In Linux Mey Be Work In Windows.
}

	public static void main(String[] args) {
		// new FrameClass();
		// FrameClass obj = new FrameClass();
	}
}