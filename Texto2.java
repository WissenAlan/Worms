package utilidades;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Texto2 {
	
	private BitmapFont fuente;
	private GlyphLayout layout;
	private SpriteBatch b = Utiles.batch;
	private String texto;
	private Vector2 posicion;
	
	public Texto2(float escala, Color color) {
		fuente = new BitmapFont();
		fuente.setColor(color);
		fuente.getData().setScale(escala);
		layout = new GlyphLayout();
		posicion = new Vector2(0, 0);
	}
	
	public void dibujar() {
		fuente.draw(b, layout, posicion.x, posicion.y);
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
		layout.setText(fuente, texto);
	}

	public String getTexto() {
		return texto;
	}
	
	public void setPosicion(Vector2 posicion) {
		this.posicion = posicion;
	}
	
	public void setPosicion(float x, float y) {
		this.posicion.x = x;
		this.posicion.y = y;
	}

	public Vector2 getPosicion() {
		return posicion;
	}
	
	public float getX() {
		return posicion.x;
	}

	public float getY() {
		return posicion.y;
	}
	
	public float getWidth() {
		return layout.width;
	}

	public float getHeight() {
		return layout.height;
	}
	
}
