package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import model.Produto;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		String glutem = "Contem glutem";
		String nGlutem = "Nao contem glutem";
		String[] nomes = {"Macarronada", "Café", "Strogonoff", "Sushi", "Pizza", "Sorvete", "Suco de Laranja", "Agua"};
		String[] descricao = {"Macarrao com molho", "Cafe feito na cafeteira", "Strogonoff de carne", "Sashimi de salmao", "Pizza de calabresa", "Sorvete de Passas ao Rum", "Suco :)", "Agua Mineral"};
		float[] preco = {10,20,30,40,50,60,70,80};
		int[] cals = {1,2,3,4,5,6,7,8};
		String[] contemGlutem = {glutem, nGlutem, glutem, nGlutem, glutem, glutem, nGlutem, nGlutem};
		String[] urls = {"https://www.sabornamesa.com.br/media/k2/items/cache/b5b56b2ae93d3dc958cf0c21c9383b18_XL.jpg",
				"https://conteudo.imguol.com.br/c/entretenimento/3e/2022/06/05/cafe-cafeina-1654432191571_v2_900x506.jpg",
				"https://static.itdg.com.br/images/1200-675/d5eff9dea9f97a00eca9554ff4f4133d/353653-original.jpg",
				"https://www.receiteria.com.br/wp-content/uploads/receitas-de-sashimi-de-salmao-0.jpg",
				"https://cdn0.tudoreceitas.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg",
				"https://www.receitasdemae.com.br/wp-content/uploads/2014/01/Sorvete-de-passas-ao-rum.jpg",
				"https://www.sabornamesa.com.br/media/k2/items/cache/b018fd5ec8f1b90a1c8015900c2c2630_XL.jpg",
				"https://bcdn.products.pcc.eu/wp-content/uploads/2022/09/FOT1-pH-wody.jpg"};
		
		for(int i = 0; i < 8; i++) {
			Produto p = new Produto(nomes[i], descricao[i], preco[i], contemGlutem[i], cals[i], urls[i]);
			lista.add(p);
		}
		JsonArray jsonArray = new Gson().toJsonTree(lista).getAsJsonArray();
		JsonObject jsonObject = new JsonObject();
        jsonObject.add("produto", jsonArray);
        PrintWriter out = response.getWriter();
        String jsonString = jsonObject.toString();
		out.print(jsonString);
        out.flush();
        out.close();
        response.setStatus(HttpServletResponse.SC_OK);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
