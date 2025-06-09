package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component // 의존성 주입을 위한 어노테이션
public class Parrot {
    private String name;

    @PostConstruct  // 필드주입
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
