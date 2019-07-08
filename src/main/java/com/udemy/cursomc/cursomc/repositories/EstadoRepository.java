package com.udemy.cursomc.cursomc.repositories;

import com.udemy.cursomc.cursomc.domain.Cidade;
import com.udemy.cursomc.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
