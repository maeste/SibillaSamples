package it.javalinux.sibilla.sample.taxi;

public interface Address {

	/**
	 * @return street
	 */
	public abstract String getStreet();

	/**
	 * @param street Sets street to the specified value.
	 */
	public abstract void setStreet(String street);

	/**
	 * @return city
	 */
	public abstract String getCity();

	/**
	 * @param city Sets city to the specified value.
	 */
	public abstract void setCity(String city);

}