package persistence;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import exceptions.DAOException;
import persistence.dto.BranchOfficeDTO;

public class BranchOfficeDAOImp {
	protected ConnectionManager connManager;
	
	public BranchOfficeDAOImp() throws DAOException {
		super();
		try {
			connManager= new ConnectionManager("vehiclerentalDB");
			}
		catch (ClassNotFoundException e) {
			throw new DAOException(e);
			}
		}
	
	public List <BranchOfficeDTO> getBranchOffices() throws DAOException {
		
		try{
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from CUSTOMER");
			connManager.close();
			
			List<BranchOfficeDTO> branchofficeDTOList = new ArrayList<BranchOfficeDTO>();
			
			try {
				while (rs.next()){
					BranchOfficeDTO braDTO = new BranchOfficeDTO(
							rs.getInt("ID"),
							rs.getString("ADDRESS")
							);
					
					branchofficeDTOList.add(braDTO);
					}
				return branchofficeDTOList;
			}
			catch (Exception e){throw new DAOException(e);}
		}
		catch (SQLException e){throw new DAOException(e);}	
		catch (DAOException e){throw e;}
	}
}
