public class Calender {
    public static void main(String args[]) {
		int yearInput = Integer.parseInt(args[0]);
        
        int dayOfMonth = 1;   
	    int month = 1;
	    int year = 1900;
	    int dayOfWeek = 2;     
        int daysInMonth = 31;

        while (year < yearInput) {
            dayOfWeek++;
            dayOfMonth++;	

            daysInMonth = nDaysInMonth(month, year);

            if (dayOfWeek > 7) {
                dayOfWeek = 1;
            }

            if (dayOfMonth > daysInMonth) {
                if (month >= 12) {
                    month = 1;
                    year++;
                } else {
                    month++;
                }
                dayOfMonth = 1;
            }

        }

        while (yearInput != -1) {
            switch (dayOfWeek) {
                case 1:
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                    break;
            
                default:
                    System.out.println(dayOfMonth + "/" + month + "/" + year);
                    break;
                }

            dayOfWeek++;
            dayOfMonth++;	

            daysInMonth = nDaysInMonth(month, year);

            if (dayOfWeek > 7) {
                dayOfWeek = 1;
            }

           if (dayOfMonth > daysInMonth) {
                if (month >= 12) {
                    yearInput = -1;
                } else {
                    month++;
                }
                dayOfMonth = 1;
            }
        }

    }

    private static boolean isLeapYear(int year) {
	    boolean isLeap = false;

		if (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0))) {
			isLeap = true;
		}
		return isLeap;
	}
	 
	// Returns the number of days in the given month and year.
	private static int nDaysInMonth(int month, int year) {
		int days = 0;

		switch (month) {
			case 1:
				days = 31;
				break;
			case 2:
				if (isLeapYear(year)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			case 5:
				days = 31;
				break;
			case 6:
				days = 30;
				break;
			case 7:
				days = 31;
				break;
			case 8:
				days = 31;
				break;
			case 9:
				days = 30;
				break;
			case 10:
				days = 31;
				break;
			case 11:
				days = 30;
				break;
			case 12:
				days = 31;
				break;
		}
		return days;
	}
}
