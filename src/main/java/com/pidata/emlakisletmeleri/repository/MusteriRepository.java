package com.pidata.emlakisletmeleri.repository;


import com.pidata.emlakisletmeleri.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriRepository extends JpaRepository<Musteri,Integer>{

}