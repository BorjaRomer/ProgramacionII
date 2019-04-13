package Comun;

public class clsExcepcionNB extends RuntimeException {


	private static final long serialVersionUID = 1L;
	
	private final String MENSAJE= "El numero de bastidor no puede tener menos de 4 caracteres";

	@Override
	public String getMessage() 
	{
		// TODO Auto-generated method stub
		return MENSAJE;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MENSAJE;
	}

}
