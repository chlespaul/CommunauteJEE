package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Arme;
import bean.Hobbit;
import bean.Personnage;
import outil.Factory;
import service.ServiceHobbit;
import service.ServiceHobbitImpl;

/**
 * Servlet implementation class ajoutePersonnage
 */
@WebServlet("/ajoutePersonnage")
public class ajoutePersonnage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutePersonnage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String race = request.getParameter("race");
		String desc = request.getParameter("desc");
		String materiel = request.getParameter("materiau");
		String arme = request.getParameter("arme");
		Arme a = new Arme();
		a.setNom(arme);
		a.setMateriau(materiel);
		Factory f = Factory.getInstance();
		Personnage p = f.getClass(race);
		p.setNom(nom);
		p.setRace(race);
		p.setDescription(desc);
		p.setArme(a);
		ServiceHobbitImpl shi = new ServiceHobbitImpl();
		shi.insert((Hobbit)p);
	}

}
