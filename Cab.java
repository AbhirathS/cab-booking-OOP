import javax.swing.*;                
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;

class Customer implements java.io.Serializable
{
	String userid;
	String password;
	long PhoneNum;
	String email;
	long wallet;
	Customer(String userid, String password, long PhoneNum, String email, long wallet)
	{
		this.userid = userid;
		this.password = password;
		this.PhoneNum = PhoneNum;
		this.email = email;
		this.wallet = wallet;
	}
	Customer getvalues()
	{
		Customer tempBuffer = new Customer(this.userid,this.password,this.PhoneNum,this.email,this.wallet);
		return tempBuffer;
	}
}

class Driver extends Thread implements java.io.Serializable
{
  	String vehicleid;
  	double rating;
  	long phonenum;
  	int loc;
  	boolean flag;      
  	Driver(String vehicleid, double rating, long phonenum)
  	{
  		this.flag = true; 
  		this.vehicleid = vehicleid;
  		this.rating = rating;
  		this.phonenum = phonenum;
        }
    	public void run()
    	{
    		try
    		{
    			this.flag = false;
    			Thread.currentThread().sleep(10000);
    			this.flag = true;
    		}
    		catch(Exception e)
    		{}
    	}
}

class Cab
{
  	public static void main(String[] args)
  	{                       
  		new f();
  	}                                      
}

class f extends JFrame implements ActionListener
{
  	JTextField f1;
  	JPasswordField f2;  //username, password
  	JButton b1,b2;     //Login, Sign-Up
  	JLabel l1,l2;      //Username, Password

