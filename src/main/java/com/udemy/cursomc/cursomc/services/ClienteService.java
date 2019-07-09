package com.udemy.cursomc.cursomc.services;

import com.udemy.cursomc.cursomc.domain.Cliente;
import com.udemy.cursomc.cursomc.domain.Cliente;
import com.udemy.cursomc.cursomc.repositories.CategoriaRepository;
import com.udemy.cursomc.cursomc.repositories.ClienteRepository;
import com.udemy.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
