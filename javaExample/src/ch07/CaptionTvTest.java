package ch07;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel=10;
		ctv.channelUp();
		System.out.println("현재 channel 번호는 " + ctv.channel);
		ctv.displayCaption("Hello World1");
		ctv.caption=true;
		ctv.displayCaption("Hello World2");

	}

}
