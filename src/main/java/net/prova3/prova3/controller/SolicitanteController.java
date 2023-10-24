package net.prova3.prova3.controller;

import lombok.*;
import net.prova3.prova3.model.Ordem;
import net.prova3.prova3.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitante")
@AllArgsConstructor
public class SolicitanteController {

    UsuarioService usuarioService;

    @PostMapping("/criarNovaOrdem")
    public void criarOrdem(@RequestBody Ordem ordem){
        usuarioService.salvaOrdem(ordem);
    }

    @DeleteMapping("/deleteOrdem")
    public void deleteOrdem(@RequestParam Integer id){
        usuarioService.deleteOrdem(id);
    }

    @GetMapping("/verMinhasOrdens")
    public List<Ordem> verTodasOrdem(@RequestParam Integer id){
        return usuarioService.verTodasOrdens(id);
    }
}