import javax.swing.*;

public class DugmePrimer {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");
		b.setBounds(100, 100, 140, 40);
		f.add(b);
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);   
	}
}
