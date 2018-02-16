package asw.db_management;

import asw.db_management.model.Agent;

public interface UpdateInfo {
	/**
	 * Permite la solicitud de cambio de contraseña
	 */
	public void updatePassword(Agent participant, String password, String newPassword);
	
	public void updateEmail(Agent participant, String email);
}
