
public class Date {
private int day,year;
private int month;
 

public void display()
{
	System.out.println("Date is"+day+"/"+month+"/"+year);
}
public Date()
{
	day=2;
	month=8;
	year=2018;
}
public Date(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
	
	
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}


}
