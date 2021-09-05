package new1;

public class ContactMain {
	public static void main(String[] args) {
		

		
	Contact contact = new Contact();
	
	System.out.println("이름 :" + contact.name);
	System.out.println("전화번호 :" + contact.number);
	System.out.println("이메일 :" + contact.email);
	System.out.println("주소 :"+ contact.address);
	System.out.println("그룹 :" + contact.group);
		
	
//	필드값 변경
//	친구 > 가족
		
	contact.group = "가족";
	System.out.println("수정된 그룹 :" + contact.group);
	}

}
