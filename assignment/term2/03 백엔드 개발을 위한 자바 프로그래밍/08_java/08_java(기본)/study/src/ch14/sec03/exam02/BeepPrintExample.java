package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {

        // 작업1
        // 0.5초 간격으로 비프음 출력
        Thread thread = new Thread(new Runnable() { // Runnble 인터페이스
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++){
                    toolkit.beep();
                    try{ Thread.sleep(500); } catch(Exception e){}
                }
            }
        });

        thread.start();

        // 작업2
        // Main thread에서 실행 : 0.5초 간격으로 '띵' 출력
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try { Thread.sleep(500); } catch(Exception e){}
        }
    }
}
