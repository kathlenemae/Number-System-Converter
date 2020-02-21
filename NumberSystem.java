import java.awt.*;
import java.lang.*;
import java.awt.event.*;

public class NumberSystem implements ActionListener {
int temp=0;
Frame f = new Frame();
//Buttons
Button b1 = new Button("HEXA");//ok na sa conversion :)
Button b2 = new Button("OCTAL");//ok na 
Button b3 = new Button("DECIMAL");//ok na :) 
Button b4 = new Button("BINARY");//ok nasad :-)

Button b5 = new Button("A");
Button b6 = new Button("B");
Button b7 = new Button("C");
Button b8 = new Button("D");
Button b9 = new Button("E");
Button b10 = new Button("F");

Button b11 = new Button("1");
Button b12 = new Button("2");
Button b13 = new Button("3");
Button b14 = new Button("4");
Button b15 = new Button("5");
Button b16 = new Button("6");

Button b17 = new Button("7");
Button b18 = new Button("8");
Button b19 = new Button("9");
Button b20 = new Button("0");
Button b21 = new Button("BACKSPACE");
Button b22 = new Button("CLEAR");

//TEXTFIELDS
TextField t1 = new TextField();
TextField t2 = new TextField();
TextField t3 = new TextField();
TextField t4 = new TextField();

NumberSystem() {
//COORDINATORS
//layout for the firs 4 upper buttons
b1.setBounds(100,110,110,30);
b2.setBounds(100,170,110,30);
b3.setBounds(100,230,110,30);
b4.setBounds(100,290,110,30);

//for the letters
b5.setBounds(80,350,70,30);
b6.setBounds(160,350,70,30);
b7.setBounds(240,350,70,30);
b8.setBounds(320,350,70,30);
b9.setBounds(400,350,70,30);
b10.setBounds(480,350,70,30);

//for the numbers 1-6
b11.setBounds(80,400,70,30);
b12.setBounds(160,400,70,30);
b13.setBounds(240,400,70,30);
b14.setBounds(320,400,70,30);
b15.setBounds(400,400,70,30);
b16.setBounds(480,400,70,30);

//for the numbers 7 - 0 and clear
b17.setBounds(80,450,70,30);
b18.setBounds(160,450,70,30);
b19.setBounds(240,450,70,30);
b20.setBounds(320,450,70,30);
b21.setBounds(400,450,150,30);
b22.setBounds(228,500,180,30);


t1.setBounds(250,110,210,30);
t2.setBounds(250,170,210,30);
t3.setBounds(250,230,210,30);
t4.setBounds(250,290,210,30);

//adding to the frame
//for buttons
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);

f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b10);

f.add(b11);
f.add(b12);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);

f.add(b17);
f.add(b18);
f.add(b19);
f.add(b20);
f.add(b21);
f.add(b22);

//for Textfields
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
//enabled the buttons
b1.setEnabled(true);
b2.setEnabled(true);
b3.setEnabled(true);
b4.setEnabled(true);
b5.setEnabled(true);
b7.setEnabled(true);
b8.setEnabled(true);
b9.setEnabled(true);
b10.setEnabled(true);
b11.setEnabled(true);
b12.setEnabled(true);
b13.setEnabled(true);
b14.setEnabled(true);
b15.setEnabled(true);
b16.setEnabled(true);
b17.setEnabled(true);
b18.setEnabled(true);
b19.setEnabled(true);
b20.setEnabled(true);
b21.setEnabled(true);
b22.setEnabled(true);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);

b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);

b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);

f.setTitle("NUMBER SYSTEM CONVERTER");
   f.setSize(600,600);
   f.setLocation(500,100);
   f.setLayout(null);
   f.setVisible(true);
   //f.setBackground(Color.);
      

f.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.exit(0);
            }
            });
          
f.addMouseListener(new MouseAdapter() {
   public void mousePressed(MouseEvent me) {}
   public void mouseReleased(MouseEvent me) {}
   public void mouseClicked(MouseEvent me) {}
    }); 

}

