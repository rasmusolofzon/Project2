package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;
import model.CellMatrix;

public class SheetPanel extends BorderPanel {
    public SheetPanel(int rows, int columns, CellMatrix cells, CurrentSlot currentSlot) {
        add(WEST, new RowLabels(rows));
        add(CENTER, new SlotLabels(rows, columns, cells, currentSlot));
    }
}