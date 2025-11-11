package ro.emanuel;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello", method = RequestMethod.GET)
	public ModelAndView getIndex() {

		
		ModelMap model = new ModelMap();
		model.put("name", "Mircea");
		model.put("time", (new Date()).toString());

		return new ModelAndView("hello", "model", model);
	}

	
	@GetMapping("/parimpar.html")
	public ModelAndView parImpar(int numar) {
	    ModelMap map = new ModelMap();

	    String mesaj;
	    if (numar % 2 == 0) {
	        mesaj = "Numărul " + numar + " este par.";
	    } else {
	        mesaj = "Numărul " + numar + " este impar.";
	    }

	    map.put("mesaj", mesaj);

	    return new ModelAndView("parimpar", map);
	}

	@GetMapping("/invers.html")
	public ModelAndView invers(String text) {
	    ModelMap map = new ModelMap();

	    String invers = new StringBuilder(text).reverse().toString();
	    map.put("mesaj", invers);

	    return new ModelAndView("invers", map);
	}
	s
	@GetMapping("/mate.html")
	public ModelAndView mate(int a, int b, String operatie) {
	    ModelMap map = new ModelMap();
	    String mesaj;

	    switch (operatie) {
	        case "adunare":
	            mesaj = "Suma este " + (a + b) + ".";
	            break;
	        case "scadere":
	            mesaj = "Diferența este " + (a - b) + ".";
	            break;
	        case "inmultire":
	            mesaj = "Produsul este " + (a * b) + ".";
	            break;
	        case "impartire":
	            if (b != 0)
	                mesaj = "Catul este " + ((double) a / b) + ".";
	            else
	                mesaj = "Nu se poate împărți la zero!";
	            break;
	        default:
	            mesaj = "Operație necunoscută! Folosește: adunare, scadere, inmultire, impartire.";
	    }

	    map.put("mesaj", mesaj);
	    return new ModelAndView("mate", map);
	}

	
}
