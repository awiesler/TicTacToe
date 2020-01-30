package ticTac;

import java.awt.BorderLayout;
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

public class FensterKlasse extends JFrame {

	game backend = new game();
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;

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
		
		JButton btnNewButton = new JButton("new game");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(261, 461, 159, 59);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnExit.setBounds(502, 461, 159, 59);
		contentPane.add(btnExit);
		
		tf1 = new JTextField();
		tf1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setBounds(69, 111, 100, 100);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf2.setColumns(10);
		tf2.setBounds(179, 111, 100, 100);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf3.setColumns(10);
		tf3.setBounds(289, 111, 100, 100);
		contentPane.add(tf3);
		
		tf6 = new JTextField();
		tf6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf6.setHorizontalAlignment(SwingConstants.CENTER);
		tf6.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf6.setColumns(10);
		tf6.setBounds(289, 222, 100, 100);
		contentPane.add(tf6);
		
		tf4 = new JTextField();
		tf4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf4.setHorizontalAlignment(SwingConstants.CENTER);
		tf4.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf4.setColumns(10);
		tf4.setBounds(69, 222, 100, 100);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf5.setHorizontalAlignment(SwingConstants.CENTER);
		tf5.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf5.setColumns(10);
		tf5.setBounds(179, 222, 100, 100);
		contentPane.add(tf5);
		
		tf9 = new JTextField();
		tf9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf9.setHorizontalAlignment(SwingConstants.CENTER);
		tf9.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf9.setColumns(10);
		tf9.setBounds(289, 333, 100, 100);
		contentPane.add(tf9);
		
		tf7 = new JTextField();
		tf7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf7.setHorizontalAlignment(SwingConstants.CENTER);
		tf7.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf7.setColumns(10);
		tf7.setBounds(69, 333, 100, 100);
		contentPane.add(tf7);
		
		tf8 = new JTextField();
		tf8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				backend.gameStatus(tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
			}
		});
		tf8.setHorizontalAlignment(SwingConstants.CENTER);
		tf8.setFont(new Font("Tahoma", Font.PLAIN, 80));
		tf8.setColumns(10);
		tf8.setBounds(179, 333, 100, 100);
		contentPane.add(tf8);
	}
}
