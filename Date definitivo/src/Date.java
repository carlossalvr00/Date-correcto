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
	    
	    public void PrintMonthName() {
	        String monthname="";
	        switch (_month) {
	        case 1: monthname="January";
	        break;
	        case 2: monthname="February";
	        break;
	        case 3: monthname="March";
	        break;
	        case 4: monthname="April";
	        break;
	        case 5: monthname="May";
	        break;
	        case 6: monthname="June";
	        break;
	        case 7: monthname="July";
	        break;
	        case 8: monthname="August";
	        break;
	        case 9: monthname="September";
	        break;
	        case 10: monthname="October";
	        break;
	        case 11: monthname="November";
	        break;
	        case 12: monthname="December";
	        break;
	        default: System.out.println("Month out of bounds");
	        break;
	        }
	        System.out.println(monthname);
	        }
	    
	    public boolean CorrectMonth() {
	        boolean correctday=true;
	        if (_month==1 || _month==3 || _month==5 || _month==7 || _month==8 || _month==10 || _month==12) {
	            if (_day<1 || _day>31) correctday=false;
	        }
	        if (_month== 4|| _month== 6|| _month==9 || _month==11) {
	            if (_day<1 || _day>30) correctday=false;
	        }
	        if (_month==2) {
	        if (_day>28) correctday=false;
	        }
	        return correctday;
	        }
	    
	    public void PrintSeason() {
	        String seasoname="";
	        if (_month==1 || _month==2 || _month==12) seasoname="Winter";
	        if (_month==3 || _month==4 || _month==5) seasoname="Spring";
	        if (_month==6 || _month==7|| _month==8) seasoname="Summer";
	        if (_month==9 || _month==10|| _month==11) seasoname="Autumn";
	        System.out.println(seasoname);
	        }
	    
	    
}
