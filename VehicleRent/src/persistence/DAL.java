package persistence;

import java.util.List;

import exceptions.DAOException;

import persistence.dto.CategoryDTO;


public class DAL {
	private ICategoryDAO catDAO;
	private static DAL INSTANCE= new DAL();		
	
	private DAL(){
		try {
			catDAO=new CategoryDAOImp();
		} catch (DAOException e) {}
	}
	
	public List<CategoryDTO> getCategories(){
		try{
			return catDAO.getCategories();
		}
		catch (DAOException e){return null;}
	}

	public static DAL getDAL() {
		return INSTANCE;
	}
}
