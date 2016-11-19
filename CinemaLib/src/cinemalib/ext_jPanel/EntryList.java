/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemalib.ext_jPanel;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ndunn
 */
public class EntryList extends JPanel{

    	public class Entry extends JPanel {
		private JComboBox comboBox;
		private JTextField textField;
		private JButton plus;
		private JButton minus;
		private EntryList parent;

		public Entry(JComboBox comboBox, String textFieldText, EntryList list) {
			this.comboBox = comboBox;
			this.parent = list;
			this.plus = new JButton(new AddEntryAction());
			this.minus = new JButton(new RemoveEntryAction());
			this.textField = new JTextField(10);
			this.textField.setText(textFieldText);
			add(this.plus);
			add(this.minus);
			add(this.comboBox);
			add(this.textField);
		}

		public JComboBox getComboBox() {
			return comboBox;
		}

		public class AddEntryAction extends AbstractAction {

			public AddEntryAction() {
				super("+");
			}

			public void actionPerformed(ActionEvent e) {
				parent.cloneEntry(Entry.this);
			}

		}

		public class RemoveEntryAction extends AbstractAction {

			public RemoveEntryAction() {
				super("-");
			}

			public void actionPerformed(ActionEvent e) {
				parent.removeItem(Entry.this);
			}
		}

		public void enableAdd(boolean enabled) {
			this.plus.setEnabled(enabled);
		}
		public void enableMinus(boolean enabled) {
			this.minus.setEnabled(enabled);
		}
	}
 
    private List<Entry> entries;
    // Replace with your database stuff
    private static final String[] comboBoxEntries = {"Test","Two","Three"};


    public EntryList() {
        this.entries = new ArrayList<Entry>();

        Entry initial = new Entry(new JComboBox(comboBoxEntries), "", this);
        addItem(initial);
    }

    public void cloneEntry(Entry entry) {
        Object selected = entry.getComboBox().getSelectedItem();
        JComboBox copy = new JComboBox(comboBoxEntries);
        copy.setSelectedItem(selected);
        Entry theClone = new Entry(copy, "", this);

        addItem(theClone);
    }

    private void addItem(Entry entry) {
        entries.add(entry);

        add(entry);
        refresh();
    }

    public void removeItem(Entry entry) {
        entries.remove(entry);
        remove(entry);
        refresh();
    }

    private void refresh() {
        revalidate();

        if (entries.size() == 1) {
            entries.get(0).enableMinus(false);
        }
        else {
            for (Entry e : entries) {
                e.enableMinus(true);
            }
        }
    }

}
