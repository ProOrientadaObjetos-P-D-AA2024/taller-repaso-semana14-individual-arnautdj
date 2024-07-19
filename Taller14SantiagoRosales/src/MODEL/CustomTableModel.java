package MODEL;
import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import java.util.Set;

public class CustomTableModel extends DefaultTableModel {
    private Set<Integer> editableRows = new HashSet<>();

    public CustomTableModel(Object[][] data, Object[] columnNames, int initialRowCount) {
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 3 || column == 4) {
            return false;
        }else{
            return editableRows.contains(row) || column == 5;
        }
    }

    public void addEditableRow() {
        int row = getRowCount();
        addRow(new Object[]{"", 0.0, 0.0, 0.0, "", ""});
        editableRows.add(row);
    }
}
