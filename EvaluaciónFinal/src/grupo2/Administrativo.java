package grupo2;

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	
	public Administrativo(String nombre, String fechaNacimiento, String rut, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
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