public void actionPerformed(ActionEvent e)
{  
      String s=e.getActionCommand();
      
                
      if(e.getSource()==b1)
		{
       temp=1;
			   b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            t2.setEditable(false);
            t3.setEditable(false);
            t4.setEditable(false);
           
            
            try{
            int decimal = Integer.parseInt(t1.getText().toString(),16);
            t3.setText(""+decimal);
            //octal
            String octal = Integer.toString(decimal,8);
            t2.setText(""+octal);
            //binary
            String binary = Integer.toString(decimal,2);
            t4.setText(""+binary);
            }
            catch(NumberFormatException ex){
            t1.setText("");
           }
        }   
   
     else if(e.getSource() == b2){
     temp=2;
   //octal
         
            b1.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            t1.setEditable(false);
            t3.setEditable(false);
            t4.setEditable(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            
       
           
   
            try{
           //decimal
            int decimal = Integer.parseInt(t2.getText().toString(),8);
            t3.setText(""+decimal);
            //binary
            String binary = Integer.toString(decimal,2);
            t4.setText(""+binary);
            //hexadecimal
            String hexa = Integer.toString(decimal,16);
            t1.setText("" +hexa);
            }
            catch(NumberFormatException ex){
            t2.setText("");
           }

   
   }
   
      else if(e.getSource() == b3) {
      temp=3;
     //decimal
     
            b1.setEnabled(false);
            b2.setEnabled(false);
            b4.setEnabled(false);
            t1.setEditable(false);
            t2.setEditable(false);
            t4.setEditable(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            
            try{
            int decimal = Integer.parseInt(t3.getText());
            //octal
            String octal = Integer.toString(decimal,8);
            t2.setText(""+octal);
            //binary
            String binary = Integer.toString(decimal,2);
            t4.setText(""+binary);
            //hexadecimal
            String hexa = Integer.toString(decimal,16);
            t1.setText(""+hexa);
            }
            catch(NumberFormatException ex){
            t3.setText(" ");
           }

   }
   else if (e.getSource() == b4){
   temp=4;
   //binary
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            t1.setEditable(false);
            t2.setEditable(false);
            t3.setEditable(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
           
            
            try{
            int decimal = Integer.parseInt(t4.getText().toString(),2);
            t3.setText(""+decimal);
            //octal
            String octal = Integer.toString(decimal,8);
            t2.setText(""+octal);
            //hexadecimal
            String hexa = Integer.toString(decimal,16);
            t1.setText(""+hexa);
            }
            catch(NumberFormatException ex){
            t4.setText("");
           }

   }
  else if(temp == 1){
   if(e.getSource()==b20)
		{
				t1.setText(t1.getText()+"0");
		}
		if(e.getSource()==b11)
		{
				t1.setText(t1.getText()+"1");
		}
		if(e.getSource()==b12)
		{
				t1.setText(t1.getText()+"2");
		}
		if(e.getSource()==b13)
		{
				t1.setText(t1.getText()+"3");
		}
		if(e.getSource()==b14)
		{
				t1.setText(t1.getText()+"4");
		}
		if(e.getSource()==b15)
		{
				t1.setText(t1.getText()+"5");
		}
		if(e.getSource()==b16)
		{
				t1.setText(t1.getText()+"6");
		}
		if(e.getSource()==b17)
		{
				t1.setText(t1.getText()+"7");
		}
		if(e.getSource()==b18)
		{
				t1.setText(t1.getText()+"8");
		}
		if(e.getSource()==b19)
		{
				t1.setText(t1.getText()+"9");
		}
		if(e.getSource()==b5)
		{
				t1.setText(t1.getText()+"A");
		}
		if(e.getSource()==b6)
		{
				t1.setText(t1.getText()+"B");
		}
		if(e.getSource()==b7)
		{
				t1.setText(t1.getText()+"C");
		}
		if(e.getSource()==b8)
		{
				t1.setText(t1.getText()+"D");
		}
		if(e.getSource()==b9)
		{
				t1.setText(t1.getText()+"E");
		}
		if(e.getSource()==b10)
		{
				t1.setText(t1.getText()+"F");
		}
      }
	if(temp == 2){
      if(e.getSource()==b20)
		{
				t2.setText(t2.getText()+"0");
		}
		if(e.getSource()==b11)
		{
				t2.setText(t2.getText()+"1");
		}
		if(e.getSource()==b12)
		{
				t2.setText(t2.getText()+"2");
		}
		if(e.getSource()==b13)
		{
				t2.setText(t2.getText()+"3");
		}
		if(e.getSource()==b14)
		{
				t2.setText(t2.getText()+"4");
		}
		if(e.getSource()==b15)
		{
				t2.setText(t2.getText()+"5");
		}
		if(e.getSource()==b16)
		{
				t2.setText(t2.getText()+"6");
		}
		if(e.getSource()==b17)
		{
				t2.setText(t2.getText()+"7");
		}
   }
  if(temp == 3){
   if(e.getSource()==b20)
		{
				t3.setText(t3.getText()+"0");
		}
		if(e.getSource()==b11)
		{
				t3.setText(t3.getText()+"1");
		}
		if(e.getSource()==b12)
		{
				t3.setText(t3.getText()+"2");
		}
		if(e.getSource()==b13)
		{
				t3.setText(t3.getText()+"3");
		}
		if(e.getSource()==b14)
		{
				t3.setText(t3.getText()+"4");
		}
		if(e.getSource()==b15)
		{
				t3.setText(t3.getText()+"5");
		}
		if(e.getSource()==b16)
		{
				t3.setText(t3.getText()+"6");
		}
		if(e.getSource()==b17)
		{
				t3.setText(t3.getText()+"7");
		}
		if(e.getSource()==b18)
		{
				t3.setText(t3.getText()+"8");
		}
		if(e.getSource()==b19)
		{
				t3.setText(t3.getText()+"9");
		}

   }
   if(temp == 4){
      if(e.getSource()==b20)
		{
				t4.setText(t4.getText()+"0");
		}
      if(e.getSource()==b11)
		{
				t4.setText(t4.getText()+"1");
		}
    }
      if(temp==1){
         if(e.getSource()==b21)
		{
				t1.setText(t1.getText().substring(0, t1.getText().length()-1));
		}
    }
      if(temp==2){
         if(e.getSource()==b21)
		{
				t2.setText(t2.getText().substring(0, t2.getText().length()-1));
		}
    }
      if(temp==3){
         if(e.getSource()==b21)
		{
				t3.setText(t3.getText().substring(0, t3.getText().length()-1));
		}
    }
      if(temp==4){
         if(e.getSource()==b21)
		{
				t4.setText(t4.getText().substring(0, t4.getText().length()-1));
		}
    }
  
  if(e.getSource()==b22)
		{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
            
            b1.setEnabled(true);
b2.setEnabled(true);
b3.setEnabled(true);
b4.setEnabled(true);
b5.setEnabled(true);
b7.setEnabled(true);
b8.setEnabled(true);
b9.setEnabled(true);
b10.setEnabled(true);
b11.setEnabled(true);
b12.setEnabled(true);
b13.setEnabled(true);
b14.setEnabled(true);
b15.setEnabled(true);
b16.setEnabled(true);
b17.setEnabled(true);
b18.setEnabled(true);
b19.setEnabled(true);
b20.setEnabled(true);
b21.setEnabled(true);
b22.setEnabled(true);
				
		}

 }


 public static void main(String[] args)
         {
                NumberSystem f=new NumberSystem();
                 
                }
             }
