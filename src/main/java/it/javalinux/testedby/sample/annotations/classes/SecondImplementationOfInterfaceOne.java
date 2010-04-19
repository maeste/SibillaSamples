/*
 * Stefano Maestri, javalinux.it Copyright 2010, and individual contributors
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
package it.javalinux.testedby.sample.annotations.classes;

import it.javalinux.testedby.annotations.TestedByFactory;
import it.javalinux.testedby.sample.annotations.factories.MyOwnFactory;
import it.javalinux.testedby.sample.annotations.interfaces.InterfaceUnderTestOne;

/**
 * @author Stefano Maestri stefano.maestri@javalinux.it
 *
 */
@TestedByFactory(MyOwnFactory.class)
public class SecondImplementationOfInterfaceOne implements InterfaceUnderTestOne {
    
    public SecondImplementationOfInterfaceOne(String foo) {
	System.out.println("creating " + this.getClass().getCanonicalName());
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.testedby.sample.annotations.interfaces.InterfaceUnderTestOne#methodOne()
     */
    public void methodOne() {
	System.out.println("invoking methodOne on " + this.getClass().getCanonicalName());
    }

    /**
     * {@inheritDoc}
     *
     * @see it.javalinux.testedby.sample.annotations.interfaces.InterfaceUnderTestOne#methodTwo()
     */
    public void methodTwo() {
	System.out.println("invoking methodOne on " + this.getClass().getCanonicalName());
    }

}
