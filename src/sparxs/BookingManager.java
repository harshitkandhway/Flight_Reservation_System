/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparxs;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author harshit
 */
public class BookingManager {
    Comb[] combarray;
            Comb[] combarray1=new Comb[10];
            Comb[] combarray2=new Comb[10];
            int count1=0;
            int count2=0;
            int bookintcount,bookdomcount;
    int count;
    String[][] BookDom = new String[100][100];
    String[] BookDom1 = new String[100];
    String[][] BookInt = new String[100][100];
    String[] BookInt1 = new String[100];
   DisplayManager dis;
   BookingManager(){}
   BookingManager(DisplayManager d)
   {
       dis=d;
   }
   public void readDomestic()throws IOException
   {     
           FileReader fr = new FileReader("Domestic.csv");
           BufferedReader br = new BufferedReader(fr);
           for(int i=0;i<8;i++)
           {
              String str = br.readLine();
              StringTokenizer st = new StringTokenizer(str,"|");
              int j=0;
              while(st.hasMoreTokens())
              {      
                  BookDom[i][j] = st.nextToken();
                  j++;
              }
           }   
       }
   public void readInternational()throws IOException
   {     
           FileReader fr1 = new FileReader("International.csv");
           BufferedReader br = new BufferedReader(fr1);
           for(int i=0;i<8;i++)
           {
              String str = br.readLine();
              StringTokenizer st = new StringTokenizer(str,"|");
              for(int j=0;j<25;j++)
              {
                  BookInt[i][j] = st.nextToken();
              }                      
           }
       }
   public void domSort()
   {
       int seat1 = dis.seat;
           int date = dis.daynum;
           int j=0;
       for(int i=0;i<8;i++)
       {
           if(Integer.parseInt(BookDom[i][date])>=seat1)
           {
               BookDom1[j++]=BookDom[i][0];
           }
           bookdomcount=j;
       }
   }
   public void intSort()
   {
       int seat1 = dis.seat;
           int date = dis.daynum;
       int j=0;
       for(int i=0;i<8;i++)
       {
           if(Integer.parseInt(BookInt[i][date])>=seat1)
           {
               BookInt1[j++]=BookInt[i][0];
           }
           bookintcount=j;      
       }
   }
   public void sort1()
   {
       count=dis.y;
       int k=0;
       for(int i=0;i<count;i++)
       {
           for(int j=0;j<bookdomcount;j++)
           {     
                 if(combarray[i].Fnumllink.equals(BookDom1[j]))
                 {
                        //System.out.println("df");
                        combarray1[count1]=combarray[i];
                        count1++;
                        System.out.println(combarray[i].Fnumllink+"uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
                 }  
           }
           
       }
       
   }   
   public void sort2()
   {
       count=dis.y;
       for(int i=0;i<count1;i++){
           for(int j=0;j<bookintcount;j++){
           if(combarray1[i].Fnumrlink.equals(BookInt1[j])){
                combarray2[count2++]=combarray1[i];
               }  
   }
   }
   }
   //__________________________________________________________________________________________________________
   
   
   
   public void updatecsvint()throws IOException
   {
      
          FileReader fr1 = new FileReader("International.csv");
          int date = dis.daynum;
          int seat1 = dis.seat;
          String[][] a = new String[10][25];
           BufferedReader br = new BufferedReader(fr1);
           for(int i=0;i<8;i++)
           {
             // System.out.println("hjhjk");
              String str = br.readLine();
              StringTokenizer st = new StringTokenizer(str,"|");
              for(int j=0;j<25;j++)
              {
                  a[i][j]=st.nextToken();
              }
           }
           for(int i=0;i<8;i++)
           {
                //System.out.println("78787878787");
               if(a[i][0].equals(dis.value.Fnumrlink))
               {
                   int z=Integer.parseInt(a[i][date]);
                   z-=seat1;
                   a[i][date]=Integer.toString(z);
               }
           }
           FileWriter fw = new FileWriter("International.csv");
           BufferedWriter bw = new BufferedWriter(fw);
           for(int i=0;i<8;i++)
           {
               for(int j=0;j<25;j++)
               {
                   if(j<24)
                  bw.write(a[i][j]+"|");
                   
                   else
                       bw.write(a[i][j]);   
               }
               bw.write("\r\n");
           }
           bw.close();
           
   }
   
   
   
   //___________________________________________________________________________________________
   
   public void updatecsvdom()throws IOException
   {
      
          FileReader fr1 = new FileReader("Domestic.csv");
          int date = dis.daynum;
          int seat1 = dis.seat;
          String[][] a = new String[10][25];
           BufferedReader br = new BufferedReader(fr1);
           for(int i=0;i<8;i++)
           {
             // System.out.println("hjhjk");
              String str = br.readLine();
              StringTokenizer st = new StringTokenizer(str,"|");
              for(int j=0;j<25;j++)
              {
                  a[i][j]=st.nextToken();
              }
           }
           for(int i=0;i<8;i++)
           {
                //System.out.println("78787878787");
               if(a[i][0].equals(dis.value.Fnumllink))
               {
                   int z=Integer.parseInt(a[i][date]);
                   z-=seat1;
                   a[i][date]=Integer.toString(z);
               }
           }
           FileWriter fw = new FileWriter("Domestic.csv");
           BufferedWriter bw = new BufferedWriter(fw);
           for(int i=0;i<8;i++)
           {
               for(int j=0;j<25;j++)
               {
                   if(j<24)
                  bw.write(a[i][j]+"|");
                   
                   else
                       bw.write(a[i][j]);   
               }
               bw.write("\r\n");
           }
           bw.close();
           
   }

   public Comb[] main7()throws IOException
   {
       readDomestic();
      
       for(int i=0;i<10;i++)
       {
           combarray1[i]=new Comb();
           combarray2[i]=new Comb();
       }
       readInternational();
       domSort();
       intSort();
       sort1();
       sort2();
       dis.finaladd=count2;
       return(combarray2);
   }
}


  

