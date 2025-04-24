package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor      // 기본 생성자
@AllArgsConstructor     // 모든 필드 초기화
public class Member {
    private String id;
    private String name;
    private int age;
}
