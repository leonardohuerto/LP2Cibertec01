package com.cibertec.ExamLeonardoHuerto.repository;

import com.cibertec.ExamLeonardoHuerto.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
}
