package framepack;
// import swing lib
import javax.swing.*;
import java.awt.*;

public class FrameClass{

	public static void frame(){
		// System.out.println("Hello Shiv Ji and Rajveer This Code Is Directly Puch From Editor");
	
		JFrame frame = new JFrame();
		// frame.setDafaultCloseOperation(JFrame.EXIT_ON_CLOSE); ---> Not Working.
		frame.setVisible(true);
		frame.setTitle("My Frame");
		// frame.setSize(600,500);
		// frame.setLocation(200,100); 
		frame.setBounds(200,100,600,500);
		// ImageIcon icon = new ImageIcon("icon.png");
		// frame.setIconImage(icon.getImage()); ---> Not Working In Linux Mey Be Work In Windows.
		// Container c = frame.getContentPane();
		// c.setBackground(Color.RED);
		// frame.setResizable(false); ----> Not Working In Linux Mey Be Work In Windows.

	}

	public static void main(String[] args) {
		
		// frame();
	}
}