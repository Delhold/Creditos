import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import web.Cliente;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/SolicitudServlet")
public class SolicitudServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String sexo = request.getParameter("sexo");
        int edad = Integer.parseInt(request.getParameter("edad"));
        double sueldo = Double.parseDouble(request.getParameter("sueldo"));

        if (sueldo <= 700) {
            response.sendRedirect("solicitud.jsp");
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setSexo(sexo);
        cliente.setEdad(edad);
        cliente.setSueldo(sueldo);

        HttpSession session = request.getSession();
        session.setAttribute("cliente", cliente);

        response.sendRedirect("credito.jsp");
    }
}
