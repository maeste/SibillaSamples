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
package it.javalinux.sibilla.sample.instrumentation;

import static org.hamcrest.core.IsEqual.equalTo;
import it.javalinux.sibilla.sample.instrumentation.App;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Stefano Maestri stefano.maestri@javalinux.it
 *
 */
public class AppTest {

    public App app;
    
    /**
     * Test method for {@link it.javalinux.sibilla.sample.instrumentation.App#getFoo()}.
     */
    @Test
    public void testGetFooAlwaysPass() {
	app.getFoo();
	assertTrue(true);
    }

    /**
     * Test method for {@link it.javalinux.sibilla.sample.instrumentation.App#setFoo(java.lang.String)}.
     */
    @Test
    public void testSetFooAlwaysPass() {
	app.setFoo("foo");
	assertThat(app.getFoo(), equalTo("foo"));
    }

    /**
     * Test method for {@link it.javalinux.sibilla.sample.instrumentation.App#getFooInt()}.
     */
    @Test
    public void testGetFooIntAlwaysPass() {
	app.getFooInt();
	assertTrue(true);
    }

    /**
     * Test method for {@link it.javalinux.sibilla.sample.instrumentation.App#setFooInt(int)}.
     */
    @Test
    public void testSetFooIntAlwaysPass() {
	app.setFooInt(2);
	assertThat(app.getFooInt(), equalTo(2));
    }
    
    @Before
    public void before() {
	app = new App();
    }

}