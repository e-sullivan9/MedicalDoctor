/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eric Sullivan
 */
public class NonEditableTable extends DefaultTableModel{
    
    public boolean isCellEditable(int row,int column){
        return false;
    }
}
