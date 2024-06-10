package com.cibertec.ExamLeonardoHuerto.rest;

import com.cibertec.ExamLeonardoHuerto.Profesor;
import com.cibertec.ExamLeonardoHuerto.IProfesorService;
import com.cibertec.ExamLeonardoHuerto.service.Impl.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfesorController {


    /*
     * Consultar => GET
     * Grabar => POST
     * Actualizar => PUT(*) / PATCH
     * Eliminar => DELETE
     * */
    IProfesorService iProfesorService;

    @Autowired
    public ProfesorController(IProfesorService iProfesorService) {
        this.iAProfesorService=iProfesorService;
    }

    //listar  animal
    @GetMapping("/listar")
    public List<Profesor> getAll() {return iProfesorService.Get();}

    @PostMapping("/guadar")
    public Profesor saveProfesor(@RequestBody Profesor entity) {
        return iProfesorService.Save(entity);
    }


    @GetMapping("/buscar/{id}")
    public Profesor getAll(@PathVariable int id) {
        return iProfesorService.FindProfesorById(id);
    }


    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Integer> updateProfesor(@PathVariable Integer id, @RequestBody Profesor profesor) {
        Integer updated = iProfesorService.update(id, profesor);
        if (updated == 1) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Integer> deleteProfesor(@PathVariable Integer id) {
        Integer deleted = iProfesorService.delete(id);
        if (deleted == 1) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }}