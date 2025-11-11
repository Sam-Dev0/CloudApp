package co.edu.poli.cloudapp.cloudapp.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstudianteDTO {
    private Long idEstudiante;
    private String nomEstudiante;
    private String apeEstudiante;
    private LocalDate fechaNacimiento;
    private String email;
}
