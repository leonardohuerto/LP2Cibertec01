package com.cibertec.ExamenLeonardoHuerto.Repository;

import com.cibertec.ExamenLeonardoHuerto.Model.Pro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProRepository extends JpaRepository<Pro, Integer> {
}