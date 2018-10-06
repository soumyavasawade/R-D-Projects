package com.soumya.Test;

import com.soumya.date.date.MyDate;

public class MyDateTestRecord {
public MyDate startDate;
public MyDate endDate;
public long expectedResult;
public MyDateTestRecord(MyDate startDate, MyDate endDate, long expectedResult) {
	
	this.startDate = startDate;
	this.endDate = endDate;
	this.expectedResult = expectedResult;
}

}
