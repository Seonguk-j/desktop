package com.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import com.hankook.SnowTire;
import com.kumho.AllSeasonTire;

public class Car {
	//부품 필더 선언
	com.hankook.Tire tire1 = new com.hankook.Tire();
	com.kumho.Tire tire2 = new com.kumho.Tire();
	
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}
