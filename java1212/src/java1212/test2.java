package java1212;

import java.util.Scanner;

public class test2 {

	// 주차 시간이 주어지면 주차요금을 계산한다.
    // @입력 매개변수들:
    //	ptime - 주차시간
    // @반환 값: 주차요금
  			// 여기에 메소드를 삽입하세요

    public static void main(String[] args)
    {
      // 주차장에 들어온 시간, 나간 시간과  주차요금을 저장하는 변수들을 선언한다.
      double entrytime, leavetime, ptime;
  			// 여기에 코드를 삽입하세요

      // 반복문의 계속 수행 여부를 나타내는 변수를 선언한다
      String flag;

      // 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
      Scanner scan = new Scanner(System.in);

      // 사용자가 계속하기를 원하는 동안 주차장에 들어온 시간과  나간 시간을 입력받아
      // 주차요금을 계산한다.
      do {
    	  double cost;
    	  // 주차장에 들어온 시간과  나간 시간을 입력하라고 요청한다.
    	  System.out.print("들어온 시간을 입력하세요:\t");
    	  entrytime = scan.nextDouble();
    	  System.out.print("나간 시간을 입력하세요:\t");
    	  leavetime = scan.nextDouble();
  				// 여기에 코드를 삽입하세요
    	  // 주차요금을 계산하고 출력한다
    	  ptime = leavetime - entrytime;
    	  if(ptime <= 1) cost = 1000;
    	  else cost = 1000 + Math.ceil(ptime - 1.0) * 500;
    	  
    	  if(cost >= 10000) cost = 10000;
    	  // 여기에 코드를 삽입하세요

    	  System.out.println(cost);
    	  // 사용자가 계속하기를 원하는 지를 예(y) 혹은 아니오(n)로 입력하라고
    	  // 요청한다. 그리고 입력된 값을 읽는다.
    	  System.out.print("계속하시겠습니까? ");
    	  flag = scan.next();
  						// 여기에 코드를 삽입하세요
      } while (flag.equals("y"));
      scan.close();
   }

}
