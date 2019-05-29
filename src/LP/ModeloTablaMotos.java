package LP;

import static Comun.clsConstantes.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Comun.itfProperty;

public class ModeloTablaMotos extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private String[] nombreColumnas = {"Nº Bastidor", "Marca", "Modelo", "Potencia (cv)", "Año Fabricacion", "Tipo moto", "Valor(€)"};
	Object[][] data;

	public ModeloTablaMotos(ArrayList<itfProperty> motos, ArrayList<itfProperty> tipomoto) {

		int row = motos.size();
		int cont;
		data = new Object[row][];
		cont = 0;

		
		for (itfProperty v : motos) {
			
			for(itfProperty t : tipomoto) {
				
				if(v.getProperty(PROPIEDAD_MOTO_IDTIPOMOTO).equals(t.getProperty(PROPIEDAD_TIPOMOTO_ID))) {
					
					SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");
					
			Object[] a = {
					v.getProperty(PROPIEDAD_NUMBASTIDOR), v.getProperty(PROPIEDAD_MARCA), v.getProperty(PROPIEDAD_MODELO),
					v.getProperty(PROPIEDAD_CV), dt.format(v.getProperty(PROPIEDAD_ANIOFABRICACION)),
					t.getProperty(PROPIEDAD_TIPOMOTO_DESCRIPCION), v.getProperty(PROPIEDAD_VALOR)};
			data[cont] = a;
			cont++;
			
			break;
				}
			}
			
		}

	}

	public void setData(ArrayList<itfProperty> motos, ArrayList<itfProperty> tipomoto) {

		int row = motos.size();
		int cont;
		data = new Object[row][];
		cont = 0;

		
		for (itfProperty v : motos) {
			
			for(itfProperty t : tipomoto) {
				
				if(v.getProperty(PROPIEDAD_MOTO_IDTIPOMOTO).equals(t.getProperty(PROPIEDAD_TIPOMOTO_ID))) {

					SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");
					
			Object[] a = {
					v.getProperty(PROPIEDAD_NUMBASTIDOR), v.getProperty(PROPIEDAD_MARCA), v.getProperty(PROPIEDAD_MODELO),
					v.getProperty(PROPIEDAD_CV), dt.format(v.getProperty(PROPIEDAD_ANIOFABRICACION)),
					t.getProperty(PROPIEDAD_TIPOMOTO_DESCRIPCION), v.getProperty(PROPIEDAD_VALOR)};
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
