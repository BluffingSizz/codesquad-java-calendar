package hunux.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] max_date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return max_date[month-1];
	}
	
	public void printCalendar(int year,int month,String first) {
		if(year%4==0) {
			max_date[1] = 29;
		}
		int a =0;
		switch (first) {
		case "일" : a=0;
		break;
		case "월" : a=1;
		break;
		case "화" : a=2;
		break;
		case "수" : a=3;
		break;
		case "목" : a=4;
		break;
		case "금" : a=5;
		break;
		default : a=-1;
		break;
		}
		System.out.printf("   <<%4d년%3d월>> \n",year,month);
		 System.out.println(" SU MO TU WE TH FR SA");
		 System.out.println("---------------------");
		 if(a==0 || a==-1) {
		 }else {
			 for(int j=0; j<a; j++) {
				 System.out.print("   ");
			 }
		 }
		 for(int i=1; i<=maxDaysOfMonth(month); i++) {
			 System.out.printf("%3d",i);
			 if((i+a)%7 == 0) {
				 System.out.println();
			 }
		 }
	}
	
	
	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달을 출력하는 프로그램
		int year=2021;
		int month;
		String first;
		Scanner scan = new Scanner(System.in);
		System.out.println(java.util.Calendar.);
		Calendar cal = new Calendar();
		String prompt = "Cal> ";
		while(true) {
			System.out.println("년도를 입력하세요");
			System.out.print(prompt);
			year = scan.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print(prompt);
			month = scan.nextInt();
			System.out.println("1일의 요일을 입력하세요(월,화,수,목,금,일");
			System.out.print(prompt);
			first = scan.next();
			if(month ==-1) {
				break;
			}else if(month >12 || month<1){
				continue;
			}else {
			cal.printCalendar(year, month, first);
			System.out.println();
			}
		}
		
		
		System.out.println("bye~");
		scan.close();
		
	}
		
		
    }


//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
//int repeat=1;
/*int[] max_date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scan = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요");
		repeat=scan.nextInt();
		for(int i=0; i<repeat; i++) {
			System.out.println("달을 입력하세요");
			month=scan.nextInt();
			System.out.printf("%d월은 %d일 까지 있습니다 \n",month,cal.maxDaysOfMonth(month));
		}*/