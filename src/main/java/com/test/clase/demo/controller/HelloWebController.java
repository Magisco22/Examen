package com.test.clase.demo.controller;


import com.test.clase.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dice")
public class HelloWebController {


    @GetMapping(value = "/Datos")
    public String helloWorldW(Model model){

        model.addAttribute("people",getPeople());
        model.addAttribute( "ejemplo","Soy un ejemplo");
        //model.addAttribute( "ejemplo2",new Date());
        model.addAttribute( "form",  "dasd");


        return "index";
    }
    @GetMapping(value = "/helloMAV")
    public ModelAndView exampleMAV(){

        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("people",getPeople());
        return modelAndView;
    }


    private List<Person> getPeople(){

        List<Person> people =new ArrayList<>();
        people.add(new Person("Dr. Jaime Camil",23));
        people.add(new Person("Dr. Esteban Quito",23));
        people.add(new Person("Dr. Juan Rito",23));
        people.add(new Person("Dr. Omar Sosa",23));

        return people;
    }
}
