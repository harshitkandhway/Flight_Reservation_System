package sparxs;
import java.io.*;
import java.util.StringTokenizer;
class DataManager2 
{	static int count;
int coun=0;

static String day1;
	String oneLine1;
        FlightSilk[] flightarray;
	public FlightSilk[] flight = new FlightSilk[9];
        FlightSilk[] sortedarray = new FlightSilk[9];
        DisplayManager dis;
        DataManager2(DisplayManager d)
        {
            dis=d;
        }
        DataManager2(){}
        public FlightSilk readLine1(String oneLine)throws IOException
	{	
		int i=count;
		StringTokenizer st = new StringTokenizer(oneLine,"|/");
       		while(st.hasMoreTokens())
		{
                	flight[i].depCity = st.nextToken();
			flight[i].daysOfWeek = st.nextToken();
			flight[i].flightNum = st.nextToken();
                        System.out.println(flight[i].flightNum);
			flight[i].depTime = st.nextToken();
                        if(flight[i].depTime.equals("0045"))
                        {
                            flight[i].depTime="2445";
                            flight[i].daysOfWeek ="Sat,Fri";
                           // System.out.println(flight[i].daysOfWeek+"     "+" ioioioioioioioioioioioioioioioioioioioioio"+flight[i].depTime);
                            
                        }
			flight[i].arrTime = st.nextToken();
			DataManager2.count++;
		}
		return(flight[i]);
	}
//	public void writeLine(FlightSilk flight1)
//	{
//		//System.out.print("DepartCity : "+"\t"+flight1.depCity+"\n"+"Days of Week :"+"\t"+flight1.daysOfWeek+"\n"+"Flight Number :"+"\t"+flight1.flightNum +"\n"+"Departure Time:"+"\t"+flight1.depTime+"\n"+"Arrival Time :"+"\t"+flight1.arrTime+"\n"+"\n");
//	}
        public FlightSilk[] sortingflight()
        {
            for(int i=0;i<8;i++)
            {
                if(flight[i].daysOfWeek.contains(day1))
                    
                    sortedarray[coun++]=flight[i];
            }
            return(sortedarray);
        }
        public void main3()throws IOException
	{
		 DataManager2 fm = new DataManager2();
		FlightSilk[] ref;
	 	for(int h=0;h<9;h++)
        	{
           		 fm.flight[h]=new FlightSilk();
                         fm.sortedarray[h]=new FlightSilk();           
        	}
		BufferedReader br = new BufferedReader(new FileReader("2015.silkair.csv"));
		int j=0, i=0;
		for(i = 0;i<11;i++)
		{
			if((fm.oneLine1=br.readLine())!=null)
			{
				if(i<3)
				{
                                    
                                }
				else{
					fm.flight[j]=fm.readLine1(fm.oneLine1);
					//fm.writeLine(fm.flight[j]);
					j++;	
				    }
			}		
		}
                fm.flightarray=fm.sortingflight();
                dis.fsarr=fm.flightarray;
                dis.c1=fm.coun;
//                for(int ie=0;ie<fm.coun;ie++)
//                {
//                    System.out.println(fm.flightarray[ie].flightNum);
//                }
	}	
}	
class FlightSilk
{
	 String depCity;
	 String daysOfWeek;
	 String flightNum;
	 String depTime;
	 String arrTime;
         int seat2;
}