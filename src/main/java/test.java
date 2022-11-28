
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class test {

    JButton jbtexit = new JButton("EXIT");

	public test() {
		JFrame frame = new JFrame("QUẢN LÍ ĐỒ ÁN TỐT NGHIỆP");
		// ImageIcon imglogin = new ImageIcon();

		JButton jbtlogin = new JButton("ĐĂNG NHẬP");
		jbtlogin.setIcon(new ImageIcon("D:/JAVA/JAVA_BTL/QUANLIDOAN/cuoiky/account.png"));

		jbtlogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new login();
				frame.dispose();

			}
		});
		jbtlogin.setBackground(Color.ORANGE);
		jbtlogin.setForeground(Color.RED);
		jbtlogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbtlogin.setBounds(150, 500, 200, 50);

		// ImageIcon imgexit = new ImageIcon("");

		JButton jbtexit = new JButton("EXIT");
		jbtexit.setIcon(new ImageIcon("D:/JAVA/JAVA_BTL/QUANLIDOAN/cuoiky/edit.png"));

		// tạo chức năng cho exit
		jbtexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		jbtexit.setBackground(Color.ORANGE);
		jbtexit.setForeground(Color.RED);
		jbtexit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbtexit.setBounds(550, 500, 250, 50);

		// chèn ảnh

		JLabel label = new JLabel();
		label.setText("");
		label.setIcon(new ImageIcon("D:/JAVA/JAVA_BTL/QUANLIDOAN/cuoiky/htqldatn1.png"));

		JPanel pink = new JPanel();
		pink.setBackground(Color.white);
		pink.setBounds(0, 0, 1000, 90);

		// chèn ảnh tt

		JLabel jlda = new JLabel();
		jlda.setText("");
		jlda.setIcon(new ImageIcon("D:/JAVA/JAVA_BTL/QUANLIDOAN/cuoiky/khoinghiep1.png"));

		JPanel jpda = new JPanel();
		jpda.setBackground(Color.lightGray);
		jpda.setBounds(70, 100, 850, 500);

		// điều chỉnh 
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1000, 650);
		frame.setLayout(null);
		frame.setVisible(true);
		pink.add(label);
		frame.add(pink);
		jpda.add(jlda);
		frame.add(jpda);
		frame.add(jbtexit);
		frame.add(jbtlogin);
		frame.setLocationRelativeTo(null);

	}

	private void setDefaultLookAndFeelDecorated(int exitOnClose) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();

	}
    
}
