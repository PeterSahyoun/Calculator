import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Calculator");
		Container contentPane=frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 550);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JTextField text=new JTextField();
		text.setBounds(45, 40, 300, 50);
		text.setFont(new Font("Arial",Font.BOLD,30));
		text.setEditable(false);
		contentPane.add(text);
		
		JPanel panel=new JPanel(new GridLayout(5,4,10,10));
		panel.setBounds(45, 110, 300, 300);
				
				JButton[] numbers=new JButton[10];
				JButton add=new JButton("+");
				add.setBackground(Color.gray);
				add.setFont(new Font("Arial",Font.BOLD,25));
				JButton sub=new JButton("-");
				sub.setBackground(Color.gray);
				sub.setFont(new Font("Arial",Font.BOLD,25));
				JButton mul=new JButton("*");
				mul.setBackground(Color.gray);
				mul.setFont(new Font("Arial",Font.BOLD,25));
				JButton div=new JButton("/");
				div.setBackground(Color.gray);
				div.setFont(new Font("Arial",Font.BOLD,25));
				JButton mod=new JButton("%");
				mod.setBackground(Color.gray);
				mod.setFont(new Font("Arial",Font.BOLD,25));
				JButton neg=new JButton("(-)");
				neg.setBackground(Color.gray);
				neg.setFont(new Font("Arial",Font.BOLD,25));
				JButton dot=new JButton(".");
				dot.setBackground(Color.gray);
				dot.setFont(new Font("Arial",Font.BOLD,25));
				JButton equ=new JButton("=");
				equ.setBackground(Color.GREEN);
				equ.setFont(new Font("Arial",Font.BOLD,25));
				
				JButton delete=new JButton("D");
				delete.setBackground(Color.red);	
				delete.setFont(new Font("Arial",Font.BOLD,25));
				
				JButton clear=new JButton("C");
				clear.setBackground(Color.white);	
				clear.setFont(new Font("Arial",Font.BOLD,25));


		ActionListener a=new ActionListener()
		{
			Double no1=0.0,no2=0.0,result=0.0;
			char op=' ';
			int t=0,n=0;
			
			public void actionPerformed(ActionEvent e) {
			
				
				for(int i=0;i<10;i++)
				{
					
					if(e.getSource()==numbers[i] && t!=1)
					text.setText(text.getText().concat(String.valueOf(i)));
				}
			
				if(e.getSource()==dot && t!=1)	
					text.setText(text.getText().concat("."));
				
				if(e.getSource()==add)
					{
					t=0;
				
					if(n==0)
					{no1=Double.parseDouble(text.getText());
					n++;
					}
					else 
						{if(op=='+')
							no1+=Double.parseDouble(text.getText());
						if(op=='-')
							no1-=Double.parseDouble(text.getText());
						if(op=='*')
							no1*=Double.parseDouble(text.getText());
						if(op=='/')
							no1/=Double.parseDouble(text.getText());
						if(op=='%')
							no1%=Double.parseDouble(text.getText());
						}
					text.setText("");
					op='+';
					}
			
				if(e.getSource()==sub)
				{
					t=0;
					
					if(n==0)
					{n++;
					no1=Double.parseDouble(text.getText());
					}
					else 
					{if(op=='+')
						no1+=Double.parseDouble(text.getText());
					if(op=='-')
						no1-=Double.parseDouble(text.getText());
					if(op=='*')
						no1*=Double.parseDouble(text.getText());
					if(op=='/')
						no1/=Double.parseDouble(text.getText());
					if(op=='%')
						no1%=Double.parseDouble(text.getText());
					}
				text.setText("");
				op='-';
				}
			
				if(e.getSource()==mul)
				{
					t=0;
					
					if(n==0)
				{no1=Double.parseDouble(text.getText());
					n++;
				}
					else 
					{if(op=='+')
						no1+=Double.parseDouble(text.getText());
					if(op=='-')
						no1-=Double.parseDouble(text.getText());
					if(op=='*')
						no1*=Double.parseDouble(text.getText());
					if(op=='/')
						no1/=Double.parseDouble(text.getText());
					if(op=='%')
						no1%=Double.parseDouble(text.getText());
					}
					text.setText("");
				op='*';
				}
			
				if(e.getSource()==div)
				{
					t=0;
					
					if(n==0)
				{no1=Double.parseDouble(text.getText());
					n++;
				}
					else 
					{if(op=='+')
						no1+=Double.parseDouble(text.getText());
					if(op=='-')
						no1-=Double.parseDouble(text.getText());
					if(op=='*')
						no1*=Double.parseDouble(text.getText());
					if(op=='/')
						no1/=Double.parseDouble(text.getText());
					if(op=='%')
						no1%=Double.parseDouble(text.getText());
					}
					text.setText("");
				op='/';
				}
				
				if(e.getSource()==mod)
				{
					t=0;
					
					if(n==0)
				{no1=Double.parseDouble(text.getText());
					n++;
				}
					else 
					{if(op=='+')
						no1+=Double.parseDouble(text.getText());
					if(op=='-')
						no1-=Double.parseDouble(text.getText());
					if(op=='*')
						no1*=Double.parseDouble(text.getText());
					if(op=='/')
						no1/=Double.parseDouble(text.getText());
					if(op=='%')
						no1%=Double.parseDouble(text.getText());
					}
					text.setText("");
				op='%';
				}
				
				if(e.getSource()==neg)
				{
			
				double t=Double.parseDouble(text.getText());
				t*=-1;
				String s1=String.valueOf(t);
				String s2="";
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)=='.'&&s1.charAt(i+1)=='0')
						break;
					 s2+=s1.charAt(i);
				}
				
				text.setText(s2);
				
				}
			
				if(e.getSource()==equ)
				{
					n=0;
					t=1;
				no2=Double.parseDouble(text.getText());
				if(op=='+')
					result=no1+no2;
				if(op=='-')
					result=no1-no2;
				if(op=='*')
					result=no1*no2;
				if(op=='/')
					result=no1/no2;
				if(op=='%')
					result=no1%no2;
				if(op==' ')
					result=Double.parseDouble(text.getText());
				
				int length=String.valueOf(result).length();
				
				String type=String.valueOf(result);
				
				String display="";
				
				for(int i=0;i<length;i++)
				{
					if(type.charAt(i)=='.'&&type.charAt(i+1)=='0')
						break;
					 display+=type.charAt(i);
				}
				
				text.setText(display);
		
				}
				
				if(e.getSource()==clear)
					{
					t=0;
					text.setText("");
					no1=0.0;no2=0.0;result=0.0; op=' ';
					
					}
					
				
				if(e.getSource()==delete && t!=1)
				{
					
					String s=text.getText();
					text.setText("");
					for(int i=0;i<s.length()-1;i++)
					{
						text.setText(text.getText()+s.charAt(i));
					}
					
				}
			}
	
		};
		
		add.addActionListener(a);
		sub.addActionListener(a);
		mul.addActionListener(a);
		div.addActionListener(a);
		dot.addActionListener(a);
		equ.addActionListener(a);
		mod.addActionListener(a);
		neg.addActionListener(a);
		clear.addActionListener(a);
		delete.addActionListener(a);
		
		for(int i=0;i<10;i++)
		{
			numbers[i]=new JButton(String.valueOf(i));
			numbers[i].setFont(new Font("Arial",Font.BOLD,15));
			numbers[i].addActionListener(a);
		}
		
		panel.add(clear);
		panel.add(neg);
		panel.add(mod);
		panel.add(delete);
		panel.add(numbers[1]);
		panel.add(numbers[2]);
		panel.add(numbers[3]);
		panel.add(add);
		panel.add(numbers[4]);
		panel.add(numbers[5]);
		panel.add(numbers[6]);
		panel.add(sub);
		panel.add(numbers[7]);
		panel.add(numbers[8]);
		panel.add(numbers[9]);
		panel.add(mul);
		panel.add(dot);
		panel.add(numbers[0]);
		panel.add(div);
		panel.add(equ);
		
		contentPane.add(panel);
		frame.setVisible(true);
	}

}
