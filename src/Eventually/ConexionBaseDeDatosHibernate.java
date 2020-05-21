package Eventually;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ConexionBaseDeDatosHibernate extends ConexionConBaseDeDatos{
	
	private static ConexionBaseDatosHibernate instanciaInterfaz = null;
	private SessionFactory sessionFactory = null;
	
}
