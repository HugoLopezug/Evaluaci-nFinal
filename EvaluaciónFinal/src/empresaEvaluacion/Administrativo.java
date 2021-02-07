package empresaEvaluacion;

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	
	

	public Administrativo(String nombre, String fechaNacimiento, Integer run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}


	public Administrativo() {
	}
	

	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}


	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}


	@Override
	public void analizarUsuario () {
		
	    super.analizarUsuario();
	    System.out.println("Area: "+getArea());
	    System.out.println("Experiencia previa: "+ getExperienciaPrevia());
	    
	}
	

}
