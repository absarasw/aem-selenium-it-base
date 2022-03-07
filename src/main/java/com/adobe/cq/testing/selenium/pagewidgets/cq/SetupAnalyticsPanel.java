package com.adobe.cq.testing.selenium.pagewidgets.cq;

import com.adobe.cq.testing.selenium.pagewidgets.common.AEMBaseComponent;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SetupAnalyticsPanel extends AEMBaseComponent {

    private static final SelenideElement SETUP_ANALYTICS_BUTTON = $(".setup-analytics__button");
    private static final SelenideElement INTEGRATION_COMPLETED_BUTTON = $(".integration-completed__button");
    /**
     * Construct the Setup Analytics Panel on the left Rail.
     */
    public SetupAnalyticsPanel() {
        super("coral-panel[data-shell-collectionpage-rail-panel=\"setupanalytics\"]");
    }


    /**
     * @return true if this panel is selected and visible.
     */
    public boolean isOpened() {
        return element().has(Condition.cssClass("is-selected")) && element().isDisplayed();
    }


    public boolean isIntegrationAvailable() {
        return SETUP_ANALYTICS_BUTTON.isEnabled();
    }

    public void startAnalyticsSetup() {
        if(isIntegrationAvailable()) {

        }
    }

    public boolean isIntegrationCompleted() {
        return INTEGRATION_COMPLETED_BUTTON.isDisplayed();
    }
}
