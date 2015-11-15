package org.alberto.resteasyspring.model;

/**
 * ModelManagerImpl
 *
 * @author <a href="mailto:nobuj_000@gmail.com">nobuj_000</a>
 * @version $Id$
 * @since Nov 14, 2015
 *
 */
public class ModelManagerImpl implements ModelManager{

    /**
     * Overrides getMessage
     *
     * @return
     * @since Nov 14, 2015
     * @see org.alberto.resteasyspring.model.ModelManager#getMessage()
     */
    @Override
    public String getMessage() {
	return "Yay!";
    }

}
