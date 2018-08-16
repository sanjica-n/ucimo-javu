import java.awt.event.*;  
import javax.swing.*;   
 
public class DugmeAkcijaPrimer {  
	public static void main(String[] args) {

		JFrame f=new JFrame("Dugme primer");  
		final JTextField tf=new JTextField();  
		tf.setBounds(50,50, 150,20);  
		JButton b=new JButton("Klikni ovde");  
		b.setBounds(50, 100, 140, 40);  
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				tf.setText("Bravo!");  
			}  
		});  
		f.add(b);f.add(tf);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);

	}  
}  
