package com.cibertec.ExamLeonardoHuerto.services;

import com.cibertec.ExamLeonardoHuerto.model.Profesor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProfesorService {
    //listar
    List<Profesor> Get();
    Profesor FindProfesorById(Integer id);
    //guardar
    Profesor Save(Profesor entity);
    //actualizar por id
    Integer update(Integer id, Profesor profesor);
    //eliminar
    Integer delete(Integer id);
}
