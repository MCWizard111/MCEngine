package com.mcwizard111.mcengine.tests.modules;

import com.mcwizard111.mcengine.Modules.Module;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

/**
 * Created by mcwizard111 on 3/14/14.
 */
public class MenuModule implements Module {

    @Override
    public void init() {
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void render() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);


    }

    @Override
    public void dispose() {

    }
}
