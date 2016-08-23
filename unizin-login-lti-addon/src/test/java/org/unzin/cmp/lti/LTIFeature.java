package org.unzin.cmp.lti;

import org.nuxeo.ecm.platform.test.PlatformFeature;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.LocalDeploy;
import org.nuxeo.runtime.test.runner.SimpleFeature;


@Features(PlatformFeature.class)
@Deploy({
    "org.nuxeo.ecm.platform.oauth",
    "org.nuxeo.usermapper",
    })
@LocalDeploy({
    "org.unizin.cmp.unizin-login-lti",
    "org.unizin.cmp.unizin-login-lti.test:OSGI-INF/mock-usermapper.xml",
})
public class LTIFeature extends SimpleFeature {
}
