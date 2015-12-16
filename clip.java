import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.*;
class que1 extends JFrame
{
        JTextField ri,wr,un,res,op1,op2,op3,op4;
        Font refon,slabfon,forq,resfon,opfon;
        JTextArea ques;
        ButtonGroup opset;
        JRadioButton o1,o2,o3,o4;
        String qno;

        que1(String iqno)
	{
             
             setLayout(null);
             addWindowListener(new WindowAdapter()
             {
             public void windowClosing(WindowEvent we)
             {
                System.exit(0);
             }		
		});
            //scoreBoard start
            slabfon=new Font("Times New Roman",Font.PLAIN,40);
            refon=new Font("Times New Roman",Font.PLAIN,30);
                            
            ri=new JTextField(10);
            wr=new JTextField(10);
            un=new JTextField(10);

            add(ri);
            add(wr);
            add(un);
            ri.setBackground(Color.CYAN);
            wr.setBackground(Color.CYAN);
            un.setBackground(Color.CYAN);

            ri.setForeground(Color.BLUE);
            wr.setForeground(Color.BLUE);
            un.setForeground(Color.BLUE);

            ri.setFont(refon);
            wr.setFont(refon);
            un.setFont(refon);

            ri.setEditable(false);
            wr.setEditable(false);
            un.setEditable(false);

            ri.setBounds(160,40,100,35);
            wr.setBounds(440,40,100,35);
            un.setBounds(830,40,100,35);
            JLabel lri=new JLabel("Right:");
            add(lri);
            lri.setBounds(40,50,130,30);
            JLabel lwr=new JLabel("Wrong:");
            add(lwr);
            lwr.setBounds(300,50,130,30);
            JLabel lun=new JLabel("Unattempted:");
            add(lun);
            lun.setBounds(580,50,250,30);

            lun.setFont(new Font("Stencil",Font.PLAIN,30));
            lri.setFont(new Font("Stencil",Font.PLAIN,30));
            lwr.setFont(new Font("Stencil",Font.PLAIN,30));
            lri.setForeground(Color.GREEN);
            lwr.setForeground(Color.RED);
            lun.setForeground(Color.BLUE);

            
            JLabel sc=new JLabel(new ImageIcon("scbo.jpg"));
            add(sc);
            sc.setBounds(0,30,1024,70);






            //score bord over
            //question
            forq=new Font("Times New Roman",Font.PLAIN,20);
            ques=new JTextArea("");
            JScrollPane fques=new JScrollPane(ques);
            add(fques);
            ques.setBackground(new Color(234,207,174));
            ques.setForeground(Color.MAGENTA);
            ques.setFont(forq);
            ques.setEditable(false);
            fques.setBounds(100,200,830,100);
            //options
            opset=new ButtonGroup();
            o1=new JRadioButton();
            o2=new JRadioButton();
            o3=new JRadioButton();
            o4=new JRadioButton();
            add(o1);
            add(o2);
            add(o3);
            add(o4);
            opset.add(o1);
            opset.add(o2);
            opset.add(o3);
            opset.add(o4);
            o1.setBounds(50,385,40,25);
            o2.setBounds(530,385,40,25);
            o3.setBounds(50,550,40,25);
            o4.setBounds(530,550,40,25);
            o1.setCursor(new Cursor(1));
            o2.setCursor(new Cursor(1));
            o3.setCursor(new Cursor(1));
            o4.setCursor(new Cursor(1));

            o1.setBackground(Color.CYAN);
            o2.setBackground(Color.CYAN);
            o3.setBackground(Color.CYAN);
            o4.setBackground(Color.CYAN);

            op1=new JTextField(10);
            op2=new JTextField(10);
            op3=new JTextField(10);
            op4=new JTextField(10);

            add(op1);
            add(op2);
            add(op3);
            add(op4);
            
            opfon=new Font("Times New Roman",Font.PLAIN,22);
            op1.setBounds(95,375,350,40);
            op1.setBackground(Color.PINK);
            op1.setForeground(Color.BLUE);
            op1.setFont(opfon);
            op1.setEditable(false);


            op2.setBounds(575,375,350,40);
            op2.setBackground(Color.PINK);
            op2.setForeground(Color.BLUE);
            op2.setFont(opfon);
            op2.setEditable(false);

            op3.setBounds(95,545,350,40);
            op3.setBackground(Color.PINK);
            op3.setForeground(Color.BLUE);
            op3.setFont(opfon);
            op3.setEditable(false);

            op4.setBounds(575,545,350,40);
            op4.setBackground(Color.PINK);
            op4.setForeground(Color.BLUE);
            op4.setFont(opfon);
            op4.setEditable(false);
            //result JTextField
            res=new JTextField(50);
            add(res);
            resfon=new Font("Times New Roman",Font.PLAIN,40);
            res.setBounds(50,600,930,50);
            res.setFont(resfon);
            res.setBackground(new Color(128,103,32));
            res.setForeground(new Color(138,186,234));
            res.setEditable(false);
            //adding interface
            ri.addActionListener(new ActionListener()
            {
             public void actionPerformed(ActionEvent ae)
             {
             }
            });               
            wr.addActionListener(new ActionListener()
            {
             public void actionPerformed(ActionEvent ae)
             {
             }
            });
            un.addActionListener(new ActionListener()
            {
             public void actionPerformed(ActionEvent ae)
             {
             }
            });
            o1.addItemListener(new ItemListener()
            {
             public void itemStateChanged(ItemEvent ie)
             {
             }
            });
            o2.addItemListener(new ItemListener()
            {
             public void itemStateChanged(ItemEvent ie)
             {
             }
            });
            o3.addItemListener(new ItemListener()
            {
             public void itemStateChanged(ItemEvent ie)
             {
             }
            });
            o4.addItemListener(new ItemListener()
            {
             public void itemStateChanged(ItemEvent ie)
             {
             }
            });

         qno=iqno;
        }

}
class ftest extends JFrame implements ActionListener
{
        
    Font forq;
    boolean f1o=false,f2o=false,q1no=true,ro=false;
    
    thank tha;
    frames f3;
    que1 q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    Font but=new Font("Times New roman",Font.PLAIN,25);
    JButton b;
    JButton next=new JButton("Next");//for pass
    JButton check;                            //for pass
    JButton q1n,q2n,q3n,q4n,q5n,q6n,q7n,q8n,q9n,q10n;
    JButton q1l,q2l,q3l,q4l,q5l,q6l,q7l,q8l,q9l,q10l;
    int rig=0,wro=0,unatt=0;
    boolean q1att=false,q2att=false,q3att=false,q4att=false,q5att=false,q6att=false,q7att=false,q8att=false,q9att=false,q10att=false;
    NumberFormat nf;

