package com.m5b.examenfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenfinalApplication.class, args);
	}

        /*
 
package com.tendencias.evaluacion3M5B.controller;

import com.tendencias.evaluacion3M5B.service.ProfesorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tendencias.evaluacion3M5B.model.Profesor;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {

    @Autowired
    ProfesorServiceImpl profesorService;

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProfesors() {
        return new ResponseEntity<>(profesorService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProfesor(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profesorService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProfesor(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor personaENcontrada = profesorService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setDireccion(p.getDireccion());
                personaENcontrada.setTelefono(p.getTelefono());

                return new ResponseEntity<>(profesorService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProfesor(@PathVariable Long id) {
        profesorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

        
        
        /*
 
package com.tendencias.evaluacion3M5B.service;

import java.io.Serializable;
import java.util.List;


public interface GenericService <T, ID extends Serializable>{

    public T save(T entity);

    public T findById(ID id);

    public List<T> findByAll();

    public void delete(ID id);
}

   generic serviceimpl
package com.tendencias.evaluacion3M5B.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

    public abstract CrudRepository<T, ID> getDao();
    
    @Override
    public T save(T Entity) {
        return getDao().save(Entity);
    }

    @Override
    public T findById(ID id) {
        Optional<T> obj = getDao().findById(id);
        if (obj.isPresent()) {
            return obj.get();
        }
        return null;
    }

    @Override
    public List<T> findByAll() {
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(obj -> list.add(obj));
        return list;
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }

  
}

        */
        
}
