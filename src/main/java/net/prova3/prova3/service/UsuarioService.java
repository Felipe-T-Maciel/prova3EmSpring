package net.prova3.prova3.service;

import lombok.AllArgsConstructor;
import net.prova3.prova3.model.*;
import net.prova3.prova3.repository.OrdemRepository;
import net.prova3.prova3.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private OrdemRepository ordemRepository;

    public void salva(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void salvaOrdem(Ordem ordem) {
        ordemRepository.save(ordem);
    }

    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Ordem> verTodasOrdens(Integer id) {
        List<Ordem> ordens = new LinkedList<>();
        for (Ordem ordem:
                ordemRepository.findAll()) {
            if(ordem.getAtendente().getId().equals(id)){
                ordens.add(ordem);
            }
        }
        return ordens;
    }

    public List<Ordem> verTodasOrdens() {
        return ordemRepository.findAll();
    }

    public List<Usuario> verTodos() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> verAtendentes() {
        List<Usuario> atendentes = new LinkedList<>();
        for (Usuario atendente:
                usuarioRepository.findAll()) {
            if(atendente instanceof Atendente){
                atendentes.add(atendente);
            }
        }
        return atendentes;
    }

    public List<Usuario> verSolicitante() {
        List<Usuario> solicitantes = new LinkedList<>();
        for (Usuario solicitante:
                usuarioRepository.findAll()) {
            if(solicitante instanceof Solicitante){
                solicitantes.add(solicitante);
            }
        }
        return solicitantes;
    }

    public Usuario buscarUserId(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public void deleteOrdem(Integer id) {
        ordemRepository.deleteById(id);
    }
}
