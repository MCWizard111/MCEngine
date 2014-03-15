package com.mcwizard111.mcengine.tests.modules;

import com.mcwizard111.mcengine.Modules.Module;
import com.mcwizard111.mcengine.tests.gui.GuiButton;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class MenuModule implements Module {
    private ArrayList<GuiButton> buttonList = new ArrayList<GuiButton>();

    @Override
    public void init() {
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
    }

    @Override
    public void show() {
        initGui();
    }

    private void initGui() {
        buttonList.clear();

        buttonList.add(new GuiButton("Test", 100, 60, 100, 100));
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
