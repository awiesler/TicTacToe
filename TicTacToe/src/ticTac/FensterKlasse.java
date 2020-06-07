package ticTac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class FensterKlasse extends JFrame {

	game backend = new game();
	player player = new player();
	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JTextField tfAusgabe;
	private JTextField tfAusgabe2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FensterKlasse frame = new FensterKlasse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void Methode(JButton text) {
		if(backend.gameStatus(btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText(), btn5.getText(), btn6.getText(), btn7.getText(), btn8.getText(), btn9.getText())) {
			tfAusgabe.setText("Gewonnen");
			tfAusgabe2.setText("neues Spiel?");
		}
		else if(player.getGameCounter() == 9) {
			tfAusgabe.setText("Unentschieden");
			btnNewButton.setBackground(Color.green);
			tfAusgabe2.setText("neues Spiel?");
		}
		else {
			text.setText(player.turn());
		}
	}
	public void neuesSpiel() {
		tfAusgabe.setText("");
		tfAusgabe2.setText("");
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
		btnNewButton.setBackground(btn1.getBackground());
		player.setGameCounter(0);
	}
	public FensterKlasse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTicTacToe = new JLabel("TiC tAc ToE");
		lblTicTacToe.setFont(new Font("Trebuchet MS", Font.ITALIC, 36));
		lblTicTacToe.setBounds(261, 11, 213, 70);
		contentPane.add(lblTicTacToe);
		
		btnNewButton = new JButton("new game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				neuesSpiel();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(261, 461, 159, 59);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnExit.setBounds(502, 461, 159, 59);
		contentPane.add(btnExit);
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn1.setBounds(63, 103, 100, 100);
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn2.setBounds(173, 103, 100, 100);
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn3.setBounds(283, 103, 100, 100);
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn4.setBounds(63, 214, 100, 100);
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn5.setBounds(173, 214, 100, 100);
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn6.setBounds(283, 214, 100, 100);
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn7.setBounds(63, 322, 100, 100);
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn8.setBounds(173, 322, 100, 100);
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methode(btn9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn9.setBounds(283, 322, 100, 100);
		contentPane.add(btn9);
		
		tfAusgabe = new JTextField();
		tfAusgabe.setFont(new Font("Tahoma", Font.PLAIN, 31));
		tfAusgabe.setBorder(null);
		tfAusgabe.setBackground(SystemColor.menu);
		tfAusgabe.setBounds(437, 103, 243, 100);
		contentPane.add(tfAusgabe);
		tfAusgabe.setColumns(10);
		
		tfAusgabe2 = new JTextField();
		tfAusgabe2.setFont(new Font("Tahoma", Font.PLAIN, 31));
		tfAusgabe2.setColumns(10);
		tfAusgabe2.setBorder(null);
		tfAusgabe2.setBackground(SystemColor.menu);
		tfAusgabe2.setBounds(437, 214, 243, 100);
		contentPane.add(tfAusgabe2);
	}
}
