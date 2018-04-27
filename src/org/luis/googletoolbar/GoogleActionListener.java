/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.luis.googletoolbar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "org.luis.googletoolbar.GoogleActionListener"
)
@ActionRegistration(
        iconBase = "org/luis/googletoolbar/google.png",
        displayName = "NOT-USED"
)
@ActionReference(
        path = "Toolbars/File",
        position = 0)
public final class GoogleActionListener extends AbstractAction implements Presenter.Toolbar {

     
    public Component getToolbarPresenter() {
        return new GooglePanel();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
