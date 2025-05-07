package ch09.sec06.exam03;

import ch09.sec06.exam01.Button;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();

		class OkClickListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭");
			}
		}

		Button.ClickListener listener = new OkClickListener();
		listener.onClick();
	}
}