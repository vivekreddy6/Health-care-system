package healthcare.utils;

public class AdminDBQueries {
	public static String addAdminQuery="insert into diagnostic_center values(?,?,?,?,?)";
	public static String deleteAdminQuery="delete from diagnostic_center where diacode=?";
}
