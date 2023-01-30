package com.machbase.chart.Dto;

import lombok.*;
import java.sql.Timestamp;

import com.machbase.chart.domain.Entity.TimeGragh;

//DTO(Data Transfer Object) 란 DB에서 데이터를 얻어 Service나 Controller 등으터 보낼 때 사용
@Getter //lombok 기능, 접근자 생성
@Setter //lombok 기능, 설정자 생성
@ToString // @toString 어노테이션을 이용하면 일일이 toString()메소드를 만들어줄 필요는 없음
// toString() 메소드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
@NoArgsConstructor //파라미터가 없는 생성자 생성
public class TimeGraghDto {
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


    public TimeGragh toEntity() {
        TimeGragh build = TimeGragh.builder()
                .dttm(dttm)
                .value_01(value_01)
                .value_02(value_02)
                .value_03(value_03)
                .value_04(value_04)
                .value_05(value_05)
                .value_06(value_06)
                .value_07(value_07)
                .value_08(value_08)
                .value_09(value_09)
                .value_10(value_10)
                .value_11(value_11)
                .value_12(value_12)
                .build();
        return build;
    }

    @Builder
    public TimeGraghDto(Timestamp dttm, float value_01, float value_02, float value_03, float value_04, float value_05, float value_06, float value_07, float value_08, float value_09, float value_10, float value_11, float value_12) {
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

