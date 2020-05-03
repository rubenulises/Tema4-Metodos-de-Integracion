package metodosnumericosu4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTablaSimpson extends AbstractTableModel{
    
    private ArrayList<Simpson> lista = new ArrayList<Simpson>();
    private String[] columnas = {"i", "h", "a+ih", "f(a+ih)"};

    public ModeloTablaSimpson(ArrayList<Simpson> lista) {
        this.lista = lista;
    }

    public ModeloTablaSimpson() {
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getH();
            case 2:
                return this.lista.get(fila).getAih();
            case 3:
                return this.lista.get(fila).getFaih();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        return this.columnas[column]; 
    }
    
}
