package persistence;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

import java.time.LocalDateTime;

import exceptions.DAOException;
import persistence.dto.ReservationDTO;




public class ReservationDAOImp {
	protected ConnectionManager connManager;

	public ReservationDAOImp() throws DAOException {
		super();
		try {
			connManager= new ConnectionManager("vehiclerentalDB");
			}
		catch (ClassNotFoundException e) {
			throw new DAOException(e);
			}
		}
	
	
	
	public ReservationDTO findReservation(int id) throws DAOException{
		try {
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from RESERVATION");
			connManager.close();
			
			ReservationDTO resDTO;
			
			try {
				while (rs.next()){
					resDTO = new ReservationDTO(
							rs.getInt("ID"),
							LocalDateTime.of(rs.getDate("PICKUPDATE").toLocalDate(), rs.getTime("PICKUPDATE").toLocalTime()),
							LocalDateTime.of(rs.getDate("RETURNDATE").toLocalDate(), rs.getTime("RETURNDATE").toLocalTime()),
							rs.getString("RENTALMODALITY"),
							rs.getString("CATEGORY"),
							rs.getString("CUSTOMER"),
							rs.getInt("PICKUPLACE"),
							rs.getInt("RETURNPLACE"));
					}
				return resDTO;
			}
			catch (Exception e){throw new DAOException(e);}
		}
		catch (SQLException e){throw new DAOException(e);}	
		catch (DAOException e){throw e;}
	}
	 
	 public List <ReservationDTO> getReservationsbyBranchOffice(int idBranchOffice) throws DAOException{
		 try {
				connManager.connect();
				ResultSet rs=connManager.queryDB("select * from RESERVATION where 'PICKUPPLACE' = " + idBranchOffice);
				connManager.close();
				
				List<ReservationDTO> reservationDTOList = new ArrayList<ReservationDTO>();
				
				try {
					while (rs.next()){
						ReservationDTO cusDTO = new ReservationDTO(
								rs.getInt("ID"),
								LocalDateTime.of(rs.getDate("PICKUPDATE").toLocalDate(), rs.getTime("PICKUPDATE").toLocalTime()),
								LocalDateTime.of(rs.getDate("RETURNDATE").toLocalDate(), rs.getTime("RETURNDATE").toLocalTime()),
								rs.getString("RENTALMODALITY"),
								rs.getString("CATEGORY"),
								rs.getString("CUSTOMER"),
								rs.getInt("PICKUPLACE"),
								rs.getInt("RETURNPLACE"));
						
						customerDTOList.add(cusDTO);
						}
					return customerDTOList;
				}
				catch (Exception e){throw new DAOException(e);}
			}
			catch (SQLException e){throw new DAOException(e);}	
			catch (DAOException e){throw e;}
		

		 
		 
	 }
	  
	 public void createReservation(ReservationDTO reservation){}
}
