/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparxs;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshit
 */
public class DisplayManager {
    Screen1 f1;
    Screen2 f2;
    Screen3 f3;
    Screen4a f4;
    DataManager dm1;
    DataManager2 dm2;
    Flight[] arr;
    FlightSilk[] fsarr;
    Combination combobj;
    BookingManager bookmgr;
    Comb[] cmb=new Comb[8];
    int y;
    int y1;
    int c1;
    int finaladd;
    String str;
    String day,day1;
    int daynum;
    int seat;
    Comb value;
    public void screenoff()
    {
        
        f2.dispose();
        f3.dispose();
        try{screen1();}catch(Exception e){}
    }
    void screen1()throws IOException
    {
        seat  = (Integer)this.f1.jsp2.getValue();
        daynum = (Integer)this.f1.jsp1.getValue();
        
       switch(daynum%7)
       {
           case 1 : day="THURSDAY";day1 = "Thu";break;
           case 2 : day = "FRIDAY";day1 = "Fri";break;
           case 3 : day = "SATURDAY";day1 = "Sat";break;
           case 4 : day = "SUNDAY";day1 = "Sun";break;
           case 5 : day = "MONDAY";day1 = "Mon";break;
           case 6 : day = "TUESDAY";day1 = "Tue";break;
           case 0 : day = "WEDNESDAY";day1 = "Wed";break;        
       }
       DataManager.day2=this.day;
       DataManager2.day1=this.day1;
       
       int i = this.f1.combo1.getSelectedIndex();
       if(i==0)
           str="DELHI";
       else if(i==1)
           str="MUMBAI";
       else
           str="PUNE ";
      

       DataManager.source=this.str;
        dm1.main2();
        dm2.main3();
       
       cmb = combobj.join(arr,fsarr);
       //__________________________________________________________________________________
      bookmgr.combarray = cmb;
      cmb=bookmgr.main7();
      
            f2.setVisible(true);
            f1.setVisible(false);
       
      
      
       
       
       
       
       
       
       
       
       
       //___________________________________________________________________________________
       DefaultTableModel dtm = (DefaultTableModel)f2.jt.getModel();
       for(i=0;i<finaladd;i++)
       {
           if(cmb[i].Deprlink.equals("2445"))
               cmb[i].Deprlink="0045";
           Object[] row={cmb[i].Depllink,cmb[i].Fnumllink,cmb[i].Arrllink,cmb[i].Via,cmb[i].Deprlink,cmb[i].Fnumrlink,cmb[i].Arrrlink,cmb[i].Duration};
           dtm.addRow(row);    
       }
    }
    public void screen4(){
        f4.setVisible(true);
        f3.setVisible(false);
        f4.lbl1.setText(f3.txtname.getText());
         f4.lbl1a.setText(f3.txtname.getText());
         int ghj = (int)((Math.random())*999956241);
         f4.lab16.setText(Integer.toString(ghj));
        
    }
       public void screen2()
       {
           int row=f2.jt.getSelectedRow();
          try{ value = cmb[row];
          if(value!=null) 
          {f3.setVisible(true);
           f2.setVisible(false);
           f3.lab1.setText(value.Sourcelink);
           f3.lab2.setText(value.Via);
           f3.lab3.setText(value.Destinationlink); 
           f3.jlab11.setText(value.Fnumllink);
           f3.jlab2.setText(value.Fnumrlink);
           System.out.println("first");
           try{bookmgr.updatecsvint();
           bookmgr.updatecsvdom();}catch(Exception e){}
           System.out.println("first222");
           f4.lbl2.setText(value.Sourcelink);
           f4.lbl2a.setText(value.Sourcelink);
           f4.lbl3.setText(value.Destinationlink);
           f4.lbl3a.setText(value.Destinationlink);
           f4.lbl4.setText(value.Via);
           f4.lbl4a.setText(value.Via);
           f4.lbl5.setText(value.Depllink);
           f4.lbl5a.setText(value.Depllink);
           f4.lbl6.setText(value.Arrrlink);
           f4.lbl6a.setText(value.Arrrlink);}
          else{
              f1.dispose();
              f2.dispose();
              f3.dispose();
          }
          }
         
          catch(Exception ed){}
       }
       public void screen11()
       {
          f1.setVisible(true);
          f2.setVisible(false);
       }
             
   
    public static void main(String[] args) {
        DisplayManager d = new DisplayManager();
        d.f1=new Screen1(d);
        d.f2 = new Screen2(d);
        d.f3 = new Screen3(d);
         d.f4 = new Screen4a(d);
        d.combobj = new Combination(d);
        d.dm1 = new DataManager(d);
        d.dm2=new DataManager2(d);
        d.f1.setVisible(true);
        d.bookmgr = new BookingManager(d);
    }
    
}
