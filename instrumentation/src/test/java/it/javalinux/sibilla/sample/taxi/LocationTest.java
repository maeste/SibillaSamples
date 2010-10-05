package it.javalinux.sibilla.sample.taxi;

import static it.javalinux.sibilla.factories.ClassUnderTestFactory.instanceClassUnderTest;

import org.junit.Test;

public class LocationTest {

	//enable test for interface
	//@Test (expected = InvalidAddressrException.class)
	public void setAddressShouldThrowExceptionWithoutStreet() throws Exception {
		Location location = instanceClassUnderTest(Location.class);
		
		Address address = new AddressImpl();
		
		address.setCity("Milan");
		
		location.setAddress(address);
	}

}
