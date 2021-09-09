package Project05;

import Project04.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLLUME) {
			this.volume = RemoteControl.MAX_VOLLUME;
		}else if(volume<RemoteControl.MIN_VOLLUME) {
			this.volume = RemoteControl.MIN_VOLLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨" + this.volume);
	}
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}

}
