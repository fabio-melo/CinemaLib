/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemalib.ext_jPanel;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import cinemalib.Filme;
import java.util.ArrayList;

/**
 *
 * @author Fabs
 */
public class ListaDinamica extends JPanel {
    
        public static void listaDinamica(ArrayList a){
        JList list = new JList(a.toArray());
        list.setVisibleRowCount(10);
        list.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (renderer instanceof JLabel && value instanceof Filme) {
                    // Here value will be of the Type 'Filme'
                    ((JLabel) renderer).setText(((Filme) value).getNome());
                }
                return renderer;
            }
        });

    }

}
    
    
    
