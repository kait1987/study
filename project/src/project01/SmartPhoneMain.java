package project01;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("#데이터 2개를 입력합니다.");
		for(int i=0; i<2;i++) { // 숫자를 변경하면 데이터 저장이 더 가능함
			smartPhone.addContact(smartPhone.inputContactData());
		}
		
		while(true) {
			printMenu(); // 메뉴를 프린트 함
			String choiceMenu = scan.nextLine();
			
			if(choiceMenu.equals("1")) {
				smartPhone.addContact(smartPhone.inputContactData());
			}else if(choiceMenu.equals("2")) {
				smartPhone.printAllContact();
			}else if(choiceMenu.equals("3")) {
				System.out.println("검색하고자 하는 이름을 입력해 주세요");
				smartPhone.searchContact(scan.nextLine());
			}else if(choiceMenu.equals("4")) {
				System.out.println("삭제하고자 하는 이름을 입력해 주세요");
				smartPhone.deleteContact(scan.nextLine());
			}else if(choiceMenu.equals("5")) {
				System.out.println("검색하고자 하는 이름을 입력해주세요");
				String name = scan.nextLine();
				smartPhone.searchContact(name);
				System.out.println("데이터를 새로 입력해 주세요");
				smartPhone.editContact(name, smartPhone.inputContactData());
			}else if(choiceMenu.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 메뉴 입니다. 다시 선택해주세요");
			}
		}
	}

	private static void printMenu() {
		System.out.println("----------------------------------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("----------------------------------------------");
		
	}
}
