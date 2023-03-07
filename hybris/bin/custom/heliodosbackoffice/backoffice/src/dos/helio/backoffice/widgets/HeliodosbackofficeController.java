/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved
 */
package dos.helio.backoffice.widgets;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;

import com.hybris.cockpitng.util.DefaultWidgetController;

import dos.helio.backoffice.services.HeliodosbackofficeService;


public class HeliodosbackofficeController extends DefaultWidgetController
{
	private static final long serialVersionUID = 1L;
	private Label label;

	@WireVariable
	private transient HeliodosbackofficeService heliodosbackofficeService;

	@Override
	public void initialize(final Component comp)
	{
		super.initialize(comp);
		label.setValue(heliodosbackofficeService.getHello());
	}

	@Override
	public void preInitialize (final Component component){
		super.preInitialize(component);
		getModel().put("PLAYLIST", heliodosbackofficeService.getPlaylist());
	}

}
