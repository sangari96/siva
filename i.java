import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import javax.swing.*;

public class Snake extends Applet implements ActionListener
{
int SnakeWidth = 10;
int SnakeLength = 10;
int SnakeSpeed[] = new int[SnakeLength];              
int x[] = new int[SnakeLength];                     
int y[] = new int[SnakeLength];                         
int directionX[] = new int[SnakeLength];                
int directionY[] = new int[SnakeLength];          
Color SnakeColor[] = new Color[SnakeLength];        
Timer timer;

Button B1;
Button B2;
Button B3;

 public void init()
  {

        B1 = new Button("Feed Snake");
        add(B1);

        B3 = new Button("Starve Snake");
        add(B3);

        B2 = new Button("Exit");
        add(B2);

        for(int i = 0; i < SnakeLength; i++)
        {
            x[i] = (int)(i * 10 + getWidth());          
            y[i] = (int)(i * 10 + getHeight());       
            directionX[i] = (int)(1 * 2);             
            directionY[i] = (int)(1 * 2);               
            SnakeSpeed[i] = (int)(1);               
        }

        timer = new Timer(1, this);                     

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);

  }

  public void paint(Graphics g)
  {
  int i;
    for(i = 0; i < SnakeLength; i++)
    {
       g.setColor(SnakeColor[i]);                        
       g.fillOval(x[i], y[i], SnakeWidth, SnakeWidth);

            if(x[i] >= getWidth() - SnakeWidth)          
                directionX[i] = 1;                  
            if(x[i] <= 0)                                
                directionX[i] = 0;                       
            if(y[i] >= getHeight() - SnakeWidth)        
                directionY[i] = 1;                      
            if(y[i] <= 0)                               
                directionY[i] = 0;                  
            if(directionX[i] == 0)                       
                x[i]+=SnakeSpeed[i];                
            if(directionX[i] == 1)                    
                x[i]-=SnakeSpeed[i];                
            if(directionY[i] == 0)                       
                y[i]+=SnakeSpeed[i];                
            if(directionY[i] == 1)                      
                y[i]-=SnakeSpeed[i];                     

            if(x[i] <= 0)                                
            {
            setBackground(Color.black);
            SnakeColor[i] = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            }                                           
            else if(x[i] >= getWidth() - SnakeWidth)
            {
            setBackground(Color.white);
            SnakeColor[i] = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            }                                       
            else if(y[i] >= getHeight() - SnakeWidth)
            {
            setBackground(Color.darkGray);
            SnakeColor[i] = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            }                                           
            else if(y[i] <= 0)
            {
            setBackground(Color.green);
            SnakeColor[i] = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            }                                           
       }
}

    public void actionPerformed(ActionEvent e)    
    {

    repaint();

     if (e.getSource() == B1)
      {SnakeWidth = SnakeWidth+2;}
     else if (e.getSource() == B2)
     {System.exit(0);}
     else if (e.getSource() == B3)
     {SnakeWidth = SnakeWidth-2;}
    }

    public void start()
    {
        timer.start();                                
    }

  public static void main(String args[])
  {
    AppletFrame.startApplet("Snake","Snake",args);
  }
}

