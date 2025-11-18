package co.edu.poli.cloudapp.cloudapp.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.poli.cloudapp.cloudapp.dto.EstudianteDTO;
import co.edu.poli.cloudapp.cloudapp.repositories.IEstudianteRepository;
import co.edu.poli.cloudapp.cloudapp.services.IEstudianteService;

@Service
@Transactional
public class EstudianteServicesImpl implements IEstudianteService {

    @Autowired
    private final  IEstudianteRepository repoEstudiante;
    
    private final  ModelMapper modelMapper;

    public EstudianteServicesImpl(IEstudianteRepository repository, ModelMapper modelMapper) {
        this.repoEstudiante = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public EstudianteDTO create(EstudianteDTO estudianteDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EstudianteDTO update(Long id, EstudianteDTO estudianteDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public EstudianteDTO findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<EstudianteDTO> findAll() {
       return repoEstudiante.findAll().stream()
       .map(e -> modelMapper.map(e, EstudianteDTO.class))
       .collect(Collectors.toList());
    }

}
