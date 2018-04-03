package com.mid.waa;

import com.mid.waa.domain.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("calculator.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstNumber=Integer.parseInt(req.getParameter("firstNumber"));
        int secondNumber=Integer.parseInt(req.getParameter("secondNumber"));
        String operator=req.getParameter("operator");
        HttpSession session=req.getSession();
        List<String > history=(List<String>)session.getAttribute("historys");


        if(history==null)
            history=new ArrayList<>();
        Calculator calculator= new Calculator();
        int result=calculator.calculate(operator,firstNumber,secondNumber);
        history.add(firstNumber +" " +operator +" " +secondNumber+" = "+ result);
        req.setAttribute("results",result);
        session.setAttribute("historys",history);
        RequestDispatcher dispatcher = req.getRequestDispatcher("calculator.jsp");
        dispatcher.forward(req, resp);
    }

}


