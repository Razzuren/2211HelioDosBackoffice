package dos.helio.backoffice.jalo;

import dos.helio.backoffice.constants.HeliodosbackofficeConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class HeliodosbackofficeManager extends GeneratedHeliodosbackofficeManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( HeliodosbackofficeManager.class.getName() );
	
	public static final HeliodosbackofficeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HeliodosbackofficeManager) em.getExtension(HeliodosbackofficeConstants.EXTENSIONNAME);
	}
	
}