    public ftest()
    {
      addWindowListener(new WindowAdapter()
		{
             public void windowClosing(WindowEvent we)
             {
             	setVisible(false);
             }		
		});
      
      
      
      


      q1=new que1("Question 1");
      q2=new que1("Question 2");
      q3=new que1("Question 3");
      q4=new que1("Question 4");
      q5=new que1("Question 5");
      q6=new que1("Question 6");
      q7=new que1("Question 7");
      q8=new que1("Question 8");
      q9=new que1("Question 9");
      q10=new que1("Question 10");

      q1.setSize(1024,735);
      q2.setSize(1024,735);
      q3.setSize(1024,735);
      q4.setSize(1024,735);
      q5.setSize(1024,735);
      q6.setSize(1024,735);
      q7.setSize(1024,735);
      q8.setSize(1024,735);
      q9.setSize(1024,735);
      q10.setSize(1024,735);



      q1.setTitle("Question 1");
      q2.setTitle("Question 2");
      q3.setTitle("Question 3");
      q4.setTitle("Question 4");
      q5.setTitle("Question 5");
      q6.setTitle("Question 6");
      q7.setTitle("Question 7");
      q8.setTitle("Question 8");
      q9.setTitle("Question 9");
      q10.setTitle("Question 10");

      
      
      
                 

      

      if(q1no)
      {
       q1.setVisible(true);
      }
      tha = new thank();
      tha.setSize(1024,768);
      tha.setTitle("Vote of Thanks");

      //ini
       nf=NumberFormat.getInstance();
       
       
       q1.ri.setText(nf.format(rig));
       q1.wr.setText(nf.format(wro));
       q1.un.setText(nf.format(unatt));

       







      //add data to paltes
       q1.ques.setText("Large Oceanic studies are concentrated upon to:");
       q1.op1.setText("    Get Energy from sea tides");
       q1.op2.setText("    Get fuel minerals and other substances");
       q1.op3.setText("    Get more food");
       q1.op4.setText("    All of the above");//

       q2.ques.setText("The branch of Science which deals with the study of distribution of plants on or near the surface of the earth ia called as__________.");
       q2.op1.setText("    Plantology");
       q2.op2.setText("    Septography");
       q2.op3.setText("    Epthology");
       q2.op4.setText("    Phytogeography");      //

       q3.ques.setText("Synthetic Aperture Radar (SAR) is an example of ________.");
       q3.op1.setText("    Natural Mineral Conservation");
       q3.op2.setText("    Waste Decomposition");
       q3.op3.setText("    Remote Sensing");             //
       q3.op4.setText("    A metod to create awareness");

       q4.ques.setText("World Enviriment Day is on _____.");
       q4.op1.setText("   May 5 ");                        //
       q4.op2.setText("   June 5");
       q4.op3.setText("   July 5");
       q4.op4.setText("   August 9");

       q5.ques.setText("Lions in India are mainly found in ____.");
       q5.op1.setText("    Forests of Madya Pradesh.");
       q5.op2.setText("    Gir Forests");                    //
       q5.op3.setText("    Forests of Western Ghats");
       q5.op4.setText("    Jim Corbett N.P");

       q6.ques.setText("Most serious threat to wild life comes from:");
       q6.op1.setText("    Introduction of exotic species.");
       q6.op2.setText("    Habitate Destruction.");         //
       q6.op3.setText("    International Trade.");
       q6.op4.setText("    Over Explotation.");

       Font eopfon=new Font("Times New Roman",Font.ITALIC,20);
       q7.ques.setText("To conserve importatnt indigenous birds, mammals, flower trees, one has been alloted each state. Which plant has been alloted to Karnataka ?");
       q7.op1.setText("    Santalum album");      //
       q7.op2.setText("    Cedrus deodara");
       q7.op3.setText("    Ficus benghalensis");
       q7.op4.setText("    Shorea robusta");
       q7.op1.setFont(eopfon);
       q7.op2.setFont(eopfon);
       q7.op3.setFont(eopfon);
       q7.op4.setFont(eopfon);


       q8.ques.setText("Genes resitance to rice pest brown palnt hopper(Nilaparvata lungens) were found in rice plant from:");
       q8.op1.setText("    Tamil Nadu");
       q8.op2.setText("    Andhra Pradesh");
       q8.op3.setText("    Kerala"); //
       q8.op4.setText("    Karnataka");

       q9.ques.setText("What do Red Data Book contain information about ?");
       q9.op1.setText("    Consumed Natural Resources.");
       q9.op2.setText("    Red coloured Insects.");
       q9.op3.setText("    About Marine Life."); 
       q9.op4.setText("    Endangered plants and animals.");//
       
       q10.ques.setText("Which of the following combination shows Indian National Bird,Animal & Flower ? ");
       q10.op1.setText("    Kiwi,Tiger,Hibiscus");
       q10.op2.setText("    Eagle,Bear,Lotus");
       q10.op3.setText("    Peacock,Lion,Rose"); 
       q10.op4.setText("    Peacock,Tiger,Lotus");//



      forq=new Font("Times New Roman",Font.PLAIN,20);
      //of question 1
      q1n=new JButton("Next");
      q1.add(q1n);
      q1n.setForeground(Color.BLACK);
      
      q1n.setBounds(100,120,140,60);
      q1n.setFont(forq);
      q1n.setCursor(new Cursor(12));  

      q1l=new JButton("Lock");
      q1.add(q1l);
      q1l.setBounds(795,120,135,60);
      q1l.setForeground(Color.BLACK);
      
      q1l.setFont(forq);
      q1l.setCursor(new Cursor(12));  

      q1n.addActionListener(this);
      q1l.addActionListener(this);

      //of question 2
      q2n=new JButton("Next");
      q2.add(q2n);
      q2n.setForeground(Color.BLACK);
      
      q2n.setBounds(100,120,140,60);
      q2n.setFont(forq);
      q2n.setCursor(new Cursor(12));  

      q2l=new JButton("Lock");
      q2.add(q2l);
      q2l.setBounds(795,120,135,60);
      q2l.setForeground(Color.BLACK);
      
      q2l.setFont(forq);
      q2l.setCursor(new Cursor(12));  

      q2n.addActionListener(this);
      q2l.addActionListener(this);
      //of question 3
      q3n=new JButton("Next");
      q3.add(q3n);
      q3n.setForeground(Color.BLACK);
      
      q3n.setBounds(100,120,140,60);
      q3n.setFont(forq);
      q3n.setCursor(new Cursor(12));  

      q3l=new JButton("Lock");
      q3.add(q3l);
      q3l.setBounds(795,120,135,60);
      q3l.setForeground(Color.BLACK);
      
      q3l.setFont(forq);
      q3l.setCursor(new Cursor(12));  

      q3n.addActionListener(this);
      q3l.addActionListener(this);
      //of question 4
      q4n=new JButton("Next");
      q4.add(q4n);
      q4n.setForeground(Color.BLACK);
      
      q4n.setBounds(100,120,140,60);
      q4n.setFont(forq);
      q4n.setCursor(new Cursor(12));  

      q4l=new JButton("Lock");
      q4.add(q4l);
      q4l.setBounds(795,120,135,60);
      q4l.setForeground(Color.BLACK);
      
      q4l.setFont(forq);
      q4l.setCursor(new Cursor(12));  

      q4n.addActionListener(this);
      q4l.addActionListener(this);
      //of question 5
      q5n=new JButton("Next");
      q5.add(q5n);
      q5n.setForeground(Color.BLACK);
      
      q5n.setBounds(100,120,140,60);
      q5n.setFont(forq);
      q5n.setCursor(new Cursor(12));  

      q5l=new JButton("Lock");
      q5.add(q5l);
      q5l.setBounds(795,120,135,60);
      q5l.setForeground(Color.BLACK);
      
      q5l.setFont(forq);
      q5l.setCursor(new Cursor(12));  

      q5n.addActionListener(this);
      q5l.addActionListener(this);

      //of question 6
      q6n=new JButton("Next");
      q6.add(q6n);
      q6n.setForeground(Color.BLACK);
      
      q6n.setBounds(100,120,140,60);
      q6n.setFont(forq);
      q6n.setCursor(new Cursor(12));  

      q6l=new JButton("Lock");
      q6.add(q6l);
      q6l.setBounds(795,120,135,60);
      q6l.setForeground(Color.BLACK);
      
      q6l.setFont(forq);
      q6l.setCursor(new Cursor(12));  

      q6n.addActionListener(this);
      q6l.addActionListener(this);

      //of question 7
      q7n=new JButton("Next");
      q7.add(q7n);
      q7n.setForeground(Color.BLACK);
      
      q7n.setBounds(100,120,140,60);
      q7n.setFont(forq);
      q7n.setCursor(new Cursor(12));  

      q7l=new JButton("Lock");
      q7.add(q7l);
      q7l.setBounds(795,120,135,60);
      q7l.setForeground(Color.BLACK);
      
      q7l.setFont(forq);
      q7l.setCursor(new Cursor(12));  

      q7n.addActionListener(this);
      q7l.addActionListener(this);

      //of question 8
      q8n=new JButton("Next");
      q8.add(q8n);
      q8n.setForeground(Color.BLACK);
      
      q8n.setBounds(100,120,140,60);
      q8n.setFont(forq);
      q8n.setCursor(new Cursor(12));  

      q8l=new JButton("Lock");
      q8.add(q8l);
      q8l.setBounds(795,120,135,60);
      q8l.setForeground(Color.BLACK);
      
      q8l.setFont(forq);
      q8l.setCursor(new Cursor(12));  

      q8n.addActionListener(this);
      q8l.addActionListener(this);

      //of question 9
      q9n=new JButton("Next");
      q9.add(q9n);
      q9n.setForeground(Color.BLACK);
      
      q9n.setBounds(100,120,140,60);
      q9n.setFont(forq);
      q9n.setCursor(new Cursor(12));  

      q9l=new JButton("Lock");
      q9.add(q9l);
      q9l.setBounds(795,120,135,60);
      q9l.setForeground(Color.BLACK);
      
      q9l.setFont(forq);
      q9l.setCursor(new Cursor(12));  
      setTitle("ftest");
      q9n.addActionListener(this);
      q9l.addActionListener(this);

      //of question 10
      q10n=new JButton("Exit");
      q10.add(q10n);
      q10n.setForeground(Color.BLACK);
      
      q10n.setBounds(100,120,140,60);
      q10n.setFont(forq);
      q10n.setCursor(new Cursor(12));  

      q10l=new JButton("Lock");
      q10.add(q10l);
      q10l.setBounds(795,120,135,60);
      q10l.setForeground(Color.BLACK);
      
      q10l.setFont(forq);
      q10l.setCursor(new Cursor(12));  

      q10n.addActionListener(this);
      q10l.addActionListener(this);

      JLabel back=new JLabel(new ImageIcon("back1.jpg"));
      q1.add(back);
      back.setBounds(0,0,1024,768);

      JLabel back1=new JLabel(new ImageIcon("back1.jpg"));
      q2.add(back1);
      back1.setBounds(0,0,1024,768);
      JLabel back2=new JLabel(new ImageIcon("back1.jpg"));
      q3.add(back2);
      back2.setBounds(0,0,1024,768);
      JLabel back3=new JLabel(new ImageIcon("back1.jpg"));
      q4.add(back3);
      back3.setBounds(0,0,1024,768);
      JLabel back4=new JLabel(new ImageIcon("back1.jpg"));
      q5.add(back4);
      back4.setBounds(0,0,1024,768);
      JLabel back5=new JLabel(new ImageIcon("back1.jpg"));
      q6.add(back5);
      back5.setBounds(0,0,1024,768);
      JLabel back6=new JLabel(new ImageIcon("back1.jpg"));
      q7.add(back6);
      back6.setBounds(0,0,1024,768);
      JLabel back7=new JLabel(new ImageIcon("back1.jpg"));
      q8.add(back7);
      back7.setBounds(0,0,1024,768);
      JLabel back8=new JLabel(new ImageIcon("back1.jpg"));
      q9.add(back8);
      back8.setBounds(0,0,1024,768);
      JLabel back9=new JLabel(new ImageIcon("back1.jpg"));
      q10.add(back9);
      back9.setBounds(0,0,1024,768);


    }
    

