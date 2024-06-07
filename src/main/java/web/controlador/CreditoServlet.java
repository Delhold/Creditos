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

@WebServlet("/CreditoServlet")

public class CreditoServlet extends HttpServlet {
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            Cliente cliente = (Cliente) session.getAttribute("cliente");

            if (cliente == null) {
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
                return;
            }

            double montoCredito = Double.parseDouble(request.getParameter("monto"));
            int plazo = Integer.parseInt(request.getParameter("plazo"));

            cliente.setMontoCredito(montoCredito);
            cliente.setPlazo(plazo);
            cliente.calcularInteresYPago();

            session.setAttribute("cliente", cliente);

        RequestDispatcher rd = request.getRequestDispatcher("/vistas/resultado.jsp");
        rd.forward(request, response);
        }
    }
