package Proyecte;

import java.util.List;

public interface IPlanClient {
		List<Object> getInformationOfClient();
		IPlanClient getByPhoneNumber(String phoneNumber);

		}