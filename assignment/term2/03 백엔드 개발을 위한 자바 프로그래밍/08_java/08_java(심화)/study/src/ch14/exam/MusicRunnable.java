package ch14.exam;

// MusicRunnable 클래스 정의
public class MusicRunnable {
    public static void main(String[] args) {

        // Runnable 인터페이스 구현으로 thread 정의
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                // 6회 출력
                for (int i = 0; i < 6; i++) {
                    System.out.println("음악을 재생합니다.");

                    // 0.5초 간격으로 
                    try{Thread.sleep(500);} catch (InterruptedException e){}
                }
            }
        });

        // thread 실행
        thread.start();
    }
}
