import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		Account[] arr = new Account[100];
		
		while(num != 5) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			num = Integer.parseInt(scan.nextLine());
			
			switch(num) {
				case 1:
					String account;
					String name;
					int money;
					System.out.println("------");
					System.out.println("계좌생성");
					System.out.println("------");
					System.out.print("계좌번호 : ");
					account = scan.nextLine();
					System.out.print("계좌주 : ");
					name = scan.nextLine();
					System.out.print("초기입금액 : ");
					money = Integer.parseInt(scan.nextLine());
					System.out.println("결과 : 계좌가 생성되었습니다.");
					arr[cnt] = new Account(account, name, money);
					cnt++;
				break;
				case 2:
					System.out.println("------");
					System.out.println("계좌목록");
					System.out.println("------");
					for(int i = 0; i < cnt; i++) {
						System.out.println(arr[i].Account + "\t" + arr[i].Name + "\t" + arr[i].Money);
					}
				break;
				case 3:
					System.out.println("------");
					System.out.println("예금");
					System.out.println("------");
					System.out.print("계좌번호 : ");
					account = scan.nextLine();
					for(int i = 0; i < cnt; i++) {
						if(arr[i].Account.equals(account)) {
							System.out.print("예금액 : ");
							money = Integer.parseInt(scan.nextLine());
							arr[i].Money += money;
							break;
						}
					}
				break;
				case 4:
					System.out.println("------");
					System.out.println("출금");
					System.out.println("------");
					System.out.print("계좌번호 : ");
					account = scan.nextLine();
					for(int i = 0; i < cnt; i++) {
						if(arr[i].Account.equals(account)) {
							System.out.print("출금액 : ");
							money = Integer.parseInt(scan.nextLine());
							if(arr[i].Money - money >= 0) {
								arr[i].Money -= money;
								System.out.println("결과 : 출금이 성공되었습니다.");
							}
							else
								System.out.println("잔액이 부족합니다.(잔액 : " + arr[i].Money + "원)");
							break;
						}
					}
				break;
				case 5:
					System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		scan.close();
	}

}
