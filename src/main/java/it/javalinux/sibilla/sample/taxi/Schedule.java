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

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 *
 */
public class Schedule {
    
    private List<Taxi> taxiList = new LinkedList<Taxi>();
    private List<Request> serveredRequests = new LinkedList<Request>();
    private List<Request> unserveredRequests = new LinkedList<Request>();
    private List<Depot> usedDepot = new LinkedList<Depot>();
    
    /**
     * @return usedDepot
     */
    public List<Depot> getUsedDepot() {
        return usedDepot;
    }
    /**
     * @param usedDepot Sets usedDepot to the specified value.
     */
    public void setUsedDepot(List<Depot> usedDepot) {
        this.usedDepot = usedDepot;
    }
    /**
     * @return taxi
     */
    public List<Taxi> getTaxi() {
        return taxiList;
    }
    /**
     * @param taxi Sets taxi to the specified value.
     */
    public void setTaxi(List<Taxi> taxi) {
        this.taxiList = taxi;
    }
    /**
     * @return serveredRequests
     */
    public List<Request> getServeredRequests() {
        return serveredRequests;
    }
    /**
     * @param serveredRequests Sets serveredRequests to the specified value.
     */
    public void setServeredRequests(List<Request> serveredRequests) {
        this.serveredRequests = serveredRequests;
    }
    /**
     * @return unserveredRequests
     */
    public List<Request> getUnserveredRequests() {
        return unserveredRequests;
    }
    /**
     * @param unserveredRequests Sets unserveredRequests to the specified value.
     */
    public void setUnserveredRequests(List<Request> unserveredRequests) {
        this.unserveredRequests = unserveredRequests;
    }
    
    public void addDepot(Depot d)
    {
	if (d.isAvailable()) {
	    usedDepot.add(d);
	}
    }
    
    public void addTaxi(Taxi t)
    {
	taxiList.add(t);
    }
    
}
