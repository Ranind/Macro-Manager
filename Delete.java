import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Delete extends JFrame {

	private JPanel contentPane;

	public Delete(int type) {
		String mod = "";
		if(type==0)
			mod = "Action";
		else if(type==2)
			mod = "Macro";
		else if(type==3)
			mod = "Robot";
		setTitle("Create"+mod);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
