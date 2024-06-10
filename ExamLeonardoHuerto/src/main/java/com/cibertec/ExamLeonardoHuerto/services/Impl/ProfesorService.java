package com.cibertec.ExamLeonardoHuerto.services.Impl;

import com.cibertec.ExamLeonardoHuerto.model.Profesor;
import com.cibertec.ExamLeonardoHuerto.repository.ProfesorRepository;
import com.cibertec.ExamLeonardoHuerto.services.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService implements IProfesorService {

    ProfesorRepository _profesorRepository;

    @Autowired
    public ProfesorService(ProfesorRepository profesorRepository) {
        _profesorRepository = profesorRepository;
    }

    //get
    @Override
    public List<Profesor> Get() {
        return _profesorRepository.findAll();
    }

    @Override
    public Profesor FindProfesorById(Integer id) {
        Optional<Profesor> profesor = _profesorRepository.findById(id);
        if (profesor.isPresent())
            return profesor.get();
        else
            return new Profesor();
    }

    //post
    @Override
    public Profesor Save(Profesor entity) {
        Profesor guardarProfesor = _profesorRepository.save(entity);
        return guardarProfesor;
    }

    @Override
    public Integer update(Integer id, Profesor profesor) {
        Optional<Profesor> existingProfesor = _profesorRepository.findById(id);
        if (existingProfesor.isPresent()) {
            Profesor profesorToUpdate = existingProfesor.get();
            profesorToUpdate.setName(profesor.getName());
            profesorToUpdate.setEdad(profesor.getEdad());
            profesorToUpdate.setCurso(profesor.getCurso());
            _profesorRepository.save(profesorToUpdate);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Integer delete(Integer id) {
        Optional<Profesor> optionalProfesor = _profesorRepository.findById(id);

        if (optionalProfesor.isPresent()) {
            _profesorRepository.deleteById(id);
            return 1;
        } else {
            return 0;
        }
    }
}

