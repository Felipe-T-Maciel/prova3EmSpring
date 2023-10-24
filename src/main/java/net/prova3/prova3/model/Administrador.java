package net.prova3.prova3.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Administrador extends Usuario{
    @OneToMany
    List<Atendente> atendentes;
}
