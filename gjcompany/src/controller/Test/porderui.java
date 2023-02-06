package controller.Test;
//移動資料夾方法 在路徑後.test 就會移動到test在紅線精靈案move就會移動
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.porder.implPorder;
import Model.porder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;

public class porderui extends JFrame {

	private JPanel contentPane;
	private JTextField desk;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField id;
	private JTextField udesk;
	private JTextField ua;
	private JTextField ub;
	private JTextField uc;
	private JTextField did;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					porderui frame = new porderui();
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
	public porderui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 10, 234, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("點餐系統");
		lblNewLabel.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel.setBounds(100, 10, 73, 50);
		panel.add(lblNewLabel);
		
		desk = new JTextField();
		desk.setBounds(110, 70, 96, 21);
		panel.add(desk);
		desk.setColumns(10);
		
		A = new JTextField();
		A.setColumns(10);
		A.setBounds(110, 129, 96, 21);
		panel.add(A);
		
		B = new JTextField();
		B.setColumns(10);
		B.setBounds(110, 175, 96, 21);
		panel.add(B);
		
		C = new JTextField();
		C.setColumns(10);
		C.setBounds(110, 235, 96, 21);
		panel.add(C);
		
		JButton add = new JButton("新增");
		
		add.setFont(new Font("宋体", Font.BOLD, 17));
		add.setBounds(28, 289, 151, 44);
		panel.add(add);
		
		JLabel lblNewLabel_1 = new JLabel("桌號");
		lblNewLabel_1.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_1.setBounds(17, 55, 73, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblA.setBounds(28, 110, 73, 50);
		panel.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblB.setBounds(28, 171, 73, 25);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblC.setBounds(28, 216, 73, 50);
		panel.add(lblC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		panel_1.setBounds(242, 10, 402, 439);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea showAll = new JTextArea();
		showAll.setBounds(10, 225, 382, 204);
		panel_1.add(showAll);
		
		JButton selectAll = new JButton("查詢");
		
		selectAll.setFont(new Font("微軟正黑體 Light", Font.BOLD, 14));
		selectAll.setBounds(10, 10, 87, 23);
		panel_1.add(selectAll);
		
		JButton update = new JButton("修改");
		
		update.setFont(new Font("微軟正黑體 Light", Font.BOLD, 14));
		update.setBounds(10, 55, 87, 23);
		panel_1.add(update);
		
		JButton delete = new JButton("刪除");
		
		delete.setFont(new Font("微軟正黑體 Light", Font.BOLD, 14));
		delete.setBounds(10, 192, 87, 23);
		panel_1.add(delete);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
		lblNewLabel_2.setBounds(263, 60, 46, 15);
		panel_1.add(lblNewLabel_2);
		
		id = new JTextField();
		id.setBounds(296, 59, 62, 21);
		panel_1.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("桌號");
		lblNewLabel_2_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(128, 59, 32, 15);
		panel_1.add(lblNewLabel_2_1);
		
		udesk = new JTextField();
		udesk.setColumns(10);
		udesk.setBounds(170, 59, 62, 21);
		panel_1.add(udesk);
		
		ua = new JTextField();
		ua.setColumns(10);
		ua.setBounds(170, 87, 62, 21);
		panel_1.add(ua);
		
		ub = new JTextField();
		ub.setColumns(10);
		ub.setBounds(170, 118, 62, 21);
		panel_1.add(ub);
		
		uc = new JTextField();
		uc.setColumns(10);
		uc.setBounds(170, 149, 62, 21);
		panel_1.add(uc);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("A");
		lblNewLabel_2_1_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(128, 90, 46, 15);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("B");
		lblNewLabel_2_1_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(128, 119, 46, 15);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("C");
		lblNewLabel_2_1_3.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
		lblNewLabel_2_1_3.setBounds(128, 151, 46, 15);
		panel_1.add(lblNewLabel_2_1_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 370, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 180, 370, 2);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("ID");
		lblNewLabel_2_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(128, 199, 46, 15);
		panel_1.add(lblNewLabel_2_2);
		
		did = new JTextField();
		did.setColumns(10);
		did.setBounds(170, 194, 62, 21);
		panel_1.add(did);
		
		//新增
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.擷取UI-->getText
				 * 2.A,B,C-->轉型-->int
				 * 3.new porder
				 * 4.add(p)
				 */
				
				String DESK=desk.getText();
				int a=Integer.parseInt(A.getText());
				int b=Integer.parseInt(B.getText());
				int c=Integer.parseInt(C.getText());
				porder p=new porder(DESK,a,b,c);
				new implPorder().add(p);
			}
		});
		//查詢
		selectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.List<porder> l-->selectAll()
				 * 2.String-->for-each-->顯示
				 * 3.--->轉陣列-->toArray-->顯示 , 統計分析
				 */
				
				/*List<porder> l=new implPorder().selectAll();
				String show="";
				for(porder p:l)
				{
					show=show+"id:"+p.getId()+"\t桌號:"+p.getDesk()+
							"\tA:"+p.getA()+
							"\tB:"+p.getB()+
							"\tC:"+p.getC()+"\n";
				}
				showAll.setText(show);*/
				
				List<porder> l=new implPorder().selectAll();
				/*Object[] o=l.toArray();
				System.out.println(((porder)o[0]).getA());*/
				
				porder[] p=l.toArray(new porder[l.size()]);//porder [] p=new porder[3];
				
				//System.out.println(p[0].getId()+"\t"+p[0].getDesk());
				
				String show="";
				int sum=0;
				for(porder P:p)
				{
					show=show+"id:"+P.getId()+"\t桌號:"+P.getDesk()+
							"\tA:"+P.getA()+
							"\tB:"+P.getB()+
							"\tC:"+P.getC()+"\n";
					
					
				}
				
				for(int i=0;i<p.length;i++)
				{
					sum=sum+p[i].getA();
					//計算A的總數
				}
				
				showAll.setText(show+"\nA總共="+sum);
				
						}
		});
		//修改
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.擷取->所有getText
				 * 2.ua,ub,uc,id-->string -->int
				 * 3.selectId-->id
				 * 4.porder-->set修改
				 * 5.update
				 */
				String DESK=udesk.getText();
				int A=Integer.parseInt(ua.getText());
				int B=Integer.parseInt(ub.getText());
				int C=Integer.parseInt(uc.getText());
				int ID=Integer.parseInt(id.getText());
				
				porder p=new implPorder().selectId(ID);
				p.setDesk(DESK);
				p.setA(A);
				p.setB(B);
				p.setC(C);
				
				new implPorder().update(p);
				
			}
		});
		//刪除
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.擷取-->id-->轉型 int
				 * 2.delete
				 */
				int ID=Integer.parseInt(did.getText());
				new implPorder().delete(ID);
			}
		});
	}
}
