import java.awt.AWTException; 
import java.awt.Rectangle; 
import java.awt.Robot; 
import java.awt.*;
import java.awt.event.*;
//import java.applet.*;
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import java.io.File; 
import javax.imageio.ImageIO; 
  
public class Save{ 
	public static final long serialVersionUID = 1L;
	public static boolean screenShot()
    {
        try 
		{ 
            	Thread.sleep(120); 
            	Robot r = new Robot(); 

            	// It saves screenshot to desired path 
            	Frame f=new Frame("Enter The File Name"); 
            	final TextField tf=new TextField();  
            	Label l1,l2;
            	l1=new Label("Enter The File Name:");
            	l1.setBounds(50,100, 150,20);  
            	l2=new Label("The File will be Saved in F Drive");
            	l2.setBounds(100,350,200,20);
            	tf.setBounds(50,150, 150,20);  
            	Button b=new Button("OK");  
            	b.setBounds(50,200,60,30);  
    		
            	b.addActionListener
            	(
            			new ActionListener()
            			{  
            				public void actionPerformed(ActionEvent e)
            				{  
            					String s1=tf.getText();
            					if(s1!="")
            					{
            						String path = "F://"+s1+".jpg"; 
            						//System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
            						// Used to get ScreenSize and capture image
            						f.setVisible(false);
									try
									{
										Thread.sleep(200);
										Rectangle capture =new Rectangle(104,100,1000,700);
										BufferedImage Image = r.createScreenCapture(capture); 
										ImageIO.write(Image, "jpg", new File(path));
										System.exit(0);
									}
									catch (IOException | InterruptedException ex) 
									{ 
										System.out.println("File Not Saved"); 
									}
            					}	  
            				}  
            			}
            	);

		f.add(l1);f.add(l2);
		f.add(b);f.add(tf);  
		f.setSize(400,400);  
		f.setLayout(null);  
 		f.setVisible(true);

        } 
        catch (AWTException | InterruptedException ex) { 
            System.out.println("File Not Saved");
        	
        }
    return true;
    } 
}