	f()
  	{
  		f1 = new JTextField(15);
  		b1 = new JButton("Login");
  		f2 = new JPasswordField(15);
  		b2 = new JButton("Sign-Up");
  		l1 = new JLabel("Username");
  		l2 = new JLabel("Password");
  		add(l1);add(f1);add(l2);add(f2);add(b1);add(b2);
  		b1.addActionListener(this);
  		b2.addActionListener(this);
  		setSize(500,500);
  		setVisible(true);
  		setLayout(new FlowLayout());
  		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  	}
  	public void actionPerformed(ActionEvent e)
  	{
  			Driver dr[] = new Driver[4];
    		/*	dr[0] = ;
    		//	dr[0].start();
    			dr[1] = new Driver("B", 5, 36272);
    		//	dr[1].start();
    			dr[2] = new Driver("C", 3.9, 37223);
    		//	dr[2].start();
    			dr[3] = new Driver("D", 4.3, 47584);
    		//	dr[3].start(); */
    			

         	if(e.getSource() == b1)
         	{
         	/*	ArrayList<Driver> dr = new ArrayList<>();
    			dr.add(new Driver("A", 4.5, 95749, true));
    			dr.add(new Driver("B", 5, 47586, true));
    			dr.add(new Driver("C", 3.9, 67849, true));
    			dr.add(new Driver("D", 4.3, 83452, true));   */

    			ArrayList<Driver> dal = new ArrayList<>();
    		//	dal.add(new Driver("A", 4.5, 57483));
    		/*	try
    			{
    				FileOutputStream fos = new FileOutputStream("Driver.ser");
      				ObjectOutputStream oos = new ObjectOutputStream(fos);
      				oos.writeObject(dal);
      				oos.close();
      				fos.close();

    			}
    			catch(Exception erf){} */
    			try
    			{ 
			try
			{			
				FileInputStream fis = new FileInputStream("Driver.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				dal = (ArrayList)ois.readObject();
				ois.close();
				fis.close();
			}
			catch(NullPointerException ero){}
			catch(IOException e1)
    			{
        		}				
        		catch(ClassNotFoundException cle)
        		{
       				System.out.println("This 22");
      			}
      			
      			catch(Exception wre){}
      		//	System.out.println(dal.size() + " 1");
      			try
      			{
      				if(dal.size() == 0)
      				{
      					dal.add(new Driver("A", 4.5, 95749));
      					dal.add(new Driver("B", 5, 85383));
      					dal.add(new Driver("C", 3.9, 48376));
      					dal.add(new Driver("D", 4.3, 47793));
      					System.out.println(dal.size() + " 2");
       					
       				}
       					dr[0] = dal.get(0);
       					dr[1] = dal.get(1);
       					dr[2] = dal.get(2);
       					dr[3] = dal.get(3);
       					FileOutputStream fos = new FileOutputStream("Driver.ser");
      					ObjectOutputStream oos = new ObjectOutputStream(fos);
      					oos.writeObject(dal);
      					oos.close();
      					fos.close();
      				
      					
      			}
      			
      			catch(NullPointerException fs){System.out.println("caught");}
      			catch(Exception eewfweW){}
      		//	System.out.println(dal.size() +  " 3");

      		//	Driver ob = new Driver("RANDOM", 3, 21441);
      			

      				/*	ArrayList<Driver> dal1 = new ArrayList<>();
    			 					try
    			 					{                                                                       
    			 						 FileInputStream fis = new FileInputStream("Driver.ser");
    			 						 ObjectInputStream ois = new ObjectInputStream(fis);
    			 						 dal1 = (ArrayList)ois.readObject();                             
    			 						 ois.close();
    			 						 fis.close();
    			 					}
    			 					catch(Exception f)
    			 					{
    			 					}
    			 					System.out.println(dal1.size() + " 4");     */  

      		//	catch (IOException ioe)
        	//	{				
            	//		ioe.printStackTrace();
       		//	}
                            		/*	Driver dr[] = new Driver[4];
    			dr[0] = new Driver("A", 4.5, 95749, true);
    		//	dr[0].start();
    			dr[1] = new Driver("B", 5, 36272, true);
    		//	dr[1].start();
    			dr[2] = new Driver("C", 3.9, 37223, true);
    		//	dr[2].start();
    			dr[3] = new Driver("D", 4.3, 47584, true);
    		//	dr[3].start();                           */

    		/*	if(dr[0].flag && dr[1].flag && dr[2].flag && dr[3].flag)
    			{
    				System.out.println("HAHAHAH");
    			}                 */
 			Random rand = new Random();
    			dr[0].loc = rand.nextInt(8);
    			dr[1].loc = rand.nextInt(8);
    			dr[2].loc = rand.nextInt(8);
    	 		dr[3].loc = rand.nextInt(8);     
        		String s1 = f1.getText();
        		String s2 = f2.getText();
        		String filename = "Customer.ser";
        		ArrayList<Customer> ali = new ArrayList<>();            
        		try
        		{
        			int flags = 1;
        			FileInputStream fis = new FileInputStream("Customer.ser");
            		
            			ObjectInputStream ois = new ObjectInputStream(fis);                      
            			ali = (ArrayList)ois.readObject();
            			ois.close();
            			fis.close();
            			for(Customer it : ali)
           			{

            				if(s1.equals(it.userid) && s2.equals(it.password))
            				{
            				//	int dis[][] = new int[10][10];
            					flags = 0;
            					JFrame map = new JFrame("Welcome:  " + it.userid);
            					ImageIcon i = new ImageIcon("C:/map.png");
            					JLabel label = new JLabel(i);
            					JScrollPane jsp = new JScrollPane(label);
            					JLabel money = new JLabel("MONEY: " + it.wallet);
           	 				map.add(money);
            					JButton addmoney = new JButton("ADD MONEY");
            					map.add(addmoney);
            					addmoney.addActionListener(new ActionListener()          
            					{
            						public void actionPerformed(ActionEvent blah)
            						{
            							try
            							{
            								JFrame nf = new JFrame("Add Money Frame");
            								nf.setVisible(true);
            								nf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            								nf.setLayout(new FlowLayout());
            								nf.setSize(500,500);
            								JLabel o = new JLabel("ENTER MONEY HERE");
            								nf.add(o);
            								JTextField textfield = new JTextField(15);
            								nf.add(textfield);
            								JButton ADD = new JButton("Add To Wallet");
            								nf.add(ADD);
                                                                        ADD.addActionListener(new ActionListener()
                                                                        {
                                                                        	public void actionPerformed(ActionEvent lala)
                                                                        	{
                                                                        		long mon = 0;
                                                                        		mon -= mon;
                                                                        		try
                                                                        		{
                                                                        			mon += Long.parseLong(textfield.getText());
                                                                        			if( (mon <= 0) && (mon >= 1000))
                                                                        			    throw new NumberFormatException();
                                                                        		}
                                                                        		catch(NumberFormatException t)
                                                                        		{
                                                                        			JFrame k = new JFrame("Add Valid No");
            											k.setVisible(true);
            											k.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            											k.setSize(400,400);

                                                                        		}
                                                                        		if(mon>0)
                                                                        		{
                                                                        		it.wallet += mon;
                                                                        		money.setText("MONEY: " + it.wallet);
												ArrayList<Customer> al = new ArrayList<>();
												try
												{
						
													FileInputStream fis = new FileInputStream("Customer.ser");
													ObjectInputStream ois = new ObjectInputStream(fis);
													al = (ArrayList)ois.readObject();
													ois.close();
													fis.close();
												}
												catch(IOException e1)
        											{
        											}				
        											catch(ClassNotFoundException cle)
        											{
       													System.out.println("This 22");
      												}
      												try
      												{
      													for(Customer it1 : al)
      													{                                                            
      														String l = it1.userid;
      														String l1 = it1.password;
      														if(l.equals(it.userid) && l1.equals(it.password))
      														{
      															it1.wallet = it.wallet;
      															FileOutputStream fos = new FileOutputStream("Customer.ser");
      															ObjectOutputStream oos = new ObjectOutputStream(fos);
      															oos.writeObject(al);
      															oos.close();
      															fos.close();
      															break;
      														}
      													}
      												}
      												catch (IOException ioe)
        											{				
            												ioe.printStackTrace();
        											}
        										}
										}	 
                                                                        });
            							}
            							catch(NumberFormatException rr)
            							{
            								JFrame k = new JFrame("Add Valid No");
            								k.setVisible(true);
            								k.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            								k.setSize(400,400);
            							}
            						}                                        
       					    	});		      
    					        map.getContentPane().add(jsp);
    					        JLabel currlocation = new JLabel("Current Location");
    					        JLabel deslocation = new JLabel("Desired Location");
    					        JTextField currloc = new JTextField(15);   
    					        JTextField desloc = new JTextField(15);
    					        map.add(currlocation);
    					        map.add(currloc);
    					        map.add(deslocation);
    					        map.add(desloc);
    					        JButton ok = new JButton("OK");
    					    	map.add(ok);
    					    	JButton show = new JButton("Show Drivers");
    					    	map.add(show);
    					    	show.addActionListener(new ActionListener()
    					    	{
    					    		public void actionPerformed(ActionEvent w)
    					    		{
    					    			try
    					    			{
    					    			JFrame fr = new JFrame("Drivers near you");
    					    			fr.setVisible(true);
    					    			fr.setSize(200,200);
    					    			fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    					    			fr.setLayout(new FlowLayout());
    					    			JLabel la = new JLabel(dr[0].vehicleid + " is at location " + dr[0].loc);
    					    			JLabel lb = new JLabel(dr[1].vehicleid + " is at location " + dr[1].loc);
    					  	  		JLabel lc = new JLabel(dr[2].vehicleid + " is at location " + dr[2].loc);
    					  	  		JLabel ld = new JLabel(dr[3].vehicleid + " is at location " + dr[3].loc);
    					  	  		JLabel le = new JLabel("Clicking Ok will confirm your ride");
    					  	  		fr.add(la);
    					    			fr.add(lb);
    					    			fr.add(lc);
    					   	 		fr.add(ld);
    					   	 		fr.add(le);
    					   	 		}
    					   	 		catch(NullPointerException eed){System.out.println("caught 1");}
    					    		}
    					    	});    
    					//	int dis[][] = new int[10][10];
    			 		//	IMPLEMENTING FUNCTION OF THE BUTTON;
    			 			ok.addActionListener(new ActionListener()
    			 			{
    			 				public void actionPerformed(ActionEvent t)
    			 				{
    			 					Driver temp = dr[0];
    			 					try
    			 					{
    			 				//	Driver temp = dr[0];
    			 					}
    			 					catch(NullPointerException erw){System.out.println("caught 2");}
    			 					int error = 0;
    			 					int cur = 9, des = 9;
    			 				//	try
    			 				//	{
    			 				//	cur = Integer.parseInt(currloc.getText());
    			 				//	des = Integer.parseInt(desloc.getText());
    			 					try
    			 					{
    			 						cur = Integer.parseInt(currloc.getText());
    			 						des = Integer.parseInt(desloc.getText());
	
    			 					//	if(currloc.getText().equals(""))
    			 						//	throw new Exception();
    			 					   //    	if(desloc.getText().equals(""))
    			 					//       		throw new Exception();
    			 						if(cur < 0 || cur > 7)
    			 							throw new Exception();
    			 					       	if(des < 0 || des > 7)
    			 					       		throw new Exception();
    			 					}
    			 					catch(Exception e)
    			 					{
    			 						error = 1;
    			 						JFrame pop = new JFrame("INVALIID CURRENT OR DESIRED LOCATION");
    			 						JLabel jj = new JLabel("Ummm... Looks like you're lost.");
    			 						pop.setVisible(true);
    			 						pop.setSize(300,300);
    			 						pop.add(jj);
    			 						pop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    			 						pop.setLayout(new FlowLayout());
    			 					}
    			 					if(error == 0)
    			 					{
       			 					int dis[][] = new int[10][10];       
    			 					dis[0][0] = 0;  
								dis[0][1] = 50;  
								dis[0][2] = 45;   
								dis[0][3] = 70;    
								dis[0][4] = 80;     
								dis[0][5] = 95;      
								dis[0][6] = 110;    
								dis[0][7] = 145;     
								dis[1][0] = 50;       
								dis[1][1] = 0;         
								dis[1][2] = 95;         
								dis[1][3] = 120;         
								dis[1][4] = 130;          
								dis[1][5] = 145;           
								dis[1][6] = 160;            
								dis[1][7] = 195;             
								dis[2][0] = 45;               
								dis[2][1] = 95;                
								dis[2][2] = 0;                  
								dis[2][3] = 60;                  
								dis[2][4] = 35;                   
								dis[2][5] = 85;                     
								dis[2][6] = 100;                   
								dis[2][7] = 135;                    
								dis[3][0] = 70;                      
								dis[3][1] = 120;                     
								dis[3][2] = 60;                      
								dis[3][3] = 0;                         
								dis[3][4] = 95;                         
								dis[3][5] = 25;                          
								dis[3][6] = 40;                           
								dis[3][7] = 75;                            
								dis[4][0] = 80;                             
								dis[4][1] = 130;                             
								dis[4][2] = 35;                               
								dis[4][3] = 95;                                
								dis[4][4] = 0;                                   
								dis[4][5] = 120;                                 
								dis[4][6] = 135;                                  
								dis[4][7] = 170;                                   
								dis[5][0] = 95;                                     
								dis[5][1] = 145;                                     
								dis[5][2] = 85;                                       
								dis[5][3] = 25;                                        
								dis[5][4] = 120;                                        
								dis[5][5] = 0;                                           
								dis[5][6] = 65;                                           
								dis[5][7] = 50;                                            
								dis[6][0] = 110;                                            
								dis[6][1] = 160;                                             
								dis[6][2] = 100;                                              
								dis[6][3] = 40;                                                
								dis[6][4] = 135;                                                
								dis[6][5] = 65;                                                  
								dis[6][6] = 0;                                                    
								dis[6][7] = 35;                                                    
								dis[7][0] = 145;                                                    
								dis[7][1] = 195;                                                     
								dis[7][2] = 135;                                                      
								dis[7][3] = 75;                                                        
								dis[7][4] = 170;                                                        
								dis[7][5] = 50;                                                          
								dis[7][6] = 35;                                                           
								dis[7][7] = 0;                                                             

								int cost = dis[cur][des]*2;
								int nocash = 0;
								if(it.wallet < cost && error == 0)
    			 					{
    			 						nocash = 1;
    			 						JFrame j = new JFrame("NOT ENOUGH CASH");
    			 						// add money option
    			 						j.setVisible(true);
    			 						j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    			 						j.setSize(300,300);
    			 					}
							//	Random rand = new Random();
							//	double r = 0;	      
    			 				/*	Driver A = new Driver("A", 4.5, 95749);
    			 					Driver B = new Driver("B", 5, 47586);
    			 					Driver C = new Driver("C", 3.9, 67849);
    			 					Driver D = new Driver("D", 4.3, 83452) ;  */
    			 				/*	A.loc = rand.nextInt(8);
    			 					Driver temp = A;
    			 					B.loc = rand.nextInt(8);
    			 					C.loc = rand.nextInt(8);
    			 					D.loc = rand.nextInt(8);   */
    			 				/*	int cur = 0,des = 0;
    			 				//	try
    			 				//	{
    			 					cur = Integer.parseInt(currloc.getText());
    			 					des = Integer.parseInt(desloc.getText());
    			 					try
    			 					{
    			 						if(!(cur >= 0 && cur <= 7 && des >= 0 && des <= 0))
    			 							throw new Exception();
    			 					}
    			 					catch(Exception e)
    			 					{
    			 						JFrame pop = new JFrame("INVALIID CURRENT OR DESIRED LOCATION");
    			 						pop.setVisible(true);
    			 						pop.setSize(300,300);
    			 						pop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    			 					}   */
    			 				/*	ArrayList<Driver> dr = new ArrayList<>();
    			 					dr.add(new Driver("A", 4.5, 95749, true));
    			 					dr.add(new Driver("B", 5, 47586, true));
    			 					dr.add(new Driver("C", 3.9, 67849, true));
    								dr.add(new Driver("D", 4.3, 83452, true));    */
    			 					int dist = 1000;
    			 					int ind = -1;
    			 				/*	Random rand = new Random();
    								dr.get(0).loc = rand.nextInt(8);
    			 					dr.get(1).loc = rand.nextInt(8);
    								dr.get(2).loc = rand.nextInt(8);
    	 							dr.get(3).loc = rand.nextInt(8); 
    	 							     */
    			 					for(int i = 0; i<4 ; i++)
    			 					{
    			 						if(dr[i].flag == true && error == 0 && nocash == 0)
    			 						{
    			 							if(dist > dis[cur][dr[i].loc] && error == 0 && nocash == 0)
    			 							{
    			 								dist = dis[cur][dr[i].loc];
    			 								ind = i;
    			 							}
    			 						}
    			 					}
    			 					double d[] = new double[4];
    			 					int in = 0;
    			 					double maxr = -1;
    			 					for(int i = 0 ; i<4 ; i++)
    			 					{
    			 						if(dis[cur][dr[i].loc] == dist && dr[i].flag == true && error == 0 && nocash == 0)
    			 						{
    			 							d[in] = dr[i].rating;
    			 							maxr = Math.max(maxr, d[in]);
    			 							in++;
    			 						//	System.out.println(d[in] + " " + dr.get(i).rating);
    			 						}
    			 						
    			 					}
    			 				//	System.out.println(maxr + " " + dist);
    			 					int cnt = 0;
    			 					for(int i = 0; i < 4; i++)
    			 					{
    			 						
    			 						if(dr[i].flag == false)
    			 						{
    			 							cnt++;
    			 						}
    			 					}
    			 					for(int i = 0 ; i<4 ; i++)
    			 					{
    			 						if(dr[i].flag && error == 0)
    			 							System.out.println(dr[i].vehicleid + " is avail");
    			 					}

    			 					int stop = 0;
    			 					try
    			 					{
    			 						for(int i = 0 ; i<4 ; i++)
    			 						{
    			 							if(dr[i].rating == maxr && dr[i].flag == true && error == 0 && nocash == 0)
    			 			 					{temp = dr[i];dr[i].start();}
    			 						}
    			 					}
    			 					catch(IllegalThreadStateException rrr)
    			 					{
    			 						stop = 1;
    			 						System.out.println("ok clicked again");
    			 					}

    			 				//	for(int i = 0 ; i<4 ; i++)
    			 				//	{                         
    			 				//		if(dr[i].flag)
    			 	    			//			System.out.println(dr[i].vehicleid + " is true");
    			 				//	}
    			 					System.out.println(temp.vehicleid);
    			 					ArrayList<Driver> dal1 = new ArrayList<>();
    			 					try
    			 					{                                                                       
    			 						 FileInputStream fis = new FileInputStream("Driver.ser");
    			 						 ObjectInputStream ois = new ObjectInputStream(fis);
    			 						 dal1 = (ArrayList)ois.readObject();                             
    			 						 ois.close();
    			 						 fis.close();
    			 					}
    			 					catch(Exception f)
    			 					{
    			 					}
    			 				//	System.out.println(dal1.size());
    			 					for(int i = 0 ; i<4 ; i++)
    			 					{
    			 						if(dr[i].flag == false)
    			 						{
    			 							dal1.get(i).flag = false;
    			 						}
    			 						else if(dr[i].flag == true)
    			 						{
    			 							dal1.get(i).flag = true;
    			 						}
    			 					}
    			 					try
    			 					{
    			 						for(int i = 0 ; i<4 ; i++)
    			 						{
    			 							if(dr[i].flag == false)
    			 								System.out.println(dr[i].vehicleid + "is false");
    			 						}
    			 						FileOutputStream fos = new FileOutputStream("Driver.ser");
      									ObjectOutputStream oos = new ObjectOutputStream(fos);
      									oos.writeObject(dal1);
      									oos.close();
      									fos.close();
	
    			 					}
    			 					catch(IOException ewtfs){}
    			 					
       			 					int unavail = 0;
    			 					if(cnt == 4)unavail = 1;
    			 					if(unavail == 1 && error == 0)
    			 					{
    			 						JFrame jj = new JFrame("NO RIDES");
    			 						jj.setSize(400,300);
    			 						jj.setVisible(true);
    			 						jj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    			 					}
    		    			 			if(nocash == 0 && error == 0 && unavail == 0)
    			 					{
    			 						long paisa = it.wallet;
    			 						paisa -= cost;
    			 						money.setText("MONEY: " + paisa);
    			 						ArrayList<Customer> al = new  ArrayList<>();
    			 						try
									{
	
										FileInputStream fis = new FileInputStream("Customer.ser");
										ObjectInputStream ois = new ObjectInputStream(fis);
										al = (ArrayList)ois.readObject();
										ois.close();
										fis.close();
									}
									catch(IOException e1)
     									{
     										
       									}				
        								catch(ClassNotFoundException cle)
        								{
       										System.out.println("This 22");          
      									}
      									try
      									{
      										for(Customer it1 : al)
      										{                                                            
      											String l = it1.userid;
      											String l1 = it1.password;
      											if(l.equals(it.userid) && l1.equals(it.password))
      											{
      												it1.wallet = it1.wallet - cost;
      												it.wallet = it1.wallet;
      												FileOutputStream fos = new FileOutputStream("Customer.ser");
      												ObjectOutputStream oos = new ObjectOutputStream(fos);
      												oos.writeObject(al);
      												oos.close();
      												fos.close();
      												break;
      											}
      										}
      									}
      									catch (IOException ioe)
        								{				
            									ioe.printStackTrace();
        								}
        								JFrame driver = new JFrame("Your Driver");
        								driver.setVisible(true);
        								driver.setSize(300,300);
        								driver.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        								driver.setLayout(new FlowLayout());
        								JLabel vid = new JLabel("Driver Vehicle Id: " + temp.vehicleid);
        								JLabel R = new JLabel("|  Driver Rating: " + temp.rating);
        								JLabel p = new JLabel("Driver Phone Number: " + temp.phonenum);
        								JLabel l = new JLabel("Driver Current location: " + temp.loc);
        								JLabel eta = new JLabel("Estimated time till driver reaches you: " + dis[cur][temp.loc]/2);
        								JLabel eta1 = new JLabel("Estimated time to your destination from here: " + dis[cur][des]/2);
        								JLabel c = new JLabel("Estimated cost of your ride: " + cost);
        								driver.add(vid);
        								driver.add(R);	
        								driver.add(p);
        								driver.add(l);
        								driver.add(eta);
        								driver.add(eta1);
        								driver.add(c);

        							}
    			 					}	
    			 				}
    			 			});
               				        map.setVisible(true);	  	
            				        map.setSize(800,600);
      					        map.setLayout(new FlowLayout());
            				        map.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   					        break;
            				}	     
            			}	
            			if(flags == 1)
           	 		{
            				JFrame j = new JFrame("INVALID LOGIN CREDENTIALS");
            				j.setSize(400,300);
            				j.setVisible(true);
            				j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            			}
        		}
        		catch(IOException e1)
       			{
        			JFrame j = new JFrame("INVALID LOGIN CREDENTIALS");
            			j.setSize(400,300);
            			j.setVisible(true);
            			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        		}
        		catch(ClassNotFoundException cle)
        		{
        			System.out.println("This 22");
        		}  
                                                                                 
                }
                catch(NullPointerException erte){System.out.println("Caught");}
       		}	
         	else if(e.getSource() == b2)
         	{
          		JFrame frame1 = new JFrame("Welcome, new Customer");
         	 	JTextField tf1,tf2,tf3,tf4;
          		JLabel L1,L2,L3,L4;
          		JButton REGISTER;
          		tf1 = new JTextField(15);
          		tf2 = new JTextField(15);
          		tf3 = new JTextField(15);
          		tf4 = new JTextField(15);
          		L1 = new JLabel("Username");
          		L2 = new JLabel("password");
          		L3 = new JLabel("Phone No.");
          		L4 = new JLabel("email");
          		frame1.add(L1);frame1.add(tf1);frame1.add(L2);frame1.add(tf2);frame1.add(L3);frame1.add(tf3);frame1.add(L4);frame1.add(tf4);
          		REGISTER = new JButton("REGISTER");
          		frame1.add(REGISTER);
          		REGISTER.addActionListener(new ActionListener()
          		{
          			public void actionPerformed(ActionEvent ae)
          			{    
          				ArrayList<Customer> al1 = new ArrayList<>();            
          				try
          				{
            					FileInputStream fis = new FileInputStream("Customer.ser");
            					ObjectInputStream ois = new ObjectInputStream(fis);
            					al1 = (ArrayList)ois.readObject();
            					ois.close();
            					fis.close();
        				}
        				catch(IOException e1)
        				{
        				}				
        				catch(ClassNotFoundException cle)
        				{
        					System.out.println("This 22");
        				}  
        				try
        				{
        					int flag = 1;
        					String s1 = tf1.getText();      String s2 = tf2.getText();       String s4 = tf4.getText();
        					long phone = Long.parseLong(tf3.getText());
        					for(Customer it : al1)
        					{
        						if(s1.equals(it.userid) && s2.equals(it.password))
        						{
        							flag = 0;
        							break;
        						}
        					}
        					if(flag == 1)
        					{
        						if(s1.equals("") || s2.equals("") || s4.equals(""))
        							throw new NumberFormatException();
            						al1.add(new Customer(s1,s2,phone,s4,0));            
            						FileOutputStream fos = new FileOutputStream("Customer.ser");
            						ObjectOutputStream oos = new ObjectOutputStream(fos);
            						oos.writeObject(al1);
            						oos.close();
            						fos.close();
            					}
        				}
        				catch(NumberFormatException nfe)                                            
            				{
            					JFrame j = new JFrame("INVALID CREDENTIALS");
            					j.setSize(400,300);
            					j.setVisible(true);
            					j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//frame that says invalid phone number
          				}
          				catch (IOException ioe)
        				{				
            					ioe.printStackTrace();
        				}
				}
               
          		});            
          		frame1.setSize(500,500);
  			frame1.setVisible(true);                                                       
  			frame1.setLayout(new FlowLayout());
  			frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
  	}	
}	 
