/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparxs;

import java.util.StringTokenizer;

/**
 *
 * @author harshit
 */
public class Combination {
    DisplayManager dis;
    String finaltime,finaltime1;
    int dfg;
    public Combination(DisplayManager d)
    {
       dis=d;
    }
    Comb[] comb = new Comb[800];
    public Comb[] join(Flight[] f1,FlightSilk[] f2)
    {
        for(int u = 0;u<800;u++)
        {
            comb[u]=new Comb();
        }
        int c=0;
        dfg=dis.c1;
       // System.out.println(dis.y1+"************************************"+dis.c1);
        for(int i=0;i<dis.y1;i++)
        {
            
            char ch = (f1[i].destination).charAt(0);
            for(int j=0;j<dfg;j++)
            {
                if(f2[j].depCity.charAt(0)==ch)
                {
                    comb[c].Sourcelink = f1[i].origin;
                    StringTokenizer st = new StringTokenizer(f1[i].arrTime," :");
                    String hour = st.nextToken();
                    String min = st.nextToken();
                    String ampm = st.nextToken();
                    if(ampm.equals("AM"))
                         finaltime = hour+min;
                    else
                        finaltime = (Integer.parseInt(hour)+12) + min;
                comb[c].Arrllink=finaltime;
                 StringTokenizer st1 = new StringTokenizer(f1[i].depTime," :");
                    String hour1 = st1.nextToken();
                    String min1 = st1.nextToken();
                    String ampm1 = st1.nextToken();
                    if(ampm1.equals("AM"))
                         finaltime1 = hour1+min1;
                    else
                        finaltime1 = (Integer.parseInt(hour1)+12)+min1;
                
                comb[c].Arrrlink=f2[j].arrTime;
                comb[c].Depllink=finaltime1;//f1[i].depTime;
                comb[c].Deprlink=f2[j].depTime;
                int checkarr,checkdept;
                checkarr = Integer.parseInt(finaltime);
                checkdept = Integer.parseInt(f2[j].depTime);
                
                comb[c].Duration=Integer.toString(checkdept-checkarr);
                comb[c].Fnumllink=f1[i].flightNum;
               
                comb[c].Fnumrlink=f2[j].flightNum;
                 System.out.println("yui"+comb[c].Fnumrlink);
                comb[c].Via=f1[i].destination;   
                comb[c].Destinationlink = "SINGAPORE";
                
                if(((checkdept-checkarr)>=200) && ((checkdept-checkarr)<=600))
                {
                   // System.out.println("The value of c "+i+"\t"+"j :"+j+"      "+ c +"  "+comb[c].Fnumllink+" "+comb[c].Fnumrlink);
                    
                    //if(Integer.parseInt(comb[c].Duration)>200){
                    c++;
                   // System.out.println(comb[c-1].Duration);//}
                    
                   
                }
                }
                
            }
        }
        dis.y=c;
        return(comb);
    }
    
}
class Comb{
    String Sourcelink;
    String Depllink;
    String Fnumllink;
    String Arrllink;
    String Via;
    String Deprlink;
    String Fnumrlink;
    String Arrrlink;
    String Duration;
    String Destinationlink;
    
    
}