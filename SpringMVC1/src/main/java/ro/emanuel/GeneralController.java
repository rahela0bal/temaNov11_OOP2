package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeneralController {

	@GetMapping("/bla.html")
	public ModelAndView abc() {
		String brand = "adidas";
		String price = "12";
		ModelMap x=new ModelMap();
		x.put("bv", brand);
		x.put("pv", price);
		return new ModelAndView("bla",x);
	}
	@GetMapping("/concat.html")
	public ModelAndView d(String f, String s) {
		
		ModelMap map=new ModelMap();
		map.put("first", f);
		map.put("second", s);
		map.put("impreuna", f+s);
		
	return new ModelAndView("concat",map);
		
	}
	@GetMapping("/salut.html")
	public ModelAndView e1(String nume) {
	    ModelMap map = new ModelMap();
	    String mesaj = "Salut, " + nume + "! Bine ai venit!";
	    map.put("mesaj", mesaj);
	    return new ModelAndView("salut", map);
	}

	
}
