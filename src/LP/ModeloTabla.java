package LP;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import static Comun.clsConstantes.*;
import Comun.itfProperty;

class ModeloTabla extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private String[] nombreColumnas = {"N� Bastidor", "Marca", "Modelo", "Potencia (cv)", "A�o Fabricacion", "Tipo coche", "Valor(�)"};
	Object[][] data;

	public ModeloTabla(ArrayList<itfProperty> coches, ArrayList<itfProperty> tipocoche) {

		int row = coches.size();
		int cont;
		data = new Object[row][];
		cont = 0;

		
		for (itfProperty v : coches) {
			
			for(itfProperty t : tipocoche) {
				
				if(v.getProperty(PROPIEDAD_COCHE_IDTIPOCOCHE).equals(t.getProperty(PROPIEDAD_TIPOCOCHE_ID))) {
					
					SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");

			
			Object[] a = {
					v.getProperty(PROPIEDAD_NUMBASTIDOR), v.getProperty(PROPIEDAD_MARCA), v.getProperty(PROPIEDAD_MODELO),
					v.getProperty(PROPIEDAD_CV), dt.format(v.getProperty(PROPIEDAD_ANIOFABRICACION)),
					t.getProperty(PROPIEDAD_TIPOCOCHE_DESCRIPCION), v.getProperty(PROPIEDAD_VALOR)};
			data[cont] = a;
			cont++;
			
			break;
				}
			}
			
		}

	}

	public void setData(ArrayList<itfProperty> coches, ArrayList<itfProperty> tipocoche) {

		int row = coches.size();
		int cont;
		data = new Object[row][];
		cont = 0;

		
		for (itfProperty v : coches) {
			
			for(itfProperty t : tipocoche) {
				
				if(v.getProperty(PROPIEDAD_COCHE_IDTIPOCOCHE).equals(t.getProperty(PROPIEDAD_TIPOCOCHE_ID))) {

					SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");
			
			Object[] a = {
					v.getProperty(PROPIEDAD_NUMBASTIDOR), v.getProperty(PROPIEDAD_MARCA), v.getProperty(PROPIEDAD_MODELO),
					v.getProperty(PROPIEDAD_CV), dt.format(v.getProperty(PROPIEDAD_ANIOFABRICACION)),
					t.getProperty(PROPIEDAD_TIPOCOCHE_DESCRIPCION), v.getProperty(PROPIEDAD_VALOR)};
			data[cont] = a;
			cont++;
				
			break;
				}
			}
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
