package com.soumya.Service;

import com.soumya.date.date.MyDate;

public class DateDifferenceProvider {

    
    private static int FEB=2;
    private static int JAN=31;
    private static int FEB1=28;
    private static int MAR=31;
    private static int APR=30;
    private static int MAY=31;
    private static int JUN=30;
    private static int JUL=31;
    private static int AUG=31;
    private static int SEP=30;
    private static int OCT=31;
    private static int NOV=30;
    private static int  DEC=31;
    
    private static int leapyear=366;
    private static int notleapyear=365;
    
    private static int[] monthsofYear= {JAN,FEB1,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
    
    
    public  static long getDateDifference(MyDate startDate,MyDate endDate) {
           if(sameDate(startDate,endDate)&&sameMonth(startDate,endDate)&&sameYear(startDate,endDate))
           {
                  return 0;
           }
           else if(sameMonth(startDate,endDate)&&sameYear(startDate,endDate))
           {
                        return endDate.getDd()-startDate.getDd();
           }
           else if(sameYear(startDate, endDate) && !sameMonth(startDate, endDate)) {
         return remainingDaysInMonth(startDate)+daysInIntervingMonth(startDate,endDate)+daysInLeadingMonth(endDate);
           }
  else {
         return remianingDaysInYear(startDate)+daysInInterviningYear(startDate,endDate)+daysInLeadingYear(endDate);
  }        
}
    
    private static boolean sameDate(MyDate startDate,MyDate endDate)
    {
           if(startDate.getDd()==endDate.getDd())
           {
                  return true;
           }
           else
                  return false;
           
    }
    private static boolean sameMonth(MyDate startDate,MyDate endDate)
    {
           if(startDate.getMm()==endDate.getMm())
           {
                  return true;
           }
           else
                  return false;
           
    }
    private static boolean sameYear(MyDate startDate,MyDate endDate)
    {
           if(startDate.getYyyy()==endDate.getYyyy())
           {
                  return true;
           }
           else
                  return false;
           
    }
    
    private static int remainingDaysInMonth(MyDate startDate) {
           int remainingDaysInMonth=0;
           if(isLeapYear(startDate) && startDate.getMm()==2)
                  remainingDaysInMonth=1;
           remainingDaysInMonth+=monthsofYear[startDate.getMm()-1]-startDate.getDd();
           return remainingDaysInMonth;
    }
    
    private static int daysInLeadingMonth(MyDate endDate) {
           return endDate.getDd();
    }
    
    private static int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
           int daysInIntervingMonthDays=0;
           if(isLeapYear(startDate) && startDate.getMm()<2 && endDate.getMm()>2)
                  daysInIntervingMonthDays=1;
           for(int i=startDate.getMm();i<endDate.getMm()-1;i++)
           {   
                  daysInIntervingMonthDays+=monthsofYear[i];
           }
           return daysInIntervingMonthDays;
    }
    
    private static boolean isLeapYear(MyDate startDate) {
           if((startDate.getYyyy()%4==0 && startDate.getYyyy()%100!=0)|| startDate.getYyyy()%400==0) 
                  return true;
           return false;
    }


    private static int remianingDaysInYear(MyDate startDate) {
           int remainingYearDays=0;
           int remainDaysInMonth=remainingDaysInMonth(startDate);
           int daysInIntervingMonthDays=daysInIntervingMonth(startDate, new MyDate(0, 13, startDate.getYyyy()));
           remainingYearDays=remainDaysInMonth+daysInIntervingMonthDays;
           return remainingYearDays;
    }
    
    private static int daysInInterviningYear(MyDate startDate, MyDate endDate) {
           int daysInInterviningYearDays=0;
           for(int j=startDate.getYyyy()+1;j<endDate.getYyyy();j++)
           {
                  if((j%4==0 && j%100!=0) || j%400==0)
                        daysInInterviningYearDays+=366;
                  else
                        daysInInterviningYearDays+=365;
           }
           return daysInInterviningYearDays;
    }
    
    private static int daysInLeadingYear(MyDate endDate) {
           int leadingYearDays=0;
           int daysInIntervingMonthDays=daysInIntervingMonth(new MyDate(0, 0, endDate.getYyyy()), endDate);
           int daysInLeadingMonthInMonth=endDate.getDd();
           leadingYearDays=daysInLeadingMonthInMonth+daysInIntervingMonthDays;
           return leadingYearDays;
    }
    
}

