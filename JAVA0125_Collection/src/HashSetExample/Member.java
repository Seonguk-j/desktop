package HashSetExample;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;	//이름과 나이가 같다면 동일한 hashCode 값 리턴
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member)obj; 
			return target.name.equals(name) && (target.age == age);
		}
		else
			return false;
	}
}
