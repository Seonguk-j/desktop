package java1213;

public class Employee {
	public String name;	// 이름
	public int number, age;	 // 직원의 번호와 나이

    // -------------------------------------------------------
    //  새로운 Employee 객체를 생성한다.
    // -------------------------------------------------------
	public Employee()
	{
		
	}
	
	public String getName()	{return name;}		// 접근자 메소드 - 이름을 반환한다
	
	public int getNumber() {return number;}		// 접근자 메소드 - 번호을 반환한다

	public int getAge() {return age;}			// 접근자 메소드 - 나이를 반환한다
    
    public String toString ()					//  현 Employee 객체의 정보에 대한 문자열을 반환한다.
    {
    	String str;
    	str = "이름: " + getName() + "\n";
    	str += "번호: " + getNumber() + "\n";
    	str += "나이: " + getAge();
    	return str;
    }
	
	public void setName(String Name) {name = Name;}			// 변경자 메소드 - 이름을 주어진 값으로 변경한다

	public void setNumber(int Number) {number = Number;}	// 변경자 메소드 - 번호을 주어진 값으로 변경한다

	public void setAge(int Age)	{age = Age;}				// 변경자 메소드 - 나이를 주어진 값으로 변경한다
}