    public void actionPerformed(ActionEvent ae)
    {
      
     //of next & answer checking  
     //q1
     
     if(ae.getSource()==q1n)
     {
      
      if(q1att==false)
      {
       unatt++;
      }
       q1.setVisible(false);
       q2.setVisible(true);
       q2.ri.setText(nf.format(rig));
       q2.wr.setText(nf.format(wro));
       q2.un.setText(nf.format(unatt));


     }
     if(ae.getSource()==q1l)
     {
      q1att=true;
      q1.remove(q1l);
      if(q1.o4.isSelected()==true)
      {
       rig++;
       q1.res.setText("        Correct Answer");
       q1.op4.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q1.res.setText("        Wrong Answer");
       q1.op4.setBackground(Color.GREEN);
       if(q1.o1.isSelected()==true)
       {
         q1.op1.setBackground(Color.RED);
       }
       if(q1.o2.isSelected()==true)
       {
         q1.op2.setBackground(Color.RED);
       }
       if(q1.o3.isSelected()==true)
       {
         q1.op3.setBackground(Color.RED);
       }
       


      }
       q1.ri.setText(nf.format(rig));
       q1.wr.setText(nf.format(wro));
       q1.un.setText(nf.format(unatt));
       
    }


     //q2
     if(ae.getSource()==q2n)
     {
      q2.setVisible(false);
      if(q2att==false)
      {
       unatt++;
      }
       q3.setVisible(true);
       q3.ri.setText(nf.format(rig));
       q3.wr.setText(nf.format(wro));
       q3.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q2l)
     {
      q2att=true;
      q2.remove(q2l);
      if(q2.o4.isSelected()==true)
      {
       rig++;
       q2.res.setText("        Correct Answer");
       q2.op4.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q2.res.setText("        Wrong Answer");
       q2.op4.setBackground(Color.GREEN);
       if(q2.o1.isSelected()==true)
       {
         q2.op1.setBackground(Color.RED);
       }
       if(q2.o2.isSelected()==true)
       {
         q2.op2.setBackground(Color.RED);
       }
       if(q2.o3.isSelected()==true)
       {
         q2.op3.setBackground(Color.RED);
       }
       
      }
       q2.ri.setText(nf.format(rig));
       q2.wr.setText(nf.format(wro));
       q2.un.setText(nf.format(unatt));

     }

       


     //q3
     if(ae.getSource()==q3n)
     {
      q3.setVisible(false);
      if(q3att==false)
      {
       unatt++;
      }
       q4.setVisible(true);
       q4.ri.setText(nf.format(rig));
       q4.wr.setText(nf.format(wro));
       q4.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q3l)
     {
      q3att=true;
      q3.remove(q3l);
      
      if(q3.o3.isSelected()==true)
      {
       rig++;
       q3.res.setText("        Correct Answer");
       q3.op3.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q3.res.setText("        Wrong Answer");
       q3.op3.setBackground(Color.GREEN);
       if(q3.o1.isSelected()==true)
       {
         q3.op1.setBackground(Color.RED);
       }
       if(q3.o2.isSelected()==true)
       {
         q3.op2.setBackground(Color.RED);
       }
       if(q3.o4.isSelected()==true)
       {
         q3.op4.setBackground(Color.RED);
       }

      }
       q3.ri.setText(nf.format(rig));
       q3.wr.setText(nf.format(wro));
       q3.un.setText(nf.format(unatt));
       
     }


     //q4
     if(ae.getSource()==q4n)
     {
      q4.setVisible(false);
      if(q4att==false)
      {
       unatt++;
      }
       q5.setVisible(true);
       q5.ri.setText(nf.format(rig));
       q5.wr.setText(nf.format(wro));
       q5.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q4l)
     {
      q4att=true;
      q4.remove(q4l);
      if(q4.o1.isSelected()==true)
      {
       rig++;
       q4.res.setText("        Correct Answer");
       q4.op1.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q4.res.setText("        Wrong Answer");
       q4.op1.setBackground(Color.GREEN);
       if(q4.o4.isSelected()==true)
       {
         q4.op4.setBackground(Color.RED);
       }
       if(q4.o2.isSelected()==true)
       {
         q4.op2.setBackground(Color.RED);
       }
       if(q4.o3.isSelected()==true)
       {
         q4.op3.setBackground(Color.RED);
       }

      }
       q4.ri.setText(nf.format(rig));
       q4.wr.setText(nf.format(wro));
       q4.un.setText(nf.format(unatt));
       
     }


     //q5
     if(ae.getSource()==q5n)
     {
      q5.setVisible(false);
      if(q5att==false)
      {
       unatt++;
      }
       q6.setVisible(true);
       q6.ri.setText(nf.format(rig));
       q6.wr.setText(nf.format(wro));
       q6.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q5l)
     {
      q5att=true;
      q5.remove(q5l);
      if(q5.o2.isSelected()==true)
      {
       rig++;
       q5.res.setText("        Correct Answer");
       q5.op2.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q5.res.setText("        Wrong Answer");
       q5.op2.setBackground(Color.GREEN);
       if(q5.o4.isSelected()==true)
       {
         q5.op4.setBackground(Color.RED);
       }
       if(q5.o3.isSelected()==true)
       {
         q5.op3.setBackground(Color.RED);
       }
       if(q5.o3.isSelected()==true)
       {
         q5.op3.setBackground(Color.RED);
       }

      }
       q5.ri.setText(nf.format(rig));
       q5.wr.setText(nf.format(wro));
       q5.un.setText(nf.format(unatt));
       
     }


     //q6
     if(ae.getSource()==q6n)
     {
      if(q6att==false)
      {
       unatt++;
      }
      q6.setVisible(false);
      q7.setVisible(true);
       q7.ri.setText(nf.format(rig));
       q7.wr.setText(nf.format(wro));
       q7.un.setText(nf.format(unatt));

     }

     if(ae.getSource()==q6l)
     {
      q6att=true;
      q6.remove(q6l);

      if(q6.o2.isSelected()==true)
      {
       rig++;
       q6.res.setText("        Correct Answer");
       q6.op2.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q6.res.setText("        Wrong Answer");
       q6.op2.setBackground(Color.GREEN);
       if(q6.o4.isSelected()==true)
       {
         q6.op4.setBackground(Color.RED);
       }
       if(q6.o1.isSelected()==true)
       {
         q6.op1.setBackground(Color.RED);
       }
       if(q6.o3.isSelected()==true)
       {
         q6.op3.setBackground(Color.RED);
       }

      }
       q6.ri.setText(nf.format(rig));
       q6.wr.setText(nf.format(wro));
       q6.un.setText(nf.format(unatt));
       
     }


     //q7
     if(ae.getSource()==q7n)
     {
      q7.setVisible(false);
      if(q7att==false)
      {
       unatt++;
      }
       q8.setVisible(true);
       q8.ri.setText(nf.format(rig));
       q8.wr.setText(nf.format(wro));
       q8.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q7l)
     {
      q7att=true;
      q7.remove(q7l);
      if(q7.o1.isSelected()==true)
      {
        rig++;
        q7.res.setText("        Correct Answer");
        q7.op1.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q7.res.setText("        Wrong Answer");
       q7.op1.setBackground(Color.GREEN);
       if(q7.o4.isSelected()==true)
       {
         q7.op4.setBackground(Color.RED);
       }  
       if(q7.o2.isSelected()==true)
       {
         q7.op2.setBackground(Color.RED);
       }
       if(q7.o3.isSelected()==true)
       {
         q7.op3.setBackground(Color.RED);
       }

      }
       q7.ri.setText(nf.format(rig));
       q7.wr.setText(nf.format(wro));
       q7.un.setText(nf.format(unatt));
       
     }


     //q8
     if(ae.getSource()==q8n)
     {
      q8.setVisible(false);
      if(q8att==false)
      {
       unatt++;
      }
      q9.setVisible(true);
       q9.ri.setText(nf.format(rig));
       q9.wr.setText(nf.format(wro));
       q9.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q8l)
     {
      q8att=true;
      q8.remove(q8l);
      if(q8.o3.isSelected()==true)
      {
       rig++;
       q8.res.setText("        Correct Answer");
       q8.op3.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q8.res.setText("        Wrong Answer");
       q8.op3.setBackground(Color.GREEN);
       if(q8.o4.isSelected()==true)
       {
         q8.op4.setBackground(Color.RED);
       }
       if(q8.o2.isSelected()==true)
       {
         q8.op2.setBackground(Color.RED);
       }
       if(q8.o1.isSelected()==true)
       {
         q8.op1.setBackground(Color.RED);
       }

      }
       q8.ri.setText(nf.format(rig));
       q8.wr.setText(nf.format(wro));
       q8.un.setText(nf.format(unatt));
       
     }


     //q9
     if(ae.getSource()==q9n)
     {
      q9.setVisible(false);
      if(q9att==false)
      {
       unatt++;
      }
       q10.setVisible(true);
       q10.ri.setText(nf.format(rig));
       q10.wr.setText(nf.format(wro));
       q10.un.setText(nf.format(unatt));

     }
     if(ae.getSource()==q9l)
     {
      q9att=true;
      q9.remove(q9l);
      if(q9.o4.isSelected()==true)
      {
       rig++;
       q9.res.setText("        Correct Answer");
       q9.op4.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q9.res.setText("        Wrong Answer");
       q9.op4.setBackground(Color.GREEN);
       if(q9.o1.isSelected()==true)
       {
         q9.op1.setBackground(Color.RED);
       }
       if(q9.o2.isSelected()==true)
       {
         q9.op2.setBackground(Color.RED);
       }
       if(q9.o3.isSelected()==true)
       {
         q9.op3.setBackground(Color.RED);
       }

      }
       q9.ri.setText(nf.format(rig));
       q9.wr.setText(nf.format(wro));
       q9.un.setText(nf.format(unatt));

     }


     //q10
     if(ae.getSource()==q10n)
     {
      if(q10att==false)
      {
       unatt++;
      }
      tha.setVisible(true);
     }
     if(ae.getSource()==q10l)
     {
      q10att=true;
      q10.remove(q10l);
      if(q10.o4.isSelected()==true)
      {
       rig++;
       q10.res.setText("        Correct Answer");
       q10.op4.setBackground(Color.GREEN);
      }
      else
      {
       wro++;
       q10.res.setText("        Wrong Answer");
       q10.op4.setBackground(Color.GREEN);
       if(q10.o1.isSelected()==true)
       {
         q10.op1.setBackground(Color.RED);
       }
       if(q10.o2.isSelected()==true)
       {
         q10.op2.setBackground(Color.RED);
       }
       if(q10.o3.isSelected()==true)
       {
         q10.op3.setBackground(Color.RED);
       }

      }
       q10.ri.setText(nf.format(rig));
       q10.wr.setText(nf.format(wro));
       q10.un.setText(nf.format(unatt));
       
     }











    }
}

