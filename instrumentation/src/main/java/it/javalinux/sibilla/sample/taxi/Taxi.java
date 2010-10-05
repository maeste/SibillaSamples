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

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 * 
 */
public class Taxi implements Facility {

    private static Logger logger = Logger.getLogger(Taxi.class.getName());

    private List<Request> requests = new LinkedList<Request>();

    private Location depot;

    private double cost;
    private double income = 0;
    
    public Taxi(double cost)
    {
    	// achange
	this.cost = cost;
    }

    public void performRun() {
	for (Request r : requests) {
	    logger.info("Pickup " + r.getPersons() + " persons at " + r.getPickup());
	    r.serve();
	    updateCostIncome(r);
	    logger.info("Deliver " + r.getPersons() + " persons at " + r.getDelivery());
	}
    }
    
    protected void updateCostIncome(Request r)
    {
	Stop s1 = r.getPickup();
	Stop s2 = r.getDelivery();
	double base;
	if (s1.getAddress().getCity().equalsIgnoreCase(s2.getAddress().getCity()))
	{
	    base = 15.0;
	}
	else
	{
	    base = 35.0;
	}
	cost = cost + base * 0.5;
	income = income + base * r.getPersons();
    }

    public void addRequest(Request request) {
	requests.add(request);
    }

    /**
     * @return depot
     */
    public Location getDepot() {
	return depot;
    }

    /**
     * @param depot
     *            Sets depot to the specified value.
     */
    public void setDepot(Location depot) {
	this.depot = depot;
    }

    /**
     * @return servedRequests
     */
    public List<Request> getRequests() {
	return requests;
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.sibilla.sample.taxi.Facility#getDailyCost()
     */
    public double getDailyCost() {
	return cost;
    }
    
    /**
     * @return income
     */
    public double getIncome() {
        return income;
    }

}
