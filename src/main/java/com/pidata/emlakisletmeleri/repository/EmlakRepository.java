package com.pidata.emlakisletmeleri.repository;


import com.pidata.emlakisletmeleri.entity.Emlak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmlakRepository extends JpaRepository<Emlak,Integer>, EmlakRepositoryCustom{

}