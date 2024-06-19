package fr.studiokakou.kakouquest.hud;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;


public class ClickableCard {
    public Texture texture;
    public String text;
    public Rectangle bounds; // Pour détecter les clics

    public ClickableCard(Texture texture, String text, Rectangle bounds) {
        this.texture = texture;
        this.text = text;
        this.bounds = bounds;
    }


    public void draw(SpriteBatch batch) {
        batch.draw(texture, bounds.x, bounds.y, bounds.width, bounds.height);
        // Dessinez le texte à l'intérieur de la carte
        // Vous pouvez utiliser BitmapFont pour cela
    }

    public boolean isClicked(float x, float y) {
        return bounds.contains(x, y);
    }
}
