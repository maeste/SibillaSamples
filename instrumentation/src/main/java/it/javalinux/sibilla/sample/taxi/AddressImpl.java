/*
 * Stefano Maestri, javalinuxlabs.org Copyright 2008, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package it.javalinux.sibilla.sample.taxi;

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 *
 */
public class AddressImpl implements Address {
    
    private String street;
    private String city;
    
    public AddressImpl()
    {
	
    }
    
    public AddressImpl(String street, String city)
    {
    	// a change
	this.city = city;
	this.street = street;
    }
    
    /* (non-Javadoc)
	 * @see it.javalinux.sibilla.sample.taxi.Address#getStreet()
	 */
    @Override
	public String getStreet() {
        return street;
    }
    /* (non-Javadoc)
	 * @see it.javalinux.sibilla.sample.taxi.Address#setStreet(java.lang.String)
	 */
    @Override
	public void setStreet(String street) {
        this.street = street;
    }
    /* (non-Javadoc)
	 * @see it.javalinux.sibilla.sample.taxi.Address#getCity()
	 */
    @Override
	public String getCity() {
		
        return city;
    }
    /* (non-Javadoc)
	 * @see it.javalinux.sibilla.sample.taxi.Address#setCity(java.lang.String)
	 */
    @Override
	public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString()
    {
	return "'" + street + ", " + city + "'";
    }
}
