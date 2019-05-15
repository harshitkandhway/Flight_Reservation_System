package sparxs;
import java.io.*;
import java.util.*;
class DataManager
{	
    DataManager(){}
    static int count;
DisplayManager dis;
int cnt;
static String day2;//"WED";
static String source;//="MUMBAI";
int month;
int fromyear;
int datenum;
int month1;
int counter=0;

	String oneLine1;
	public Flight[] flight = new Flight[85];
      public Flight[] flight1 = new Flight[85];
      DataManager(DisplayManager d)
      {
          dis = d;
      }
        public Flight readLine(String oneLine)throws IOException
	{	
		int i=count;
		StringTokenizer st = new StringTokenizer(oneLine,"|");
       		while(st.hasMoreTokens())
		{
             		flight[i].origin=st.nextToken();
                	flight[i].destination = st.nextToken();
			flight[i].frequency = st.nextToken();
			flight[i].flightNum = st.nextToken();
			flight[i].depTime = st.nextToken();
			flight[i].arrTime = st.nextToken();
                        st.nextToken();
			flight[i].effectfrom = st.nextToken();
			flight[i].effecttill = st.nextToken();
			DataManager.count++;
		}
		return(flight[i]);
	}
      public void writeLine(Flight flight1)
	{
           // System.out.println(flight1.flightNum);
		//System.out.print("Origin : "+"\t"+flight1.origin+"\n"+"DepartCity : "+"\t"+flight1.destination+"\n"+"Frequency :"+"\t"+flight1.frequency+"\n"+"Flight Number :"+"\t"+flight1.flightNum +"\n"+"Departure Time:"+"\t"+flight1.depTime+"\n"+"Arrival Time :"+"\t"+flight1.arrTime+"\n"+"Effective From :"+" "+flight1.effectfrom+"\n"+"Effective Till : "+flight1.effecttill+"\n\n");
	}

	public Flight[] sort(Flight[] flight)
	{
            	for(int i=0;i<80;i++)
                { 
                    StringTokenizer stk = new StringTokenizer(flight[i].effectfrom);
                    datenum = Integer.parseInt(stk.nextToken());
                    String frommonth = stk.nextToken();
                    switch(frommonth)
                    {
                        case "JAN" : month=1;break;
                        case "FEB" : month=2;break;
                        case "MAR" : month=3;break;
                        case "APR" : month=4;break;
                        case "MAY" : month=5;break;
                        case "JUN" : month=6;break;
                        case "JUL" : month=7;break;
                        case "AUG" : month=8;break;
                        case "SEP" : month=9;break;
                        case "OCT" : month=10;break;
                        case "NOV" : month=11;break;
                        case "DEC" : month=12;break;
                    }
                     fromyear=Integer.parseInt(stk.nextToken());
                    if(fromyear==15)
                        fromyear=2015;
                    else
                        fromyear=2016;
                   // System.out.print("Effective from : "+datenum+" "+month+" "+fromyear+"     ");
//                        
                    Date date = new Date(2015, 10, 1);
                    Date date2 = new Date(2015, 10, 24);
                    Date datefrom = new Date(fromyear, month, datenum);
                    
                    StringTokenizer stk1 = new StringTokenizer(flight[i].effecttill);
                    int datenum1 = Integer.parseInt(stk1.nextToken());
                    String frommonth1 = stk1.nextToken();
                    switch(frommonth1)
                    {
                        case "JAN" : month1=1;break;
                        case "FEB" : month1=2;break;
                        case "MAR" : month1=3;break;
                        case "APR" : month1=4;break;
                        case "MAY" : month1=5;break;
                        case "JUN" : month1=6;break;
                        case "JUL" : month1=7;break;
                        case "AUG" : month1=8;break;
                        case "SEP" : month1=9;break;
                        case "OCT" : month1=10;break;
                        case "NOV" : month1=11;break;
                        case "DEC" : month1=12;break;
                    }
                    int fromyear1=Integer.parseInt(stk1.nextToken());
                    if(fromyear1==15)
                        fromyear1=2015;
                    else
                        fromyear1=2016;
                   // System.out.println("Effective till :"+datenum1+" "+month1+" "+fromyear1);
                     Date datetill = new Date(fromyear1, month1, datenum1);
                     if(((datetill.before(date)==true)||(datefrom.after(date2)==true))){}
                    // {System.out.println(flight[i].flightNum+"uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");}
                    // else{ 
//                    if((datenum1< 11)){//&& month1<10 && fromyear1<2015)||( datenum>24 && month>10 && fromyear>2015)){
//                    counter++;
//                   
//                    }
                    else{
                         //System.out.println(flight[i].destination+"  "+flight[i].flightNum+"  "+flight[i].frequency);
                         counter++;
                    if(flight[i].origin.equals(DataManager.source))
                       if(flight[i].frequency.contains(day2)||flight[i].frequency.equals("DAILY"))
                        flight1[cnt++]=flight[i];
                         //System.out.println("                           "+cnt);    
                    }
                }    
                //}
              return(flight1);
	}
	public void main2()throws IOException
	{
		 DataManager fm = new DataManager();
		Flight[] ref;
	 	for(int h=0;h<85;h++)
        	{
           		 fm.flight[h]=new Flight();
			fm.flight1[h]=new Flight();
        	}
		
		BufferedReader br = new BufferedReader(new FileReader("2015.spicejet.csv"));
                int j;
                j = 0;
		int i;
		
		for(i = 0;i<85;i++)
		{
			if((fm.oneLine1=br.readLine())!=null)
			{
				if(i<5)
				{
                                   // System.out.println(fm.oneLine1);
                                    
                                
                                }
				else{
					fm.flight[j]=fm.readLine(fm.oneLine1);
					fm.writeLine(fm.flight[j]);
					j++;	
				    }
			}		
		}

	
ref=fm.sort(fm.flight);
dis.arr=ref;
dis.y1=fm.cnt;
//		System.out.println("\n----------Sorted Output----------\n\n");
//		for(i = 0;i<fm.cnt;i++)
//		{
//			System.out.println("Flink1"+" "+(ref[i].flightNum));
//		}
                //System.out.println("egf********"+fm.cnt+"jjjjjjjjjjjjjjjjjjjjjjjjjjj"+fm.counter);
 



	}	
}	

class Flight
{
	 String origin;
	 String destination;
	 String frequency;
	 String flightNum;
	 String depTime;
	 String arrTime;
	 String effectfrom;
	 String effecttill;
         int seat1;
}