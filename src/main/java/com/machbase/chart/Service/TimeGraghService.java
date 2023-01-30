package com.machbase.chart.Service;

import com.machbase.chart.domain.Entity.TimeGragh;
import com.machbase.chart.domain.Repository.TimeGraghRepository;
import com.machbase.chart.Dto.TimeGraghDto;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.*;

@Service //핵심 비즈니스 로직을 담은 서비스 클래스를 빈으로 등록
public class TimeGraghService {
    private TimeGraghRepository TimegraghRepository;

    public TimeGraghService(TimeGraghRepository TimegraghRepository) {
        this.TimegraghRepository = TimegraghRepository;
    }



    @Transactional
    public List<TimeGraghDto> getGraghList() {
        List<TimeGragh> graghList = TimegraghRepository.findTop10By(); //데이터 dttm 역순으로 정렬
        List<TimeGraghDto> TimegraghDtoList = new ArrayList<>();

        System.out.println(TimegraghDtoList.getClass().getTypeName());

        for(TimeGragh gragh : graghList) {
            TimeGraghDto TimegraghDto = TimeGraghDto.builder()
                    .dttm(gragh.getDttm())
                    .value_01(gragh.getValue_01())
                    .value_02(gragh.getValue_02())
                    .value_03(gragh.getValue_03())
                    .value_04(gragh.getValue_04())
                    .value_05(gragh.getValue_05())
                    .value_06(gragh.getValue_06())
                    .value_07(gragh.getValue_07())
                    .value_08(gragh.getValue_08())
                    .value_09(gragh.getValue_09())
                    .value_10(gragh.getValue_10())
                    .value_11(gragh.getValue_11())
                    .value_12(gragh.getValue_12())
                    .build();
                    TimegraghDtoList.add(TimegraghDto);
        }
        return TimegraghDtoList;
    }
}