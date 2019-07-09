package com.udemy.cursomc.cursomc.repositories;

import com.udemy.cursomc.cursomc.domain.Categoria;
import com.udemy.cursomc.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
