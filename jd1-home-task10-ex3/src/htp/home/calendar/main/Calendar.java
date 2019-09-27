package htp.home.calendar.main;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private List<Month> months;
		
	public Calendar() {
		months = new ArrayList<Month>();
	}

	public void addMonth(Month newMonth) {
		months.add(newMonth);
	}
		
	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}


	class Month {
		
		private String title;
		private List<Week> weeks;

		public Month(String title) {
			this.title = title;
			weeks = new ArrayList<Week>();
		}
		
		public void addWeek(Week newWeek) {
			weeks.add(newWeek);
		}

		public List<Week> getWeeks() {
			return weeks;
		}

		public void setWeeks(List<Week> weeks) {
			this.weeks = weeks;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
	}
	
	
	class Week {
		
		private List<Day> days;

		public Week() {
			days = new ArrayList<Day>();
		}

		public void addDay(Day newDay) {
			days.add(newDay);
		}
		
		public List<Day> getDays() {
			return days;
		}

		public void setDays(List<Day> days) {
			this.days = days;
		}
		
	}
	
	
	class Day {
		
		private int num;
		private DayOfWeek dayOfWeek;
		private boolean weekend;
		private boolean holiday;
		
		public Day(int num, DayOfWeek dayOfWeek, boolean weekend, boolean holiday) {			
			this.num = num;
			this.dayOfWeek = dayOfWeek;
			this.weekend = weekend;
			this.holiday = holiday;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public DayOfWeek getDayOfWeek() {
			return dayOfWeek;
		}

		public void setDayOfWeek(DayOfWeek dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
		}

		public boolean isWeekend() {
			return weekend;
		}

		public void setWeekend(boolean weekend) {
			this.weekend = weekend;
		}

		public boolean isHoliday() {
			return holiday;
		}

		public void setHoliday(boolean holiday) {
			this.holiday = holiday;
		}

		@Override
		public String toString() {
			return "Day: " + num + ", dayOfWeek: " + dayOfWeek + ", weekend: " + weekend + ", holiday: " + holiday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
			result = prime * result + (holiday ? 1231 : 1237);
			result = prime * result + num;
			result = prime * result + (weekend ? 1231 : 1237);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (dayOfWeek != other.dayOfWeek)
				return false;
			if (holiday != other.holiday)
				return false;
			if (num != other.num)
				return false;
			if (weekend != other.weekend)
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}
				
	}
	
}
