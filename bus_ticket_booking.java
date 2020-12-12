package bus_booking;

interface bus_ticket_booking {
	int ticket_no=0;
	void payment();
	void cancellation(int ticket_no, bus bus1);
}
