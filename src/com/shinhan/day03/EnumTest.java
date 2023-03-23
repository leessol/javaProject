package com.shinhan.day03;

public class EnumTest {
	//상수: 고정값 (변경 불가능)
	static final double PI = 3.141592;
	static final int MONDAY = 1;
	static final int SUNDAY = 2;
	static final int SUCCESS = 2;
	
	public static void main(String[] args) {
		f3(LoginEnum.FAIL);
	}

	private static void f3(LoginEnum fail) {
		WeekEnum[] weeks=WeekEnum.values();
		for(WeekEnum week: weeks) {
			System.out.println(week.ordinal() + "=>" + week.name());
			String weekName = f4(week);
			System.out.println(weekName);
			System.out.println("----------------");
			String weekName5 = f5(week);
			System.out.println("55"+weekName5);
		}
		
	}

	private static String f5(WeekEnum week) {
		String result = null;
		switch (week) {
//		case MONDAY:result = "월요일";break;
//		case THURSDAY:result = "월요일";break;
//		case MONDAY:result = "월요일";break;
//		case MONDAY:result = "월요일";break;
//		case MONDAY:result = "월요일";break;
//		case MONDAY:result = "월요일";break;
//		case MONDAY:result = "월요일";break;
//		
		}
		return null;
	}

	private static String f4(WeekEnum week) {
		String result = null;
		if (week == WeekEnum.MONDAY) {
			result = "월요일";
		} else if (week == WeekEnum.TUESDAY) {
			result = "화요일";
		
		} else if(week == WeekEnum.WEDNESDAY) {
			result = "수요일";
		
		} else if(week == WeekEnum.THURSDAY) {
			result = "목요일";
		
		} else if(week == WeekEnum.FRIDAY) {
			result = "금요일";
		
		} else if(week == WeekEnum.SATURDAY) {
			result = "토요일";
		
		} else if(week == WeekEnum.SUNDAY) {
			result = "일요일";
			
		}
		return result;
		
	}

	private static void f2(LoginEnum login) {
		System.out.println(login == LoginEnum.SUCCESS);
		System.out.println(login == LoginEnum.FAIL);
		
	}

	private static void f1() {
		System.out.println(PI);
		int input = 2;
		System.out.println(input == 2);
	}

}
