package com.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

@SuppressWarnings("serial")
public class pt extends Frame implements ActionListener {

//	private Label result = new Label("test", Label.CENTER);
	private TextArea ta = new TextArea();
	private Button btn;

	public pt() {

		setTitle("¹øÈ£»Ì±â");
		setSize(400, 400);
		setResizable(false);
		setVisible(true);
		setLayout(null);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		btn = new Button("»Ì±â");
		btn.setBounds(150, 100, 100, 50);
		add(btn);
		btn.addActionListener(this);

		ta.setBounds(75, 200, 250, 150);
		add(ta);
//		result.setBounds(100, 200, 50, 50);
//		add(result);

	}

	public static void main(String[] args) {
		new pt();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		if (ob instanceof Button) {

//			Button b = (Button) ob;

			Random rd = new Random();

			int[] num = new int[6];
			int n = 0;
			while (n < 6) {
				num[n] = rd.nextInt(45) + 1;
				for (int i = 0; i < n; i++) {
					if (num[i] == num[n]) {
						n--;
						break;
					}
				}
				n++;
			}
			int temp;
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
			String str = String.format("\t %2d  %2d  %2d  %2d  %2d  %2d", num[0], num[1], num[2], num[3], num[4], num[5]);
			if (!str.equals(null)) {
				ta.append(str + "\r\n");
			} else
				ta.setText(str);

		}

	}

}
