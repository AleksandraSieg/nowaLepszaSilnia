package pl.madison.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.madison.domain.Liczba;

import java.util.Map;

@Controller
public class TestController {

//    @RequestMapping(value = "/silnia/{liczba}")
//    public String silnia(@PathVariable("liczba") int liczba){
//
//        int mnozenie = 1;
//        for(int i = 1; i<=liczba; i++){
//            mnozenie = mnozenie*i;
//        }
//
//        return "silnia: " + mnozenie;
//    }

    @RequestMapping(value = "/uzupelnijLiczbe")
    public String uzupelnijLiczbe(Map<String, Object> model){
        model.put("uzupelnij", new Liczba());
        return "uzupelnijLiczbe";
    }

    @RequestMapping(value = "/silnia", method = RequestMethod.POST)
    public String silnia(Liczba liczba, Map<String, Object> model){
        int mnozenie = 1;
        for(int i = 1; i<=liczba.getLiczba(); i++){
            mnozenie = mnozenie*i;
        }

        model.put("robSilnie", mnozenie);
        return "silnia";
    }
}
