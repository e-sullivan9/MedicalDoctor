/*
 * Team Name: Andrew's Honor Squad 2: High Honors
 * Team Members: Justin Jiang, Samir Leal, Phi Nguyen, Eric Sullivan
 * Date: 04-30-15
 *
 * Purpose: You and your team members will simulate to develop the software called
 * "Medical Doctor".  The software will be used in hospital for managing and updating
 * not only the patient information but also prescription, and other physical test.
 * The software should be developed with well-designed Graphical User Interface (GUI)
 * so that medical doctors can easily access and manage the patient information.
 *
 * Program Contents: The "Medical Doctor" software should have following contents on GUI:
 * 1. Registration
 * 2. Doctor General Practice
 * 3. Nursing
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
