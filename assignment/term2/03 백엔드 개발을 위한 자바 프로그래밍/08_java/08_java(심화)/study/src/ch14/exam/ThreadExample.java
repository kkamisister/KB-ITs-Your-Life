package ch14.exam;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// MovieThread와 MusicRunnable을 동시에 운영하는 클래스
public class ThreadExample {
    public static void main(String[] args) {

        // 스레드풀로 두 개의 스레드 관리
        // executorService 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Runnable 형태로 MovieThread 역할 생성
        Runnable movieThread = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("동영상을 재생합니다.");
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                }
            }
        };

        // Runnable 형태로 MusicRunnable 역할 생성
        Runnable musicRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println("음악을 재생합니다.");
                    try { Thread.sleep(500); } catch (InterruptedException e) {}
                }
            }
        };

        // 두 가지 작업 제출
        executorService.submit(movieThread);
        executorService.submit(musicRunnable);

        // 작업 다 맡긴 후 종료
        executorService.shutdown();
    }
}

//        동영상을 재생합니다.
//        음악을 재생합니다.
//        음악을 재생합니다.
//        동영상을 재생합니다.
//        음악을 재생합니다.
//        음악을 재생합니다.
//        동영상을 재생합니다.
//        음악을 재생합니다.
//        음악을 재생합니다.