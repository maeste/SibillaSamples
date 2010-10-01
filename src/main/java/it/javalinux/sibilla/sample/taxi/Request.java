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

import java.util.logging.Logger;

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 *
 */
public class Request {
    
    private static Logger logger = Logger.getLogger(Request.class.getName());
    
    private String id;
    private Stop pickup;
    private Stop delivery;
    private int persons;
    
    public Request(String id)
    {
	this.id = id;
    }
    
    public void serve()
    {
	logger.info("Serving request " + id);
    }
    
    /**
     * @return pickup
     */
    public Stop getPickup() {
        return pickup;
    }
    /**
     * @param pickup Sets pickup to the specified value.
     */
    public void setPickup(Stop pickup) {
        this.pickup = pickup;
    }
    /**
     * @return delivery
     */
    public Stop getDelivery() {
        return delivery;
    }
    /**
     * @param delivery Sets delivery to the specified value.
     */
    public void setDelivery(Stop delivery) {
        this.delivery = delivery;
    }
    /**
     * @return persons
     */
    public int getPersons() {
        return persons;
    }
    /**
     * @param persons Sets persons to the specified value.
     */
    public void setPersons(int persons) {
        this.persons = persons;
    }
    
    
}
