
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
public class noithuctap extends JFrame{
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

	JLabel Jlbid = new JLabel("IDProject:       ");
	JLabel Jlbdd = new JLabel("Internship address: ");
	JLabel Jlbtl = new JLabel("Time line:       ");
	JLabel Jlbin = new JLabel("Instruction:  ");


	JTextField tfid = new JTextField(30);
	JTextField tfdd = new JTextField(30);
	JTextField tftl = new JTextField(30);
	JTextField tfin = new JTextField(30);


	public noithuctap() {

		dtm = new DefaultTableModel();
		JTable jtableKQ = new JTable(dtm);
		dtm.addColumn("ID Project");
		dtm.addColumn("Internship address");
		dtm.addColumn("Time line");
		dtm.addColumn("Instruction");
		
		loadata();
		JScrollPane sc = new JScrollPane(jtableKQ);
		loadata();

		Border border = BorderFactory.createLineBorder(Color.RED);
		TitledBorder title = BorderFactory.createTitledBorder(border, "INTERNSHIP INFORMATION");

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
		JPanel id = new JPanel();
		JPanel dd = new JPanel();
		JPanel tl = new JPanel();
		JPanel in = new JPanel();

		JFrKQ.setLayout(new BorderLayout());
		center.setLayout(new GridLayout(6, 2));
		east.setLayout(new GridLayout(4, 1));
		north.setLayout(new BorderLayout());
		n_north.setLayout(new BorderLayout());
		nn_west.setLayout(new GridLayout(1, 2));

		JFrKQ.add(north, "North");
		JFrKQ.add(south, "East");
		JFrKQ.add(center, "Center");
		JFrKQ.add(east, "West");
		north.add(n_north, "West");
		n_north.add(nn_west, "West");

		south.add(sc);
		south.setBorder(title);
		center.setBorder(title1);
		east.setBorder(title2);

		id.add(Jlbid);
		id.add(tfid);
		dd.add(Jlbdd);
		dd.add(tfdd);
		tl.add(Jlbtl);
		tl.add(tftl);
		in.add(Jlbin);
		in.add(tfin);

		center.add(id);
		center.add(dd);
		center.add(tl);
		center.add(in);
		
		center.add(btnADD);
		center.add(btnSUA);
		center.add(btnDEL);
		center.add(btnFIND);
		center.add(btnRE);

		nn_west.add(btnBACK);
		center.setLayout(new GridLayout(3, 2));
		center.setLayout(new FlowLayout(FlowLayout.LEFT));
		center.setBackground(Color.white);
		south.setBackground(Color.white);

//		JFrKQ.pack();
		JFrKQ.setTitle("Quản địa điểm thực tập sinh viên");
		JFrKQ.setSize(900, 500);
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

		btnADD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				conn = new ConnectionDB();
				try {
					ps = ConnectionDB.getConn().prepareCall("insert into noithuctap values (?, ?, ?, ?)");
					ps.setString(1, tfid.getText());
					ps.setString(2, tfdd.getText());
					ps.setString(3, tftl.getText());
					ps.setString(4, tfin.getText());

					ps.execute();
					dtm.addRow(new String[] { tfid.getText(), tfdd.getText(), tftl.getText(), tfin.getText() });
					dtm.setRowCount(0);

					tfid.setText("");
					tfdd.setText("");
					tftl.setText("");
					tfin.setText("");

					loadata();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		jtableKQ.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				tfid.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 0));
				tfdd.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 1));
				tftl.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 2));
				tfin.setText((String) jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 3));
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
		btnSUA.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				conn = new ConnectionDB();
				try {
					ps = conn.getConn().prepareStatement(
							"update noithuctap set Internship address = ? , Time line = ?, Instruction = ? where IDProject  ="
									+ "'" + jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 0) + "'");
					ps.setString(1, tfdd.getText());
					ps.setString(2, tftl.getText());
					ps.setString(3, tfin.getText());
					ps.executeUpdate();
					dtm.setRowCount(0);

					tfid.setText("");
					tfdd.setText("");
					tftl.setText("");
					tfin.setText("");

					loadata();
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
		btnRE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfid.setText("");
				tfdd.setText("");
				tftl.setText("");
				tfin.setText("");
				loadata();
			}
		});

		btnDEL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					ps = conn.getConn().prepareStatement("DELETE FROM noithuctap WHERE IDProject = ?");
					ps.setString(1, jtableKQ.getValueAt(jtableKQ.getSelectedRow(), 0).toString());
					ps.executeUpdate();
					dtm.setRowCount(0);

					tfid.setText("");
					tfdd.setText("");
					tftl.setText("");
					tfin.setText("");
				
					loadata();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});

		btnFIND.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				ResultSet rs;
				conn = new ConnectionDB();
				try {
					// rs = conn.getStm().executeQuery("select * from noithuctap where Internship address = N" +
					// "'" + tfid.getText() + "'" );
					// dtm.setRowCount(0);

					rs = conn.getStm().executeQuery("select * from noithuctap where IDProject = N" + "'" + tfid.getText()
							+ "'" + " or Internship address = N" + "'" + tftl.getText() + "'" + " or Time line = N" + "'"
							+ tfin.getText() + "'" + " or Instruction = N" + "'" );
					dtm.setRowCount(0);

					while (rs.next()) {
						dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) });

					}

				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});

	}

	public static void main(String args[]) {
		new noithuctap();
	}

	public void loadata() {
		conn = new ConnectionDB();
		ResultSet rs;
		try {
			dtm.setRowCount(0);
			rs = conn.getStm().executeQuery("select * from noithuctap");
			while (rs.next()) {
				dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) });
			}
		} catch (SQLException e) { // TODOAuto-generated catch block e.printStackTrace();
		}
	}
    
    
}
