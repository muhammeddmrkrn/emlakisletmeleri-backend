package com.pidata.emlakisletmeleri.repository;


import com.pidata.emlakisletmeleri.entity.Isyeri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsyeriRepository extends JpaRepository<Isyeri,Integer>{

}