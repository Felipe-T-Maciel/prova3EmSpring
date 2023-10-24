package net.prova3.prova3.controller;

import lombok.*;
import net.prova3.prova3.model.Ordem;
import net.prova3.prova3.model.Solicitante;
import net.prova3.prova3.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendente")
@AllArgsConstructor
public class AtendenteRepostiory {

    UsuarioService usuarioService;

    @PostMapping("/criarNovoSolicitante")
    public void criarAtendente(@RequestBody Solicitante solicitante){
        usuarioService.salva(solicitante);
    }

    @DeleteMapping("/deleteOrdem")
    public void deleteOrdem(@RequestParam Integer id){
        usuarioService.deleteOrdem(id);
    }

    @GetMapping("/verOrdens")
    public List<Ordem> verTodasOrdem(@RequestParam Integer id){
        return usuarioService.verTodasOrdens(id);
    }
}
