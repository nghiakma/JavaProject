
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class thongkediem extends JFrame{
private Statement stmt;
	private PreparedStatement ps;
	private ConnectionDB conn;

	private static DefaultTableModel dtm;

	JButton btnBACK = new JButton("RETURN");
	JButton btnRE = new JButton("REFRESH");
	JButton btnADD = new JButton("ADD");
	JButton btnSUA = new JButton("EDIT");
	JButton btnDEL = new JButton("DELETE");
	JButton btnFIND = new JButton("FIND");
	JButton btnCOUNT = new JButton("COUNT");
	JButton btnDEM = new JButton("Tổng Số Đồ Án: 6");
	JButton btnTINH = new JButton("Trung Bình Tổng: 24.5");
	JButton btnTINH1 = new JButton("Trung Bình SV: 8.2");
	
	JLabel Jlbpro = new JLabel("ID Project:             ");
	JLabel Jlbin = new JLabel("Intructor:             ");
	JLabel Jlbdg = new JLabel("PointGV :");
	JLabel Jlbdh = new JLabel("PointHD :                ");
	JLabel Jlbdc = new JLabel("PointHDC:           ");
	JLabel Jlbtd = new JLabel("Tongdiem:             ");
	JLabel Jlbtb = new JLabel("PointTB:             ");

	JTextField tfpro = new JTextField(30);
	JTextField tfin = new JTextField(30);
	JTextField tfdg = new JTextField(30);
	JTextField tfdh = new JTextField(10);
	JTextField tfdc = new JTextField(30);
	JTextField tftd = new JTextField(30);
	JTextField tftb = new JTextField(30);
	JTextField tfcount = new JTextField(5);
	public thongkediem() {

		dtm = new DefaultTableModel();
		JTable jtableKQ = new JTable(dtm);
		dtm.addColumn("IDProject");
		dtm.addColumn("Intructor ");
		dtm.addColumn("PointGV");
		dtm.addColumn("PointHD");
		dtm.addColumn("PointHDC");
		dtm.addColumn("Tongdiem");
		dtm.addColumn("PointTB");
		loadata();
		JScrollPane sc = new JScrollPane(jtableKQ);
		loadata();

		Border border = BorderFactory.createLineBorder(Color.RED);
		TitledBorder title = BorderFactory.createTitledBorder(border, "PROJECT SCORE INFORMATION");

		Border border1 = BorderFactory.createLineBorder(Color.RED);
		TitledBorder title1 = BorderFactory.createTitledBorder(border1, "INFORMATION INSERT");

		Border border2 = BorderFactory.createLineBorder(Color.green);
		TitledBorder title2 = BorderFactory.createTitledBorder(border2, "");

		JFrame JFrKQ = new JFrame();

		JPanel north = new JPanel();
		JPanel n_north = new JPanel();
		JPanel nn_west = new JPanel();
		JPanel south = new JPanel();
		JPanel center = new JPanel();
		JPanel east = new JPanel();
		JPanel pro = new JPanel();
		JPanel in = new JPanel();
		JPanel dg = new JPanel();
		JPanel dh = new JPanel();
		JPanel dc = new JPanel();
		JPanel td = new JPanel();
		JPanel tb = new JPanel();

		JFrKQ.getContentPane().setLayout(new BorderLayout());
		center.setLayout(new GridLayout(8, 2));
		east.setLayout(new GridLayout(4, 1));
		north.setLayout(new BorderLayout());
		n_north.setLayout(new BorderLayout());
		nn_west.setLayout(new GridLayout(1, 2));

		JFrKQ.getContentPane().add(north, "North");
		JFrKQ.getContentPane().add(south, "East");
		JFrKQ.getContentPane().add(center, "Center");
		JFrKQ.getContentPane().add(east, "West");
		north.add(n_north, "West");
		n_north.add(nn_west, "West");

		south.add(sc);
		south.setBorder(title);
		center.setBorder(title1);
		east.setBorder(title2);

		pro.add(Jlbpro);
		pro.add(tfpro);
		in.add(Jlbin);
		in.add(tfin);
		dg.add(Jlbdg);
		dg.add(tfdg);
		dh.add(Jlbdh);
		dh.add(tfdh);
		dc.add(Jlbdc);
		dc.add(tfdc);

		td.add(Jlbtd);
		td.add(tftd);
		tb.add(Jlbtb);
		tb.add(tftb);
		pro.add(Jlbpro);
		pro.add(tfpro);

		center.add(pro);
		center.add(in);
		center.add(dg);
		center.add(dh);
		center.add(dc);
		center.add(td);
		center.add(tb);
		
		center.add(btnADD);
		
				btnADD.addActionListener(new ActionListener() {
		
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						conn = new ConnectionDB();
						try {
							ps = conn.getConn().prepareCall("insert into thongkediem values (?, ?, ?, ?, ?, ?, ? )");
							ps.setString(1, tfpro.getText());
							ps.setString(2, tfin.getText());
							ps.setString(3, tfdg.getText());
							ps.setString(4, tfdh.getText());
							ps.setString(5, tfdc.getText());
							ps.setString(6, tftd.getText());
							ps.setString(7, tftb.getText());
							
							ps.execute();
							dtm.addRow(new String[] { tfpro.getText(), tfin.getText(), tfdg.getText(), tfdh.getText(),
									tfdc.getText(), tftd.getText(), tftb.getText() });
							dtm.setRowCount(0);
		
							tfpro.setText("");
							tfin.setText("");
							tfdg.setText("");
							tfdh.setText("");
							tfdc.setText("");
							tftd.setText("");
							tftb.setText("");
		
							loadata();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							JOptionPane.showMessageDialog(null, e.getMessage()); 
						}
					}
				});
		center.add(btnSUA);
		btnSUA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				conn = new ConnectionDB();
				try {
					ps = conn.getConn().prepareStatement(
							"update thongkediem set Instruction = ? , PointGV = ?, PointHD = ?, PointHDC = ?,Tongdiem = ?, PointTB = ? where IDProject ="
									+ "'" + jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 0) + "'");
					ps.setString(1, tfin.getText());
					ps.setString(2, tfdg.getText());
					ps.setString(3, tfdh.getText());
					ps.setString(4, tfdc.getText());
					ps.setString(5, tftd.getText());
					ps.setString(6, tftb.getText());
					ps.executeUpdate();
					dtm.setRowCount(0);
					// loadata();

					tfpro.setText("");
					tfin.setText("");
					tfdg.setText("");
					tfdh.setText("");
					tfdc.setText("");
					tftd.setText("");
					tftb.setText("");
					loadata();
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, ex.getMessage()); 
				}
			}
		});
		center.add(btnDEL);
		
				btnDEL.addActionListener(new ActionListener() {
		
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							ps = conn.getConn().prepareStatement("DELETE FROM thongkediem WHERE IDProject = ?");
							ps.setString(1, jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 0).toString());
							ps.executeUpdate();
							dtm.setRowCount(0);
		
							tfpro.setText("");
							tfin.setText("");
							tfdg.setText("");
							tfdh.setText("");
							tfdc.setText("");
							tftd.setText("");
							tftb.setText("");					
		
							loadata();
		
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
					}
				});
		center.add(btnFIND);
		
				btnFIND.addActionListener(new ActionListener() {
		
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
		
						ResultSet rs;
						conn = new ConnectionDB();
						try {
							// rs = conn.getStm().executeQuery("select * from thongkediem where IDProject = N" + "'"
							// + tfid.getText() + "'" );
							// dtm.setRowCount(0);
							rs = conn.getStm().executeQuery("select * from thongkediem where IDProject = N" + "'" + tfpro.getText() + "'"
									+ " or Instruction = N" + "'" + tfin.getText() + "'" + " or PointGV = N" + "'" + tfdg.getText()
									+ "'" + " or PointHD = N" + "'" + tfdh.getText() + "'" + " or PointHDC = N" + "'" + tfdc.getText()
									+ "'" + " or Tongdiem = N" + "'" + tftd.getText() + "'" + " or PointTB = N" + "'"
									+ tftb.getText() + "'");
							dtm.setRowCount(0);
		
							while (rs.next()) {
								dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
										rs.getString(5), rs.getString(6), rs.getString(7) });
		
							}
		
						} catch (Exception e2) {
							// TODO: handle exception
						}
		
					}
				});
		center.add(btnRE);
		btnRE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfpro.setText("");
				tfin.setText("");
				tfdg.setText("");
				tfdh.setText("");
				tfdc.setText("");
				tftd.setText("");
				tftb.setText("");

				loadata();
			}
		});
		center.add(btnDEM);
		center.add(btnTINH);
		center.add(btnTINH1);
	//	center.add(btnCOUNT);
	//	center.add(tfcount);

		nn_west.add(btnBACK);
		center.setLayout(new GridLayout(3, 2));
		center.setLayout(new FlowLayout(FlowLayout.LEFT));
		center.setBackground(Color.white);
		south.setBackground(Color.white);

