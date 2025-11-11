package co.edu.poli.cloudapp.cloudapp.services;

import java.util.List;

import co.edu.poli.cloudapp.cloudapp.dto.EstudianteDTO;

public interface IEstudianteService     {
    EstudianteDTO create(EstudianteDTO estudianteDTO);
    EstudianteDTO update(Long id, EstudianteDTO estudianteDTO);
    void delete(Long id);
    EstudianteDTO findById(Long id);
    List<EstudianteDTO> finAll();
}
