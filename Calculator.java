import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener
{
	
	public static void main(String[] args) 
	{
		new Calculator();
	}

	private JTextField textVar = new JTextField();
	private JTextField textVar2 = new JTextField();
	private JTextField textErg = new JTextField();
	
	private JLabel labelErg = new JLabel("Ergebnis");
	
	private JButton btAdd = new JButton("+");
	private JButton btSub = new JButton("-");
	private JButton btDiv = new JButton("/");
	private JButton btMul= new JButton("*");
	private JButton btLoes = new JButton ("Löschen");
	
	public Calculator() {
		
		Container cp = getContentPane();
		cp.setLayout(null);
		textVar.setBounds(100,10,200,40);
		textVar2.setBounds(100,100,200,40);
		labelErg.setBounds(120,70,190,20);
		textErg.setBounds(220, 210, 120, 20);
		textErg.setEditable(false); 
		
		btAdd.setBounds(100, 60, 50, 30);
		btSub.setBounds(150, 60, 50, 30);
		btDiv.setBounds(200, 60, 50, 30);
		btMul.setBounds(250, 60, 50, 30);
		btLoes.setBounds(120, 150, 100, 20);

		cp.add(labelErg);
		cp.add(textVar);
		cp.add(textVar2);
		cp.add(textErg);
		cp.add(btAdd);
		cp.add(btSub);
		cp.add(btDiv);
		cp.add(btMul);
		cp.add(btLoes);
		
		setTitle("Taschenrechner");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btAdd.addActionListener(this);
		btSub.addActionListener(this);
		btDiv.addActionListener(this);
		btMul.addActionListener(this);
		btLoes.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		double var1, var2;
		Object obj = event.getSource();
		
		if(obj == btAdd) 
		{
			try
			{
			var1 = Double.parseDouble(textVar.getText());
			var2 = Double.parseDouble(textVar2.getText());
			var1 += var2;
			textErg.setText(""+var1);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(this, "Falsche Eingabe");
			}
			
		}	
		
		if(obj == btSub) 
		{
			try {
			var1 = Double.parseDouble(textVar.getText());
			var2 = Double.parseDouble(textVar2.getText());
				
			var1 -= var2;
			textErg.setText(""+var1);
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(this, "Falsche Eingabe");
			}
		}
			
		if(obj == btDiv) 
		{
			try
			{
			var1 = Double.parseDouble(textVar.getText());
			var2 = Double.parseDouble(textVar2.getText());
				
			var1 /= var2;
			textErg.setText(""+var1);
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(this, "Falsche Eingabe");
			}
		}
			
		if(obj == btMul) 
		{
			try {
			var1 = Double.parseDouble(textVar.getText());
			var2 = Double.parseDouble(textVar2.getText());
				
			var1 *= var2;
			textErg.setText(""+var1);
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(this, "Falsche Eingabe");
			}
		}
		
		if(obj == btLoes)
		{
			textVar.setText("");
			textVar2.setText("");
			textErg.setText("");
		}
		
	}
}
