package dao;




import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class Produitdao implements IProduitdao {
SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		Session session =factory.openSession();
	@Override
	public int creat(Produit pr) {
		try {
		
		session.beginTransaction();
		session.save(pr);
		session.getTransaction().commit();
		return 1;
		
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return 0;
		}
		
	}
	@Override
	public int remove(int id) {
		try {
		session.beginTransaction();
		Produit pr=new Produit();
		pr.setId(id);
		session.delete(pr);
		session.getTransaction().commit();
		return 1;
		}
		
		catch (HibernateException e)
		{
			e.printStackTrace();
			return 0;
			
		}
	}


	
	
}
