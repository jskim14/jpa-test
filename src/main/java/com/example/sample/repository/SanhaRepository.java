package com.example.sample.repository;

import com.example.sample.model.entity.Sanha;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface SanhaRepository extends CrudRepository<Sanha,Long> {
/*
    @Modifying
    @Transactional
    @Query(value = "update sanha_company s set s.san_empcnt=:#{sanha.empCnt}, s.san_location=:#{sanha.location} where s.san_id = :id")
    void update(@Param("sanha") Sanha sanha, @Param("id") Long param);

 */
}
