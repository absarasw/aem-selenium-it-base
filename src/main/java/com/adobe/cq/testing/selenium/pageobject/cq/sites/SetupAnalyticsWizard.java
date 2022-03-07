package com.adobe.cq.testing.selenium.pageobject.cq.sites;

import com.adobe.cq.testing.selenium.pagewidgets.common.AEMBaseComponent;
import com.adobe.cq.testing.selenium.pagewidgets.granite.Wizard;

public class SetupAnalyticsWizard extends Wizard {
    private static final String SETUP_ANALYTICS_URL = "/mnt/overlay/wcm/dx-setup-automation/components/analytics/wizard.html";

    public class ProvideLabel extends AEMBaseComponent {
        public ProvideLabel() {
            super("");
        }
    }
}
