package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {

        // 작업1
        // 익명 객체로 스레드 생성
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++){
                    toolkit.beep();
                    try {Thread.sleep(500); } catch(Exception e){}
                }
            }
        };

        // 작업1 스레드 실행
        thread.start();

        // 작업2
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try {Thread.sleep(500); } catch(Exception e){}
        }
    }
}
