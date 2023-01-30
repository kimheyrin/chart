package com.machbase.chart.domain.Repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.machbase.chart.domain.Entity.TimeGragh;

public interface TimeGraghRepository extends JpaRepository<TimeGragh,Timestamp>{
    List<TimeGragh> findTop10By();
}