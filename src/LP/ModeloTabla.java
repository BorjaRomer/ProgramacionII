package LP;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import Comun.clsConstantes;
import Comun.itfProperty;

class ModeloTabla extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private String[] nombreColumnas = { "Nº Bastidor", "Marca", "Modelo" };
	Object[][] data;

	public ModeloTabla(ArrayList<itfProperty> vehiculos) {

		int filas = vehiculos.size();
		int cont;
		data = new Object[filas][];
		cont = 0;

		
		for (itfProperty v : vehiculos) {
			Object[] a = { v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR),
					v.getProperty(clsConstantes.PROPIEDAD_MARCA), v.getProperty(clsConstantes.PROPIEDAD_MODELO) };
			data[cont] = a;
			cont++;
		}

	}

	public void setData(ArrayList<itfProperty> vehiculos) {

		int filas = vehiculos.size();
		int cont;
		data = new Object[filas][];
		cont = 0;

		
		for (itfProperty v : vehiculos) {
			Object[] a = { v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR),
					v.getProperty(clsConstantes.PROPIEDAD_MARCA), v.getProperty(clsConstantes.PROPIEDAD_MODELO) };
			data[cont] = a;
			cont++;
		}

	}
	

	public int getColumnCount() {
		return nombreColumnas.length;
	}

	public int getRowCount() {
		return data.length;
	}

	public String getColumnName(int col) {
		return nombreColumnas[col];
	}

	public Object getValueAt(int row, int col) {
		return data[row][col];
	}

	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

	public boolean isCellEditable(int row, int col) {

		return false;

	}

	public void setValueAt(Object value, int row, int col) {

		data[row][col] = value;
		fireTableCellUpdated(row, col);

	}

}
