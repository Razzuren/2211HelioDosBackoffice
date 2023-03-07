/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved
 */
package dos.helio.backoffice.services;

import javax.swing.*;
import de.hybris.platform.util.Config;
import dos.helio.backoffice.constants.HeliodosbackofficeConstants;

/**
 * Hello World HeliodosbackofficeService
 */
public class HeliodosbackofficeService
{
	public String getHello()
	{
		return "Hello";
	}

	public String getPlaylist() {
		return Config.getParameter(HeliodosbackofficeConstants.PLAYLISTSOURCE);
	}

}
