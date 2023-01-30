package com.machbase.chart.domain.Entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.sql.Timestamp;

@Getter //lombok 기능, 필드 리턴
@Entity
@NoArgsConstructor //파라미터가 없는 생성자 생성
        (access = AccessLevel.PROTECTED) //접근 제한자 설정, 무분별 객체 생성 방지
@EntityListeners(AuditingEntityListener.class) //해당 클래스에 Auditing 기능을 포함
// Audit은 Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능
// Audit을 이용하면 자동으로 시간을 매핑하여 데이터베이스의 테이블에 넣어줌

public class TimeGragh {

    @Id //기본키 설정 ID 어노테이션만 사용하면 직저 할당
    @GeneratedValue(strategy= GenerationType.IDENTITY)//id 어노테이션과 같이 사용하여 기본키 자동할당
    //IDENTITY 전략을 사용해 기본키 생성을 데이터베이스에 위임
    private Timestamp dttm;

    private float value_01;
    private float value_02;
    private float value_03;
    private float value_04;
    private float value_05;
    private float value_06;
    private float value_07;
    private float value_08;
    private float value_09;
    private float value_10;
    private float value_11;
    private float value_12;


    @Builder //자동으로 해당 클래스에 빌더를 추가
    public TimeGragh(Timestamp dttm, float value_01, float value_02, float value_03, float value_04, float value_05, float value_06, float value_07, float value_08, float value_09, float value_10, float value_11, float value_12) {
        this.dttm = dttm;
        this.value_01 = value_01;
        this.value_02 = value_02;
        this.value_03 = value_03;
        this.value_04 = value_04;
        this.value_05 = value_05;
        this.value_06 = value_06;
        this.value_07 = value_07;
        this.value_08 = value_08;
        this.value_09 = value_09;
        this.value_10 = value_10;
        this.value_11 = value_11;
        this.value_12 = value_12;
    }

}