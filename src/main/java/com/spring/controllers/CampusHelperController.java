package com.spring.controllers;

import com.spring.beans.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CampusHelperController {
    @Autowired
    UserBean dbbean;

    @RequestMapping(value = "/teachersPage", method = RequestMethod.GET)
    public ModelAndView teachersPage() {
        ModelAndView mw = new ModelAndView("CampusHelper/teachersPages/teachers_firstPage");
        return mw;
    }

    @RequestMapping(value = "/teachers_studentListPage", method = RequestMethod.GET)
    public ModelAndView teachersStudents() {
        ModelAndView mw = new ModelAndView("CampusHelper/teachersPages/teachers_studentlistPage");
        return mw;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public ModelAndView addStudent() {
        ModelAndView mw = new ModelAndView("CampusHelper/teachersPages/teachers_addStudentPage");
        return mw;
    }

    @RequestMapping(value = "/studentPage", method = RequestMethod.GET)
    public ModelAndView studentPage() {
        ModelAndView mw = new ModelAndView("CampusHelper/teachersPages/individual_StudentPage");
        return mw;
    }

    @RequestMapping(value = "/studentFirstPage", method = RequestMethod.GET)
    public ModelAndView studentFirstPage() {
        ModelAndView mw = new ModelAndView("CampusHelper/studentPages/studentFirstPage");
        return mw;
    }

    @RequestMapping(value = "/studentPracticePage", method = RequestMethod.GET)
    public ModelAndView studentPracticePage() {
        ModelAndView mw = new ModelAndView("CampusHelper/studentPages/PracticePage");
        return mw;
    }
    @RequestMapping(value = "/studentAddPracticePage", method = RequestMethod.GET)
    public ModelAndView studentAddPracticePage() {
        ModelAndView mw = new ModelAndView("CampusHelper/studentPages/add_Practice");
        return mw;
    }


    @RequestMapping(value = "/add_real_practice", method = RequestMethod.GET)
    public ModelAndView add_practice(
            @RequestParam(name = "name_of_practice") String name_of_practice,
            @RequestParam (name = "boss") String boss,
            @RequestParam (name = "location_of_practice") String location_of_practice,
            @RequestParam(name = "date") String str_date
    ) throws ParseException {

        System.out.println("KUKKKKKAAAAA");
        Date date1=new SimpleDateFormat("dd-mm-yyyy").parse(str_date);

        System.out.println(name_of_practice+" "+boss+" "+location_of_practice+" "+date1.toString());


        ModelAndView mw = new ModelAndView("CampusHelper/studentPages/studentFirstPage");
        return mw;
    }




}
