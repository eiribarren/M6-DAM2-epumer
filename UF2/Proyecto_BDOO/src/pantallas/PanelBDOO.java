package pantallas;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.neodatis.odb.Objects;

import objetos.Depart;
import objetos.Emple;

public abstract class PanelBDOO extends JPanel {
	protected Font fuente;
	protected boolean isLoaded = false;
	public PanelBDOO anterior;
	
	public abstract void cargarUI();
	
	public interface PanelBDOOListener {
		void insertarCamposDepart(HashMap<String, Campo> campos);
		void insertarCamposEmple(HashMap<String, Campo> campos);
		void insertarEmpleado(Emple emple);
		void insertarDepartamento(Depart dept);
		void modificarSalario(String apellido, String salario);
		void eliminarEmpleado(String apellido);
		Emple[] obtenerEmpleados();
		Depart[] obtenerDepartamentos();
		void consultaEmpleadosDept10();
		void consultaNumeroEmpleadosDeVentas();
		void consultaEmpleadosCuyoDirectorEsFernandez();
		void consultaNumeroDeEmpleadosPorDepartamento();
		void mostrarInsertarEmple();
		void mostrarInsertarDepart();
		void mostrarListaDeEmpleados();
		void mostrarListaDeDepartamentos();
		void mostrarConsultasProyecto();
		void mostrarFormularioBaseDeDatos();
		void mostrarListaDeEmpleadosImportacion(String ip, String puerto, String db, String usuario, String password);
		void mostrarModificarSalario();
		void mostrarEliminarEmpleado();
	}
}
