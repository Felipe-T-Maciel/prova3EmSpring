package net.prova3.prova3.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.prova3.prova3.model.*;
import net.prova3.prova3.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/administrador")
public class AdministradorController {

    public UsuarioService administradorService;

    @PostMapping("/criarNovoUsuario")
    public void criarAdmin(@RequestBody Administrador administrador){
        administradorService.salva(administrador);
    }

    @PostMapping("/criarNovoAtendente")
    public void criarAtendente(@RequestBody Atendente atendente){
        administradorService.salva(atendente);
    }

    @PostMapping("/criarNovoSolicitante")
    public void criarAtendente(@RequestBody Solicitante solicitante){
        administradorService.salva(solicitante);
    }

    @DeleteMapping("/deleteOrdem")
    public void deleteOrdem(@RequestParam Integer id){
        administradorService.deleteOrdem(id);
    }

    @DeleteMapping()
    public void delete(@RequestParam Integer id){
        administradorService.delete(id);
    }

    @GetMapping("/verOrdens")
    public List<Ordem> verTodasOrdem(){
        return administradorService.verTodasOrdens();
    }

    @GetMapping("/verAtendentes")
    public List<Usuario> verAtendente(){
        return administradorService.verAtendentes();
    }

    @GetMapping("/verSolicitantes")
    public List<Usuario> verSolicitante(){
        return administradorService.verSolicitante();
    }

    @GetMapping()
    public Usuario buscaPorId(@RequestParam Integer id){
        return administradorService.buscarUserId(id);
    }
}
