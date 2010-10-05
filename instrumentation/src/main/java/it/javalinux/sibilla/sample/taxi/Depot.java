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

import it.javalinux.sibilla.annotations.SibillaFactory;

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 *
 */

public class Depot implements Facility, Manageable, Location {
	
    private Address address;
    private double cost;
    private boolean available;
    
    public Depot() {
    	this.cost = Facility.MIN_COST;
    	this.available = true;
    }
    
    public Depot(double cost, boolean available)
    {
	this.cost = cost;
	this.available = available;
    }

    /* (non-Javadoc)
	 * @see it.javalinux.sibilla.sample.taxi.Location#getAddress()
	 */
    @Override
	public Address getAddress() {
        return address;
    }

    /* (non-Javadoc)
	 * @see it.javalinux.sibilla.sample.taxi.Location#setAddress(it.javalinux.sibilla.sample.taxi.Address)
	 */
    @Override
	public void setAddress(Address address) throws InvalidAddressrException {
    	//if (address.getStreet() == null) throw new InvalidAddressrException();
        this.address = address;
        
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.sibilla.sample.taxi.Facility#getDailyCost()
     */
    @Override
	public double getDailyCost() {
	return cost;
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.sibilla.sample.taxi.Manageable#close()
     */
    @Override
	public void close() {
	this.available = false;
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.sibilla.sample.taxi.Manageable#isAvailable()
     */
    @Override
	public boolean isAvailable() {
	return available;
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.sibilla.sample.taxi.Manageable#open()
     */
    @Override
	public void open() {
	this.available = true;
    }

    
    
}
