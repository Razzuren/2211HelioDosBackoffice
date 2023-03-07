package org.training.jalo;

import org.training.constants.TrainingConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class TrainingManager extends GeneratedTrainingManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( TrainingManager.class.getName() );
	
	public static final TrainingManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingManager) em.getExtension(TrainingConstants.EXTENSIONNAME);
	}
	
}
