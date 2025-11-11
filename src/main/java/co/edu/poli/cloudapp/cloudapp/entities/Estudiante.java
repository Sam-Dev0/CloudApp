package co.edu.poli.cloudapp.cloudapp.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estudiantes")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    
    @Id
    @Column(name = "id_estudiante")
    private Long idEstduiante;

    @Column(name = "nom_estudiante", length = 80, nullable = false)
    private String nomEstudiante;

    @Column(name = "ape_estudiante", length = 80, nullable = false)
    private String apeEstudiante;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "email", length = 100, nullable = false)
    private String email;
}
