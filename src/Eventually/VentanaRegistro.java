package Eventually;

import java.awt.*;
import javax.swing.*;

public class VentanaRegistro extends JPanel{
	
	private JButton bRegistro;
	private JButton bVolver;
	private JTextField tfUser;
	private JPasswordField tfPassword;
	private JPasswordField tfPassword2;
	private JTextField tfMail;
	private TextPrompt placeholderUser;
	private TextPrompt placeholderPassword;
	private TextPrompt placeholderMail;
	private TextPrompt placeholderPassword2;
	
	public VentanaRegistro() {
		
		bRegistro = new JButton("Registrarse.");
		bVolver = new JButton("Volver.");
		tfUser = new JTextField(20);
		tfPassword = new JPasswordField(20);
		tfPassword2 = new JPasswordField(20);
		tfMail = new JTextField(20);
		
		placeholderUser = new TextPrompt("Usuario", tfUser);
		placeholderPassword = new TextPrompt("Contraseņa", tfPassword);
		placeholderPassword2 = new TextPrompt("Confirme contraseņa", tfPassword2);
		placeholderMail = new TextPrompt("Email", tfMail);
		
		placeholderUser.changeAlpha(0.75f);
		placeholderUser.changeStyle(Font.ITALIC);
		placeholderPassword.changeAlpha(0.75f);
		placeholderPassword.changeStyle(Font.ITALIC);
		placeholderPassword2.changeAlpha(0.75f);
		placeholderPassword2.changeStyle(Font.ITALIC);
		placeholderMail.changeAlpha(0.75f);
		placeholderMail.changeStyle(Font.ITALIC);
		
		setLayout(new BorderLayout());
		
		JPanel botones = new JPanel();

		botones.setLayout(new GridLayout(1, 2));
		botones.add(bRegistro);
		botones.add(bVolver);
		
		JPanel campos = new JPanel();
		campos.setLayout(new GridLayout(4, 1));
		campos.add(tfUser);
		campos.add(tfPassword);
		campos.add(tfPassword2);
		campos.add(tfMail);
		
		
		add(botones, BorderLayout.CENTER);
		add(campos, BorderLayout.NORTH);
		
	}
	
}
