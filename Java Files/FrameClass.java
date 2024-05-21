package framepack;
// import swing lib
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameClass{

	public static JFrame frame = new JFrame();
	public static JButton button;
	public static JLabel label;
	public static JLabel label_1;
	public static JTextField textfield;
	public static JTextField textfield_1;

	public FrameClass(){

		// System.out.println("Hello Shiv Ji and Rajveer This Code Is Directly Push From Editor");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("My Frame");

		// frame.setSize(600,500);
		// frame.setLocation(200,100); 

		frame.setBounds(200,100,500,500);
		frame.setLayout(null);

		// ImageIcon icon = new ImageIcon("icon.png");
		// frame.setIconImage(icon.getImage()); ---> Not Working In Linux Mey Be Work In Windows.
		// Container c = frame.getContentPane();
		// c.setBackground(Color.RED);
		// frame.setResizable(false); ----> Not Working In Linux Mey Be Work In Windows.

		button = new JButton("Click Me");
		button.setBounds(180,300,100,30);
		frame.add(button);
		// button.addActionListener(new ActionListener(){

		// 	@Override
		// 	public void actionPerformed(ActionEvent e){
		// 		label.setText(textfield.getText());
		// 	}

		// });

		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
				JOptionPane.showMessageDisplay(null,"Submitted  Succesfully....");
			}
		});

		label = new JLabel("Enter Username");
		label.setBounds(50,40,200,30);
		frame.add(label);

		textfield = new JTextField();
		textfield.setBounds(250,40,200,30);
		frame.add(textfield);

		label_1 = new JLabel("Enter Password");
		label_1.setBounds(50,100,200,30);
		frame.add(label_1);

		textfield_1 = new JTextField();
		textfield_1.setBounds(250,100,200,30);
		frame.add(textfield_1);		
		

}

	public static void main(String[] args) {
		new FrameClass();
		// FrameClass obj = new FrameClass();
	}
}
