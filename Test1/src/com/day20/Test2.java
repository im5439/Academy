package com.day20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

// Swing

@SuppressWarnings("serial")
public class Test2 extends JFrame implements ActionListener {

	private JTextField[] tf = new JTextField[4];
	private JButton btn1, btn2;
	private JTable table;

	public Test2() {

		getContentPane().setLayout(null);

		String[] caption = { "이름", "국어", "영어", "수학" };

		for (int i = 0; i < caption.length; i++) {
			JLabel lbl = new JLabel(caption[i]);
			lbl.setBounds(10, (i + 1) * 30, 50, 20);
			getContentPane().add(lbl);

			tf[i] = new JTextField();
			tf[i].setBounds(80, (i + 1) * 30, 70, 20);
			getContentPane().add(tf[i]);

		}

		btn1 = new JButton("추가");
		btn1.setBounds(10, 160, 60, 20);
		btn1.addActionListener(this);
		getContentPane().add(btn1);

		btn2 = new JButton("종료");
		btn2.setBounds(90, 160, 60, 20);
		btn2.addActionListener(this);
		getContentPane().add(btn2);

		addTable();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("성적처리");
		setSize(550, 250);
		setVisible(true);

	}

	private void addTable() {

		String[] title = { "이름", "국어", "영어", "수학", "총점", "평균" };

		MyTableModel model = new MyTableModel(title);

		table = new JTable(model);

		// 스크롤바
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(160, 30, 352, 150);
		getContentPane().add(sp);

		// 컬럼크기 자동변경 off
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		// 컬럼폭 고정
		for (int i = 0; i < title.length; i++) {

			TableColumn col = table.getColumnModel().getColumn(i);
			col.setPreferredWidth(58);

		}


	}

	private void process() {

		String[] data = new String[6];

		int tot;

		try {

			tot = 0;
			data[0] = tf[0].getText(); // 이름

			for (int i = 1; i <= 3; i++) { // 국,영,수

				data[i] = tf[i].getText();
				tot += Integer.parseInt(tf[i].getText()); // 총점 구하기

			}

			data[4] = Integer.toString(tot); // 총점 넣음
			data[5] = Integer.toString(tot / 3); // 평균

			((MyTableModel) table.getModel()).addRow(data); // 가로열: row,   세로열: field, column

			// 초기화
			for (int i = 0; i < tf.length; i++) {
				tf[i].setText(null);
			}

			tf[0].requestFocus(); // 커서 갖다 놓기

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	class MyTableModel extends DefaultTableModel {

		private String[] title;

		public MyTableModel(String[] title) {
			this.title = title;
		}

		@Override
		public int getColumnCount() {

			if (title == null || title.length == 0)
				return 0;

			return title.length;
		}

		@Override
		public String getColumnName(int column) {

			if (title == null || title.length == 0)
				return null;

			return title[column];
		}

	}

	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		if (ob instanceof JButton) {

			JButton b = (JButton) ob;

			if (b == btn1) {
				process();
			} else if (b == btn2) {
				System.exit(0);
			}

		}

	}

}
