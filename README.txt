                        ThinWire(R) HelloWorld Demo
               Copyright (C) 2006-2007 Custom Credit Systems

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option) any
 later version.

 This library is distributed in the hope that it will be useful, but WITHOUT ANY
 WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License along
 with this library; if not, write to the Free Software Foundation, Inc., 59
 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Users interested in finding out more about the ThinWire framework should visit
 the ThinWire framework website at http://www.thinwire.com. For those interested
 in discussing the details of how this demo was built, you can contact the 
 developer via email at "Joshua Gertzen" <josh at truecode dot org>.

===============================================================================
	                     About ThinWire(R) HelloWorld Demo	
===============================================================================
Walks you through building a simple and complete ThinWire(R) application from
the ground up. This demonstrates what the process looks like if you hand-code
an application without the assistance of the Form Creator. The complete source
code involved in building the application is included. Notice how the source
code doesn't involve any HTML, client-side JavaScript, or Cascading Style Sheet
definition. The only skill necessary is knowledge of Java and the traditional
event-model that GUI toolkits such as SWT, Swing & Visual Basic use.

===============================================================================
                           Building the HelloWorld Demo
===============================================================================
The build process for the demo is defined using the Apache Ant build tool. It
has only been built using Ant 1.6 or greater, but it may build correctly with
earlier releases as well.  You can learn about the Apache Ant project and
download a working version from: http://ant.apache.org/

Once you have Ant installed and added to your system path, you can build the
demo simply by typing 'ant dist' at the command shell from the 'build'
directory.  The following Ant build targets are supported:

 dist        compile the demo, create a jar and package
	         it along with other required runtime files into
             a distribution zip.

 dist14      compile a Java 1.4 compatible version of the
             demo, create a jar and package it along with
             other required runtime files into a distribution
             zip.
	
 source      create a source only distribution that contains
             everything necessary to build the demo.
