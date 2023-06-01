package com.example.ex00.dependency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
//@AllArgsConstructor //전체 필드 초기화
@RequiredArgsConstructor // @NonNull, final만 초기회
//@NoArgsConstructor 기본생성자
public class Coding {
//  필드주입

    @Autowired
    private Computer computer;


//  생선자 주입
//  순환참조시 컴파일러 인지 가능, 오류 가능
//  메모리에 할당하면서 초기값으로 주입되므로 초기값에 문제 발생 시 할당도 되지 않기 때문이다.
//
//    private   Computer computer;

//    public Coding(Computer computer) {
//        this.computer = computer;
//    }
}
