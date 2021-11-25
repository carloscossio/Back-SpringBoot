package com.misionTIC2022.grupo29.equipo8.cadena.tienda.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.misionTIC2022.grupo29.equipo8.cadena.tienda.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
	List<Usuario> findByUsername(String username);
	//List<Usuario> findByNombre_Completo(String nombre_completo);
	
	
}
