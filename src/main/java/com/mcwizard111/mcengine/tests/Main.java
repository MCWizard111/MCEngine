package com.mcwizard111.mcengine.tests;

import com.mcwizard111.mcengine.MCEngine;
import com.mcwizard111.mcengine.tests.modules.MenuModule;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

/**
 * Created by mcwizard111 on 3/13/14.
 */
public class Main {
    public static void main(String[] args) throws LWJGLException {
        MCEngine engine = new MCEngine();
        engine.setTitle("Test Title");
        engine.setSize(800, 600);
        engine.createDisplay();

        engine.add(MenuModule.class, new MenuModule());

        while (engine.isActive()) {
            engine.update();
            engine.render();
        }

        Display.destroy();
    }
}
