package co.edu.poli.cloudapp.cloudapp.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.cloudapp.cloudapp.dto.EstudianteDTO;
import co.edu.poli.cloudapp.cloudapp.services.IEstudianteService;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudiantesRestController {
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<List<EstudianteDTO>> getAll() {
        return ResponseEntity.ok(estudianteService.findAll());
    }
    
}
