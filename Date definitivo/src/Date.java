public class Date {
	private int _day;
	private int _month;
	private int _year;
	public Date() {
		_day = 1;
		_month = 1;
		_year = 2018;
		    }
	
	 public int getDay(){
	        return _day;
	    }
	 
	 public Date(int day, int month, int year) {
	        _day=day;
	        _month=month;
	        _year=year;    
	    }

	    public int getMonth(){
	        return _month;
	    }

	    public int getYear(){
	        return _year;
	    }
	
	    public boolean isSameYear(Date date) {
	        boolean comp=true;
	        if (_year!=date.getYear()) comp=false;
	        return comp;
	        }
	    
	    public boolean isSameMonth(Date date) {
	        boolean comp=true;
	        if (_month!=date.getMonth()) comp=false;
	        return comp;
	        }
	    
	    public boolean isSameDay(Date date) {
	        boolean comp=true;
	        if (_day!=date.getDay()) comp=false;
	        return comp;
	        }
	    
	    public boolean isSame(Date date) {
	        boolean comp=true;
	        if (_year!=date.getYear() || _month!=date.getMonth() || _day!=date.getDay()) comp=false;
	        return comp;
	        }
	    
	    public boolean isSameYearextra(Date date) {
	        return _year==date.getYear();
	        }
	    
	    public boolean isSameMonthextra(Date date) {
	        return _month==date.getMonth();
	        }
	    
	    public boolean isSameDayextra(Date date) {
	        return _day==date.getDay();
	        }
	    
	    
}
