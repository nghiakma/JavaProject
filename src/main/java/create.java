
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
public class create extends JFrame{

   public create() {
		JFrame frame = new JFrame("--WECOME--");

		ImageIcon imasv = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/student.png");
		JButton jbtsv = new JButton("SINH VIÊN");
		jbtsv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new sinhvien();
			}
		});
		jbtsv.setIcon(imasv);

		/*
		 * //jbtlogin.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub new login(); frame.dispose();
		 * 
		 * } });
		 */

		jbtsv.setBackground(Color.ORANGE);
		jbtsv.setForeground(Color.RED);
		jbtsv.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		jbtsv.setBounds(20, 420, 180, 40);

		ImageIcon imagv = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/teacher.png");
		JButton jbtgv = new JButton("GIẢNG VIÊN");
		jbtgv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new giangvien();
			}
		});
		jbtgv.setIcon(imagv);

		jbtgv.setBackground(Color.ORANGE);
		jbtgv.setForeground(Color.RED);
		jbtgv.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		jbtgv.setBounds(220, 420, 180, 40);

		ImageIcon jmada = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/project.png");
		JButton jbtdoan = new JButton("ĐỒ ÁN");
		jbtdoan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new project();
			}
		});
		jbtdoan.setIcon(jmada);
		jbtdoan.setBackground(Color.ORANGE);
		jbtdoan.setForeground(Color.RED);
		jbtdoan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		jbtdoan.setBounds(420, 420, 180, 40);
		
		ImageIcon jmatk = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/thongke.png");
		JButton jbtthongke = new JButton("THỐNG KÊ");
		jbtthongke.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new thongkediem();
			}
		});
		jbtthongke.setIcon(jmatk);
		jbtthongke.setBackground(Color.ORANGE);
		jbtthongke.setForeground(Color.RED);
		jbtthongke.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		jbtthongke.setBounds(620, 420, 180, 40);
		
		ImageIcon jmatt = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/thuctap.png");
		JButton jbtthuctap = new JButton("THỰC TẬP");
		jbtthuctap.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				new noithuctap();
			}
		});
		jbtthuctap.setIcon(jmatt);
		jbtthuctap.setBackground(Color.ORANGE);
		jbtthuctap.setForeground(Color.RED);
		jbtthuctap.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		jbtthuctap.setBounds(820, 420, 180, 40);

		ImageIcon imgreturn = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/return.png");

		JButton jbtreturn = new JButton("LOG OUT");

		jbtreturn.setIcon(imgreturn);
		jbtreturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new login();
				frame.dispose();
			}
		});

		jbtreturn.setBackground(Color.PINK);
		jbtreturn.setForeground(Color.BLACK);
		jbtreturn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jbtreturn.setBounds(835, 10, 140, 30);

		ImageIcon icon = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/htqldatn.png");

		JLabel label = new JLabel();
		label.setText("");
		label.setIcon(icon);

		JPanel pink = new JPanel();
		pink.setBackground(Color.white);
		pink.setBounds(0, 50, 1040, 100);

		/*
		 * ImageIcon imgcreate = new
		 * JLabel(); jlbtao.setIcon(imgcreate); jlbtao.setText("NEW TABLE");
		 * jlbtao.setBounds(250,50, 250, 50);; jlbtao.setForeground(Color.RED);
		 * jlbtao.setFont(new Font("Times New Roman",Font.PLAIN, 18));
		 * 
		 * JPanel jptao = new JPanel(); jptao.setBackground(Color.ORANGE);
		 * jptao.setBounds(50, 250, 200, 40);
		 */

		ImageIcon welcome = new ImageIcon("D:/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp 2/NHÓM 8 _Quản lí đồ án thực tập tốt nghiệp/QUANLIDOAN/cuoiky/welcome.png");

		JLabel jlwc = new JLabel();
		jlwc.setText("");
		jlwc.setIcon(welcome);

		JPanel jpwc = new JPanel();
		jpwc.setBackground(Color.WHITE);
		jpwc.setBounds(230, 170, 550, 240);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1040, 550);
		frame.setLayout(null);
		frame.setVisible(true);
		pink.add(label);
		frame.add(pink);
		/*
		 * jptao.add(jlbtao); frame.add(jptao);
		 */jpwc.add(jlwc);
		frame.add(jpwc);
		frame.add(jbtsv);
		frame.add(jbtgv);
		frame.add(jbtdoan);
		frame.add(jbtthongke);
		frame.add(jbtthuctap);
		frame.add(jbtreturn);
		frame.setLocationRelativeTo(null);

	}

	private void setDefaultLookAndFeelDecorated(int exitOnClose) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new create();

	}
    
}