class pass extends JFrame implements ActionListener
{
    JTextField name,age,passstatus;
    TextField pass;
    JLabel l1,l2,l3,h;
    Font head=new Font("Bodoni MT Black",Font.BOLD,50);
    Font lab;
    Font ofp=new Font("Times New Roman",Font.PLAIN,30);
    Font tf=new Font("Times New Roman",Font.PLAIN,20);
    Checkbox ma,fe;
    CheckboxGroup se;
    boolean passexit=false;

    public pass()
    {
        setLayout(null);
        addWindowListener(new WindowAdapter()
            {
             public void windowClosing(WindowEvent we)
             {
                System.exit(0);
             }		
		});
        h=new JLabel("LOGIN SCREEN");
        add(h);
        h.setFont(head);
        
        h.setForeground(new Color(250,186,90));
        h.setBounds(250,100,520,50);




        l1=new JLabel("Name: ");
        l2=new JLabel("Password: ");
        l3=new JLabel("Age:  ");

        name=new JTextField(60);
        pass=new TextField(35);
        passstatus=new JTextField(35);
        age=new JTextField(25);
        pass.setEchoChar('*');
        add(l1);
        add(l2);
        add(l3);

        add(name);
        add(pass);
        add(age);
        add(passstatus);

        //font and color
        name.setForeground(Color.BLUE);
        pass.setForeground(Color.BLUE);
        age.setForeground(Color.BLUE);
        passstatus.setForeground(new Color(233,158,133));
        passstatus.setBackground(new Color(186,248,210));
        name.setFont(tf);
        pass.setFont(tf);
        age.setFont(tf);
        passstatus.setFont(ofp);
        passstatus.setEditable(false);
        l1.setForeground(Color.RED);
        l2.setForeground(Color.RED);
        l3.setForeground(Color.RED);
        lab=new Font("Segoe UI",Font.BOLD,30);
        l1.setFont(lab);
        l2.setFont(lab);
        l3.setFont(lab);


        name.setBounds(300,200,500,35);
        pass.setBounds(300,300,500,35);
        age.setBounds(300,400,500,35);
        passstatus.setBounds(300,550,400,40);


        l1.setBounds(100,200,220,30);
        l2.setBounds(100,300,200,30);
        l3.setBounds(100,400,250,30);
        //check boxes
        se=new CheckboxGroup();
        ma=new Checkbox(" Male",se,true);
        fe=new Checkbox(" Female",se,false);
        Color che=new Color(152,140,217);
        ma.setForeground(che);
        fe.setForeground(che);
        ma.setFont(tf);
        fe.setFont(tf);
        add(ma);
        add(fe);

        ma.setBounds(400,500,100,30);
        fe.setBounds(550,500,100,30);

        //JButton
        
        //adding interface
        name.addActionListener(this);
        pass.addActionListener(this);
        age.addActionListener(this);
        
         
        

        ma.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent ie)
          {
           
          }
        });
        fe.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent ie)
          {
           
          }
        });
       
    }
    public void actionPerformed(ActionEvent ae)
    {
    }

}

public class clip extends JFrame implements ActionListener
{
 
 JLabel wel,bckowel;
 JButton next,exit;
 boolean wo=true,pa=false,ma=false,tho=false;
 pass p;
 JButton next1=new JButton("Next");//for pass
 JButton check;                            //for pass
 fquiz fq;
 terres anim;
 marin mari;
 bird bi;
 welcome w;
 thank tha;
 JTabbedPane jf;
 JButton bquiz;
 ftest ft;
 public clip()
 {
  
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  }); 


  next=new JButton("< Next >");
  
  next.setBounds(360,640,300,60);
  next.setBackground(Color.RED);
  next.setForeground(Color.YELLOW);
  next.setFont(new Font("Times New Roman",Font.PLAIN,30));

  bquiz=new JButton("Click To Start The Quiz !");
    
    


    tha=new thank();
    tha.setTitle("Vote of Thanks");
    tha.setSize(1024,768);
   fq=new fquiz();
   fq.add(bquiz);
   bquiz.setBounds(412,300,200,200);
   JLabel qback=new JLabel(new ImageIcon("qback.jpg"));
   fq.add(qback);
   qback.setBounds(0,0,1024,768);

  exit=new JButton(new ImageIcon("close.jpg"));
  exit.setRolloverIcon(new ImageIcon("ring.gif"));
  exit.setBackground(Color.PINK);
  add(exit);
  exit.setBounds(875,97,37,32);
  jf=new JTabbedPane();

  
  anim=new terres();
  anim.add(exit);
  mari=new marin();
  mari.add(exit);
  bi=new bird();
  bi.add(exit);

  w=new welcome();
  w.setSize(1024,768);
     p=new pass();
     p.setSize(1024,768);
      check=new JButton("LOGIN");
      p.add(check);
      JLabel backp=new JLabel(new ImageIcon("back2.jpg"));
      p.add(backp);
      backp.setBounds(0,0,1024,768);

      next1.setBounds(150,600,200,70);
      check.setBounds(650,600,200,70);
      check.setCursor(new Cursor(12));
      next1.setCursor(new Cursor(12));  

      next1.setFont(new Font("OCR A Extended",Font.PLAIN,20));
      check.setFont(new Font("OCR A Extended",Font.PLAIN,20));
      next1.setForeground(new Color(224,203,109));
      check.setForeground(new Color(224,203,109));
      next1.setBackground(new Color(207,133,194));




      next1.addActionListener(this);
      check.addActionListener(this);
      bquiz.addActionListener(this);
  if(wo=true)
  {
   w.add(next);
   w.setVisible(true);
  }
  //temp
  //  add(anim);
   // setVisible(true);
  //end temp
  


  next.addActionListener(this);
  exit.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae)
  {  
     if(ae.getSource()==check)
     {
       p.passstatus.setText("        Password Incorrect");
       if(p.pass.getText().equals("how do you turn this on"))
        {  
         p.passstatus.setText("         Password Correct");
         pa=false;
         p.setVisible(false);
        jf.addTab("  Terrestrial  ",anim);
        jf.addTab("  Birds  ",bi);
        jf.addTab("  Marine  ",mari);
        jf.addTab("  Endangered Species",new endanger());
        jf.addTab("  Enviroment Quest  ",fq);
        add(jf);
        jf.setBackground(new Color(96,106,176));
        jf.setForeground(Color.RED);
        setVisible(true);

        }
        
     }
   if(ae.getSource()==bquiz)
   {
    setVisible(false);
    ft=new ftest();
    ft.setVisible(true);
   }

   if(ae.getSource()==exit)
   {
    setVisible(false);
    tha.setVisible(true);
   }
   if(ae.getSource()==next)
   {
    w.setVisible(false);
    wo=false;
    pa=true;
    p.setVisible(true);
   }

  }
 public static void main(String args[])
 {
  
        clip c=new clip();
  
        c.setSize(1024,768);
  

  }
 }
class welcome extends JFrame
{
 JLabel wel,bckowel,me;

 public welcome()
 {
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  }); 

  JLabel l1=new JLabel(new ImageIcon("lavalamp.gif"));
  add(l1);
  l1.setBounds(10,60,130,130);

  JLabel l2=new JLabel(new ImageIcon("lavalamp.gif"));
  add(l2);
  l2.setBounds(10,190,130,130);

  JLabel l3=new JLabel(new ImageIcon("lavalamp.gif"));
  add(l3);
  l3.setBounds(860,60,130,130);

  JLabel l4=new JLabel(new ImageIcon("lavalamp.gif"));
  add(l4);
  l4.setBounds(860,190,130,130);

  JLabel b=new JLabel(new ImageIcon("ball.gif"));
  add(b);
  b.setBounds(200,130,130,130);

  JLabel b1=new JLabel(new ImageIcon("ball.gif"));
  add(b1);
  b1.setBounds(640,130,130,130);

  JLabel b2=new JLabel(new ImageIcon("ball.gif"));
  add(b2);
  b2.setBounds(100,80,130,130);

  JLabel b3=new JLabel(new ImageIcon("ball.gif"));
  add(b3);
  b3.setBounds(740,80,130,130);

  JLabel b4=new JLabel(new ImageIcon("ball.gif"));
  add(b4);
  b4.setBounds(300,180,130,130);

  JLabel b5=new JLabel(new ImageIcon("ball.gif"));
  add(b5);
  b5.setBounds(540,180,130,130);

  JLabel b6=new JLabel(new ImageIcon("ball.gif"));
  add(b6);
  b6.setBounds(400,230,130,130);




  setLayout(null);
  me=new JLabel("Click Here to Proceed Further");
  add(me);
  me.setBounds(390,650,200,20);
  me.setBackground(new Color(153,153,255));

  wel=new JLabel(new ImageIcon("wel.gif"));
  wel.setBounds(25,10,900,620);
  add(wel);
  bckowel=new JLabel(new ImageIcon("bckowel.jpg"));
  bckowel.setBounds(-2,-2,1024,800);
  add(bckowel);
 }
}
class thank extends JFrame
{
 JLabel wel,bckowel,me;

