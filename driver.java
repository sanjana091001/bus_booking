package bus_booking;

public class driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		login obj1=new login("admin_username2", "admin_password2");
		obj1.adminLogin();
		login obj2=new login("username1","password10");
		obj2.userLogin();
	}

}
