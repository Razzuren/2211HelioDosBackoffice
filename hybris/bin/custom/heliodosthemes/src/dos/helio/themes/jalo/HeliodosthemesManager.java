package dos.helio.themes.jalo;

import dos.helio.themes.constants.HeliodosthemesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class HeliodosthemesManager extends GeneratedHeliodosthemesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( HeliodosthemesManager.class.getName() );
	
	public static final HeliodosthemesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HeliodosthemesManager) em.getExtension(HeliodosthemesConstants.EXTENSIONNAME);
	}
	
}
