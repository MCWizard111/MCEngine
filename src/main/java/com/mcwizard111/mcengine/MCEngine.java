package com.mcwizard111.mcengine;

import com.mcwizard111.mcengine.Modules.Module;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MCEngine {
    private String title;
    private int width, height;
    private Map<Class<? extends Module>, Module> modules = new HashMap<Class<? extends Module>, Module>();
    private Module currentModule = null;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTitle() {
        return title;
    }

    public boolean isActive() {
        return Display.isCloseRequested() == false;
    }

    public void createDisplay() throws LWJGLException {
        Display.setDisplayMode(new DisplayMode(getWidth(), getHeight()));
        Display.setTitle(getTitle());
        Display.create();
    }

    public void update() {
        Display.update();
    }

    public void render() {
        for (Map.Entry<Class<? extends Module>, Module> pair : modules.entrySet()) {
            pair.getValue().render();
        }
    }

    public void add(Class<? extends Module> clazz, Module module) {
        if (!modules.containsKey(clazz)) {
            modules.put(clazz, module);
            Module mod = modules.get(clazz);
            mod.init();
        }
    }
}
