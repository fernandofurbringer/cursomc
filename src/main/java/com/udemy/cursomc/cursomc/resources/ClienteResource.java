package com.udemy.cursomc.cursomc.resources;

import com.udemy.cursomc.cursomc.domain.Categoria;
import com.udemy.cursomc.cursomc.domain.Cliente;
import com.udemy.cursomc.cursomc.services.CategoriaService;
import com.udemy.cursomc.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){

        Cliente obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }


}
