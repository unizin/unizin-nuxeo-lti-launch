package org.unizin.cmp.auth;

import java.io.Serializable;
import java.util.Map;

import org.nuxeo.ecm.core.api.NuxeoPrincipal;
import org.nuxeo.ecm.platform.usermanager.UserManager;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.usermapper.extension.UserMapper;

public final class LtiUserMapper implements UserMapper {
    private UserManager userManager;

    @Override
    public NuxeoPrincipal getOrCreateAndUpdateNuxeoPrincipal(final Object userObject) {
        return getOrCreateAndUpdateNuxeoPrincipal(userObject, true, true, null);
    }

    @Override
    public NuxeoPrincipal getOrCreateAndUpdateNuxeoPrincipal(
    		final Object userObject, final boolean createIfNeeded,
    		final boolean update, final Map<String, Serializable> params) {



    	// TODO

        // Fetching keys from the custom configuration in nuxeo

        // - Creating/Updating user for instance (unrestricted way)
        // - Updating documents ACLs for instance (unrestricted way)
        // - Business logic

        // return userManager.getPrincipal(userId);

        return userManager.getPrincipal("");
    }

    @Override
    public void init(final Map<String, String> params) throws Exception {
        userManager = Framework.getService(UserManager.class);
    }

    @Override
    public Object wrapNuxeoPrincipal(final NuxeoPrincipal principal,
    		final Object nativePrincipal,
            final Map<String, Serializable> params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void release() {
    }
}
