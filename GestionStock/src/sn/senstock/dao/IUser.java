package sn.senstock.dao;

import sn.senstock.entities.User;

import java.util.List;

public interface IUser {
	public User   getLogin(String email, String password);
	public int add(User user);
	public int update(User user);
	public int delete(int id);
	public User get(int id);
	public List<User> getAll();
}
