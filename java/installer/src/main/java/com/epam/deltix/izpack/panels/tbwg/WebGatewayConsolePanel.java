package com.epam.deltix.izpack.panels.tbwg;

import com.izforge.izpack.api.data.InstallData;
import com.izforge.izpack.api.resource.Resources;
import com.izforge.izpack.installer.console.ConsolePanel;
import com.izforge.izpack.installer.panel.PanelView;
import com.izforge.izpack.util.Console;

/**
 * Skip this panel for console mode
 */
public class WebGatewayConsolePanel extends com.izforge.izpack.panels.htmllicence.HTMLLicenceConsolePanel {

    public WebGatewayConsolePanel(PanelView<ConsolePanel> panel, Resources resources) {
        super(panel, resources);
    }

    @Override
    public boolean run(InstallData installData, Console console) {
        return super.run(installData, console);
    }
}