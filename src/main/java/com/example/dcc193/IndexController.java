package com.example.dcc193;

import com.example.dcc193.model.Atividade;
import com.example.dcc193.model.Membro;
import com.example.dcc193.model.Sede;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController{

    @RequestMapping("index.html")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = { "adicionarSede"}, method = RequestMethod.GET)
    public ModelAndView adcionarSede() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("adicionarSede");
        return mv;
    }

    @RequestMapping(value = { "adicionarSede"}, method = RequestMethod.POST)
    public ModelAndView receberSede(Sede sede) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sedes", sede);
        mv.setViewName("index");
        return mv;
    }
    
    @RequestMapping(value = { "adicionarMembro"}, method = RequestMethod.GET)
    public ModelAndView adicionarMembro() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("adicionarMembro");
        return mv;
    }

    @RequestMapping(value = { "adicionarSede"}, method = RequestMethod.POST)
    public ModelAndView receberSede(Membro membro) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("membros", membro);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = { "adicionarAtividade"}, method = RequestMethod.GET)
    public ModelAndView adicionarAtividade(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("adicionarAtividade");
        return mv;
    }

    @RequestMapping(value = { "adicionarAtividade"}, method = RequestMethod.POST)
    public ModelAndView receberSede(Atividade atividade) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("atividades", atividade);
        mv.setViewName("index");
        return mv;
    }



    @RequestMapping("listarSedes.html")
    public ModelAndView resultado(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listarSedes");
        mv.addObject("sede", s);
        return mv;
    }

    @RequestMapping("listarMembros.html")
    public ModelAndView resultado(Membro m){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listarMembros");
        mv.addObject("membro", m);
        return mv;
    }

    @RequestMapping("listarAtividades.html")
    public ModelAndView resultado(Atividade a){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listarAtividades");
        mv.addObject("atividade", a);
        return mv;
    }
}