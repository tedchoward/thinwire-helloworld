/*
 *                      ThinWire(TM) Hello World Demo
 *                 Copyright (C) 2006 Custom Credit Systems
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Users wishing to use this demo in proprietary products which are not 
 * themselves to be released under the GNU Public License should contact Custom
 * Credit Systems for a license to do so.
 * 
 *               Custom Credit Systems, Richardson, TX 75081, USA.
 *                          http://www.thinwire.com
 */
package thinwire.apps.helloworld;

import thinwire.ui.*;
import thinwire.ui.event.*;

/**
 * @author Joshua J. Gertzen
 */
public class Main {
    public static void main(String[] args) {
        //Create and set initial position for components
        final Dialog dialog = new Dialog("Hello World, ThinWire Style!");
        dialog.setBounds(25, 25, 215, 120);
        Label label = new Label("Hello, what is your name?");
        label.setBounds(5, 5, 200, 25);        
        final TextField input = new TextField();
        input.setBounds(5, 35, 200, 25);
        Button button = new Button("Ok");
        button.setBounds(55, 65, 100, 25);

        //When button is clicked, close modal dialog and say hello
        button.addActionListener("click", new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MessageBox.confirm("Hello " + input.getText() + "!");
                dialog.setVisible(false);
            }
        });

        //Add components to dialog
        dialog.getChildren().add(label);
        dialog.getChildren().add(input);
        dialog.getChildren().add(button);
        
        //Show dialog and wait for "OK" press
        dialog.setVisible(true);
    }
}
