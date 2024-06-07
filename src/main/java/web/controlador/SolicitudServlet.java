package web.controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import web.modelo.Cliente;

import java.io.IOException;


@WebServlet("/SolicitudServlet")
public class SolicitudServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String sexo = request.getParameter("sexo");
        int edad = Integer.parseInt(request.getParameter("edad"));
        double sueldo = Double.parseDouble(request.getParameter("sueldo"));

        if (sueldo <= 700) {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setSexo(sexo);
        cliente.setEdad(edad);
        cliente.setSueldo(sueldo);

        HttpSession session = request.getSession();
        session.setAttribute("cliente", cliente);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
