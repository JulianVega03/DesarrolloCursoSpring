package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

	@RequestMapping({ "/index", "/", "", "home" }) // es igual a @GetMapping(), el value se puede omitir si solo es un
	public String index(Model model) {// ModelAndView, Model, ModelMap, Map<String,Object>
		model.addAttribute("titulo", textoIndex);
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("julian");
		usuario.setApellido("becerra");
		usuario.setEmail("julian@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> pasarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("andres", "becerra", "andres@gmail.com"),
				new Usuario("jhon", "cordero", "jhon@gmail.com"), new Usuario("camila", "fonseca", "camila@gmail.com"),
				new Usuario("nuevo", "neider", "safiro@gmail.com"));
		return usuarios;
	}

}
