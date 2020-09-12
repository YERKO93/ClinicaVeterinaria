package com.Testjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.dao.UsuarioDao;
import com.dao.UsuarioDao;
import com.dto.UsuarioDto;

public class TestConexion {
	@Test
	public void testConexion() {
		System.out.println("Test de conexion a DB Banco | MySQL localhost");
		try {
			UsuarioDao user = new UsuarioDao();
			UsuarioDto validate = user.validate("user", "password");
			UsuarioDto usr = validate;
			assertEquals(usr.getNombreUsuario(), "user", "user");
			System.out.println("Conexion a DB satisfactoria");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
			System.out.println("Conexion a DB erronea");
		}
	}
}
