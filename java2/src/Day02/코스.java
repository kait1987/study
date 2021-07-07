package Day02;

public class 코스 <매개클래스> {
	
	private String name;
	private 매개클래스[] 목록;
	
	public 코스 (String name, int 인원수) {
		this.name = name;
		목록 = (매개클래스[])new Object[인원수];
		//(자료형/클래스) 변수/객체 : 강제형변환
	}
	
	public void add(매개클래스 매개객체) {
		for(int i = 0 ; i<목록.length ; i++) {
				
		if(목록[i] == null) {
			목록[i] = 매개객체; break;
		 }
	  }	
	}
}
