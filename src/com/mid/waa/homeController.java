package com.mid.waa;

import com.mid.waa.domain.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@WebServlet(urlPatterns = {"/register"})
public class homeController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{

        String key= request.getParameter("key");
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        HttpSession session=request.getSession();
        Collection<Person> personlist=(Collection<Person>)session.getAttribute("personlist");
        if(personlist==null)
            personlist=new ArrayList<>();
        Person person=new Person(firstName,lastName,key);
        personlist.add(person);
        session.setAttribute("personlist",personlist);
        RequestDispatcher dispatcher= request.getRequestDispatcher("registerUI.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher= request.getRequestDispatcher("registerUI.jsp");
        dispatcher.forward(request, response);

    }
}
