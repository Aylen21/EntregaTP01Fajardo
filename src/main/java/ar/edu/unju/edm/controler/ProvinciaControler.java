package ar.edu.unju.edm.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;
@Controller
public class ProvinciaControler {
	
	//Provincia unaProvincia = new Provincia();
	 @Autowired
	 Provincia unaProvincia;
	 @GetMapping({"/provincia"})
		public String cargarProvincia(Model model) {
			Provincia unaProvincia = new Provincia();
			unaProvincia.setNombreDeProvincia("Jujuy Argentina");
			model.addAttribute("aylen", unaProvincia);
			return "provincia";
		}
}
