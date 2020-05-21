package Eventually;

import javax.swing.*;

public class pruebaVentanaInicio {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Eventually");
		
		ventana.setSize(200, 175);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(new VentanaInicio());
		ventana.pack(); 
		ventana.setVisible(true);

	}

}
