package aplica.upn.edu.app.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aplica.upn.edu.app.model.Pelicula;

@Controller
public class HomeController {
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String irHome() {
		return "home";
	}
	
//	@RequestMapping(value="/",method = RequestMethod.GET)
//	public String mostrarPrincipal(Model model) {
//		List<String> peliculas = new LinkedList<>();
//		peliculas.add("A");
//		peliculas.add("B");
//		peliculas.add("C");
//		
//		model.addAttribute("Vpeliculas",peliculas);
//		return "home";
//	}
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		List<Pelicula> peliculas = getLista();
		
		
		model.addAttribute("Vpeliculas",peliculas);
		return "home";
	}
	
	private List<Pelicula> getLista() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		try {
			lista = new LinkedList<>();
			Pelicula p =  new Pelicula();
			p.setId(1);	p.setTitulo("ABC");p.setDuracion(135); p.setClasificacion("A");p.setGenero("Horror");p.setFechaEstreno(formatter.parse("02-05-2018"));
			p.setImagen("cinema.png"); p.setEstatus("Activa");
			
			Pelicula p2 =  new Pelicula();
			p2.setId(2);	p2.setTitulo("XYZ");p2.setDuracion(128); p2.setClasificacion("B");p2.setGenero("Miedo");p2.setFechaEstreno(formatter.parse("12-06-2018"));
			p2.setImagen("cineasdaa.png"); p2.setEstatus("Activa");
			
			lista.add(p); lista.add(p2);
			
			return lista;
		}
		catch (Exception ex) {
			return null;
		}
	}

	@RequestMapping(value="/detail")
	public String mostrarDetalle (Model model) {
		
		String tituloPelicula = "RAPIDOS Y FURIOSOS";
		int duracion = 136;
		double precio = 50;
		
		model.addAttribute("titulo",tituloPelicula);
		model.addAttribute("duracion",duracion);
		model.addAttribute("precio",precio);
		
		return "detalle";
	}
}