 public thank()
 {
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  }); 
  
  JLabel t=new JLabel(new ImageIcon("thank.gif"));
  add(t);
  t.setBounds(40,20,900,650);
  JLabel tb=new JLabel(new ImageIcon("tback.jpg"));
  add(tb);
  tb.setBounds(0,0,1200,900);

 }
}

class animimage extends JFrame
{
 public animimage()
 {
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    setVisible(false);
   }
  }
  );
  setBounds(200,200,350,350);
  setSize(400,400);
  setTitle("Image");
 }
}
////////////////////////////////////////////////////////////////////
class terres extends JPanel implements ActionListener,ItemListener
{
 JComboBox op;
 String n[]=new String[44];
 String option;
 String name[]=new String[44];
 String s;
 JButton search,exit;
 boolean it=true;
 JTextField cname,fin,type,s1,sc1,s2,sc2,s3,sc3,s4,sc4,s5,sc5,fam,ord;
 String imid;
 animimage ai;
 JLabel im;
 thank tha;
 boolean ccl=false;
 public terres()
 {
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from terres");
              
              
              
              if(it)
              {
              for(int i=0;i<44;i++)
               {
                rs.next();
                name[i]=rs.getString(1);

               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 

  ai=new animimage();
  ai.setVisible(false);




  im=new JLabel();
  ///ai.add(im);
  add(im);
  im.setBounds(110,225,295,305);

  setLayout(null);
  setBackground(Color.WHITE);
  JLabel h1=new JLabel(new ImageIcon("terr.gif"));
  add(h1);
 // h1.setForeground(new Color(194,102,10));
 // h1.setFont(new Font("Century Gothic",Font.BOLD,65));
  h1.setBounds(270,0,800,100);

  JLabel tth=new JLabel(new ImageIcon("clover.gif"));
  add(tth);
  tth.setBounds(-36,-60,200,200);


 


  JLabel dog=new JLabel(new ImageIcon("dog.gif"));
  add(dog);
  dog.setBounds(500,90,100,100);





  search=new JButton(new ImageIcon("search2.gif"));
  search.setRolloverIcon(new ImageIcon("search3.gif"));
  add(search);
  search.setBounds(335,102,150,45);
  
  
   

  op=new JComboBox();
  for(int y=0;y<44;y++)
  {
   op.addItem(name[y]);
  }
  





  add(op);
  op.setBounds(120,102,200,45);
  op.setBackground(new Color(61,133,222));
  op.setFont(new Font("Century Goyhic",Font.PLAIN,20));
  op.setForeground(new Color(252,187,67));
  cname=new JTextField();
  fin=new JTextField();
  type=new JTextField();
   s1=new JTextField();
   sc1=new JTextField();
   s2=new JTextField();
   sc2=new JTextField();
   s3=new JTextField();
   sc3=new JTextField();
   s4=new JTextField();
   sc4=new JTextField();
   s5=new JTextField();
   sc5=new JTextField();
   fam=new JTextField();
   ord=new JTextField();

  cname.setEditable(false);
  cname.setBackground(new Color(220,29,130));
  cname.setFont(new Font("Snap ITC",Font.BOLD,40));
  cname.setForeground(Color.YELLOW);
  fin.setEditable(false);
  fin.setBackground(new Color(28,187,221));
  type.setEditable(false);
  type.setBackground(new Color(28,187,221));
  s1.setEditable(false);
  s1.setBackground(new Color(230,124,90));
  sc1.setEditable(false);
  sc1.setBackground(new Color(230,124,90));

  s2.setEditable(false);
  s2.setBackground(new Color(224,154,50));
  sc2.setEditable(false);
  sc2.setBackground(new Color(224,154,50));

  s3.setEditable(false);
  s3.setBackground(Color.PINK);
  sc3.setEditable(false);
  sc3.setBackground(Color.PINK);

  s4.setEditable(false);
  s4.setBackground(Color.YELLOW);
  sc4.setEditable(false);
  sc4.setBackground(Color.YELLOW);

  s5.setEditable(false);
  s5.setBackground(Color.MAGENTA);
  sc5.setEditable(false);
  sc5.setBackground(Color.MAGENTA);

  fam.setEditable(false);
  fam.setBackground(new Color(28,187,221));
  ord.setEditable(false);
  ord.setBackground(new Color(28,187,221));
  add(cname);
  
  cname.setBounds(500,190,450,50);
  JLabel lfin=new JLabel("Found In:");
  add(fin);
  fin.setBounds(680,400+70-100,300,35);
  add(lfin);
  lfin.setBounds(500,400-100,150,50);
  lfin.setForeground(Color.RED);
  lfin.setFont(new Font("Tahoma",Font.PLAIN,24));
  
  add(type);
  type.setBounds(680,340+70-100,300,35);
  JLabel ltype=new JLabel("Type:");
  add(ltype);
  ltype.setForeground(Color.RED);
  ltype.setBounds(500,460-100,150,50);
  ltype.setFont(new Font("Tahoma",Font.PLAIN,24));

  add(fam);
  fam.setBounds(680,430,300,35);
  JLabel lfam=new JLabel("Family:");
  add(lfam);
  lfam.setForeground(Color.RED);
  lfam.setBounds(500,420+3,150,50);
  lfam.setFont(new Font("Tahoma",Font.PLAIN,24));


  add(ord);
  ord.setBounds(680,490,300,35);
  JLabel lord=new JLabel("Order:");
  add(lord);
  lord.setForeground(Color.RED);
  lord.setBounds(500,480+3,150,50);
  lord.setFont(new Font("Tahoma",Font.PLAIN,24));


  JLabel lsub=new JLabel("SubSpecies:");
  add(lsub);
  lsub.setForeground(Color.RED);
  lsub.setBounds(5+19,583+8,150,50);
  lsub.setFont(new Font("Tahoma",Font.BOLD,15));
  add(s1);
  s1.setBounds(110+5,590+15,170,30);
  add(s2);
  s2.setBounds(110+178+5,590+15,170,30);
  add(s3);
  s3.setBounds(110+178+178+5,590+15,170,30);
  add(s4);
  s4.setBounds(110+178+178+178+5,590+15,170,30);
  add(s5);
  s5.setBounds(110+178+178+178+178+5,590+15,170,30);

  JLabel lsci=new JLabel("Sc. Name:");
  add(lsci);
  lsci.setForeground(Color.RED);
  lsci.setBounds(5+20,634,150,50);
  lsci.setFont(new Font("Tahoma",Font.BOLD,15));

  add(sc1);
  sc1.setBounds(110+5,640+10,170,30);
  add(sc2);
  sc2.setBounds(110+178+5,640+10,170,30);
  add(sc3);
  sc3.setBounds(110+178+178+5,640+10,170,30);
  add(sc4);
  sc4.setBounds(110+178+178+178+5,640+10,170,30);
  add(sc5);
  sc5.setBounds(110+178+178+178+178+5,640+10,170,30);

  JLabel star1=new JLabel(new ImageIcon("star.gif"));
  add(star1);
  star1.setBounds(52,172,50,50);

  JLabel star2=new JLabel(new ImageIcon("star.gif"));
  add(star2);
  star2.setBounds(424,172,50,50);

  JLabel star3=new JLabel(new ImageIcon("star.gif"));
  add(star3);
  star3.setBounds(52,540,50,50);

  JLabel star4=new JLabel(new ImageIcon("star.gif"));
  add(star4);
  star4.setBounds(424,540,50,50);

  JLabel imgb=new JLabel(new ImageIcon("imgbor.jpg"));
  add(imgb);
  imgb.setBounds(50,170,420,425);

  JLabel tool=new JLabel(new ImageIcon("toolbar.jpg"));
  add(tool);
  tool.setBounds(100,93,829,79);


  JLabel back=new JLabel(new ImageIcon("terresbck.jpg"));
  add(back);
  back.setBounds(0,0,1024,768);


  cname.addActionListener(this);
  op.addItemListener(this);
  search.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent ae) 
 {
  
  String f[]=new String[44];
  String t[]=new String[44];
  String s11[]=new String[44];
  String s22[]=new String[44];
  String s33[]=new String[44];
  String s44[]=new String[44];
  String s55[]=new String[44];

  String sc11[]=new String[44];
  String sc22[]=new String[44];
  String sc33[]=new String[44];
  String sc44[]=new String[44];
  String sc55[]=new String[44];

  String fam1[]=new String[44];
  String ord1[]=new String[44];
  String imid1[]=new String[44];

  if(ae.getSource()==search)
  {
    
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from terres");
              
              
              
              if(it)
              {
              for(int i=0;i<44;i++)
               {
                rs.next();
                n[i]=rs.getString(1);
                t[i]=rs.getString(3);
                f[i]=rs.getString(2);
                s11[i]=rs.getString(4);
                sc11[i]=rs.getString(5);

                s22[i]=rs.getString(6);
                sc22[i]=rs.getString(7);

                s33[i]=rs.getString(8);
                sc33[i]=rs.getString(9);

                s44[i]=rs.getString(10);
                sc44[i]=rs.getString(11);

                s55[i]=rs.getString(12);
                sc55[i]=rs.getString(13);

                fam1[i]=rs.getString(14);
                ord1[i]=rs.getString(15);
                imid1[i]=rs.getString(16);
               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 
  
  if(it)
  {
   for(int u=0;u<44;u++)
   {
    if(n[u].equals(option)==true)
    {
     cname.setText(n[u]);
     type.setText(t[u]);
     fin.setText(f[u]);
     fam.setText(fam1[u]);
     ord.setText(ord1[u]);
     s1.setText(s11[u]);
     sc1.setText(sc11[u]);

     s2.setText(s22[u]);
     sc2.setText(sc22[u]);
     s3.setText(s33[u]);
     sc3.setText(sc33[u]);
     s4.setText(s44[u]);
     sc4.setText(sc44[u]);

     s5.setText(s55[u]);
     sc5.setText(sc55[u]);
     imid=imid1[u];
     im.setIcon(new ImageIcon("jpg\\"+imid+".jpg"));
     if(imid.equals("none")==true)
     {
      im.setIcon(new ImageIcon("jpg\\none.gif"));
     }
    }
   }
  }
 }

 }

 public void itemStateChanged(ItemEvent e)
 {
  option=(String)op.getSelectedItem();
 }

}
///////////////////////////////////////////////////////////////////////
class bird extends JPanel implements ActionListener,ItemListener
{
 JComboBox op;
 String n[]=new String[44];
 String option;
 String name[]=new String[44];
 String s;
 JButton search,exit;
 boolean it=true;
 JTextField cname,fin,type,s1,sc1,s2,sc2,s3,sc3,s4,sc4,s5,sc5,fam,ord;
 String imid;
 animimage ai;
 JLabel im;
 thank tha;
 boolean ccl=false;
 public bird()
 {
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from birds");
              
              
              
              if(it)
              {
              for(int i=0;i<30;i++)
               {
                rs.next();
                name[i]=rs.getString(1);

               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 

  ai=new animimage();
  ai.setVisible(false);




  im=new JLabel();
  ///ai.add(im);
  add(im);
  im.setBounds(110,225,295,305);

  setLayout(null);
  setBackground(Color.WHITE);
  JLabel h1=new JLabel(new ImageIcon("bird.gif"));
  add(h1);
 // h1.setForeground(new Color(194,102,10));
 // h1.setFont(new Font("Century Gothic",Font.BOLD,65));
  h1.setBounds(270,0,800,100);

  JLabel tth=new JLabel(new ImageIcon("clover.gif"));
  add(tth);
  tth.setBounds(-36,-60,200,200);


 


  JLabel dog=new JLabel(new ImageIcon("parrot.gif"));
  add(dog);
  dog.setBounds(500,90,100,100);





  search=new JButton(new ImageIcon("search2.gif"));
  search.setRolloverIcon(new ImageIcon("search3.gif"));
  add(search);
  search.setBounds(335,102,150,45);
  
  
   

  op=new JComboBox();
  for(int y=0;y<30;y++)
  {
   op.addItem(name[y]);
  }
  





  add(op);
  op.setBounds(120,102,200,45);
  op.setBackground(new Color(61,133,222));
  op.setFont(new Font("Century Goyhic",Font.PLAIN,20));
  op.setForeground(new Color(252,187,67));
  cname=new JTextField();
  fin=new JTextField();
  type=new JTextField();
   s1=new JTextField();
   sc1=new JTextField();
   s2=new JTextField();
   sc2=new JTextField();
   s3=new JTextField();
   sc3=new JTextField();
   s4=new JTextField();
   sc4=new JTextField();
   s5=new JTextField();
   sc5=new JTextField();
   fam=new JTextField();
   ord=new JTextField();

  cname.setEditable(false);
  cname.setBackground(new Color(220,29,130));
  cname.setFont(new Font("Snap ITC",Font.BOLD,40));
  cname.setForeground(Color.YELLOW);
  fin.setEditable(false);
  fin.setBackground(new Color(28,187,221));
  type.setEditable(false);
  type.setBackground(new Color(28,187,221));
  s1.setEditable(false);
  s1.setBackground(new Color(230,124,90));
  sc1.setEditable(false);
  sc1.setBackground(new Color(230,124,90));

  s2.setEditable(false);
  s2.setBackground(new Color(224,154,50));
  sc2.setEditable(false);
  sc2.setBackground(new Color(224,154,50));

  s3.setEditable(false);
  s3.setBackground(Color.PINK);
  sc3.setEditable(false);
  sc3.setBackground(Color.PINK);

  s4.setEditable(false);
  s4.setBackground(Color.YELLOW);
  sc4.setEditable(false);
  sc4.setBackground(Color.YELLOW);

  s5.setEditable(false);
  s5.setBackground(Color.MAGENTA);
  sc5.setEditable(false);
  sc5.setBackground(Color.MAGENTA);

  fam.setEditable(false);
  fam.setBackground(new Color(28,187,221));
  ord.setEditable(false);
  ord.setBackground(new Color(28,187,221));
  add(cname);
  
  cname.setBounds(500,190,450,50);
  JLabel lfin=new JLabel("Found In:");
  add(fin);
  fin.setBounds(680,400+70-100,300,35);
  add(lfin);
  lfin.setBounds(500,400-100,150,50);
  lfin.setForeground(Color.RED);
  lfin.setFont(new Font("Tahoma",Font.PLAIN,24));
  
  add(type);
  type.setBounds(680,340+70-100,300,35);
  JLabel ltype=new JLabel("Type:");
  add(ltype);
  ltype.setForeground(Color.RED);
  ltype.setBounds(500,460-100,150,50);
  ltype.setFont(new Font("Tahoma",Font.PLAIN,24));

  add(fam);
  fam.setBounds(680,430,300,35);
  JLabel lfam=new JLabel("Family:");
  add(lfam);
  lfam.setForeground(Color.RED);
  lfam.setBounds(500,420+3,150,50);
  lfam.setFont(new Font("Tahoma",Font.PLAIN,24));


  add(ord);
  ord.setBounds(680,490,300,35);
  JLabel lord=new JLabel("Order:");
  add(lord);
  lord.setForeground(Color.RED);
  lord.setBounds(500,480+3,150,50);
  lord.setFont(new Font("Tahoma",Font.PLAIN,24));


  JLabel lsub=new JLabel("SubSpecies:");
  add(lsub);
  lsub.setForeground(Color.RED);
  lsub.setBounds(5+19,583+8,150,50);
  lsub.setFont(new Font("Tahoma",Font.BOLD,15));
  add(s1);
  s1.setBounds(110+5,590+15,170,30);
  add(s2);
  s2.setBounds(110+178+5,590+15,170,30);
  add(s3);
  s3.setBounds(110+178+178+5,590+15,170,30);
  add(s4);
  s4.setBounds(110+178+178+178+5,590+15,170,30);
  add(s5);
  s5.setBounds(110+178+178+178+178+5,590+15,170,30);

  JLabel lsci=new JLabel("Sc. Name:");
  add(lsci);
  lsci.setForeground(Color.RED);
  lsci.setBounds(5+20,634,150,50);
  lsci.setFont(new Font("Tahoma",Font.BOLD,15));

  add(sc1);
  sc1.setBounds(110+5,640+10,170,30);
  add(sc2);
  sc2.setBounds(110+178+5,640+10,170,30);
  add(sc3);
  sc3.setBounds(110+178+178+5,640+10,170,30);
  add(sc4);
  sc4.setBounds(110+178+178+178+5,640+10,170,30);
  add(sc5);
  sc5.setBounds(110+178+178+178+178+5,640+10,170,30);

  JLabel star1=new JLabel(new ImageIcon("star.gif"));
  add(star1);
  star1.setBounds(52,172,50,50);

  JLabel star2=new JLabel(new ImageIcon("star.gif"));
  add(star2);
  star2.setBounds(424,172,50,50);

  JLabel star3=new JLabel(new ImageIcon("star.gif"));
  add(star3);
  star3.setBounds(52,540,50,50);

  JLabel star4=new JLabel(new ImageIcon("star.gif"));
  add(star4);
  star4.setBounds(424,540,50,50);

  JLabel imgb=new JLabel(new ImageIcon("bimgbor.jpg"));
  add(imgb);
  imgb.setBounds(50,170,420,425);

  JLabel tool=new JLabel(new ImageIcon("toolbar.jpg"));
  add(tool);
  tool.setBounds(100,85,829,79);


  JLabel back=new JLabel(new ImageIcon("birdbck.jpg"));
  add(back);
  back.setBounds(0,0,1024,768);


  cname.addActionListener(this);
  op.addItemListener(this);
  search.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent ae) 
 {
  
  String f[]=new String[30];
  String t[]=new String[30];
  String s11[]=new String[30];
  String s22[]=new String[30];
  String s33[]=new String[30];
  String s44[]=new String[30];
  String s55[]=new String[30];

  String sc11[]=new String[30];
  String sc22[]=new String[30];
  String sc33[]=new String[30];
  String sc44[]=new String[30];
  String sc55[]=new String[30];

  String fam1[]=new String[30];
  String ord1[]=new String[30];
  String imid1[]=new String[30];

  if(ae.getSource()==search)
  {
    
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from birds");
              
              
              
              if(it)
              {
              for(int i=0;i<30;i++)
               {
                rs.next();
                n[i]=rs.getString(1);
                t[i]=rs.getString(3);
                f[i]=rs.getString(2);
                s11[i]=rs.getString(4);
                sc11[i]=rs.getString(5);

                s22[i]=rs.getString(6);
                sc22[i]=rs.getString(7);

                s33[i]=rs.getString(8);
                sc33[i]=rs.getString(9);

                s44[i]=rs.getString(10);
                sc44[i]=rs.getString(11);

                s55[i]=rs.getString(12);
                sc55[i]=rs.getString(13);

                fam1[i]=rs.getString(14);
                ord1[i]=rs.getString(15);
                imid1[i]=rs.getString(16);
               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 
  
  if(it)
  {
   for(int u=0;u<30;u++)
   {
    if(n[u].equals(option)==true)
    {
     cname.setText(n[u]);
     type.setText(t[u]);
     fin.setText(f[u]);
     fam.setText(fam1[u]);
     ord.setText(ord1[u]);
     s1.setText(s11[u]);
     sc1.setText(sc11[u]);

     s2.setText(s22[u]);
     sc2.setText(sc22[u]);
     s3.setText(s33[u]);
     sc3.setText(sc33[u]);
     s4.setText(s44[u]);
     sc4.setText(sc44[u]);

     s5.setText(s55[u]);
     sc5.setText(sc55[u]);
     imid=imid1[u];
     im.setIcon(new ImageIcon("jpg\\"+imid+".jpg"));
     if(imid.equals("none")==true)
     {
      im.setIcon(new ImageIcon("jpg\\none.gif"));
     }
    }
   }
  }
 }

 }

 public void itemStateChanged(ItemEvent e)
 {
  option=(String)op.getSelectedItem();
 }

}

////////////////////////////////////////////////////////////////////////
class marin extends JPanel implements ActionListener,ItemListener
{
 JComboBox op;
 String n[]=new String[24];
 String option;
 String name[]=new String[24];
 String s;
 JButton search,exit;
 boolean it=true;
 JTextField cname,fin,type,s1,sc1,s2,sc2,s3,sc3,s4,sc4,s5,sc5,fam,ord;
 String imid;
 animimage ai;
 JLabel im;
 thank tha;
 boolean ccl=false;
 public marin()
 {
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from marin");
              
              
              
              if(it)
              {
              for(int i=0;i<24;i++)
               {
                rs.next();
                name[i]=rs.getString(1);

               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 

  ai=new animimage();
  ai.setVisible(false);




  im=new JLabel();
  ///ai.add(im);
  add(im);
  im.setBounds(110,225,295,305);

  setLayout(null);
  setBackground(Color.WHITE);
  JLabel h1=new JLabel(new ImageIcon("hmarin.gif"));
  add(h1);
  h1.setForeground(new Color(194,102,10));
  h1.setFont(new Font("Century Gothic",Font.BOLD,65));
  h1.setBounds(270,0,800,100);

  JLabel tth=new JLabel(new ImageIcon("clover.gif"));
  add(tth);
  tth.setBounds(-36,-50,200,200);


 

  JLabel dog=new JLabel(new ImageIcon("goldfish.gif"));
  add(dog);
  dog.setBounds(500,90,140,100);






  search=new JButton(new ImageIcon("search2.gif"));
  search.setRolloverIcon(new ImageIcon("search3.gif"));
  add(search);
  search.setBounds(335,102,150,45);
  
  
   

  op=new JComboBox();
  for(int y=0;y<24;y++)
  {
   op.addItem(name[y]);
  }
  





  add(op);
  op.setBounds(120,102,200,45);
  op.setBackground(new Color(61,133,222));
  op.setFont(new Font("Century Goyhic",Font.PLAIN,20));
  op.setForeground(new Color(252,187,67));
  cname=new JTextField();
  fin=new JTextField();
  type=new JTextField();
   s1=new JTextField();
   sc1=new JTextField();
   s2=new JTextField();
   sc2=new JTextField();
   s3=new JTextField();
   sc3=new JTextField();
   s4=new JTextField();
   sc4=new JTextField();
   s5=new JTextField();
   sc5=new JTextField();
   fam=new JTextField();
   ord=new JTextField();

  cname.setEditable(false);
  cname.setBackground(new Color(220,29,130));
  cname.setFont(new Font("Snap ITC",Font.BOLD,40));
  cname.setForeground(Color.YELLOW);
  fin.setEditable(false);
  fin.setBackground(new Color(28,187,221));
  type.setEditable(false);
  type.setBackground(new Color(28,187,221));
  s1.setEditable(false);
  s1.setBackground(new Color(230,124,90));
  sc1.setEditable(false);
  sc1.setBackground(new Color(230,124,90));

  s2.setEditable(false);
  s2.setBackground(new Color(224,154,50));
  sc2.setEditable(false);
  sc2.setBackground(new Color(224,154,50));

  s3.setEditable(false);
  s3.setBackground(Color.PINK);
  sc3.setEditable(false);
  sc3.setBackground(Color.PINK);

  s4.setEditable(false);
  s4.setBackground(Color.YELLOW);
  sc4.setEditable(false);
  sc4.setBackground(Color.YELLOW);

  s5.setEditable(false);
  s5.setBackground(Color.MAGENTA);
  sc5.setEditable(false);
  sc5.setBackground(Color.MAGENTA);

  fam.setEditable(false);
  fam.setBackground(new Color(28,187,221));
  ord.setEditable(false);
  ord.setBackground(new Color(28,187,221));
  add(cname);
  
  cname.setBounds(500,190,450,50);
  JLabel lfin=new JLabel("Found In:");
  add(fin);
  fin.setBounds(680,400+70-100,300,35);
  add(lfin);
  lfin.setBounds(500,400-100,150,50);
  lfin.setForeground(Color.RED);
  lfin.setFont(new Font("Tahoma",Font.PLAIN,24));
  
  add(type);
  type.setBounds(680,340+70-100,300,35);
  JLabel ltype=new JLabel("Type:");
  add(ltype);
  ltype.setForeground(Color.RED);
  ltype.setBounds(500,460-100,150,50);
  ltype.setFont(new Font("Tahoma",Font.PLAIN,24));

  add(fam);
  fam.setBounds(680,430,300,35);
  JLabel lfam=new JLabel("Family:");
  add(lfam);
  lfam.setForeground(Color.RED);
  lfam.setBounds(500,420+3,150,50);
  lfam.setFont(new Font("Tahoma",Font.PLAIN,24));


  add(ord);
  ord.setBounds(680,490,300,35);
  JLabel lord=new JLabel("Order:");
  add(lord);
  lord.setForeground(Color.RED);
  lord.setBounds(500,480+3,150,50);
  lord.setFont(new Font("Tahoma",Font.PLAIN,24));


  JLabel lsub=new JLabel("SubSpecies:");
  add(lsub);
  lsub.setForeground(Color.RED);
  lsub.setBounds(5+19,583+8,150,50);
  lsub.setFont(new Font("Tahoma",Font.BOLD,15));
  add(s1);
  s1.setBounds(110+5,590+15,170,30);
  add(s2);
  s2.setBounds(110+178+5,590+15,170,30);
  add(s3);
  s3.setBounds(110+178+178+5,590+15,170,30);
  add(s4);
  s4.setBounds(110+178+178+178+5,590+15,170,30);
  add(s5);
  s5.setBounds(110+178+178+178+178+5,590+15,170,30);

  JLabel lsci=new JLabel("Sc. Name:");
  add(lsci);
  lsci.setForeground(Color.RED);
  lsci.setBounds(5+20,634,150,50);
  lsci.setFont(new Font("Tahoma",Font.BOLD,15));

  add(sc1);
  sc1.setBounds(110+5,640+10,170,30);
  add(sc2);
  sc2.setBounds(110+178+5,640+10,170,30);
  add(sc3);
  sc3.setBounds(110+178+178+5,640+10,170,30);
  add(sc4);
  sc4.setBounds(110+178+178+178+5,640+10,170,30);
  add(sc5);
  sc5.setBounds(110+178+178+178+178+5,640+10,170,30);

  JLabel star1=new JLabel(new ImageIcon("star.gif"));
  add(star1);
  star1.setBounds(52,172,50,50);

  JLabel star2=new JLabel(new ImageIcon("star.gif"));
  add(star2);
  star2.setBounds(424,172,50,50);

  JLabel star3=new JLabel(new ImageIcon("star.gif"));
  add(star3);
  star3.setBounds(52,540,50,50);

  JLabel star4=new JLabel(new ImageIcon("star.gif"));
  add(star4);
  star4.setBounds(424,540,50,50);

  JLabel imgb=new JLabel(new ImageIcon("mimgbor.jpg"));
  add(imgb);
  imgb.setBounds(50,170,420,425);

  JLabel tool=new JLabel(new ImageIcon("toolbar2.jpg"));
  add(tool);
  tool.setBounds(100,93,829,79);


  JLabel back=new JLabel(new ImageIcon("bckmarin.jpg"));
  add(back);
  back.setBounds(0,0,1024,768);


  cname.addActionListener(this);
  op.addItemListener(this);
  search.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent ae) 
 {
  
  String f[]=new String[24];
  String t[]=new String[24];
  String s11[]=new String[24];
  String s22[]=new String[24];
  String s33[]=new String[24];
  String s44[]=new String[24];
  String s55[]=new String[24];

  String sc11[]=new String[24];
  String sc22[]=new String[24];
  String sc33[]=new String[24];
  String sc44[]=new String[24];
  String sc55[]=new String[24];

  String fam1[]=new String[24];
  String ord1[]=new String[24];
  String imid1[]=new String[24];

  if(ae.getSource()==search)
  {
    
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from marin");
              
              
              
              if(it)
              {
              for(int i=0;i<24;i++)
               {
                rs.next();
                n[i]=rs.getString(1);
                t[i]=rs.getString(3);
                f[i]=rs.getString(2);
                s11[i]=rs.getString(4);
                sc11[i]=rs.getString(5);

                s22[i]=rs.getString(6);
                sc22[i]=rs.getString(7);

                s33[i]=rs.getString(8);
                sc33[i]=rs.getString(9);

                s44[i]=rs.getString(10);
                sc44[i]=rs.getString(11);

                s55[i]=rs.getString(12);
                sc55[i]=rs.getString(13);

                fam1[i]=rs.getString(14);
                ord1[i]=rs.getString(15);
                imid1[i]=rs.getString(16);
               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 
  
  if(it)
  {
   for(int u=0;u<24;u++)
   {
    if(n[u].equals(option)==true)
    {
     cname.setText(n[u]);
     type.setText(t[u]);
     fin.setText(f[u]);
     fam.setText(fam1[u]);
     ord.setText(ord1[u]);
     s1.setText(s11[u]);
     sc1.setText(sc11[u]);

     s2.setText(s22[u]);
     sc2.setText(sc22[u]);
     s3.setText(s33[u]);
     sc3.setText(sc33[u]);
     s4.setText(s44[u]);
     sc4.setText(sc44[u]);

     s5.setText(s55[u]);
     sc5.setText(sc55[u]);
     imid=imid1[u];
     im.setIcon(new ImageIcon("jpg\\"+imid+".jpg"));
     if(imid.equals("none")==true)
     {
      im.setIcon(new ImageIcon("jpg\\none.gif"));
     }
    }
   }
  }
 }
 }
 public void itemStateChanged(ItemEvent e)
 {
  option=(String)op.getSelectedItem();
 }

}
///////////////////////////////////////////////////////////////
class endanger extends JPanel implements ActionListener,ItemListener
{
 JComboBox op;
 String n[]=new String[44];
 String option;
 String name[]=new String[44];
 String s;
 JButton search,exit;
 boolean it=true;
 JTextField cname,fin,type,s1,sc1,s2,sc2,s3,sc3,s4,sc4,s5,sc5,fam,ord;
 String imid;
 animimage ai;
 JLabel im;
 thank tha;
 boolean ccl=false;
 public endanger()
 {
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from endanger");
              
              
              
              if(it)
              {
              for(int i=0;i<30;i++)
               {
                rs.next();
                name[i]=rs.getString(1);

               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 

  ai=new animimage();
  ai.setVisible(false);




  im=new JLabel();
  ///ai.add(im);
  add(im);
  im.setBounds(110,225,295,305);

  setLayout(null);
  setBackground(Color.WHITE);
  JLabel h1=new JLabel(new ImageIcon("hend.gif"));
  add(h1);
 // h1.setForeground(new Color(194,102,10));
 // h1.setFont(new Font("Century Gothic",Font.BOLD,65));
  h1.setBounds(270,0,800,100);

  JLabel tth=new JLabel(new ImageIcon("clover.gif"));
  add(tth);
  tth.setBounds(-36,-60,200,200);


 


  JLabel dog=new JLabel(new ImageIcon("polar.gif"));
  add(dog);
  dog.setBounds(500,90,100,100);





  search=new JButton(new ImageIcon("search2.gif"));
  search.setRolloverIcon(new ImageIcon("search3.gif"));
  add(search);
  search.setBounds(335,102,150,45);
  
  
   

  op=new JComboBox();
  for(int y=0;y<30;y++)
  {
   op.addItem(name[y]);
  }
  





  add(op);
  op.setBounds(120,102,200,45);
  op.setBackground(new Color(61,133,222));
  op.setFont(new Font("Century Goyhic",Font.PLAIN,20));
  op.setForeground(new Color(252,187,67));
  cname=new JTextField();
  fin=new JTextField();
  type=new JTextField();
   s1=new JTextField();
   sc1=new JTextField();
   s2=new JTextField();
   sc2=new JTextField();
   s3=new JTextField();
   sc3=new JTextField();
   s4=new JTextField();
   sc4=new JTextField();
   s5=new JTextField();
   sc5=new JTextField();
   fam=new JTextField();
   ord=new JTextField();

  cname.setEditable(false);
  cname.setBackground(new Color(220,29,130));
  cname.setFont(new Font("Snap ITC",Font.BOLD,40));
  cname.setForeground(Color.YELLOW);
  fin.setEditable(false);
  fin.setBackground(new Color(28,187,221));
  type.setEditable(false);
  type.setBackground(new Color(28,187,221));
  s1.setEditable(false);
  s1.setBackground(new Color(230,124,90));
  sc1.setEditable(false);
  sc1.setBackground(new Color(230,124,90));

  s2.setEditable(false);
  s2.setBackground(new Color(224,154,50));
  sc2.setEditable(false);
  sc2.setBackground(new Color(224,154,50));

  s3.setEditable(false);
  s3.setBackground(Color.PINK);
  sc3.setEditable(false);
  sc3.setBackground(Color.PINK);

  s4.setEditable(false);
  s4.setBackground(Color.YELLOW);
  sc4.setEditable(false);
  sc4.setBackground(Color.YELLOW);

  s5.setEditable(false);
  s5.setBackground(Color.MAGENTA);
  sc5.setEditable(false);
  sc5.setBackground(Color.MAGENTA);

  fam.setEditable(false);
  fam.setBackground(new Color(28,187,221));
  ord.setEditable(false);
  ord.setBackground(new Color(28,187,221));
  add(cname);
  
  cname.setBounds(500,190,450,50);
  JLabel lfin=new JLabel("Found In:");
  
  
  
  lfin.setBounds(500,400-100,150,50);
  lfin.setForeground(Color.RED);
  lfin.setFont(new Font("Tahoma",Font.PLAIN,24));
  
  add(type);
  type.setBounds(680,400-100,300,35);
  JLabel ltype=new JLabel("Type:");
  add(ltype);
  ltype.setForeground(Color.RED);
  ltype.setBounds(500,400-100,300,35);
  ltype.setFont(new Font("Tahoma",Font.PLAIN,24));

  
  fam.setBounds(680,430,300,35);
  JLabel lfam=new JLabel("Family:");
  
  lfam.setForeground(Color.RED);
  lfam.setBounds(500,420+3,150,50);
  lfam.setFont(new Font("Tahoma",Font.PLAIN,24));


  
  ord.setBounds(680,490,300,35);
  JLabel lord=new JLabel("Order:");
  
  lord.setForeground(Color.RED);
  lord.setBounds(500,480+3,150,50);
  lord.setFont(new Font("Tahoma",Font.PLAIN,24));


  JLabel lsub=new JLabel("SubSpecies:");
  
  lsub.setForeground(Color.RED);
  lsub.setBounds(5+19,583+8,150,50);
  lsub.setFont(new Font("Tahoma",Font.BOLD,15));
  
  s1.setBounds(110+5,590+15,170,30);
  
  s2.setBounds(110+178+5,590+15,170,30);
  
  s3.setBounds(110+178+178+5,590+15,170,30);
  
  s4.setBounds(110+178+178+178+5,590+15,170,30);
  
  s5.setBounds(110+178+178+178+178+5,590+15,170,30);

  JLabel lsci=new JLabel("Sc. Name:");
  
  lsci.setForeground(Color.RED);
  lsci.setBounds(5+20,634,150,50);
  lsci.setFont(new Font("Tahoma",Font.BOLD,15));

  
  sc1.setBounds(110+5,640+10,170,30);
  
  sc2.setBounds(110+178+5,640+10,170,30);
  
  sc3.setBounds(110+178+178+5,640+10,170,30);
  
  sc4.setBounds(110+178+178+178+5,640+10,170,30);
  
  sc5.setBounds(110+178+178+178+178+5,640+10,170,30);

  JLabel star1=new JLabel(new ImageIcon("star.gif"));
  add(star1);
  star1.setBounds(52,172,50,50);

  JLabel star2=new JLabel(new ImageIcon("star.gif"));
  add(star2);
  star2.setBounds(424,172,50,50);

  JLabel star3=new JLabel(new ImageIcon("star.gif"));
  add(star3);
  star3.setBounds(52,540,50,50);

  JLabel star4=new JLabel(new ImageIcon("star.gif"));
  add(star4);
  star4.setBounds(424,540,50,50);

  JLabel imgb=new JLabel(new ImageIcon("eimgbor.jpg"));
  add(imgb);
  imgb.setBounds(50,170,420,425);

  JLabel tool=new JLabel(new ImageIcon("toolbar.jpg"));
  add(tool);
  tool.setBounds(100,85,829,79);


  JLabel back=new JLabel(new ImageIcon("endbck.jpg"));
  add(back);
  back.setBounds(0,0,1024,768);


  cname.addActionListener(this);
  op.addItemListener(this);
  search.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent ae) 
 {
  
  String f[]=new String[30];
  String t[]=new String[30];
  String s11[]=new String[30];
  String s22[]=new String[30];
  String s33[]=new String[30];
  String s44[]=new String[30];
  String s55[]=new String[30];

  String sc11[]=new String[30];
  String sc22[]=new String[30];
  String sc33[]=new String[30];
  String sc44[]=new String[30];
  String sc55[]=new String[30];

  String fam1[]=new String[30];
  String ord1[]=new String[30];
  String imid1[]=new String[30];

  if(ae.getSource()==search)
  {
    
    try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c=DriverManager.getConnection("Jdbc:Odbc:data","","");
           Statement st=c.createStatement();
            
             ResultSet rs=st.executeQuery("select * from endanger");
              
              
              
              if(it)
              {
              for(int i=0;i<30;i++)
               {
                rs.next();
                n[i]=rs.getString(1);
                t[i]=rs.getString(2);
                imid1[i]=rs.getString(3);
               }
              }
               st.close();
               c.close();
        }catch(Exception e){System.out.println("error.." + e);} 
  
  if(it)
  {
   for(int u=0;u<30;u++)
   {
    if(n[u].equals(option)==true)
    {
     cname.setText(n[u]);
     type.setText(t[u]);
     imid=imid1[u];
     im.setIcon(new ImageIcon("jpg\\"+imid+".jpg"));
     if(imid.equals("none")==true)
     {
      im.setIcon(new ImageIcon("jpg\\none.gif"));
     }
    }
   }
  }
 }

 }

 public void itemStateChanged(ItemEvent e)
 {
  option=(String)op.getSelectedItem();
 }

}


class fquiz extends JPanel
{
 
 public fquiz()
 {
  setLayout(null);

 }
}
