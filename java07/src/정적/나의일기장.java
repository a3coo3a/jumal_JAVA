package 정적;

public class 나의일기장 {

	public static void main(String[] args) {
		Day	day1 = new Day("자바공부", 10, "강남");
		System.out.println(day1);
		System.out.println(Day.count + "일째");
		System.out.println(Day.sum + "시간");
		//System.out.println("평균시간: " + Day.sum/Day.count + "시간");
		Day.avg();
		
		Day	day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(Day.count + "일째");
		System.out.println(Day.sum + "시간");
		//System.out.println("평균시간: " + Day.sum/Day.count + "시간");
		Day.avg();
		
		Day	day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println(Day.count + "일째");
		System.out.println(Day.sum + "시간");
		//System.out.println("평균시간: " + Day.sum/Day.count + "시간");
		Day.avg();
	}

}
