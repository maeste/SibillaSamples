package it.javalinux.sibilla.sample.taxi;

import it.javalinux.sibilla.annotations.TestedBy;


public interface Location {

	/**
	 * @return address
	 */
	public Address getAddress();

	/**
	 * @param address Sets address to the specified value.
	 */
	//@TestedBy(testClass = "LocationTest")
	public void setAddress(Address address) throws InvalidAddressrException;

}