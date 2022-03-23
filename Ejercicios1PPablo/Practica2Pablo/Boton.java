import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;

public class Boton extends JButton{

	public Color primer, segundo;
	
	public Color getPrimer() {
		return primer;
	}

	public void setPrimer(Color primer) {
		this.primer = primer;
	}

	public Color getSegundo() {
		return segundo;
	}

	public void setSegundo(Color segundo) {
		this.segundo = segundo;
	}

	public Boton(String nombre,Color prim, Color seg) {
		super(nombre);
		primer=prim;
		segundo=seg;
		setContentAreaFilled(false);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
			g.setColor(segundo);
			
			
		} else {
			g.setColor(primer);
		}

		g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
		super.paintComponent(g);
	}

	@Override
	protected void paintBorder(Graphics g) {

		g.setColor(Color.black);
		g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);

	}
}
