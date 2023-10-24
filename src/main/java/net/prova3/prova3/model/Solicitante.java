package net.prova3.prova3.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Solicitante extends Usuario{
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Ordem> ordens;
}
