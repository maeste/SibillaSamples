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

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 *
 */
public class TaxiTest {
    
    private static Logger logger = Logger.getLogger(TaxiTest.class.getName());
    
    @Test
    public void testRun()
    {
	logger.info("***** RUNNING testRun... *****");
	Taxi taxi = new Taxi(200.0);
	Stop s1 = new Stop();
	s1.setAddress(new Address("Piazza Duomo", "Milan"));
	Stop s2 = new Stop();
	s2.setAddress(new Address("Piazza S.Babila", "Milan"));
	Stop s3 = new Stop();
	s3.setAddress(new Address("Viale Lombardia", "Milan"));
	Request r1 = new Request("Req1");
	r1.setPersons(3);
	r1.setPickup(s1);
	r1.setDelivery(s2);
	Request r2 = new Request("Req2");
	r2.setPersons(3);
	r2.setPickup(s3);
	r2.setDelivery(s2);
	taxi.addRequest(r1);
	taxi.addRequest(r2);
	taxi.performRun();
	assertTrue(taxi.getIncome() > 0);
	assertTrue(taxi.getDailyCost() > 200);
    }
}
