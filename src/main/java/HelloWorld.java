import com.ipartek.formacion.Employee;
import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		String nombre = "Asier";		

		System.out.println("Hello World "+nombre);
		
		
		Person p1= new Person();
		p1.setNombre("Manolo");
		System.out.println(p1.toString());
		
		Perro p2 = new Perro("Rataplam");
		System.out.println(p2);
		
		Perro pulgas = new Perro();
		pulgas.setNombre("Pulgas");
		pulgas.setEdad(-2);
		
		System.out.println(pulgas.toString());
		
		PerroPresa buba = new PerroPresa();
		buba.setNombre("Buba");
		buba.atacar();
		
		Employee youtuber = new Employee("LoganPaul",23,'h',14500000);
		System.out.println(youtuber.getNombre()+" "+ youtuber.getEdad()+" "+ youtuber.getSexo()+" "+ youtuber.getSalario());
		Employee youtuber2 = new Employee("Pewdipeie",23,'h',15500000);
		System.out.println(youtuber2.getNombre()+" "+ youtuber2.getEdad()+" "+ youtuber2.getSexo()+" "+ youtuber2.getSalario());
		
	}

}