//		JFrKQ.pack();
		JFrKQ.setTitle("Thống kê điểm sinh viên");
		JFrKQ.setSize(950, 500);
		JFrKQ.setLocationRelativeTo(null);
		JFrKQ.setVisible(true);
		btnBACK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrKQ.dispose();
				new create();
			}
		});

		jtableKQ.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				tfpro.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 0));
				tfin.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 1));
				tfdg.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 2));
				tfdh.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 3));
				tfdc.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 4));
				tftd.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 5));
				tftb.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 6));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		btnCOUNT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ResultSet rs;
				int count = 0;
				  conn = new ConnectionDB();
				try {
						rs = conn.getStm().executeQuery("select * from thongkediem ");
						
						while(rs.next()) {	
							++count;
						}	
						tfcount.setText(Integer.toString(count));
					}

				 catch (Exception e2) {
					// TODO: handle exception
				}

			
			}
		});
		
	}

	public static void main(String args[]) {
		new thongkediem();
	}

	public void loadata() {
		conn = new ConnectionDB();
		ResultSet rs;
		try {
			dtm.setRowCount(0);
			rs = conn.getStm().executeQuery("select * from thongkediem ");
			while (rs.next()) {
				dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7) });
			}
		} catch (SQLException e) { // TODOAuto-generated catch block e.printStackTrace();
		}
	}
   
    
}
