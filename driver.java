package bus_booking;

public class driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		user db=new user("jo","jo1");
		db.addDetails();
		bus obj1=new bus(50,"TYPE5","owner10","driver10","conductor10","BUS10", 10);
		obj1.addBus();
		booking db2 = new booking(2020,"ekm","tvm");
		db2.addBooking(3,obj1 );
	}

}
