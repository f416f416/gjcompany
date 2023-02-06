package controller.Main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.member.implMember;
import Model.member;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class addMemberUI extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField name;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField phone;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblMobile;
	private JLabel lblPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberUI frame = new addMemberUI();
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
	public addMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(61, 10, 327, 230);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		username = new JTextField();
		username.setBounds(111, 54, 96, 21);
		panel.add(username);
		username.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(111, 10, 96, 21);
		panel.add(name);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(111, 91, 96, 21);
		panel.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(111, 130, 96, 21);
		panel.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(111, 166, 96, 21);
		panel.add(mobile);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(111, 199, 96, 21);
		panel.add(phone);
		
		JButton add = new JButton("確定");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.username-->getText
				 * 2.帳號判斷-->queryusername():boolean
				 * 3.true-->重複-->addError
				 * 4.false-->接收所有資料-->new member-->add()-->addSuccess
				 */
				
				String Username=username.getText();
				if(new implMember().queryUser(Username))
				{
					addError error=new addError();
					error.show();
					dispose();
				}
				else
				{
					String Name=name.getText();
					String Password=password.getText();
					String Address=address.getText();
					String Mobile=mobile.getText();
					String Phone=phone.getText();
					
					member m=new member(Name,Username,Password,Address,Mobile,Phone);
					
					new implMember().add(m);
					
					addSuccess success=new addSuccess();
					success.show();
					dispose();
				}
			}
		});
		add.setBounds(230, 73, 87, 23);
		panel.add(add);
		
		lblNewLabel = new JLabel("名字");
		lblNewLabel.setBounds(20, 13, 46, 15);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setBounds(20, 57, 46, 15);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setBounds(20, 94, 46, 15);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("地址");
		lblNewLabel_3.setBounds(20, 133, 46, 15);
		panel.add(lblNewLabel_3);
		
		lblMobile = new JLabel("行動");
		lblMobile.setBounds(20, 169, 46, 15);
		panel.add(lblMobile);
		
		lblPhone = new JLabel("電話");
		lblPhone.setBounds(20, 202, 46, 15);
		panel.add(lblPhone);
	}

}
