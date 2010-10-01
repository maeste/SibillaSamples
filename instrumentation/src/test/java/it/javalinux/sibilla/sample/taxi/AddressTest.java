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

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author alessio.soldano@javalinux.it
 * @since 01-Oct-2010
 *
 */
public class AddressTest {
    
    private static Logger logger = Logger.getLogger(AddressTest.class.getName());
    
    @Test
    public void testName()
    {
	logger.info("***** RUNNING testName... *****");
	Address address = new Address();
	address.setCity("Rome");
	address.setStreet("Piazza Navona");
	assertEquals("'Piazza Navona, Rome'", address.toString());
    }
    
    @Test
    public void testCity()
    {
	logger.info("***** RUNNING testCity... *****");
	Address address = new Address();
	address.setCity("Rome");
	assertEquals("Rome", address.getCity());
    }
    
}
