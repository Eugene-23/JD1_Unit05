package htp.home.calendar.main;

import htp.home.calendar.main.Calendar.Day;
import htp.home.calendar.main.Calendar.Month;
import htp.home.calendar.main.Calendar.Week;

/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */

public class Main {

	public static void main(String[] args) {
		
		Calendar cl = new Calendar();
						
		Week w1 = cl.new Week();
		w1.addDay(cl.new Day(1, DayOfWeek.MONDAY, false, true));
		w1.addDay(cl.new Day(2, DayOfWeek.TUESDAY, false, false));
		w1.addDay(cl.new Day(3, DayOfWeek.WEDNESDAY, false, false));
		w1.addDay(cl.new Day(4, DayOfWeek.THURSDAY, false, false));
		w1.addDay(cl.new Day(5, DayOfWeek.FRIDAY, false, false));
		w1.addDay(cl.new Day(6, DayOfWeek.SATURDAY, true, false));
		w1.addDay(cl.new Day(7, DayOfWeek.SUNDAY, true, true));
		
		Week w2 = cl.new Week();
		w2.addDay(cl.new Day(8, DayOfWeek.MONDAY, false, false));
		w2.addDay(cl.new Day(9, DayOfWeek.TUESDAY, false, false));
		w2.addDay(cl.new Day(10, DayOfWeek.WEDNESDAY, false, false));
		w2.addDay(cl.new Day(11, DayOfWeek.THURSDAY, false, false));
		w2.addDay(cl.new Day(12, DayOfWeek.FRIDAY, false, false));
		w2.addDay(cl.new Day(13, DayOfWeek.SATURDAY, true, true));
		w2.addDay(cl.new Day(14, DayOfWeek.SUNDAY, true, false));
		
		Week w3 = cl.new Week();
		w3.addDay(cl.new Day(15, DayOfWeek.MONDAY, false, false));
		w3.addDay(cl.new Day(16, DayOfWeek.TUESDAY, false, false));
		w3.addDay(cl.new Day(17, DayOfWeek.WEDNESDAY, false, false));
		w3.addDay(cl.new Day(18, DayOfWeek.THURSDAY, false, false));
		w3.addDay(cl.new Day(19, DayOfWeek.FRIDAY, false, false));
		w3.addDay(cl.new Day(20, DayOfWeek.SATURDAY, true, false));
		w3.addDay(cl.new Day(21, DayOfWeek.SUNDAY, true, false));
		
		Week w4 = cl.new Week();
		w4.addDay(cl.new Day(22, DayOfWeek.MONDAY, false, false));
		w4.addDay(cl.new Day(23, DayOfWeek.TUESDAY, false, true));
		w4.addDay(cl.new Day(24, DayOfWeek.WEDNESDAY, false, false));
		w4.addDay(cl.new Day(25, DayOfWeek.THURSDAY, false, false));
		w4.addDay(cl.new Day(26, DayOfWeek.FRIDAY, false, false));
		w4.addDay(cl.new Day(27, DayOfWeek.SATURDAY, true, false));
		w4.addDay(cl.new Day(28, DayOfWeek.SUNDAY, true, false));
		
		Week w5_1 = cl.new Week();
		w5_1.addDay(cl.new Day(29, DayOfWeek.MONDAY, false, false));
		w5_1.addDay(cl.new Day(30, DayOfWeek.TUESDAY, false, false));
		w5_1.addDay(cl.new Day(31, DayOfWeek.WEDNESDAY, false, false));

		Month m1 = cl.new Month("January");		
		m1.addWeek(w1);
		m1.addWeek(w2);
		m1.addWeek(w3);
		m1.addWeek(w4);
		m1.addWeek(w5_1);
		
		Week w5_2 = cl.new Week();		
		w5_2.addDay(cl.new Day(1, DayOfWeek.THURSDAY, false, false));
		w5_2.addDay(cl.new Day(2, DayOfWeek.FRIDAY, false, false));
		w5_2.addDay(cl.new Day(3, DayOfWeek.SATURDAY, true, false));
		w5_2.addDay(cl.new Day(4, DayOfWeek.SUNDAY, true, true));
		
		Week w6 = cl.new Week();
		w6.addDay(cl.new Day(5, DayOfWeek.MONDAY, false, false));
		w6.addDay(cl.new Day(6, DayOfWeek.TUESDAY, false, false));
		w6.addDay(cl.new Day(7, DayOfWeek.WEDNESDAY, false, false));
		w6.addDay(cl.new Day(8, DayOfWeek.THURSDAY, false, false));
		w6.addDay(cl.new Day(9, DayOfWeek.FRIDAY, false, false));
		w6.addDay(cl.new Day(10, DayOfWeek.SATURDAY, true, true));
		w6.addDay(cl.new Day(11, DayOfWeek.SUNDAY, true, false));
		
		Week w7 = cl.new Week();
		w7.addDay(cl.new Day(12, DayOfWeek.MONDAY, false, false));
		w7.addDay(cl.new Day(13, DayOfWeek.TUESDAY, false, false));
		w7.addDay(cl.new Day(14, DayOfWeek.WEDNESDAY, false, false));
		w7.addDay(cl.new Day(15, DayOfWeek.THURSDAY, false, false));
		w7.addDay(cl.new Day(16, DayOfWeek.FRIDAY, false, false));
		w7.addDay(cl.new Day(17, DayOfWeek.SATURDAY, true, false));
		w7.addDay(cl.new Day(18, DayOfWeek.SUNDAY, true, false));
		
		Week w8 = cl.new Week();
		w8.addDay(cl.new Day(19, DayOfWeek.MONDAY, false, false));
		w8.addDay(cl.new Day(20, DayOfWeek.TUESDAY, false, true));
		w8.addDay(cl.new Day(21, DayOfWeek.WEDNESDAY, false, false));
		w8.addDay(cl.new Day(22, DayOfWeek.THURSDAY, false, false));
		w8.addDay(cl.new Day(23, DayOfWeek.FRIDAY, false, false));
		w8.addDay(cl.new Day(24, DayOfWeek.SATURDAY, true, false));
		w8.addDay(cl.new Day(25, DayOfWeek.SUNDAY, true, false));
		
		Week w9_1 = cl.new Week();
		w9_1.addDay(cl.new Day(26, DayOfWeek.MONDAY, false, false));
		w9_1.addDay(cl.new Day(27, DayOfWeek.TUESDAY, false, true));
		w9_1.addDay(cl.new Day(28, DayOfWeek.WEDNESDAY, false, false));
		
		Month m2 = cl.new Month("February");
		m2.addWeek(w5_2);
		m2.addWeek(w6);
		m2.addWeek(w7);
		m2.addWeek(w8);
		m2.addWeek(w9_1);
		
		cl.addMonth(m1);
		cl.addMonth(m2);
		
		printCalendar(cl);
	}
	
	public static void printCalendar(Calendar cl) {
		for(Month m : cl.getMonths()) {
			System.out.println(m.getTitle() + ":");
			for(Week w : m.getWeeks()) {
				for(Day d : w.getDays()) {
					System.out.println(d.toString());
				}
			}
		}
	}

}
