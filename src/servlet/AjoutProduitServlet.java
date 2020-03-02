package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IProduitdao;
import dao.Produitdao;
import model.Produit;

/**
 * Servlet implementation class AjoutProduitServlet
 */
@WebServlet("/AjoutProduit")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produit pr= new Produit();
		pr.setNomProduit(request.getParameter("name"));
		pr.setDescription(request.getParameter("description"));
		IProduitdao dao = new Produitdao();
		int i=dao.creat(pr);
		if (i ==1 ) request.setAttribute("message", "success");
		else request.setAttribute("message", "fail");
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/produit.jsp").forward(request, response);
		
	}

}
