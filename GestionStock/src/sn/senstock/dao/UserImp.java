package sn.senstock.dao;

import sn.senstock.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserImp implements IUser {
	
	EntityManager em ;
	public UserImp() {
		EntityManagerFactory emf = Persistence
							.createEntityManagerFactory("GestionStock");
		em = emf.createEntityManager();
	}
	
	@Override
	public User getLogin(String email, String password) {
		try {
			User user = new User();
			user =(User) em.createQuery("SELECT u FROM User u WHERE u.email=:em  AND u.password=:pwd")
					.setParameter("em", email)
					.setParameter("pwd", password)
					.getSingleResult();
			
			return user;
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public int add(User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int update(User user) {

		try {
			em.getTransaction().begin();
			em.merge(user);
			em.getTransaction().commit();
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.getTransaction().begin();
			em.remove(em.find(User.class, id));;
			em.getTransaction().commit();
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public User get(int id) {
		return (User)em.createNamedQuery("User.findById")
				.setParameter("id", id)
				.getSingleResult();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		return em.createNamedQuery("User.findAll").getResultList();
	}
	

}
