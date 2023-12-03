import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener
{
	
	public static void main(String[] args) 
	{
		new Calculator();
	}
	
	//Eingabefelder
	private JTextField feld1 = new JTextField();
	private JTextField feld2 = new JTextField();
	
	//Ergebnis-Ausgabe
	private JTextField feldErg = new JTextField();
	
	//Alle Buttons des Taschenrechners
	private JButton btAdd = new JButton("+");
	private JButton btSub = new JButton("-");
	private JButton btDiv = new JButton("/");
	private JButton btMul= new JButton("*");
	private JButton btLoes = new JButton("Löschen");
	
	//Ergebnis-Label
	private JLabel text1 = new JLabel("Bitte Zahl 1 einfügen:");
	private JLabel text2 = new JLabel("Bitte Zahl 2 einfügen:");
	private JLabel text3 = new JLabel("Auswahl der Rechenoperation:");
	private JLabel textErg = new JLabel("Ergebnis");
	
	public Calculator() {
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		text1.setBounds(100, 10, 200, 20);
		feld1.setBounds(100,40,200,40);
		text2.setBounds(100, 100, 200, 20);
		feld2.setBounds(100,130,200,40);
		text3.setBounds(100, 190, 200, 20);
		
		btAdd.setBounds(100, 220, 50, 30);
		btSub.setBounds(150, 220, 50, 30);
		btDiv.setBounds(200, 220, 50, 30);
		btMul.setBounds(250, 220, 50, 30);
		
		textErg.setBounds(100, 270, 200, 20);
		feldErg.setBounds(100, 300, 200, 80);
		feldErg.setEditable(false); 
		Font myFont = new Font("Arial", Font.BOLD, 18);
		feldErg.setFont(myFont);
		
		btLoes.setBounds(100, 400, 200, 30);
		
		cp.add(text1);
		cp.add(feld1);
		cp.add(text2);
		cp.add(feld2);
		cp.add(text3);
		cp.add(btAdd);
		cp.add(btSub);
		cp.add(btDiv);
		cp.add(btMul);
		cp.add(textErg);
		cp.add(feldErg);
		cp.add(btLoes);

		setTitle("Taschenrechner");
		setSize(400, 480);
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
			var1 = Double.parseDouble(feld1.getText());
			var2 = Double.parseDouble(feld2.getText());
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
			var1 = Double.parseDouble(feld1.getText());
			var2 = Double.parseDouble(feld2.getText());
				
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
			var1 = Double.parseDouble(feld1.getText());
			var2 = Double.parseDouble(feld2.getText());
				
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
			var1 = Double.parseDouble(feld1.getText());
			var2 = Double.parseDouble(feld2.getText());
				
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
			feld1.setText("");
			feld2.setText("");
			textErg.setText("");
		}
		
	}
}
