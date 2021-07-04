import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class CRgame extends JFrame implements ActionListener
{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,
	b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,
	b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,
	b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,
	b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99;
	JButton end,close;
	JFrame f;
	JPanel p;
	JLabel l1,l2,pl;
	Object ob[][] = new JButton[10][10];
	int arr[][] = new int[10][10];
	int p1[][] = new int[10][10];
	int p2[][] = new int[10][10];
	int x,y,u=1,steps=0;
	CRgame()
	{
		f = new JFrame();
		p = new JPanel();
		end = new JButton("Restart");
		close = new JButton("CLOSE");
		l1 = new JLabel("Welcome to Chain Reaction");
		l2 = new JLabel("-------P1 => YELLOW-------------------P2 => CYAN-------");
		pl = new JLabel("Player -> 1");
		ob[0][0] = b0 = new JButton("0");
		ob[0][1] = b1 = new JButton("0");
		ob[0][2] = b2 = new JButton("0");
		ob[0][3] = b3 = new JButton("0");
		ob[0][4] = b4 = new JButton("0");
		ob[0][5] = b5 = new JButton("0");
		ob[0][6] = b6 = new JButton("0");
		ob[0][7] = b7 = new JButton("0");
		ob[0][8] = b8 = new JButton("0");
		ob[0][9] = b9 = new JButton("0");
		ob[1][0] = b10 = new JButton("0");
		ob[1][1] = b11 = new JButton("0");
		ob[1][2] = b12 = new JButton("0");
		ob[1][3] = b13 = new JButton("0");
		ob[1][4] = b14 = new JButton("0");
		ob[1][5] = b15 = new JButton("0");
		ob[1][6] = b16 = new JButton("0");
		ob[1][7] = b17 = new JButton("0");
		ob[1][8] = b18 = new JButton("0");
		ob[1][9] = b19 = new JButton("0");
		ob[2][0] = b20 = new JButton("0");
		ob[2][1] = b21 = new JButton("0");
		ob[2][2] = b22 = new JButton("0");
		ob[2][3] = b23 = new JButton("0");
		ob[2][4] = b24 = new JButton("0");
		ob[2][5] = b25 = new JButton("0");
		ob[2][6] = b26 = new JButton("0");
		ob[2][7] = b27 = new JButton("0");
		ob[2][8] = b28 = new JButton("0");
		ob[2][9] = b29 = new JButton("0");
		ob[3][0] = b30 = new JButton("0");
		ob[3][1] = b31 = new JButton("0");
		ob[3][2] = b32 = new JButton("0");
		ob[3][3] = b33 = new JButton("0");
		ob[3][4] = b34 = new JButton("0");
		ob[3][5] = b35 = new JButton("0");
		ob[3][6] = b36 = new JButton("0");
		ob[3][7] = b37 = new JButton("0");
		ob[3][8] = b38 = new JButton("0");
		ob[3][9] = b39 = new JButton("0");
		ob[4][0] = b40 = new JButton("0");
		ob[4][1] = b41 = new JButton("0");
		ob[4][2] = b42 = new JButton("0");
		ob[4][3] = b43 = new JButton("0");
		ob[4][4] = b44 = new JButton("0");
		ob[4][5] = b45 = new JButton("0");
		ob[4][6] = b46 = new JButton("0");
		ob[4][7] = b47 = new JButton("0");
		ob[4][8] = b48 = new JButton("0");
		ob[4][9] = b49 = new JButton("0");
		ob[5][0] = b50 = new JButton("0");
		ob[5][1] = b51 = new JButton("0");
		ob[5][2] = b52 = new JButton("0");
		ob[5][3] = b53 = new JButton("0");
		ob[5][4] = b54 = new JButton("0");
		ob[5][5] = b55 = new JButton("0");
		ob[5][6] = b56 = new JButton("0");
		ob[5][7] = b57 = new JButton("0");
		ob[5][8] = b58 = new JButton("0");
		ob[5][9] = b59 = new JButton("0");
		ob[6][0] = b60 = new JButton("0");
		ob[6][1] = b61 = new JButton("0");
		ob[6][2] = b62 = new JButton("0");
		ob[6][3] = b63 = new JButton("0");
		ob[6][4] = b64 = new JButton("0");
		ob[6][5] = b65 = new JButton("0");
		ob[6][6] = b66 = new JButton("0");
		ob[6][7] = b67 = new JButton("0");
		ob[6][8] = b68 = new JButton("0");
		ob[6][9] = b69 = new JButton("0");
		ob[7][0] = b70 = new JButton("0");
		ob[7][1] = b71 = new JButton("0");
		ob[7][2] = b72 = new JButton("0");
		ob[7][3] = b73 = new JButton("0");
		ob[7][4] = b74 = new JButton("0");
		ob[7][5] = b75 = new JButton("0");
		ob[7][6] = b76 = new JButton("0");
		ob[7][7] = b77 = new JButton("0");
		ob[7][8] = b78 = new JButton("0");
		ob[7][9] = b79 = new JButton("0");
		ob[8][0] = b80 = new JButton("0");
		ob[8][1] = b81 = new JButton("0");
		ob[8][2] = b82 = new JButton("0");
		ob[8][3] = b83 = new JButton("0");
		ob[8][4] = b84 = new JButton("0");
		ob[8][5] = b85 = new JButton("0");
		ob[8][6] = b86 = new JButton("0");
		ob[8][7] = b87 = new JButton("0");
		ob[8][8] = b88 = new JButton("0");
		ob[8][9] = b89 = new JButton("0");
		ob[9][0] = b90 = new JButton("0");
		ob[9][1] = b91 = new JButton("0");
		ob[9][2] = b92 = new JButton("0");
		ob[9][3] = b93 = new JButton("0");
		ob[9][4] = b94 = new JButton("0");
		ob[9][5] = b95 = new JButton("0");
		ob[9][6] = b96 = new JButton("0");
		ob[9][7] = b97 = new JButton("0");
		ob[9][8] = b98 = new JButton("0");
		ob[9][9] = b99 = new JButton("0");
		
		f.setLayout(null);					
		p.setLayout(new GridLayout(10,10));
		p.setBounds(80,80,600,600);
		l1.setBounds(100,0,800,20);
		l2.setBounds(100,30,800,20);
		pl.setBounds(100,60,500,20);
		end.setBounds(300,750,200,30);
		close.setBounds(750,50,100,30);
		
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				p.add((JButton)ob[i][j]);		
		
		
		f.add(l1);
		f.add(l2);
		f.add(p);
		f.add(pl);
		f.add(end);
		f.add(close);
		
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
			{
				JButton jb = (JButton)ob[i][j];
				jb.addActionListener(this);				
			}		
		end.addActionListener(this);
		close.addActionListener(this);
		f.setSize(1000,1000);
		f.setVisible(true);
	}
	public void PC(int a, int b, int x)
	{
		if(x==1)
		{
			p1[a][b] = 1;
			p2[a][b] = 0;
		}
		else if(x==2)
		{
			p2[a][b] = 1;
			p1[a][b] = 0;
		}
		else if(x==0)
		{
			p1[a][b] = 0;
			p2[a][b] = 0;
		}
	}
	public void status(int i , int j, int k)
	{
		if(arr[i][j] != 0)
			PC(i,j,k);
		else
			PC(i,j,0);
	}
	public void internal(int a, int b, int u)
	{
		check(a,b,u);
		status(a,b,u);
	}
	public void check (int a, int b, int y)
	{
		if(arr[a][b] == 4)
		{
			arr[a][b] = 0;
			if(b<=8)
			{
				arr[a][b+1] ++ ;
				internal(a,b+1,y);				
			}
			if(b>=1)
			{
				arr[a][b-1] ++ ;
				internal(a,b-1,y);
			}
			if(a<=8)
			{
				arr[a+1][b] ++ ;
				internal(a+1,b,y);
			}
			if(a>=1)
			{
				arr[a-1][b] ++ ;
				internal(a-1,b,y);
			}			
		}
		else if(arr[a][b] == 3)
		{
			if(a==0 && b>0 && b<9)
			{
				arr[a][b] = 0;
				arr[a][b-1]++;
				internal(a,b-1,y);
				arr[a][b+1]++;
				internal(a,b+1,y);
				arr[a+1][b]++;
				internal(a+1,b,y);
			}
			if(a==9 && b>0 && b<9)
			{
				arr[a][b] = 0;
				arr[a][b-1]++;
				internal(a,b-1,y);
				arr[a][b+1]++;
				internal(a,b+1,y);
				arr[a-1][b]++;
				internal(a-1,b,y);
			}
			if(b==0 && a>0 && a<9)
			{
				arr[a][b] = 0;
				arr[a-1][b]++;
				internal(a-1,b,y);
				arr[a+1][b]++;
				internal(a+1,b,y);
				arr[a][b+1]++;
				internal(a,b+1,y);
			}
			if(b==9 && a>0 && a<9)
			{
				arr[a][b] = 0;
				arr[a-1][b]++;
				internal(a-1,b,y);
				arr[a+1][b]++;
				internal(a+1,b,y);
				arr[a][b-1]++;
				internal(a,b-1,y);
			}
		}
		else if(arr[a][b] == 2)
		{
			if(a==0 && b==0)
			{
				arr[a][b] = 0;
				arr[a+1][b]++;
				internal(a+1,b,y);
				arr[a][b+1]++;
				internal(a,b+1,y);
			}
			if(a==0 && b==9)
			{
				arr[a][b] = 0;
				arr[a+1][b]++;
				internal(a+1,b,y);
				arr[a+1][b-1]++;
				internal(a,b-1,y);
			}
			if(a==9 && b==0)
			{
				arr[a][b] = 0;
				arr[a-1][b]++;
				internal(a-1,b,y);
				arr[a][b+1]++;
				internal(a,b+1,y);
			}
			if(a==9 && b==9)
			{
				arr[a][b] = 0;
				arr[a-1][b]++;
				internal(a-1,b,y);
				arr[a][b-1]++;
				internal(a,b-1,y);
			}
		}
	}
	public int win()
	{
		int sum1 = 0,sum2 = 0,i,j;
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
			{
				sum1 = sum1 + p1[i][j];
				sum2 = sum2 + p2[i][j];
			}
		if(sum1==0)
			return 2;
		else if(sum2 == 0)
			return 1;
		else
			return 0;
		
	}
	public void restart()
	{
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
			{
				arr[i][j] = 0;
				p1[i][j] = 0;
				p2[i][j] = 0;
			}
	}
	public void display()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(arr[i][j] == 0)
				{
					((JButton)ob[i][j]).setText("0");
					p1[i][j] = 0;
					p2[i][j] = 0;
					((JButton)ob[i][j]).setBackground(Color.white);
				}
				if(p1[i][j] == 1)
				{
					((JButton)ob[i][j]).setText(Integer.toString(arr[i][j]));
					((JButton)ob[i][j]).setBackground(Color.yellow);					
				}
				else if(p2[i][j] == 1)
				{					
					((JButton)ob[i][j]).setText(Integer.toString(arr[i][j]));
					((JButton)ob[i][j]).setBackground(Color.cyan);					
				}								
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		display();
		if(u == 1)
		{
			for(int i =0;i<10;i++)
				for(int j=0;j<10;j++)
					if(ob[i][j] == (JButton)e.getSource())
					{
						if(p2[i][j] == 0)
						{
							steps++;
							arr[i][j]++;
							p1[i][j] = 1;
							check(i,j,u);
							pl.setText("Player -> 2");
							((JButton)ob[i][j]).setBackground(Color.yellow);	
							u = 2;
						}
					}
			display();
		}
		else if(u == 2)
		{
			for(int i =0;i<10;i++)
				for(int j=0;j<10;j++)
					if(ob[i][j] == (JButton)e.getSource())
					{
						if(p1[i][j] == 0)
						{
							steps++;
							arr[i][j]++;
							p2[i][j] = 1;
							check(i,j,u);
							pl.setText("Player -> 1");
							((JButton)ob[i][j]).setBackground(Color.cyan);
							u = 1;
						}
					}
			display();
		}
		if(end == (JButton)e.getSource())
		{
			restart();
			display();
		}
		if(close == (JButton)e.getSource())
		{
			System.exit(1);
		}
		if(win() != 0 && steps>=2)
		{
				display();
				if(win() == 1 && steps>=2)
				{
					pl.setText("Player -> 1 is the Winner -------  Player -> 2 Start the game");
					steps = 0;
					//restart();
					display();
				}
				else if(win() == 2 && steps>=2)
				{
					pl.setText("Player -> 2 is the Winner -------  Player -> 1 Start the game");
					steps = 0;
					//restart();
					display();
				}					
		}
	}
}
public class ChainReaction
{
	public static void main(String args[])throws InterruptedException
	{
		JOptionPane.showMessageDialog(null,"The objective of Chain Reaction is to take control of the board by eliminating your oppenents Cells.\n\nPlayers takes it in turns to place their numbers in a cell. Once a cell has reached critical number, \nthe cells explode into the surrounding cells adding an extra cell and claiming the cell for the player.\nA player may only place their point in a blank cell or a cell that contains numbers of their own color. \nAs soon as a player looses all their cells, they are out of the game.");
		CRgame obj = new CRgame();		
	}
}