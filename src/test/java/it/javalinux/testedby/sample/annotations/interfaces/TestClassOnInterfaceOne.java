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
package it.javalinux.testedby.sample.annotations.interfaces;

import static org.junit.Assert.assertTrue;

import static it.javalinux.testedby.factories.ClassUnderTestFactory.instanceClassUnderTest;


import org.junit.Test;

/**
 * @author Stefano Maestri stefano.maestri@javalinux.it
 * 
 */

public class TestClassOnInterfaceOne {

    @Test
    public void testMethodOne() throws Exception {
	System.out.println("invoking testMethodOne on " + this.getClass().getCanonicalName());
	InterfaceUnderTestOne interfaceInstance= instanceClassUnderTest(InterfaceUnderTestOne.class);
	interfaceInstance.methodOne();
	interfaceInstance.methodTwo();
	assertTrue(true);
    }

    @Test
    public void testMethodTwo() throws Exception {
	System.out.println("invoking testMethodTwo on " + this.getClass().getCanonicalName());
	System.out.println("invoking testMethodOne on " + this.getClass().getCanonicalName());
	InterfaceUnderTestOne interfaceInstance= instanceClassUnderTest(InterfaceUnderTestOne.class);
	interfaceInstance.methodOne();
	assertTrue(true);
    }
}
