import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import web.Cliente;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CreditoServlet")

public class CreditoServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            Cliente cliente = (Cliente) session.getAttribute("cliente");

            if (cliente == null) {
                response.sendRedirect("index.html");
                return;
            }

            double montoCredito = Double.parseDouble(request.getParameter("monto"));
            int plazo = Integer.parseInt(request.getParameter("plazo"));

            cliente.setMontoCredito(montoCredito);
            cliente.setPlazo(plazo);
            cliente.calcularInteresYPago();

            session.setAttribute("cliente", cliente);

            response.sendRedirect("resultado.jsp");
        }
    }
