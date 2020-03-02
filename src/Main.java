import dao.IProduitdao;
import dao.Produitdao;
import model.Produit;

public class Main {

	public static void main(String[] args) {
		
IProduitdao pr= new Produitdao();
//pr.creat(new Produit(1, "Samsung S10"," ver"));
pr.remove(9);
		
	}

}

