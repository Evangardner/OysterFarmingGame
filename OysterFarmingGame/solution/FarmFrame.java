package solution;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import solution.*;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
public class FarmFrame {
	JFrame frame;
	JTextArea map;
	Farm farm;
	JPanel panel;

	public FarmFrame() {
		frame = new JFrame();
		farm = new Farm(25);
		map = new JTextArea("map");
		panel = new JPanel(new BorderLayout());
		map.setEditable(false);
		map.setText(farm.toString());
		frame.setSize(500,500);
		frame.setResizable(false);
		map.setBackground(Color.BLUE);
		panel.add(map, BorderLayout.CENTER);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FarmFrame farmFrame = new FarmFrame();
	}
}


